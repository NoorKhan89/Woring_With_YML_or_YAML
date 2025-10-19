package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("emp")
@Setter
@ConfigurationProperties(prefix="emp.data")
@ToString
public class Employee 
{
	
private Integer id;
private String name;
private String addres;
private Float salary;


}
