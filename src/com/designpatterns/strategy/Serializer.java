package com.designpatterns.strategy;

public class Serializer {
	
	SerializableI i_serializer;
	
	public Serializer(SerializableI i) {
		 i_serializer = i;
	}
	
	public void Serialize(String s) {
		i_serializer.Serialize(s);
	}
	
	public void DeSerialize(String s) {
		i_serializer.DeSerialize(s);
	}
	
}
