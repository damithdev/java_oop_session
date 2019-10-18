package com.swingapp.Zoo.Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger instance;

    private Logger(){
        //reflection
        if(instance== null){
            instance = this;
        }else{
            throw new IllegalStateException("Already initialized.");
        }
    }

    /**
     * The instance gets created only when it is called for first time. Lazy-loading
     */
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }


    public void log(String msg){

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();

        System.out.println(dateFormat.format(date) + "__________" + msg);
    }

}


