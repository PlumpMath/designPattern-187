package com.steven.visitorPattern;

public class MarketSurveyVisitor implements Visitor {

	@Override
	public void visitorEnterpriseCustomer(EnterpriseCustomer ec) {
		System.out.println(ec.getName()+" 进行市场调查分析……");

	}

	@Override
	public void visitorPersonCustomer(PersonCustomer pc) {
		System.out.println(pc.getName()+" 进行市场调查分析……");

	}

}
