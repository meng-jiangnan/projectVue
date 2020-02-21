package com.accp.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.EmployeeBiz;
import com.accp.vo.EmployeeVo;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/c/Employee")
public class EmployeeAction {
	
	@Autowired
	private EmployeeBiz eb;
	
	
	@GetMapping("cx/{employeeId}/{password}")
	public  Object login(@PathVariable String employeeId,@PathVariable  String password) {
		EmployeeVo ev=eb.queryByLogin(employeeId, password);
		if(ev==null){
			return "no";
		}else {
			return JSON.toJSONString(ev);
		}
	}
	
	@GetMapping("extis")
	public  String extis(HttpSession session) {
		session.removeAttribute("user");
		return "redirect:/ui/login.jsp";
	}
}
