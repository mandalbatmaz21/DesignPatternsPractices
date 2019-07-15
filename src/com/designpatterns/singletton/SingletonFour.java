package com.designpatterns.singletton;

public class SingletonFour {
	//lazy loading and double checking
	private SingletonFour() {}
	
	private static SingletonFour instance;
	
	public static SingletonFour getInstance() {
		if(instance==null) {
			synchronized (SingletonFour.class) {
				instance = new SingletonFour();
			}
		}
		return instance;
		
	}
}
