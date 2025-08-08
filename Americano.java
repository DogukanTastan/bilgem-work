
public class Americano implements Coffee {

    @Override
    public String getName() {
        return "Americano";
    }

    @Override
    public String prepare() {
        return "Americano seçtiniz içeceğiniz 1x Espresso, 4x Hot Water içermektedir.";
    }

    @Override
    public int getPrice() {
        return 26;
    }
    
    
}