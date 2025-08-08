package com.Coffee;
import com.bilgem.Coffee;

public class HotWater implements Coffee {

    @Override
    public String getName() {
        return "HotWater";
    }

    @Override
    public String prepare() {
        return "HotWater seçtiniz içeceğiniz 5x Hot Water içermektedir.";
    }

    @Override
    public int getPrice() {
        return 5;
    }

    
    
    
}