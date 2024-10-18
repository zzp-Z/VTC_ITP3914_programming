package week3;

import javax.swing.*;

public class BoxCalculateVolume {
    public static void main(String[] args) {
        // Step 1: Get data
        String strR = JOptionPane.showInputDialog(null, "請輸入圓柱的半徑: ", "計算體積", JOptionPane.QUESTION_MESSAGE);
        String strH = JOptionPane.showInputDialog(null, "請輸入圓柱的高度: ", "計算體積", JOptionPane.QUESTION_MESSAGE);

        // Step 2: Check input
        double r, h;
        try {
            r = Double.parseDouble(strR);
            h = Double.parseDouble(strH);
            if (r <= 0 || h <= 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("err");
            return;
        }


        // Step 2: Calculate
        double volume = Math.PI * r * r * h;

        // Step 3: Output result
        System.out.println("volume: " + volume);
    }
}
