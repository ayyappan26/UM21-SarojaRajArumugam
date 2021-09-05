package com.test.javaActivity;

public class GetImageOfString {
	public StringBuffer getImage(StringBuffer str) {
		StringBuffer mirror=new StringBuffer();
		mirror=mirror.append("|");
		StringBuffer revStr = str.reverse();
		mirror.append(revStr);
		return mirror;
		
	}
}
