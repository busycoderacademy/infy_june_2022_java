package com.day5.session1.ex_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//read a file and print all words of it
public class NeedOfCheckedEx {

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
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("---------");
	}
}
