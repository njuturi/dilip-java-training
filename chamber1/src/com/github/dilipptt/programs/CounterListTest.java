package com.github.dilipptt.programs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.dilipptt.programs.CounterList;

public class CounterListTest {

	@Test
	public void positiveTest() {
		int start = 10;
		int end = 21;
		int nextNum = 10;
		CounterList list = new CounterList(start, end, nextNum);
		list.createList(start, end);
		int actual = list.nextNumber(10);
		assertEquals(11, actual);
	}

	@Test
	public void positiveTestForLastNum() {
		int start = 10;
		int end = 21;
		int nextNum = 21;
		CounterList list = new CounterList(start, end, nextNum);
		list.createList(start, end);
		int actual = list.nextNumber(21);
		assertEquals(10, actual);
	}

	@Test
	public void outOfRangeTest1() {
		int start = 10;
		int end = 21;
		int nextNum = 2; // less than lower bound
		try{
			CounterList list = new CounterList(start, end, nextNum);
			list.createList(start, end);
		}catch(IllegalArgumentException e){
			fail("The number is out of range");
		}
	}
	
	@Test
	public void outOfRangeTest2() {
		int start = 10;
		int end = 21;
		int nextNum = 22; // more than lower bound
		try{
			CounterList list = new CounterList(start, end, nextNum);
			list.createList(start, end);
		}catch(IllegalArgumentException e){
			fail("The number is out of range");
		}
	}
}
