package com.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.client.HttpClientErrorException.Conflict;

public class Entity {
	
	private Long userId;
	private String name;
	private String phone;
	
	List<Conflict> contacts=new ArrayList<>()

	public Entity(Long userId, String name, String phone, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}

}
