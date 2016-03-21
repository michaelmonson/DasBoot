package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This annotation scans our application for Spring components and auto-wires most of the 
 * Spring libraries we want to use by enabling AUTO-CONFIGURATION.
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {        
    	//Fires up Spring.Boot when our main method is ran as our pure Java Application:
    	SpringApplication.run(App.class,  args);
    }
}
