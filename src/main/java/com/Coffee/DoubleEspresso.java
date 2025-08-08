package com.Coffee;
import com.bilgem.Coffee;

public class DoubleEspresso implements Coffee {

    @Override
    public String getName() {
        return "DoubleEspresso";
    }

    @Override
    public String prepare() {
        return "DoubleEspresso seçtiniz içeceğiniz 2x Espresso içermektedir.";
    }

    @Override
    public int getPrice() {
        return 27;
    }

  
    
    
}