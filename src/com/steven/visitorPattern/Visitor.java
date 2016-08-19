package com.steven.visitorPattern;

public interface Visitor {
	public void visitorEnterpriseCustomer(EnterpriseCustomer ec);
	public void visitorPersonCustomer(PersonCustomer pc);
}
