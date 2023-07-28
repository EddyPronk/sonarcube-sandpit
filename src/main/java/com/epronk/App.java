package com.epronk;

import java.io.InputStream;
import java.io.FileInputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public void load(String filename)
    {
	try (InputStream input = new FileInputStream(filename)) {
	    // do something useful
	}
	catch(Exception ex) {
	    // handle the exception
	}
    }
}
