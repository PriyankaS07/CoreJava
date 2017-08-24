package com.corejava.collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.math.*;


import com.corejava.collection.CarOwner;

class Parking{
	int floors;
	int section;
	int capacity;
	public LinkedHashMap<Integer, CarOwner> parkingSlot = new LinkedHashMap<Integer, CarOwner>();
	
	public Parking(int floors, int section, int capacity) {
		this.floors = floors;
		this.section = section;
		this.capacity = capacity;
	}

	public int getTotalCapacity(){
		return floors*section*capacity;
	}
	
	public void initMap(){
		for(int i=0;i<getTotalCapacity();i++){
			parkingSlot.put(i, null);
		}
	}
	
	
}

public class ParkedCarList {
	
	Parking parking;
	ParkedCarList(){
		parking = new Parking(3,4,20);
		parking.initMap();	
	}
	
	int addNewCar(CarOwner car){
		
		Set parkingSet = parking.parkingSlot.entrySet();
		Iterator itr = parkingSet.iterator();
		int token = 0;
		while(itr.hasNext()){
			
			Map.Entry slot = (Map.Entry)itr.next();
			if(slot.getValue()==null){
				
				parking.parkingSlot.put((Integer) slot.getKey(), car);
				token =  (int) slot.getKey();
				break;
			}
		}
		return token;
	}
	
	void removeCar(int token){
		parking.parkingSlot.put(token, null);
		double f=token/80.0;
		int floor = (int) Math.floor(f)+1;
		int section = (int)Math.floor(token/20.0) % 4+1;
		System.out.println("Removed car from floor "+floor+", section "+section+".");
	}
	
	void getParkedLocation(int token){
		
		CarOwner owner = parking.parkingSlot.get(token);
		if(owner!=null){
			int floor = (int)Math.floor(token/80.0)+1;
			int section = (int)Math.floor(token/20.0) % 4+1;
			System.out.println("Hello "+owner.getName()+", your car is parked on floor "+floor
					+", section "+section+".");
		} else {
			System.out.println("Parking is empty");
		}
	}
	
	public static void main(String args[]){
		
		ParkedCarList carList = new ParkedCarList();
		Scanner scanner = new Scanner(System.in);
		int choice;
		while(true){
			System.out.println("****XOR Car Park****");
			System.out.println("1. Add Car");
			System.out.println("2. Show car location");
			System.out.println("3. Remove car");
			choice = scanner.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter your name");
				String name = scanner.next();
				String carModel = "Wagon R";
				int carNo = 7600;
				long mobileNo = 895623145;
				String address = "Pune";
				
				CarOwner car = new CarOwner(name, carModel, carNo, mobileNo, address);
				int token = carList.addNewCar(car);
				System.out.println("Car is parked, your token is : "+token);
				System.out.println("Thankyou");
				break;
			case 2:
				System.out.println("Please provide your token");
				int userToken = scanner.nextInt();
				carList.getParkedLocation(userToken);
				break;
			case 3:
				System.out.println("Please provide your token");
				int userToken1 = scanner.nextInt();
				carList.removeCar(userToken1);
				break;
			default:
				System.exit(0);
			}
			
		}
		
		
	}
}
