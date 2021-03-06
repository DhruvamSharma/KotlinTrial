package com.fil.file_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;


public class CharacterStreams {
	
	public static void main(String...args) {
		
		
		lineByLineReading();
		
	}
	
	
	
	
	public static void lineByLineReading() {
		
		BufferedReader reader = null;
		PrintWriter writer = null;
		
		try {
			
			reader = new BufferedReader(new FileReader("original.txt"));
			writer = new PrintWriter ( new FileWriter("copy.txt"));
			String line;
			
			while ( (line = reader.readLine()) != null ) {
				writer.flush();
				writer.println(line);
			}
			
		} catch ( FileNotFoundException ex ) {
			ex.printStackTrace();
		} catch ( IOException ex ) {
			ex.printStackTrace();
		} finally {
			if ( reader != null )
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if ( writer != null ) {
				writer.close();
			}
		}
	}
	
	
	public void characterByCharacterReading() {
		
		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			
			reader = new FileReader("original.txt");
			writer = new FileWriter("copy.txt");
			
			int c;
			
			while ( (c = reader.read()) != -1)  {
				writer.write(c);
			}
			
		} catch ( FileNotFoundException ex) {
			ex.printStackTrace();
		} catch ( IOException  ex ) {
			ex.printStackTrace();
		} finally {
			if ( reader != null )
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if ( writer != null ) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
