 package com.jdbc.bo;

public class ProductBo {

	protected int productNo;
	protected String productName;
	protected String description;
	protected int warranty;
	protected double price;
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductBo [productNo=" + productNo + ", productName=" + productName + ", description=" + description
				+ ", warranty=" + warranty + ", price=" + price + "]";
	}
	public ProductBo(int productNo, String productName, String description, int warranty, double price) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.description = description;
		this.warranty = warranty;
		this.price = price;
	}
	public ProductBo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
