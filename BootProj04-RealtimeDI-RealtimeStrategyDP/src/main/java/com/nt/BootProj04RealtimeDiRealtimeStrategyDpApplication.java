package com.nt;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.CollageOperationsController;
import com.nt.modal.Employee;

@SpringBootApplication
public class BootProj04RealtimeDiRealtimeStrategyDpApplication {

	private final CollageOperationsController cfgController;
/*
	@Autowired
	 private Environment env;
	 
     @Bean(name="c3PODs")
     public DataSource createC3PODS() throws Exception
     {
    	 ComboPooledDataSource c3Ds= new ComboPooledDataSource();
	  c3Ds.setDriverClass(env.getRequiredProperty("Spring.dataSource.driver-class-name"));
	 c3Ds.setJdbcUrl(env.getRequiredProperty("spring.dataSource.url"));
	 c3Ds.setUser(env.getRequiredProperty("spring.dataSource.username"));
	 c3Ds.setPassword(env.getRequiredProperty("spring.dataSource.password"));
	  return c3Ds; 
	  }
	 
*/
	BootProj04RealtimeDiRealtimeStrategyDpApplication(CollageOperationsController cfgController) {
		this.cfgController = cfgController;
	}

	public static void main(String[] args) {
		// get access to IOC Container
		ApplicationContext ctx = SpringApplication.run(BootProj04RealtimeDiRealtimeStrategyDpApplication.class, args);
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
