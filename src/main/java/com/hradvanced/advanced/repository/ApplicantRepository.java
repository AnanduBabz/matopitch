package com.hradvanced.advanced.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hradvanced.advanced.entity.ApplicantEntity;

@Repository
public interface ApplicantRepository extends JpaRepository<ApplicantEntity, Long> {

}
