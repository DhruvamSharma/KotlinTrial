package com.fil.file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
	
	public static void main(String...args) {
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("original.txt");
			out = new FileOutputStream("copy.txt");
			int c;
			while ( (c = in.read()) != -1 ) {
				out.write(c);
			}
		} catch (FileNotFoundException ex) {
			System.out.print(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		} finally {
			if ( in != null ) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if( out != null ) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

}
