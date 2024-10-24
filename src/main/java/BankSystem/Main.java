package BankSystem;

import java.util.Scanner;

public class Main {
    static Scanner scann = new Scanner(System.in);
    public static void main(String[] args) {
        Accout accout=new Accout();
methd(accout);
    }
    public static void methd(Accout accout) {
        System.out.println("1чи карта");
        System.out.println("1-баланс текшеру ");
        System.out.println("2-картага акча салуу");
        System.out.println("3-картадан акча алуу");
        System.out.println("---------------------------");
        boolean exit = false;
        while (!exit) {
            int change = scann.nextInt();

            switch (change) {
                case 1:
                    accout.checkBalance();
                    break;
                case 2:
                    accout.deposit();
                    break;
                case 3:
                    accout.withdrawal();
                    break;
                case 5:
                    exit = true;
                    break;
            }

    }

}}