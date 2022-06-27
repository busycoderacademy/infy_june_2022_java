package com.day6.session1.ann_inner_class;
import java.util.*;
//how hashmap work?, hashing (collions)
class Key {
	int i;
	public Key(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
	@Override
	public String toString() {
		return "Key [i=" + i + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(i);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		return i == other.i;
	}

	
}
public class SomeImpQOnMap {
	public static void main(String[] args) {
		Map<Key, String> map=new HashMap<Key, String>();
		map.put(new Key(33), "thirty three");
		
		System.out.println(map.containsKey(new Key(33)));
	}

}
