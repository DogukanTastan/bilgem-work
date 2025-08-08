public class Espresso implements Coffee {

    @Override
    public String getName() {
        return "Espresso";
    }

    @Override
    public String prepare() {
        return "Espresso seçtiniz içeceiğiniz 1x Espresso içermektedir.";
    }

    @Override
    public int getPrice() {
        return 20;
    }
    
    
}
