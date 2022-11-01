package Logging;

import dataAcces.Ilogger;

public class FileLogger implements Ilogger {
    @Override
    public void log(String data) {
        System.out.println("Dosyaya Loglandi :"+data);
    }
}
