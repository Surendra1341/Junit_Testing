package com.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	ReverseString obj = new ReverseString();

	@Test
	void testReverseString_OneWord() {
		assertEquals("avaj", obj.reverse("java"));
	}
	@Test
	void testReverseString_MultipleWords() {
		assertEquals("ysae si avaj", obj.reverse("java is easy"));
	}

}
