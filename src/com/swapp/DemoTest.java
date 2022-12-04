package com.swapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoTest {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		m.put(1, "abc");
		m.put(2, "pqr");
		
		m.put(3, "xyz");

		for (Entry<Integer, String> m1 : m.entrySet()) {
			System.out.println(m1.getKey() + " " + m1.getValue());

		}

	}

}
