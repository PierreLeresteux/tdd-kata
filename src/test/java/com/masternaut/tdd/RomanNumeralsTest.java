package com.masternaut.tdd;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void one(){
		String arabicToRoman = RomanNumerals.arabicToRoman(1);
		assertThat(arabicToRoman).isEqualTo("I");
	}
}
