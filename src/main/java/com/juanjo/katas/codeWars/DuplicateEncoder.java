package com.juanjo.katas.codeWars;

public class DuplicateEncoder {
	static String encode(String word){
		StringBuilder newStr = new StringBuilder();
		for (String s : word.toUpperCase().split("")) {
			int firstIndex = word.toUpperCase().indexOf(s);
			int lastIndex = word.toUpperCase().lastIndexOf(s);
			char chr = (firstIndex == lastIndex) ? '(' : ')';
			newStr.append(chr);
		}
		return newStr.toString();
	}
	
	public static void main(String[] args){
		String word = "din";
		String word2 = "recede";
		String word3 = "Success";
		String word4 = "(( @";
		encode(word);
		encode(word2);
		encode(word3);
		encode(word4);
		
		
		//"din"      =>  "((("
		//"recede"   =>  "()()()"
		//"Success"  =>  ")())())"
		//"(( @"     =>  "))(("
		
		
	}
}

