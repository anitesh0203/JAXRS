package com.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="car")
public class Car {
 public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
int modelNo;
 String carName;
 String manufacturer;
 
}
