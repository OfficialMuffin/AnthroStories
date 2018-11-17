package com.anthrostories;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for anthrostories.
 */
public class anthrostories
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public anthrostories( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( anthrostories.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
