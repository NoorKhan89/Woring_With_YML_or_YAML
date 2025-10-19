package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.modal.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmService {

	@Autowired
	@Qualifier("mysql_empDAO")
	private IEmployeeDAO empDAO;
	
	@Override
	public  List<Employee> fetchEmployeesByDesg(String desg1, String dseg2, String desg3) throws Exception {
		
		//use dao
		List<Employee>list=empDAO.getEmpsByDesgs(desg1, dseg2, desg3);
		
		return list;
	}

}
