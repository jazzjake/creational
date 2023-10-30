package com.pluralsight.factory;

import java.util.Calendar;

public class FactoryEverydayDemo {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();  //various calendars available due to factory method
        System.out.println(cal);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
