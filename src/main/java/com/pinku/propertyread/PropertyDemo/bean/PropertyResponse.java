package com.pinku.propertyread.PropertyDemo.bean;

public class PropertyResponse {

	private int minimum;
	private int maximum;

	public PropertyResponse() {

	}

	public PropertyResponse(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}

}
