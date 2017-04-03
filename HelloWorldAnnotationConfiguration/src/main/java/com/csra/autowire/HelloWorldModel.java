package com.csra.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class HelloWorldModel implements IHelloPlanets {
	private String value;

	/* (non-Javadoc)
	 * @see com.csra.autowire.IHelloPlanets#getValue()
	 */
	@Override
	public String getValue() {
		return value;
	}

	/* (non-Javadoc)
	 * @see com.csra.autowire.IHelloPlanets#setValue(java.lang.String)
	 */
	@Override
	@Autowired
	public void setValue(@Value("Earth") String value) {
		this.value = value;
	}
	
}
