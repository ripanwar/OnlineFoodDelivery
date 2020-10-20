package com.cg.fds.entities;

public class Address {

	private String addressId;
	private String buildingName;
	private String area;
	private String streetNo;
	private String city;
	private String state;
	private String country;
	private String pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String addressId, String buildingName, String area, String streetNo, String city, String state,
			String country, String pincode) {
		super();
		this.addressId = addressId;
		this.buildingName = buildingName;
		this.area = area;
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Address [AddressId=" + addressId + ", Building Name=" + buildingName + ", Area=" + area + ", Street No="+streetNo+", City="+city+", State="+state+", Country="+country+", Pin code="+pincode+"]";
	}
	
	
}
