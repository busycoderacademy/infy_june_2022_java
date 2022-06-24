package com.day6.session1.doubts.q2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//read a file and print all words of it
public class ExHierarchy {

	public static void main(String[] args){

		BufferedReader br=null;
		try {
			br = new BufferedReader(new FileReader("dat.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException is happends");
		} catch (IOException e) {
			System.out.println("IO ex can happends");
		}
		catch(Exception e) {
			System.out.println("some other ex..");
		}
		
		
		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("---------");
	}
}
