package com.steven.visitorPattern;

public class MarketSurveyVisitor implements Visitor {

	@Override
	public void visitorEnterpriseCustomer(EnterpriseCustomer ec) {
		System.out.println(ec.getName()+" �����г������������");

	}

	@Override
	public void visitorPersonCustomer(PersonCustomer pc) {
		System.out.println(pc.getName()+" �����г������������");

	}

}
