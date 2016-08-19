package com.steven.visitorPattern;

import java.util.ArrayList;
import java.util.Collection;

public class ObjectStructure {
	private Collection<Customer> collection = new ArrayList<Customer>();
	
	//����������ṩ�߲���õĽӿ�
	public void handleRequest(Visitor visitor){
		for(Customer c:collection){
			c.accept(visitor);
		}
	}
	
	public void addElement(Customer customer){
		collection.add(customer);
	}
}
