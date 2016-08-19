package com.steven.visitorPattern;

public class PersonCustomer extends Customer {
	private String telephone;
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitorPersonCustomer(this);
	}

}
