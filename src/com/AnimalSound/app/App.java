package com.AnimalSound.app;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class App {

	public static void main(String[] args) {
		
		Horse myHorse;
		
		String name, species, lifeSpan, source;
		int mass, speed;
		boolean ableToDomesticate = true;
		
		Scanner take = new Scanner(System.in);
		
		System.out.println("Enter your Horse Name !");
		name = take.next();
		System.out.println("Enter there species !");
		species = take.next();
		System.out.println("Enter there lifeSpan !");
		lifeSpan = take.next();
		System.out.println("Enter your Horse Mass !");
		mass = take.nextInt();
		System.out.println("Enter your Horse Speed !");
		speed = take.nextInt();
		
		source = "C:\\Users\\admin\\eclipse-workspace\\AnimalSound\\src\\Horse-Neighing-Twice.wav";
		
		myHorse = new Horse(name, species, lifeSpan, ableToDomesticate, mass, speed);
		
		System.out.println(myHorse.toString());
		
		try {
			myHorse.ReadSound(source);
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		take.close();
	}

}
