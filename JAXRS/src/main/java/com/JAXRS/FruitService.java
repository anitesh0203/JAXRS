package com.JAXRS;

import java.util.Map;
import java.util.TreeMap;

public class FruitService {

	public FruitService() {

	fruitsList.put("Aam", new Fruit("aam", "round", 101));
	fruitsList.put("Jamun", new Fruit("Jamun", "small", 102));
	
	}

	public Map<String, Fruit> getFruitsList() {
		return fruitsList;
	}

	public void setFruitsList(Map<String, Fruit> fruitsList) {
		this.fruitsList = fruitsList;
	}

	private Map<String, Fruit>fruitsList=new TreeMap<String, Fruit>();
	
}
