package com.designpatterns.singletton;

public class SingletonSecond {
	//lazy init
	private SingletonSecond() {}
	
	private static SingletonSecond instance=null;
	
	static SingletonSecond createInstance() {
		if(instance==null) {
			instance= new SingletonSecond();
			return instance;
		}
		return instance;
	}
	
	
	
}
