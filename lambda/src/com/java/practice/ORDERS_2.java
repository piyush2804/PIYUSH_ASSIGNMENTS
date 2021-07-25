package com.java.practice;

public class ORDERS_2 {
	String order_name;
	int price;
	String status;
	public ORDERS_2() {
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ORDERS_2(String order_name,int price, String status) {
		super();
		this.order_name=order_name;
		this.price = price;
		this.status = status;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	@Override
	public String toString() {
		return "ORDERS_2 [order_name=" + order_name + ", price=" + price + ", status=" + status + "]";
	}

}
