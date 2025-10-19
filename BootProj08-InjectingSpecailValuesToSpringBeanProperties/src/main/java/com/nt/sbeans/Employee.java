package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("emp")
@ConfigurationProperties(prefix="emp.details")
public class Employee
{
	//Simple properties
private Integer eno;
private String ename;
private String eaddrs;

//Array Properties
private String[] favColors;
//Collection Properties
private List<String>nickNames;
private Set<Long> phoneNumbers;
private Map<String,Long> idDetails;

//HAS-A properties
private Project project;


}
