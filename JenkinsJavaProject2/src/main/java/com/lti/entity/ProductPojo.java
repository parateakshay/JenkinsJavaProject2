package com.lti.entity;

public class ProductPojo 
{
	private int prdId;
	private String prdName;
	private double prdCost;
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public double getPrdCost() {
		return prdCost;
	}
	public void setPrdCost(double prdCost) {
		this.prdCost = prdCost;
	}
	@Override
	public String toString() {
		return "ProductPojo [prdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost + "]";
	}

}
