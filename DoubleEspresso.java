public class DoubleEspresso implements Coffee {

    @Override
    public String getName() {
        return "DoubleEspresso";
    }

    @Override
    public String prepare() {
        return "DoubleEspresso seçtiniz içeceiğiniz 2x Espresso içermektedir.";
    }

    @Override
    public int getPrice() {
        return 27;
    }
    
    
}