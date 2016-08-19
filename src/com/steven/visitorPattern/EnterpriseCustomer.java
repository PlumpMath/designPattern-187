package com.steven.visitorPattern;

public class EnterpriseCustomer extends Customer {
	private String address;
	private String contactTel;
	
	
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContactTel() {
		return contactTel;
	}


	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visitorEnterpriseCustomer(this);
	}

}
