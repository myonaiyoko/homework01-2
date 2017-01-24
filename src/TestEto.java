import static org.junit.Assert.*;

import org.junit.Test;
public class TestEto {

	@Test
	public void testEto1() {
		assertEquals(Eto.getEto(2006),"戌");
	}
	@Test
	public void testEto2() {
		assertEquals(Eto.getEto(2007),"亥");
	}
	@Test
	public void testEto3() {
		assertEquals(Eto.getEto(2008),"子");
	}
	@Test
	public void testEto4() {
		assertEquals(Eto.getEto(2009),"丑");
	}
	@Test
	public void testEto5() {
		assertEquals(Eto.getEto(2010),"寅");
	}
	@Test
	public void testEto6() {
		assertEquals(Eto.getEto(2011),"卯");
	}
	@Test
	public void testEto7() {
		assertEquals(Eto.getEto(2012),"辰");
	}
	@Test
	public void testEto8() {
		assertEquals(Eto.getEto(2013),"巳");
	}
	@Test
	public void testEto9() {
		assertEquals(Eto.getEto(2014),"午");
	}
	@Test
	public void testEto10() {
		assertEquals(Eto.getEto(2015),"未");
	}
	@Test
	public void testEto11() {
		assertEquals(Eto.getEto(2016),"申");
	}
	@Test
	public void testEto12() {
		assertEquals(Eto.getEto(2017),"酉");
	}
	@Test
	public void testEto13() {
		assertEquals(Eto.getEto(1),"酉");
	}
	@Test
	public void testEto14() {
		assertEquals(Eto.getEto(5012),"辰");
	}
	@Test(expected= IllegalArgumentException.class)
	public void testEto15() {
			Eto.getEto(-2017);
	}
	@Test(expected= IllegalArgumentException.class)
	public void testEto16() {
		Eto.getEto(0);
	}


}
