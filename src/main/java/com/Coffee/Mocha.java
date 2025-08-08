package com.Coffee;
import com.bilgem.Coffee;

public class Mocha implements Coffee {

    @Override
    public String getName() {
        return "Mocha";
    }

    @Override
    public String prepare() {
        return "Mocha seçtiniz içeceğiniz 1x Espresso, 1x Steamed Milk, 1x Milk Foam, 1x Hot Chocolate içermektedir.";
    }

    @Override
    public int getPrice() {
        return 32;
    }
}