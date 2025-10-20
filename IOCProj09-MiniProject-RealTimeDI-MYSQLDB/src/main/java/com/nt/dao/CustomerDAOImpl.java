//CustomerDAOImpl.java(DAO Impl class)
package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Customer;

@Repository("custDAO")
public class CustomerDAOImpl implements ICustomerDOA {
private static final String CUSTOMER_INFO_INSERT_QUERY="INSERT INTO SPRING_CUSTOMER_INFO VALUES{CNO_SEQ1.NEXTVAL,?,?,?,?,?}";
	@Autowired
	private DataSource ds;
	
	
	@Override
	public int Insert(Customer cust) throws Exception
	{
		int count=0;
		
		 try(Connection con=ds.getConnection();
		 
			 PreparedStatement ps = con.prepareStatement(CUSTOMER_INFO_INSERT_QUERY);
			 
		 ){
			 
		 //Set values to query  param
			 ps.setString(1,cust.getCname());
			 ps.setString(2,cust.getCaddrs());
			 ps.setDouble(3,cust.getBillAmount());
			 ps.setDouble(4,cust.getDiscount());
			 ps.setDouble(5,cust.getFinalAmount());
			 
			 //Execute the SQL QUERY
			 
			 count=ps.executeUpdate();			 
			 
		 }//try End
		 catch (SQLException se) {
			 se.printStackTrace();
			 throw se;   //Exception rethrowing for exception Propagation
			 
		}
		 catch (Exception e)
		 {
			 e.printStackTrace();
			 throw e;
			
		}
		return count;
	} //mathode

}   //class
