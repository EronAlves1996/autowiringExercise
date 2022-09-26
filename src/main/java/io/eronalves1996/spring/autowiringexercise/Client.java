package io.eronalves1996.spring.autowiringexercise;

import org.springframework.beans.factory.annotation.Autowired;

public class Client {

	private String name;
	
	@Autowired
	private Reservation reservation;

	public void setName(String name){
		this.name=name;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", reservation=" + reservation + "]";
	}

}
