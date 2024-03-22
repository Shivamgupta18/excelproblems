package com.javaQuestions;

public class JavaInterview {
	public static void main(String[] args) {
		String s="ABCD";
		int result = 0;
		for (int i = 0; i < s.length(); i++)
	    {
	        result *= 26;
	        result += s.charAt(i) - 'A' + 1;
	    }
	    System.out.println(result);
	}
}
