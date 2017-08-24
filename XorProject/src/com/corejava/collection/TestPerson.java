package com.corejava.collection;

import java.util.*;
class Person implements Comparable<Person>
{
	public String name;
	public int height_in_inches;
	public int weight;


	public Person(String name,int height_in_inches,int weight)
	{
		this.name=name;
		this.height_in_inches=height_in_inches;
		this.weight=weight;
	}

	public String toString()
	{
		return this.name+" "+this.height_in_inches+" "+this.weight;
	}


	public int compareTo(Person b)
	{
		
		if( this.weight==b.weight)
		{
			if( this.height_in_inches==b.height_in_inches)
				return 0;
			else if(this.height_in_inches>b.height_in_inches)
				return 1;
			else
				return -1;
		}
		else if(this.weight>b.weight)
			return 1;
		else
			return -1;
		
	}
}

public class TestPerson
{

	public static void main(String args[]) throws Exception
	{
		Person[]  p=  new Person[4];

		p[0]=new Person("Ash",5,40);
		p[1]=new Person("Zack",10,30);
		p[2]=new Person("DJ",6,30);
		p[3]=new Person("Clay",15,100);
		
		TreeSet<Person> ts=new TreeSet<Person>();  
		
		ts.add(p[0]);
		ts.add(p[1]);
		ts.add(p[2]);
		ts.add(p[3]);
		
         System.out.println("Sorted by Weight");
         
         Iterator<Person> itr=ts.iterator();  
         while(itr.hasNext()){  
          System.out.println(itr.next());  
         }  


	}
}