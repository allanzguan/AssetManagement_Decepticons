package com.decepticons.assetManagement.services.protocols;

import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import com.decepticons.assetManagement.entity.Department;


public interface IDepartmentService {
	public List<Department> findAll();
	public Department findById(int id);
	


}
