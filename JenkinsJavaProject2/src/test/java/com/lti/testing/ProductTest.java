package com.lti.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.entity.ProductDaoImpl;
import com.lti.entity.ProductPojo;

class ProductTest {

	@Test
	void test() {
		ProductPojo pj = new ProductPojo();
		ProductDaoImpl pdi = new ProductDaoImpl();
		pj.setPrdId(101);
		pj.setPrdName("Mobile");
		pj.setPrdCost(10000);
		boolean flag = pdi.addProduct(pj);
		Assertions.assertEquals(true, flag);
	}

}
