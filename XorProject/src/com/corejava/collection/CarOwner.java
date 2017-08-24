package com.corejava.collection;

public class CarOwner {
	String name;
	String carModel;
	int carNo;
	long mobileNo;
	String address;
	public CarOwner(String name, String carModel, int carNo, long mobileNo, String address) {
		super();
		this.name = name;
		this.carModel = carModel;
		this.carNo = carNo;
		this.mobileNo = mobileNo;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	@Override
	public String toString() {
		return "CarOwner [name=" + name + ", carModel=" + carModel + ", carNo=" + carNo + ", mobileNo=" + mobileNo
				+ ", address=" + address + "]";
	}
	
	
}
