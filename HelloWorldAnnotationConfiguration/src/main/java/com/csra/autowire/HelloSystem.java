/**
 * 
 */
package com.csra.autowire;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sskerhut
 *
 */
public class HelloSystem {
	
	//@Autowired  //property autowire
	private IHelloPlanets helloWorldModel;
	private IHelloPlanets helloVenus;
	/**
	 * 
	 */
	public HelloSystem() {
		// TODO Auto-generated constructor stub
	}
	//@Autowired //constructor autowire
	public HelloSystem(IHelloPlanets myModel){
		myModel.setValue("Constructor autowire annotation");
		this.helloWorldModel = myModel;
	}
	/**
	 * @return the helloWorldModel
	 */
	public IHelloPlanets getHelloWorldModel() {
		return helloWorldModel;
	}
	/**
	 * @param helloWorldModel the helloWorldModel to set
	 */
	@Autowired(required = false)  //property autowire
	public void setHelloWorldModel(IHelloPlanets helloWorldModel) {
		this.helloWorldModel = helloWorldModel;
	}
	
	public IHelloPlanets getHelloVenus() {
		return helloVenus;
	}
	/**
	 * @param helloVenus the helloVenus to set
	 */
	public void setHelloVenus(IHelloPlanets helloVenus) {
		this.helloVenus = helloVenus;
	}
	
	public String getSystem(){
		StringBuilder sb = new StringBuilder()
				.append("HelloWorld: ");
		
		if(helloWorldModel != null)
			sb.append(helloWorldModel.getValue());
		
		return sb.toString();
	}
	/**
	 * @return the helloVenus
	 */


}
