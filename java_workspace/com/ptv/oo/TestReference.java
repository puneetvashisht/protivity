package com.ptv.oo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestReference {

	@Test
	public void test() {
		//input 
		int value = 46;
		
		MyNumber myNum = new MyNumber(value);
		CallByReferenceDemo.changeNumber(myNum);
		
		//expected output : 48
		System.out.println(myNum);
		
		assertSame(48, myNum.x);
	}
	
	
	@Test
	public void testNegative() {
		//input 
		int value = -46;
		
		MyNumber myNum = new MyNumber(value);
		CallByReferenceDemo.changeNumber(myNum);
		
		//expected output : 48
		System.out.println(myNum);
		
		assertSame(-44, myNum.x);
	}

}
