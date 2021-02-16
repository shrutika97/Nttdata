package com.nttdata;

public class Reverse {
	public static void main(String[] args)
	{
		String input = "NTTDATA";

		char[] str = input.toCharArray();

		for (int i = str.length - 1; i >= 0; i--)
			System.out.print(str[i]);
	}

}
