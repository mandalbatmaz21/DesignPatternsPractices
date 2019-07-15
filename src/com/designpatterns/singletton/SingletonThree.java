package com.designpatterns.singletton;


public class SingletonThree {
		//thread-safe singleton pattern
		//multiple threads can’t access at the same time
	
		private SingletonThree() {}
		
		private static SingletonThree instance ;
		
		synchronized public static SingletonThree getInstance() {
			if(instance==null) {
				instance = new SingletonThree();
			}
			return instance;
		}
}
