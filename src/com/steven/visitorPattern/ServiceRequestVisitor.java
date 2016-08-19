package com.steven.visitorPattern;

public class ServiceRequestVisitor implements Visitor {

	@Override
	public void visitorEnterpriseCustomer(EnterpriseCustomer ec) {
		System.out.println(ec.getName()+" ������������");
	}

	@Override
	public void visitorPersonCustomer(PersonCustomer pc) {
		System.out.println(pc.getName()+" ������������");
	}

}
