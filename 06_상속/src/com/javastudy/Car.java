package com.javastudy; //default package에 있으면 안 뜸 //패키지를 먼저 써야 함

import java.util.Scanner; //먼저 패키지 쓰고 그 다음에 import

public class Car { 
	private String name;
	private int year;
	
	public Car(String name, int year) { //모두 접근 가능 //protected도 안됨
		this.name = name;
		this.year = year;
	}
	public void prnCar() { //모두 접근 가능
		System.out.println("name:"+name);
		System.out.println("year:"+year);
		
		Scanner sc = new Scanner(System.in);
	}
}
