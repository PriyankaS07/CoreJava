package com.spring.FirstDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {

	public int orderNo;
	//@Autowired
	Item item;
	
	public Order() {
		System.out.println("Inside Order constructor");
	}
	public Order(int orderNo, Item item) {
		super();
		this.orderNo = orderNo;
		this.item = item;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", item=" + item + "]";
	}
	
}
