package com.capgemini.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.capgemini.spring.model.*;
import com.capgemini.spring.configuration.*;

public class OrganizationMain{

	public static void main(String args[]){
		
		ApplicationContext context=new AnnotationConfigApplicationContext(OrganizationConfiguration.class);
		Organization org=context.getBean(Organization.class);
		System.out.println();
		System.out.println(org);
	}
}