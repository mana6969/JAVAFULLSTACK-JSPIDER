package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Demo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String exp = "[a-z][0-9a-z]";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(sc.nextLine());
		
		while(m.find())
		{
			System.out.println(m.group());
			System.out.println("------------");
		}
	}

}
