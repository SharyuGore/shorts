package com.sharyu.shorts.datetime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sharyu.shorts.datetime.HumanReadableDate;

public class HumanReadableDateTest {
	@Test
	void testTimeTwo() {
		String[] argument = {"14:00"};		
		String humanreadableTime = "Two O' Clock";
		assertTrue(HumanReadableDate.validateThenConvertBasedOnInput(argument).equals(humanreadableTime));
	}
	
	@Test
	void testTimeTwoThirty() {
		String[] argument = {"14:30"};		
		String humanreadableTime = "Half past two";
		assertTrue(HumanReadableDate.validateThenConvertBasedOnInput(argument).equals(humanreadableTime));
	}
	
	@Test
	void testTimeTwoFifteen() {
		String[] argument = {"14:15"};		
		String humanreadableTime = "Fifteen past two";
		assertTrue(HumanReadableDate.validateThenConvertBasedOnInput(argument).equals(humanreadableTime));
	}
	
	@Test
	void testTimeTwoFortyFive() {
		String[] argument = {"14:45"};		
		String humanreadableTime = "Fifteen to three";
		assertTrue(HumanReadableDate.validateThenConvertBasedOnInput(argument).equals(humanreadableTime));
	}
}
