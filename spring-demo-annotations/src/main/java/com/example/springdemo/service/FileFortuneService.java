package com.example.springdemo.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService  {
	private String fileName = "fortune-data.txt";
	
	private List<String> theFortune;
	
	private Random rdm = new Random();
	
	
	public FileFortuneService() {

		System.out.println(">> FileFortuneService: inside default constructor");
		
	}
	
	@PostConstruct
	private void loadTheFortune() {
		System.out.println(">> FileFortuneService: inside method loadTheFortunesFile");

		File newFile = new File(fileName);
		
		System.out.println("reading foruntes from file: "+newFile);
		System.out.println("file exists: "+newFile.exists());
		
		theFortune = new ArrayList<String>();
		
		//read fortune from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(newFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortune.add(tempLine);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = rdm.nextInt(theFortune.size());

		String tempFortune = theFortune.get(index);

		return tempFortune;
	}
}
