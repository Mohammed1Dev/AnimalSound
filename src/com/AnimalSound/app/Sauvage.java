package com.AnimalSound.app;

public class Sauvage extends Animal{
	
	private boolean ableToDomesticate;
	
	public Sauvage(String name, String species, String lifeSpan, boolean ableToDomesticate)
	{
		super(name, species, lifeSpan);
		this.ableToDomesticate = ableToDomesticate;
	}
	
	
	public void setAbleToDomesticate(boolean ableToDomesticate)
	{
		this.ableToDomesticate = ableToDomesticate;
	}

	public boolean getAbleToDomesticate()
	{
		return this.ableToDomesticate;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"|"+this.ableToDomesticate+"|";
	}
}
