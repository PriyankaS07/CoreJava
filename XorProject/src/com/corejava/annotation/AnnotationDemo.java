package com.corejava.annotation;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
class Employee
{
	int ID;
	String name;
	int ABC;
	
	@Getter
	public int getID() {
		return ID;
	}

	@Getter
	public int getAge() {
		return 5;
	}
	
	@Getter
	public String getName() {
		return name;
	}
	
	@Getter
	public String getABC() {
		return "hi";
	}
	
	public void print()
	{
		System.out.println("In print method");
	}

	
}
public class AnnotationDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class c= Employee.class;
		Object obj=c.newInstance();
		Constructor con[] = c.getDeclaredConstructors();
		Method m[] = c.getDeclaredMethods(); 
		
		Field f[] = c.getDeclaredFields();
		Annotation an[]=c.getAnnotations();
		
		String[] fName= new String[f.length];
		Class[] fType= new Class[f.length];
		String[] subStr= new String[m.length];
		Class[] mReturnType= new Class[m.length];


		for(int i=0;i<f.length;i++)
		{
			fName[i]=f[i].getName();
			fType[i]=f[i].getType();
		}
		System.out.println("");
		for(int i=0;i<m.length;i++)
		{
			//System.out.println(m[i].getName());
			//System.out.println(m[i].getReturnType());
			Getter annot=m[i].getAnnotation(Getter.class);
			
			if(annot != null)
			{
				try
				{
					String str=m[i].getName();
					mReturnType[i]=m[i].getReturnType();
					subStr[i]= str.substring(3,str.length());
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		
		for (int i = 0; i < subStr.length; i++) {
			for (int j = 0; j < fName.length; j++) {
				if(fName[j].equalsIgnoreCase(subStr[i])){
					if(mReturnType[i]==fType[j])
						System.out.println(fName[j]);
					
				}
			}
		}
	}
}
