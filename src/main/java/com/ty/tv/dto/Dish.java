package com.ty.tv.dto;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Dish
{
	@Id
	private int id;
	private String provider;
	@ManyToOne
	private Tv tv;
	
	public Dish()
	{}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public Tv getTv() {
		return tv;
	}
	public void setTv(Tv tv) {
		this.tv = tv;
	}
	
	
}
