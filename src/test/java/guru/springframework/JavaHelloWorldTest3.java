package guru.springframework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import guru.springframework.JavaHelloWorld;

class JavaHelloWorldTest3 {

	@Test
	void testGetHello() {
		JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

		assertEquals("Hello World", javaHelloWorld.getHello());
	}

}
