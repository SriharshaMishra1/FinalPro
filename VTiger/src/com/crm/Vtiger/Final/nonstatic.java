package com.crm.Vtiger.Final;

public class nonstatic {
	
	int i=10;//non static variable

	public static void main(String[] args) { //static area
		
		//object creation necessary
		nonstatic ns=new nonstatic();
		System.out.println(ns.i);
		
		//non static to static area:object creation necessary
		ns.m1();
		//static area to static area:diresctly call
		nonstatic.test();//classname.membername
		test();//direct call
		
	}
	public static void test()//static area
	{
		int d=70;
		//static to instace variable
		nonstatic ns1=new nonstatic();
		System.out.println(ns1.i+d);
		System.out.println(ns1.i+""+d);
	}
	
	
	void m1()//instance area
	{
		int r=40;// local variable  (instance variable to instance area:direct)
		nonstatic ns2=new nonstatic();//nonstatic variable to nonstatic area object creation possible
		System.out.println("***********");
		System.out.println(ns2.i);
		System.out.println("...........");
		System.out.println(i+r);
		System.out.println("############");
	}
}
