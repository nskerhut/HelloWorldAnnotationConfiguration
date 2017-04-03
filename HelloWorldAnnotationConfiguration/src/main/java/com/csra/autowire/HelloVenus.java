package com.csra.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class HelloVenus implements IHelloPlanets {

	public HelloVenus() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	@Override
	public void setValue(@Value("Venus") String value) {
		// TODO Auto-generated method stub

	}

}
