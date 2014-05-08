package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest extends SnakeCamelUtil{

	@Test
	public void snakeToCamelcasetest() {
		String words = "abc" ;
		SnakeCamelUtil w = new SnakeCamelUtil();
		String wo = w.snakeToCamelcase(words);
		assertEquals("abc", words);
	}
	
	public void capitalizetest() {
		String c1 = "A";
		String c2 = "Ac";
		SnakeCamelUtil captest = new SnakeCamelUtil();
		String a = captest.capitalize(c1);
		String b = captest.capitalize(c2);
		assertEquals("A",a);
	}

}
