package com.AnimalSound.app;


import java.io.IOException;


import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
	
	private String id;
	private String name;
	private String species;
	private String lifeSpan;
	
	
	public Animal(){}
	
	public Animal(String name, String species, String lifeSpan)
	{
		this.id = "An" + Math.random()*100;
		this.name = name;
		this.species = species;
		this.lifeSpan = lifeSpan;
		
	}
	
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSpecies(String species)
	{
		this.species = species;
	}
	public void setLifeSpan(String lifeSpan)
	{
		this.lifeSpan = lifeSpan;
	}
	
	public String getName()
	{
		return this.name;
	}
	public String getSpecies()
	{
		return this.species;
	}
	public String getLifeSpan()
	{
		return this.lifeSpan;
	}
	
	
	public void ReadSound(String effectSource) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		
	}
	
	@Override
	public String toString()
	{
		return "|"+this.id+"|"+this.name+"|"+this.species+"|"+this.lifeSpan+"|";
	}
	
	
	
	

}

