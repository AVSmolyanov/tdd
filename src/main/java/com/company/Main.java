package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws BadDataExeption {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму кредита:");
        Double amount = scanner.nextDouble();
        System.out.println("Введите срок кредита (месяцев):");
        Byte period = scanner.nextByte();
        System.out.println("Введите ставку кредита (процентов):");
        Double rate = scanner.nextDouble();

        try {
            Credit credit = new Credit(amount,period,rate);
            System.out.println("Месячный платеж: "+ credit.monthPayment());
            System.out.println("Общая сумма к возврату в банк: "+credit.fullAmount());
            System.out.println("Переплата за весь период: "+(credit.fullAmount()-amount));
        } catch (BadDataExeption e) {
            System.out.println(e);
        }

    }

}

