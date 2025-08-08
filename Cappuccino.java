
public class Cappuccino implements Coffee {

    @Override
    public String getName() {
        return "Cappuccino";
    }

    @Override
    public String prepare() {
        return "Cappuccino seçtiniz içeceiğiniz 1x Espresso, 2x Steamed Milk,2x Milk Foam içermektedir.";
    }

    @Override
    public int getPrice() {
        return 28;
    }
    
    
}