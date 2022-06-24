package com.day6.session1.collection_set;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DemoUniqeWordsFromAFile {

	public static void main(String[] args) {

		// how to print all unique words form the file
		// 1. open the file read it line by line
		// 2. make token of line split vs StringTokenized and then put
		// 3. data into treeset it then
		// 4. print data from that treeset

		Set<String> words=new TreeSet<String>();
		
		try {

			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				//now you have to make tokens of the line
				String tokens[]=line.split(" ");
				for(String token: tokens) {
					words.add(token.toLowerCase());
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		//We need to print it
		System.out.println("----------------------");
		for(String word: words) {
			System.out.println(word);
		}
		
		// i want to use set
//		Set<String> set=new TreeSet<String>();
//		set.add("foo");
//		
//		set.add("bar");
//		set.add("jar");
//		set.add("car");
//		set.add("ganga");
//		set.add("ganga");
//		
//		System.out.println(set);

	}

}
