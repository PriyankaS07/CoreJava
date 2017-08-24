package com.corejava.lambda;

import java.util.*;
import java.util.function.Predicate;
class Order{
	int price;
	String status;
	public Order(int price,String status){
		this.price=price;
		this.status=status;
	}
	@Override
	public String toString() {
		
		return "Price " +price+" Status"+status;
	}
}
public class OrdersTest {
	
	static List<Order> filterOrder(List<Order> list,Predicate p1,Predicate p2){
		
		List<Order> myOrders = new ArrayList<Order>();
		for(Order order: list) {
		if ((p1.test(order.price)==true) && (p2.test(order.status)==true)) {
			myOrders.add(order);
			}
		}
		return myOrders;

	}
	public static void main(String[] args){
	Order order1=new Order(1000,"PASS");
	Order order2=new Order(500,"Fail");
	Order order3=new Order(800,"PASS");
	Order order4=new Order(400,"Fail");
	Order order5=new Order(1200,"PASS");
	
	List<Order> list=new ArrayList<Order>();
	list.add(order1);
	list.add(order2);
	list.add(order3);
	list.add(order4);
	list.add(order5);
	Predicate<Integer> p1 = (price) -> price>500?true:false;
	Predicate<String> p2 = (status)-> (status.equals("PASS"))?true:false;
	List<Order> opOrders= new ArrayList<Order>();
	opOrders=filterOrder(list,p1,p2);
	System.out.println("Total orders:- "+opOrders.size());
	for (int i = 0; i < opOrders.size(); i++) {
		System.out.println(opOrders.get(i));
	}

}
}
