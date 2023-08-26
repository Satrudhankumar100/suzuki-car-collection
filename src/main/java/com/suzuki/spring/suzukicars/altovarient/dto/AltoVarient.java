package com.suzuki.spring.suzukicars.altovarient.dto;

public class AltoVarient {
	private String model;
	private String color;
	private String version;
	private String price;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "AltoVarient [model=" + model + ", color=" + color + ", version=" + version + ", price=" + price + "]";
	}

	}


