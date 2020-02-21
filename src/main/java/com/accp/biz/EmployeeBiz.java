package com.accp.biz;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EmployeeMapper;
import com.accp.vo.EmployeeVo;

@Service
public class EmployeeBiz {
	
	@Autowired
	private EmployeeMapper dao;
	
	
	public  EmployeeVo  queryByLogin(String employeeId,String password) {
		return dao.queryByLogin(employeeId, password);
	}
}
