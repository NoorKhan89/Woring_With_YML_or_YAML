package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Department;
import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootProj07BulkDataInjectionApplication {

    private final Department dept;

    BootProj07BulkDataInjectionApplication(Department dept) {
        this.dept = dept;
    }

	public static void main(String[] args)
	{
		// Get Acces  to IOC Container
	ApplicationContext ctx=SpringApplication.run(BootProj07BulkDataInjectionApplication.class, args);
	
	//gett the Spring bean class object 
	Employee emp=ctx.getBean("emp",Employee.class);
	System.out.println("Emp--data ::"+emp);
	Department dept=ctx.getBean("dept",Department.class);
	System.out.println("dept--data ::"+dept);
	
	//close the container
	((ConfigurableApplicationContext) ctx).close();
	}

}
