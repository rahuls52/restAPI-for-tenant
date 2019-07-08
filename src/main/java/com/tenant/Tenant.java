package com.tenant;

import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.SequenceGenerators;


@Entity
public class Tenant 
{
	@Id
	private int id;
	private String tenantName;
	private long mobileNo;
	private String address;
	private String city;
	private int zipcode;
	
	
	
	
	public Tenant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tenant(int id, String tenantName, long mobileNo, String address, String city, int zipcode) {
		super();
		this.id = id;
		this.tenantName = tenantName;
		this.mobileNo = mobileNo;
		this.address = address;
		this.city = city;
		this.zipcode= zipcode;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenantName() {
		return tenantName;
	}
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
	@Override
	public String toString() {
		return "Tenant [id=" + id + ", tenantName=" + tenantName + ", mobileNo=" + mobileNo + ", address=" + address
				+ ", city=" + city + ", zipcode=" + zipcode + "]";
	}

	
	

}
