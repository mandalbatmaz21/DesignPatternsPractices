package com.designpatterns.strategy;

public class UserMain {

	public static void main(String[] args) {
		Serializer xmlS = new Serializer(new XMLSerializable());
		xmlS.Serialize("veri");
		xmlS.DeSerialize("veri");
		
		Serializer jsonS = new Serializer(new JsonSerializable());
		jsonS.Serialize("veri");
		jsonS.DeSerialize("veri");
	}

}
