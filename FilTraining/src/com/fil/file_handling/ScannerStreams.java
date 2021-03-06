package com.fil.file_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScannerStreams {

	public static void main(String...args) {
		
		translateDecimals();
		
	}
	
	public static void translateDecimals() {
		Scanner s = null;
        double sum = 0;

        try {
            try {
				s = new Scanner(new BufferedReader(new FileReader("numbers.txt")));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            //s.useLocale(Locale.US);

            while (s.hasNext()) {
                if (s.hasNextDouble()) {
                    sum += s.nextDouble();
                } else {
                    s.next();
                }   
            }
        } finally {
            s.close();
        }

        System.out.println(sum);
    }
	
	
	public static void scanningFile() {
		
		Scanner scanner = null;
		
		try {
			
			scanner = new Scanner( new BufferedReader( new FileReader("original.txt") ) );
			String line = null;
			
			while ( scanner.hasNext() ) {
				System.out.println(scanner.nextLine());
			}
			
		} catch ( FileNotFoundException ex ) {
			ex.printStackTrace();
		} catch ( IOException ex ) {
			ex.printStackTrace();
		} catch ( Exception ex ) {
			ex.printStackTrace();
		}
		finally {
			scanner.close();
		}
		
	}
	
}
