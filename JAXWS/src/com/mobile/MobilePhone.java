package com.mobile;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Phone")
public class MobilePhone {

public MobilePhone(int modelNo, String name) {
		super();
		this.modelNo = modelNo;
		this.name = name;
	}
int modelNo;
public int getModelNo() {
	return modelNo;
}
public void setModelNo(int modelNo) {
	this.modelNo = modelNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
String name;



}
