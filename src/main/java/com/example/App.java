package com.example;

public class App 
{
    public static void main( String[] args )
    {
        String mode = System.getProperty("app.mode");
        System.out.println("LINUX-AGENT");
        
        System.out.println("POLL-SCM");
        System.out.println("Application is running in mode: " + mode);
    }
}
