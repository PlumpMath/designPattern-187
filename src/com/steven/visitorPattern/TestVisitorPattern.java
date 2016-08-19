package com.steven.visitorPattern;

public class TestVisitorPattern {

	public static void main(String[] args) {
		ObjectStructure os = new ObjectStructure();
		
		Customer customer1 = new EnterpriseCustomer();
		customer1.setName("企业A");
		os.addElement(customer1);
		
		Customer customer2 = new EnterpriseCustomer();
		customer2.setName("企业B");
		os.addElement(customer2);
		
		Customer customer3 = new EnterpriseCustomer();
		customer3.setName("个人C");
		os.addElement(customer3);
		
		Visitor visitor1 = new ServiceRequestVisitor();
		Visitor visitor2 = new PriceAnalysisVisitor();
		Visitor visitor3 = new MarketSurveyVisitor();
		
		os.handleRequest(visitor1);
		os.handleRequest(visitor2);
		os.handleRequest(visitor3);
	}

}
