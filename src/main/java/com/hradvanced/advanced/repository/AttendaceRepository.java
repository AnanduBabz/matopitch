package com.hradvanced.advanced.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hradvanced.advanced.entity.AttendanceEntity;

public interface AttendaceRepository extends JpaRepository<AttendanceEntity, Long>{
	
	List<AttendanceEntity> findByUserIdAndProcess(long userId,String process);

}
