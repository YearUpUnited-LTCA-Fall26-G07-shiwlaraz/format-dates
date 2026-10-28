package com.pruralsight;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat format3 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        SimpleDateFormat format4 = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm");

        System.out.println(format1.format(today));
        System.out.println(format2.format(today));
        System.out.println(format3.format(today));
        System.out.println(format4.format(today));

    }
}
