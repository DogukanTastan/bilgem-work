package com.bilgem;
import com.Coffee.*;

/**
 * Coffee nesnelerini oluşturan factory sınıfı.
 * Kullanıcıdan gelen kahve numarasına göre ilgili Coffee
 * alt sınıfından nesne yaratır.
 */
public class DrinkFactory {

    public Drink createDrink(int num) {
        if (num == 1) {
            return new Espresso();
        } 
        else if (num == 2) {
            return new Cappuccino();
        } 
        else if (num == 3) {
            return new CaffeLatte();
        } 
        else if (num == 4) {
            return new Mocha();
        } 
        else if (num == 5) {
            return new Americano();
        } 
        else if (num == 6) {
            return new DoubleEspresso();
        } 
        else if (num == 7) {
            return new HotWater();
        } 
        else {
            return null;
        }
    }
}
