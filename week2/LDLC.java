package week2;

import java.util.Scanner;

/**
 * Filename:        LDLC.java
 * Programmer:	    Zhang Zipang
 * Description:     Class for LDLC
 */

public class LDLC {
    public static void main(String[] args) {

        // Step 1: Get the input
        Scanner kb = new Scanner(System.in);
        // TC（總膽固醇）、HDLC（高密度膽固醇)、TG（甘油三酯)
        System.out.print("Enter 總膽固醇 (TC) : ");
        String tc = kb.next();
        System.out.print("Enter 高密度膽固醇 (HDLC) : ");
        String hdlc = kb.next();
        System.out.print("Enter 甘油三酯 (TG) : ");
        String tg = kb.next();

        // Step 2: Check the input is floated
        try {
            Float.parseFloat(tc);
            Float.parseFloat(hdlc);
            Float.parseFloat(tg);
        } catch (NumberFormatException e) {
            System.out.println("輸入格式錯誤，請輸入數字");
            return;
        }

        // Step 3: Translate the input to double
        double dTc, dHdlc, dTg;
        dTc = Double.parseDouble(tc);
        dHdlc = Double.parseDouble(hdlc);
        dTg = Double.parseDouble(tg);

        // Step 4: Calculate the LDLC
        System.out.println("低密度膽固醇 (LDLC) = " + (dTc - dHdlc - (dTg / 5)));
    }
}
