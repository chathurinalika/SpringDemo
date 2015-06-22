package com.demo;

public class Quadrilateral {
	
	private String type;
	private int height;
	
	public Quadrilateral(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}
	
	public void draw(){
		System.out.println(getType() + " quadrilateral drawn of hieght " + getHeight());
	}		
}
