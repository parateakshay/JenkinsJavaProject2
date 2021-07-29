package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao
{
	List<ProductPojo> list = new ArrayList<ProductPojo>();

	@Override
	public boolean addProduct(ProductPojo p) 
	{
		list.add(p);
		if(list.isEmpty())
		{
			return false;
			
		}
		else
		{
			return true;
			
		}
	}
	

}
