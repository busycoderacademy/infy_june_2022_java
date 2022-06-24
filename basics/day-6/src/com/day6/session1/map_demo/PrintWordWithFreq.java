package com.day6.session1.map_demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PrintWordWithFreq {

	public static void main(String[] args) {
		// word freq
		Map<String, Integer> words= new TreeMap<>();

		try {

			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				// now you have to make tokens of the line
				String tokens[] = line.split(" ");
				for (String token : tokens) {
					  token= token.toLowerCase();
					if (words.containsKey(token)) {
						Integer freq=words.get(token);
						words.put(token, ++freq);
					}else {
						words.put(token, new Integer(1));	
					}
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

		//print the map
		Set<Entry<String, Integer>> entrySet = words.entrySet();
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> next = it.next();
			System.out.println(next.getKey()+": "+ next.getValue());
		}
	}

}
