package guru.springframework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import guru.springframework.JavaHelloWorld;

public class JavaHelloWorldTest2 {

	@Test
	public void testGetHello() {
		JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

		assertEquals("Hello World", javaHelloWorld.getHello());
	}

}
