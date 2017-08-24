package com.spring.FirstDemo;


import java.util.HashMap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext iocContainer=new ClassPathXmlApplicationContext("Chatroom.xml");
        /*Order bean=(Order)iocContainer.getBean("order");
        System.out.println("Price:"+bean.getItem().getPrice());*/
    	/*HashMap<String, Order> hmap=new HashMap<String, Order>();
    	hmap=(HashMap<String, Order>)iocContainer.getBeansOfType(Order.class);
    	int price=0;
    	for(Order o:hmap.values()){
    		 price+=o.getItem().getPrice();	  
    	}
    	System.out.println("Price:"+price);*/
    	/*Employee bean=(Employee)iocContainer.getBean("employee");
        System.out.println("Dept name:"+bean.getDept().getDeptName());*/
    	

    	HashMap<String, Chatroom> hmap=new HashMap<String, Chatroom>();
    	hmap=(HashMap<String, Chatroom>)iocContainer.getBeansOfType(Chatroom.class);
    	for(Chatroom cr:hmap.values()){
    		System.out.println("Name :"+cr.getName());
    		for (int i = 0; i < cr.getUsers().size(); i++) {
				System.out.println("Messages "+cr.getMessages());
			}
    		
    	}
    	
    }
}
