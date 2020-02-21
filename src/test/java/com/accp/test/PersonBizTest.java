package com.accp.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.action.EmployeeAction;
import com.accp.action.TbreimburseAction;
import com.accp.biz.EmployeeBiz;
import com.accp.biz.TbreimburseBiz;
import com.accp.pojo.Reimbursedetail;
import com.accp.pojo.Tbreimburse;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class PersonBizTest {
	
	@Autowired()
	private TbreimburseBiz a ;
	
	@Test
	public void testQuery() {
		Tbreimburse b=new Tbreimburse();
		b.setCreateman(111);
		b.setCreatetime(new Date());
		b.setDepartmentid(111);
		b.setEvent("111");
		b.setNextdealman(111);
		b.setReimburseid("111");
		b.setStatusid(111);
		b.setTotalcount(1.1);
		b.setTypeid(111);
		List<Reimbursedetail> c=new ArrayList<Reimbursedetail>();
		c.add(new Reimbursedetail("111", 1.1, "111", "111", "111"));
		b.setList(c);
		System.out.println(a.addTbreimburse(b));
	}
}
