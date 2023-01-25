package com.projet.Monument.Services;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ClassJson {
	public static void main(String args[]) throws IOException, ParseException {
	JSONParser jsonP = new JSONParser();
	
	try {
		JSONObject jsonO = (JSONObject) jsonP.parse(new FileReader("C:\\Users\\SCD UM\\OneDrive\\Eclipse_workspace\\fichierJson.json"));
		
	}catch(FileNotFoundException e){
		e.printStackTrace();
		
	}
	
}
}