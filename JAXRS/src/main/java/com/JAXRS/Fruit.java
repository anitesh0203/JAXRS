package com.JAXRS;

public class Fruit {
String name;
public Fruit(String name, String shape, int code) {
	super();
	this.name = name;
	this.shape = shape;
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getShape() {
	return shape;
}
public void setShape(String shape) {
	this.shape = shape;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
String shape;
int code;
}
