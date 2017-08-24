package com.corejava.collection;
import java.util.*;
class MyDate
{
	
	public int dd,mm,yy;
	public MyDate(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	@Override
	public int hashCode() {
		
		if ((dd == 8) && (mm == 9) )
			return 5;
		final int prime = 31;
		int result = 1;
		result = prime * result + dd;
		return result;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if ((dd == other.dd) && (mm == other.mm ) )
			return true;
		return true;
	}
	
}


public class EmployeeTest {
	
	public static void main(String[] args) {
		
		MyDate myDates[]=new  MyDate[4];
		
		myDates[0]=new MyDate(8,9,1995);
		myDates[1]=new MyDate(8,9,2000);
		myDates[2]=new MyDate(5,1,2000);
		myDates[3]=new MyDate(1,7,2007);
		


		HashMap<MyDate,String> hmap= new HashMap<MyDate,String>();
		
		hmap.put(myDates[0],"Aish");
		hmap.put(myDates[1],"Pooja");
		hmap.put(myDates[2],"LN");
		hmap.put(myDates[3],"hjd");
		
		
		Iterator<MyDate> itr= hmap.keySet().iterator();
        while(itr.hasNext()){  
        	MyDate d=itr.next();
         System.out.println("Key: "+d+"  Value: "+ hmap.get(d));  
        }  

        	System.out.println("Expected: Aishwarya "+"output: "+hmap.get(myDates[0]));  	
        	System.out.println("Expected: Pooja "+"output: "+hmap.get(myDates[1]));
	
	}
}
