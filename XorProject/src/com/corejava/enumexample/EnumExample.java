package com.corejava.enumexample;

public class EnumExample {
	
	
	int orderId,orderQuantity,orderPrice;
	String orderName;
	OrderStatus status;
	public EnumExample(String orderName,int orderId,int orderQuantity,int orderPrice,OrderStatus status)
	{
		this.orderId=orderId;
		this.orderQuantity=orderQuantity;
		this.orderPrice=orderPrice;
		this.orderName=orderName;
		this.status=status;
	}
	
	public static void getValue(OrderStatus status)
	{
		switch(status)
		{
		case NEW: 
			System.out.println("Value of NEW is "+status.value);
			break;
		case REJECTED:
			System.out.println("Value of REJECTED is "+status.value);
			break;
		case ACCEPTED:
			System.out.println("Value of ACCEPTED is "+status.value);
			break;
		case COMPLETED:
			System.out.println("Value of COMPLETED is "+status.value);
			break;
		}
		
	}
	
	public static void main(String[] args) {
		EnumExample[] o = new EnumExample[4];
		
		o[0]=new EnumExample("Shoes",1001,45,800,OrderStatus.NEW);
		o[1]=new EnumExample("Fridge",1021,75,70,OrderStatus.ACCEPTED);
		o[2]=new EnumExample("z",1033,100,550,OrderStatus.REJECTED);
		o[3]=new EnumExample("a",1045,80,400,OrderStatus.COMPLETED);

		for (int i = 0; i < o.length; i++) {
			EnumExample.getValue(o[i].status);
		}
	}

}

enum OrderStatus{ 
	
	NEW(1),REJECTED(5),ACCEPTED(7),COMPLETED(3);
	int value;
	
	private OrderStatus(int value)
	{
	this.value=value;
	}

};