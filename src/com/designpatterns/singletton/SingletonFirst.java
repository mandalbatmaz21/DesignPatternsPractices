package com.designpatterns.singletton;

public class SingletonFirst {
	
	
	private static final SingletonFirst instance = new SingletonFirst();
	
	private SingletonFirst() {}
	
	static SingletonFirst createInstance(){
		return instance;
	}
	
}	
