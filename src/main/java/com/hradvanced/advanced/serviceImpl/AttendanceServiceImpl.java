package com.hradvanced.advanced.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hradvanced.advanced.entity.AttendanceEntity;
import com.hradvanced.advanced.entity.EmployeeEntity;
import com.hradvanced.advanced.repository.AttendaceRepository;
import com.hradvanced.advanced.repository.EmployeeRepository;
import com.hradvanced.advanced.service.AttendanceService;

@Service
public class AttendanceServiceImpl  implements AttendanceService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	AttendaceRepository attendaceRepository;
	
	@Override
	public String punch(long id) {
		EmployeeEntity entity =  employeeRepository.findById(id).orElse(null);
		String process="punchIn";
		if(entity!=null) {
			Date date = new Date();  
			Calendar currentDate = Calendar.getInstance();
			currentDate.setTime(date);
						
			AttendanceEntity newAttendanceEntity =  new AttendanceEntity();
			
			List<AttendanceEntity>attendanceEntity= attendaceRepository.findByUserIdAndProcess(id, "punchIn");
			if(attendanceEntity!=null) {
				List<AttendanceEntity>attendanceEntityPunchOut= attendaceRepository.findByUserIdAndProcess(id, "punchOut");
				for(AttendanceEntity each:attendanceEntityPunchOut) {
					Calendar eachDate = Calendar.getInstance();
					eachDate.setTime(each.getDate());
					if(currentDate.get(Calendar.DAY_OF_YEAR) == eachDate.get(Calendar.DAY_OF_YEAR) &&
							currentDate.get(Calendar.YEAR) == eachDate.get(Calendar.YEAR)) {
						return "you have already punched out";
					}	
				}
				for(AttendanceEntity each:attendanceEntity) {
					Calendar eachDate = Calendar.getInstance();
					eachDate.setTime(each.getDate());
					if(currentDate.get(Calendar.DAY_OF_YEAR) == eachDate.get(Calendar.DAY_OF_YEAR) &&
							currentDate.get(Calendar.YEAR) == eachDate.get(Calendar.YEAR)) {
						process="punchOut";
					}	
				}
			}
			newAttendanceEntity.setProcess(process);
			newAttendanceEntity.setUserId(id);
			newAttendanceEntity.setDate(date);
			
			attendaceRepository.save(newAttendanceEntity);
			
		}
		else {
			return "no employee found";
		}
		return "you have "+process+" Sucessfully";
	}

}
