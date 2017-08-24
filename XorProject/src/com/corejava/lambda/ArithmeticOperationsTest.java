
package com.corejava.lambda;
@FunctionalInterface
interface ArithmeticOps<T>
{
	T Operations(T t1,T t2);
}
public class ArithmeticOperationsTest {

	public static void main(String[] args) {
		ArithmeticOps<Integer> addObj= (a,b)-> {return a+b;};
		System.out.println("Addition: "+addObj.Operations(5, 10));
		
		ArithmeticOps<Integer> subObj= (a,b)-> {return a-b;};
		System.out.println("Subtraction: "+subObj.Operations(5, 10));
		
		ArithmeticOps<Integer> mulObj= (a,b)-> {return a*b;};
		System.out.println("Multiplication: "+mulObj.Operations(5, 10));
		
		ArithmeticOps<Integer> divObj= (a,b)-> {return a/b;};
		System.out.println("Division: "+divObj.Operations(5, 10));
		
	}

}
