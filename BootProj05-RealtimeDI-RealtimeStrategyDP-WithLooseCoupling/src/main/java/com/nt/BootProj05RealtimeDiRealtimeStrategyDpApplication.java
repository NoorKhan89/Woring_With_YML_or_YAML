package com.nt;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.CollageOperationsController;
import com.nt.modal.Employee;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj05RealtimeDiRealtimeStrategyDpApplication {

	private CollageOperationsController cfgController = new CollageOperationsController();
	BootProj05RealtimeDiRealtimeStrategyDpApplication(CollageOperationsController cfgController) {
		this.cfgController = cfgController;
	}

	public static void main(String[] args) {
		// get access to IOC Container
		ApplicationContext ctx = SpringApplication.run(BootProj05RealtimeDiRealtimeStrategyDpApplication.class, args);
		// get controller class obj
		CollageOperationsController controller = ctx.getBean("cfgController", CollageOperationsController.class);
		// invoke the B.method

		try {
			List<Employee> list = controller.showEmployeesByDesgs("CLERK", "MANAGER", "SALESMEN");
			list.forEach(emp -> {
				System.out.println(emp);
			});
		} // try
		catch (Exception e) {
			e.printStackTrace();
		}
		// close the container
		((ConfigurableApplicationContext) ctx).close();
	}// main
} // class
