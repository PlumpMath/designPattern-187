package com.steven.visitorPattern;

public class ServiceRequestVisitor implements Visitor {

	@Override
	public void visitorEnterpriseCustomer(EnterpriseCustomer ec) {
		System.out.println(ec.getName()+" 发出服务请求");
	}

	@Override
	public void visitorPersonCustomer(PersonCustomer pc) {
		System.out.println(pc.getName()+" 发出服务请求");
	}

}
