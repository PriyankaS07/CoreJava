package com.spring.FirstDemo;

public class Item {
	
	public Item() {
		System.out.println("Inside Item constructor");
	}
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String name;
	public int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	
}
