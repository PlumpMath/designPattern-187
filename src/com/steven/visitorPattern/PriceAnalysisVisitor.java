package com.steven.visitorPattern;

public class PriceAnalysisVisitor implements Visitor {

	@Override
	public void visitorEnterpriseCustomer(EnterpriseCustomer ec) {
		// 依据企业客户购买产品情况进行价值分析
		System.out.println(ec.getName()+" 进行价值分析");

	}

	@Override
	public void visitorPersonCustomer(PersonCustomer pc) {
		// 依据个人客户购买产品情况进行价值分析
		System.out.println(pc.getName()+" 进行价值分析");

	}

}
