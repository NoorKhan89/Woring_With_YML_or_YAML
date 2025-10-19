package com.nt.test;

import org.springframework.core.io.FileSystemResource;

import com.nt.sbeans.WishGenerator;

public class ClientApp
{
public static void main(String args[])
{
	System.out.println("ClientApp :------ MAin()--");
	FileSystemResource res= new FileSystemResource("src/com/nt/configures/application.xml");
	XmlBeanFactory factory = new XmlBeanFactory(res);
	WishGenerator bean =(WishGenerator)factory.getBean("wmg",WishGenerator.class );
	WishGenerator bean1 =(WishGenerator)factory.getBean("wmg",WishGenerator.class);

}
}
