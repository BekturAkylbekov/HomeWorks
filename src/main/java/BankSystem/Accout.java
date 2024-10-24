package BankSystem;

import java.util.Scanner;

public class Accout {
    Scanner scanner = new Scanner(System.in);
    double balance;

    // Баланс текшерүү
    public void checkBalance() {
        System.out.println("Сиздин балансыңыз: " + balance + " сом");
    }

    // Акча кошуу
    public void deposit() {
        System.out.println("Баланска канча акча кошууну каалайсыз?");
        double plus = scanner.nextDouble();
        balance += plus; // Балансты жаңыртабыз
        System.out.println("Балансыңызга " + plus + " сом кошулду. Жаңы баланс: " + balance + " сом");
    }

    // Акча алуу
    public void withdrawal() {
        System.out.println("Баланстан канча акча алгыңыз келет?");
        double minus = scanner.nextDouble();

        if (minus <= balance) {
            balance -= minus; // Балансты жаңыртабыз
            System.out.println("Балансыңыздан " + minus + " сом алынды. Жаңы баланс: " + balance + " сом");
        } else {
            System.out.println("Жетиштүү баланс жок! Сиздин учурдагы балансыңыз: " + balance + " сом");
        }
    }}
