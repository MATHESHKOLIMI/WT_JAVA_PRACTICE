package com.practice.Immutable;

public class Address implements Cloneable{
	private String doorNumber;
	private String streetName;
	private String state;
	private String pinCode;
	
	public Address() {
		
	}
	public Address(String doorNumber, String streetName, String state, String pinCode) {
		super();
		this.doorNumber=doorNumber;
		this.streetName=streetName;
		this.state= state;
		this.pinCode= pinCode;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", streetName=" + streetName + ", state=" + state + ", pinCode="
				+ pinCode + "]";
	}
	
	
}
