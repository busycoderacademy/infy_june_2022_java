package com.day7.session1.datetime_ex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class ModernDateAndTimeApi {

	public static void main(String[] args) {
		//java till java 7 our date time api is very badly design 
		
		//Date , Calender
//		Date date=new Date(12, 12, 12);
//		System.out.println(date);
		
		//a open source sol: joda date and time =>since java 8 it become part of jdk :)
		
		LocalDate date=LocalDate.now();
//		System.out.println(date);
		
	//	LocalDate date=LocalDate.of(2012, Month.APRIL, 12);
		System.out.println(date);//2012-04-12
		
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonthValue());
		
		//dd-MM-yyyy		mm: min 28/6/2022
		
		//Date time formater? if u want to customerize date formate
		
		
		//------how to find the age of a person if dob provided
		
//		Scanner scanner=new Scanner(System.in); 
//		System.out.println("PE the your bdate dd/MM/yyyy");
//		
//		String dateString= scanner.nextLine();
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate dob=LocalDate.parse("11/11/2011", dtf);
		System.out.println(dob);
		
		LocalDate currDate=LocalDate.now();
		
		Period period=Period.between(dob, currDate);
		System.out.println("years: "+period.getYears());
		System.out.println("months: "+ period.getMonths());
		System.out.println("days: "+ period.getDays());
		
		//used for time stamp: punch card app
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		//
		
		//what is the age of the person
		
		//somebody is giving u exam date form the ip ensure that it should not be passed date
		//26/06/2022
		
	}
	
	public boolean checkDate(LocalDate examDate) {
		return examDate.isAfter(LocalDate.now());
	}
}







