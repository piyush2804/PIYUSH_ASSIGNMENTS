package com.example.SPRINGREST_2.zips;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "country", "state", "city", "zip" })
public class Zipsinfo {
	int zip;

	@JsonProperty("city_name")
	String city;
	String state;
	String country;

	public Zipsinfo(int zip, String city, String state, String country) {
		super();
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Zipsinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "zipsInfo [zip=" + zip + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
