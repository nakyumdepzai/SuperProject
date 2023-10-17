/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate;

import java.util.Scanner;
import person.Person;

/**
 *
 * @author Khanh
 */
public class calculate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so nguoi: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("Nhap ten thanh vien(" + n + ")");
        Person[] p = new Person[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Thanh vien " + (i + 1) + ": ");
            String name = input.nextLine();
            p[i] = new Person(name);
        }
        // double[] tongtiencung = new double[n];
        double[] tongtienflex = new double[n];
        // double[] tongtienmem = new double[n];
        // double sum = 0;
        // System.out.println("Nhap so tien cung ne(quit to quit): ");
        // while (true) {
        // String tiencung = input.nextLine();
        // if (tiencung.equalsIgnoreCase("quit")) {
        // break;
        // }
        // sum += Double.parseDouble(tiencung);
        // }
        // tongtiencung[0] = sum;
        // for (int i = 0; i < n; i++) {
        // p[i].setLent(sum * 1.0 / n);
        // }

        // System.out.println("Nhap tien mem ne(khong co thi dien so 0): ");
        // for (int i = 0; i < n; i++) {
        // double sum1 = 0;
        // System.out.print("Tien mem cua " + p[i].getName() + " : ");
        // while (true) {
        // String tienmem = input.nextLine();
        // if (tienmem.equalsIgnoreCase("next")) {
        // break;
        // }
        // if (!tienmem.equals("")) {
        // sum1 += Double.parseDouble(tienmem);
        // }
        // }
        // tongtienmem[i] = sum1;
        // p[i].setLent(p[i].getLent() + sum1);
        // }
        double sumflex = 0;
        System.out.println("Nhap tien flex ne(khong co thi dien so 0): ");
        for (int i = 0; i < n; i++) {
            System.out.println("Tien flex cua " + p[i].getName() + ": ");
            double sum1 = 0;
            while (true) {
                String tienflex = input.nextLine();
                if (tienflex.equalsIgnoreCase("next")) {
                    break;
                }

                if (!tienflex.equals("")) {
                    sum1 += Double.parseDouble(tienflex);
                }
            }
            tongtienflex[i] = sum1;
            sumflex += sum1;
        }

        for (int i = 0; i < n; i++) {
            p[i].setDiff(-sumflex * 1.0 / n + tongtienflex[i]);
        }

        Person[] plon = new Person[n];
        Person[] pbe = new Person[n];
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < n; i++) {
            if (p[i].getDiff() > 0) {
                plon[n1] = p[i];
                n1++;
            } else if (p[i].getDiff() < 0) {
                pbe[n2] = p[i];
                n2++;
            }
        }
        for (int i = 0; i < n1; i++) {
            System.out.println(plon[i].getDiff());
        }
        for (int i = 0; i < n2; i++) {
            System.out.println(pbe[i].getDiff());
        }
        int count = 0;
        boolean check = true;
        System.out.println("Nhap ten admin: ");
        do {
            String admin = input.nextLine();
            for (int i = 0; i < n; i++) {
                if (admin.equalsIgnoreCase(p[i].getName())) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Ten thanh vien khong ton tai! Xin hay nhap lai ten thanh vien!");
            } else {
                check = false;
            }
        } while (check);

        if (n1 >= n2) {
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < n2; j++) {
                    if (plon[j].getDiff() <= Math.abs(pbe[i].getDiff())) {
                        if (plon[j].getDiff() == 0 || pbe[i].getDiff() == 0) {
                            continue;
                        }
                        System.out.println(
                                pbe[i].getName() + " se tra " + plon[j].getName() + " " + plon[j].getDiff() + " kVND");
                        double newDiff = pbe[i].getDiff() + plon[j].getDiff();
                        pbe[i].setDiff(newDiff);
                        plon[j].setDiff(0);
                        System.out.println(i + " " + j);
                        System.out.println(pbe[i].getDiff() + " " + plon[j].getDiff());
                    } else {
                        System.out.println(pbe[i].getName() + " se tra " + plon[j].getName() + " "
                                + Math.abs(pbe[i].getDiff()) + " kVND");
                        double newDiff = pbe[i].getDiff() + plon[j].getDiff();
                        plon[j].setDiff(newDiff);
                        pbe[i].setDiff(pbe[i].getDiff() - Math.abs(plon[j].getDiff()));
                        System.out.println(i + " " + j);
                        System.out.println(pbe[i].getDiff() + " " + plon[j].getDiff());
                        break;
                    }
                }
            }
        } else {
            for (int t = 0; t < n1; t++) {
                for (int i = 0; i < n1 + 1; i++) {
                    for (int j = 0; j < n2; j++) {

                        if ((plon[j].getDiff() <= Math.abs(pbe[i].getDiff())) && (plon[j].getDiff() != 0)) {
                            if (plon[j].getDiff() == 0 || pbe[i].getDiff() == 0) {
                                continue;
                            }
                            System.out.println(
                                    pbe[i].getName() + " se tra " + plon[j].getName() + " " + plon[j].getDiff()
                                    + " kVND");
                            double newDiff = pbe[i].getDiff() + plon[j].getDiff();
                            pbe[i].setDiff(newDiff);
                            plon[j].setDiff(0);
                            System.out.println(i + " " + j);
                            System.out.println(pbe[i].getDiff() + " " + plon[j].getDiff());
                            //break;
                        } else if ((plon[j].getDiff() > Math.abs(pbe[i].getDiff())) && (plon[j].getDiff() != 0)) {
                            System.out.println(pbe[i].getName() + " se tra " + plon[j].getName() + " "
                                    + Math.abs(pbe[i].getDiff()) + " kVND");

                            double newDiff = pbe[i].getDiff() + plon[j].getDiff();
                            plon[j].setDiff(newDiff);
                            pbe[i].setDiff(0);
                            System.out.println(i + " " + j);
                            System.out.println(pbe[i].getDiff() + " " + plon[j].getDiff());
                            break;
                        } else if ((plon[j].getDiff() == 0) && (pbe[i].getDiff() == 0)) {
                            System.out.println(i + " " + j);
                            System.out.println(pbe[i].getDiff() + " " + plon[j].getDiff());
                            System.out.println("dfgdf");
                            break;
                        }
                    }
                }
            }
        }
    }
}
