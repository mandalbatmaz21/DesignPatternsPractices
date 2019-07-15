package com.designpatterns.singletton;

public class SingletonFirst {
	//eager init.
	private SingletonFirst() {}
	
	private static final SingletonFirst instance = new SingletonFirst();
	
	static SingletonFirst createInstance(){
		return instance;
	}
	
}	
