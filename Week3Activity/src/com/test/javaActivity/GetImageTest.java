package com.test.javaActivity;

import java.util.Scanner;

public class GetImageTest {
	public static void main(String[] args) {
		String s = "EARTH";
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		GetImageOfString getImg = new GetImageOfString();
		StringBuffer mirrorImg= getImg.getImage(sb);
		System.out.println(s+mirrorImg);
	}
}
