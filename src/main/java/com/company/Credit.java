package com.company;

public class Credit {
    private Double amount;
    private Byte period;
    private Double rate;


    public Credit(Double amount, Byte period, Double rate) throws BadDataExeption {

        if (rate < 0) throw new BadDataExeption("Ставка по кредиту не может быть отрицательной");

        this.amount = amount;
        this.period = period;
        this.rate = rate;
    }


    public Double monthPayment() {
        return amount / period + amount * rate / 100;
    }


    public Double fullAmount() {
        return amount + amount * period * rate / 100;
    }

}
