package com.ultramain.training.objectCasting;

public class familyTest {
	public static void main(String[] args) {
//		Son mySon = new Son();
//		mySon.swim();
//		mySon.earnmoney();
//		mySon.sleep();
		
//		Dad myDad = new Daughter();
//		myDad.earnmoney();
//		myDad.sleep();
		
		Dad myDad = new Son();
		Display d = new Display();
		d.showKidsDetails(new Daughter());
		
		
	}
}
class GrandFather{
	public void sleep() {
		System.out.println("GrandFather asks to sleep for 8 hrs....");
	}
}
class Dad extends GrandFather{
	public void earnmoney() {
		System.out.println("Dad does his own business to make money....");
	}
	
}
class Son extends Dad{
	public void swim() {
		System.out.println("Son is going to swimming class..");
	}
	public void earnmoney() {
		System.out.println("Son does partTimeJob to make money....");
	}
	
}
class Daughter extends Dad{
	public void sing() {
		System.out.println("Daughter sings sweetly..");
	}
	public void earnmoney() {
		System.out.println("Daughter does partTimeJob to make money....");
	}
}
class Display{
	public void showKidsDetails(Dad myDad) {
		if(myDad instanceof Son) {
			Son mySon = (Son) myDad;
			mySon.swim();
			mySon.earnmoney();
			mySon.sleep();
		}
		if(myDad instanceof Daughter) {
			Daughter d = (Daughter) myDad;
			d.sing();
			d.earnmoney();
			d.sleep();
		}
	}
}