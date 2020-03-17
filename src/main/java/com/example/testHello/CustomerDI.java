package com.example.testHello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerDI {
	public int custId;
	public String name;
	public int rollNo;
	@Autowired

	public techDI techDi;
	
    //	 calling one DI in di so class don't know about each other so we need to use auto wired
	
	public techDI getTechDi() {
		return techDi;
	}
	
	public void setTechDi(techDI techDi) {
		this.techDi = techDi;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void displayNew() {
		System.out.println("this is displayNew");
		techDi.checkExitence();
	}
		

}
