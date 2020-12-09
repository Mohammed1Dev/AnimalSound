package com.AnimalSound.app;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Horse extends Sauvage{
	
	private int mass;
	private int speed;
	
	
	public Horse(String name, String species, String lifeSpan, boolean ableToDomesticate, int mass, int speed)
	{
		super(name, species, lifeSpan, ableToDomesticate);
		this.mass = mass;
		this.speed = speed;
	}
	
	public void setMass(int mass)
	{
		this.mass = mass;
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	
	public int getMass()
	{
		return this.mass;
	}
	public int getSpeed()
	{
		return this.speed;
	}
	
	@Override
	public void ReadSound(String effectSource) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		  AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(effectSource));
	      Clip clip = AudioSystem.getClip();
	      clip.open(audioIn);
	      clip.start();
	      System.out.println(effectSource+" sound is start ! ");
	      System.out.println("s : "+clip.isActive());
	      while(clip.isActive()) {
	    	   //System.out.println("hola "+effectSource);
	      }
	      clip.close();
	      System.out.println(effectSource+" sound is end ! ");
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"|"+this.mass+"|"+this.speed;
	}

}
