package com.curso.ejemplos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestArrays {
	public static void main(String[] args) {
		List<String> nonusedkeywords = Arrays.asList("goto", "const");
		List<String> weirdkeywords = Arrays.asList("transient", "volatile", "native", "strictfp");
		List<String> weirdkeywordsCopy = weirdkeywords;
		List<String> weirdkeywordsCopy2 = weirdkeywords.subList(0, weirdkeywords.size()-2);
		String [] arrstrings2 = {};
		String [] arrstrings = weirdkeywords.toArray(arrstrings2);
		
		System.out.println(arrstrings);
		System.out.println(Arrays.toString(arrstrings));
		
		Collections.sort(weirdkeywords);
		System.out.println(weirdkeywords);
		
		/** /
		for(String tmp : nonusedkeywords) {
			System.out.println(tmp);
			nonusedkeywords.remove(tmp);
		}
		/**/
		/**/
		for(String tmp : weirdkeywordsCopy2) {
			System.out.println(tmp);
			weirdkeywordsCopy2.remove(tmp);
		}
		/**/
	}
}
