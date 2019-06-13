package com.mkyong.hashing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
public void testeven() {
OddEven ob=new OddEven();
	String avalue=ob.Checkeven((7));
        String evalue="The number is odd.";
	assertEquals(avalue,evalue);
 }
public void testeven1() {
OddEven ob=new OddEven();
	String avalue=ob.Checkeven((8));
        String evalue="The number is even.";
	assertEquals(avalue,evalue);
 }
    public void testApp()
    {
        assertTrue( true );
    }
}
