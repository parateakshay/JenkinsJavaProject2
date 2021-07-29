package com.lti.demo;

import com.lti.entity.ProductDaoImpl;
import com.lti.entity.ProductPojo;

public class UserApp 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the new jenkins java project");
		ProductDaoImpl pdi = new ProductDaoImpl();
		ProductPojo pj = new ProductPojo();
		pj.setPrdId(101);
		pj.setPrdName("Mobile");
		pj.setPrdCost(10000);
		boolean flag = pdi.addProduct(pj);
		if(flag)
		{
			System.out.println("Added succesfully");
		}
		else
		{
			System.out.println("try again");
			
		}
	}

}
