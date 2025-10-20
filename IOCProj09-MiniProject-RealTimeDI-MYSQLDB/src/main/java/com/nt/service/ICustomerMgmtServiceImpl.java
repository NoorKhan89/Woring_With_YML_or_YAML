package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.dao.ICustomerDOA;
import com.nt.model.Customer;

@Service("custService")
public abstract class ICustomerMgmtServiceImpl implements ICustomerMgmtService
{

	private ICustomerDOA custDAO;
	
	
	@Override
	public String registerCustomer(Customer customer) throws Exception
	{
		//Claculate discount, final Amount
		double discountAmount= (customer.getBillAmount()*(customer.getDiscount()/100.0));
		double finalAmount =customer.getBillAmount()-discountAmount;
		
		//sett finalAmount to modal class Object
		customer.setFinalAmount(finalAmount);
		
		//Use DAO
		int count=custDAO.Insert(customer);
		return count==0?"Customer Registraction failed":"Customer Register having Bill Amount ::"+customer.getBillAmount()+"Discount Amount ::"
		+discountAmount()+"Final Amount ::"+finalAmount(); 
	}


	protected abstract String finalAmount();


	private String discountAmount() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
