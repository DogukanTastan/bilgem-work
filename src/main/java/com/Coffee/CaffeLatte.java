package com.Coffee;
import com.bilgem.Coffee;

public class CaffeLatte implements Coffee {

    @Override
    public String getName() {
        return "CaffeLatte";
    }

    @Override
    public String prepare() {
       return "CaffeLatte seçtiniz içeceğiniz 1x Espresso, 3x Steamed Milk, 1x Milk Foam içermektedir.";
    }

    @Override
    public int getPrice() {
        return 28;
    }

   
    
    
}