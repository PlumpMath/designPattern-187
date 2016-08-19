package com.steven.visitorPattern;

public class PriceAnalysisVisitor implements Visitor {

	@Override
	public void visitorEnterpriseCustomer(EnterpriseCustomer ec) {
		// ������ҵ�ͻ������Ʒ������м�ֵ����
		System.out.println(ec.getName()+" ���м�ֵ����");

	}

	@Override
	public void visitorPersonCustomer(PersonCustomer pc) {
		// ���ݸ��˿ͻ������Ʒ������м�ֵ����
		System.out.println(pc.getName()+" ���м�ֵ����");

	}

}
