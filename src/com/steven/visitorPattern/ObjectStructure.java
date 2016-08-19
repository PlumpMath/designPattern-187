package com.steven.visitorPattern;

import java.util.ArrayList;
import java.util.Collection;

public class ObjectStructure {
	private Collection<Customer> collection = new ArrayList<Customer>();
	
	//处理情况，提供高层调用的接口
	public void handleRequest(Visitor visitor){
		for(Customer c:collection){
			c.accept(visitor);
		}
	}
	
	public void addElement(Customer customer){
		collection.add(customer);
	}
}
