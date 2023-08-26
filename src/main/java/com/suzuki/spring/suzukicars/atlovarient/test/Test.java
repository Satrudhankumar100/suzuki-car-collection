package com.suzuki.spring.suzukicars.atlovarient.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suzuki.spring.suzukicars.altovarient.dao.impl.AltoVarientDaoImpl;
import com.suzuki.spring.suzukicars.altovarient.dto.AltoVarient;

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/suzuki/spring/suzukicars/atlovarient/test/config.xml");
		AltoVarientDaoImpl dao = (AltoVarientDaoImpl) context.getBean("altoVarientDao");
		AltoVarient altovarient = new AltoVarient();
		abc: while (true) {
			System.out.println("*******************choice***************");
			System.out.println("\t1.INSERT CAR VARIENT\n\t2.DELETE CAR\n\t3.UPDATE CAR\n\t4.VIEW ALTO MODEL\n\t5.STOP OPERATION");
			Integer choice = Integer.parseInt(s.nextLine());
			switch (choice) {
			case 1:
				System.out.println("Enter AltoCar Model...");
				String model = s.nextLine();
				altovarient.setModel(model);
				System.out.println("Enter AltoCar Color...");
				String color = s.nextLine();
				altovarient.setColor(color);
				System.out.println("Enter AltoCar Version...");
				String version = s.nextLine();
				altovarient.setVersion(version);
				System.out.println("Enter AltoCar Price...");
				String price = s.nextLine();
				altovarient.setPrice(price);
				int result1 = dao.create(altovarient);
				System.out.println(result1 + " CAR VARIENT INSERTED SUCCESSFULLY..");
				break;
			case 2:
				System.out.println("Enter AltoCar Model....");
				String delModel = s.nextLine();
				altovarient.setModel(delModel);
				int result2 = dao.delete(altovarient);
				System.out.println(result2 + " CAR VARIENT DELETED SUCCESSFULLY...");
				break;
			case 3:
				System.out.println("Enter AltoCar Price....");
				String upPrice = s.nextLine();
				altovarient.setModel(upPrice);
				System.out.println("Enter Altocar Color...");
				String upColor = s.nextLine();
				int result3 = dao.update(altovarient);
				System.out.println(result3 + " CAR COLOR UPDATED SUCCESSFULLY...");
				break;
			case 4:
//				System.out.println("Enter AltoCar Model..");
//				//String setModel=s.nextLine();
//				//altovarient.setModel(setModel);
//				System.out.println("****VIEW*****");
//				AltoVarient result4=dao.read("Lxi vxi");
				System.out.println("Working....");
				break abc;
			case 5:
				System.out.println("Stopped...");
				break;
			default:
				System.out.println("Opps..Invalid Input....\nTry Again....");
				break;

			}
		} // end of while loop

	}
}
//		
//		
//		/*altovarient.setModel("Alto k10");
//		altovarient.setColor("Red");
//		altovarient.setPrice("5.34 Lakh");
//		altovarient.setVersion("CNG");
//		int result = dao.create(altovarient);
//		System.out.println(result+" Varient inserted....");
//		/*
//		 * altovarient.setPrice("4.34 Lakh"); int result2 = dao.delete(altovarient);
//		 * System.out.println(result2+" Varient deleted.....");
//		 
//		altovarient.setColor("Black");
//		altovarient.setPrice("4.00 Lakh");
//		int result3=dao.update(altovarient);
//		System.out.println(result3+" Varient updated...");*/
//		
//		
//	
//	
//	
//	while(true) {
//		System.out.println("*********choice*******");
//		System.out.println("\t1. INSERT CAR VARIENT\n\t2.DELETE CAR\n\t3.UPDATE CAR ");
//	}//end of while loop
//	
//	}
