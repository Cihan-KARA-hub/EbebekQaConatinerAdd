package org.example.Log;

import org.apache.log4j.xml.DOMConfigurator;

public class Logger {
    static org.apache.log4j.Logger Log = org.apache.log4j.Logger.getLogger(org.example.Log.Logger.class);
    public Logger(){
        DOMConfigurator.configure("src/main/resources/log4j.properties");

    }
    public void info(String message){
       Log.info(message);
    }
    public void warn(String message){
        Log.warn(message);
    }
    public void eror(String message){
        Log.error(message);
    }
}
