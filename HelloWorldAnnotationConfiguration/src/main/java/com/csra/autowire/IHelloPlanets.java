package com.csra.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public interface IHelloPlanets {

	/**
	 * @return the value
	 */
	String getValue();

	/**
	 * @param value the value to set
	 */
	void setValue(String value);

}