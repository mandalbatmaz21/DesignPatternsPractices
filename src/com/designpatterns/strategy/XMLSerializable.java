package com.designpatterns.strategy;

public class XMLSerializable implements SerializableI {

	@Override
	public void Serialize(String s) {
		System.out.println(s+"=XML Serialized");		
	}

	@Override
	public void DeSerialize(String s) {
		System.out.println(s+"=XML DeSerialized");
	}
	
}
