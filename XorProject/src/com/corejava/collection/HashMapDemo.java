package com.corejava.collection;
import java.util.*;
class Date1{
	int day,month,year;
	public Date1(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public boolean equals(Object o) {	           
        Date1 Date1 = (Date1) o;
        if(day == Date1.day  && month == Date1.month && year != Date1.year ){
        	
        	System.out.println("Error");
        	System.exit(0);
          }
        return false;  
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month);
    }
	@Override
	public String toString() {
		return this.day+"-"+this.month+"-"+this.year;
	}
	
}
public class HashMapDemo {
public static void main(String[] args) {
	Date1 d1=new Date1(12,6,2017);
	Date1 d2=new Date1(12,5,2015);
	Date1 d3=new Date1(10,6,2011);
	Date1 d4=new Date1(8,4,2013);
	HashMap<Date1,String> hm=new HashMap<Date1,String>();  
	hm.put(d1, "ABC");
	hm.put(d2, "PQR");
	hm.put(d3, "XYZ");
	hm.put(d4, "LMN");
	for(Map.Entry<Date1,String> entry:hm.entrySet()){     
        Date1 key=entry.getKey();  
        String val=entry.getValue();  
        System.out.println("Name : " + val + "   DOB : " + key.day + " -  " + key.month + " - " + key.year);  
           
    }      
}
}
