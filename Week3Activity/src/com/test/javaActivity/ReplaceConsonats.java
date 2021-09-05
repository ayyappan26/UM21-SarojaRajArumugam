package com.test.javaActivity;


class ReplaceAlphabets{
	static int isVowel(char i) {
		if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
			return 1;
		}
		return 0;
	}
	
	public String alterString(String input) {
		char[] a = input.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(isVowel(a[i])==0) {
				a[i] = (char) (a[i]+1);
			}
		}
		return(String.valueOf(a));
		
	}
}


public class ReplaceConsonats {
	public static void main(String[] args) {
		ReplaceAlphabets r =new ReplaceAlphabets();
		String s = "ultramain";
		String res=r.alterString(s);
		System.out.println(res);
	}
}
