package utils;

import java.util.Scanner;

public class val1 {
      static void tinhtiennext(String tien, Double sum) {
        Scanner input = new Scanner(System.in);
        while (true) {
            tien = input.nextLine();
            if (tien.equalsIgnoreCase("next")) {
                break;
            }

            if (!tien.equals("")) {
                sum += Double.parseDouble(tien);
            }
        }
        input.close();
    }
}
