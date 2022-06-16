package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.hamcrest.CoreMatchers;
import static org.junit.Assert.assertThat;

public class CreditTest {

    @Test
    @DisplayName("Проверка вычисления: Рассчет месячного платежа")
    public void test1() throws BadDataExeption {
        Credit credit  = new Credit(100.0, (byte) 10, 10.0);
        Assertions.assertEquals(20.0, credit.monthPayment(),"не верно");
    }

    @Test
    @DisplayName("Проверка вычисления: Рассчет общей суммы к возврату в банк")
    public void test2() throws BadDataExeption {
        Credit credit  = new Credit(100.0, (byte) 10, 10.0);
        Assertions.assertEquals(200.0, credit.fullAmount(),"не верно");
    }


    @Test
    @DisplayName("Проверка вызова эксепшна при отрицательных значениях ставки кредита")
    public void test3() {
        Assertions.assertThrows(BadDataExeption.class, () -> new Credit(100.0, (byte) 10, -10.0));
    }
}
