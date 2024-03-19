package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {

	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> coursess;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCoursess() {
		return coursess;
	}
	public void setCoursess(Map<String, String> coursess) {
		this.coursess = coursess;
	}
	public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> coursess) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.coursess = coursess;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
