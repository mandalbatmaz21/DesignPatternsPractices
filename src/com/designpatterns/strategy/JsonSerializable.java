package com.designpatterns.strategy;

public class JsonSerializable implements SerializableI {

	@Override
	public void Serialize(String s) {
		System.out.println(s+"JSON Serialized +1");
	}

	@Override
	public void DeSerialize(String s) {
		System.out.println(s+"=JSON Serialized +1");
	}

}
