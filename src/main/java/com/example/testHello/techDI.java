package com.example.testHello;

import org.springframework.stereotype.Component;

// declare a component which that why another class call easily
@Component
public class techDI {

	public String techName;
	public int techId;

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public void checkExitence() {
		System.out.println("checkExitence");
	}

}
