package Logging;

import dataAcces.Ilogger;

public class MailLogger implements Ilogger {
    @Override
    public void log(String data) {
        System.out.println("Mail gonderildi "+data);
    }
}
