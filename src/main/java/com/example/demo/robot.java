package com.example.demo;

import javax.validation.constraints.AssertTrue;

public class robot {
	
	@AssertTrue(message = "No puede ingresar un producto siendo Robot")
	private boolean soyRobot = true;
	private String msg;
	
	
	public boolean isSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(boolean soyRobot) {
		this.soyRobot = soyRobot;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
