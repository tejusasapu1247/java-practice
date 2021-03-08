package com.day7.session1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Key {
	private int id;
	public Key(int i) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
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
		if (id != other.id)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Key [id=" + id + "]";
	}

}
public class MapWithUserdefinedKey {

	public static void main(String[] args) {
		Map<Key, String> map = new HashMap<>();
		Key key=new Key(234);
		map.put(key, "hello");
		key.setId(123);
		System.out.println(map.get(key));
		map.entrySet();	
	}

}
