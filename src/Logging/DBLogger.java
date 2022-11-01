package Logging;

import dataAcces.Ilogger;

public class DBLogger implements Ilogger {
    @Override
    public void log(String data) {
        System.out.println("DB loglandi :"+ data);
    }
}
