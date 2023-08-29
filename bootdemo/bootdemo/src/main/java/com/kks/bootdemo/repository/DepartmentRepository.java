package com.kks.bootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kks.bootdemo.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
