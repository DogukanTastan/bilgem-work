package com.bilgem;
import java.util.List;

/**
 * Builder pattern ile oluşturulan içecek sınıfı.
 */
public class CustomDrink implements Drink {
    private final String name;
    private final int price;
    private final List<String> ingredients;
    
    /**
     * CustomDrink constructor
     * 
     * @param name İçeceğin adı
     * @param price İçeceğin fiyatı
     * @param ingredients İçeceğin hammadde listesi
     */
    public CustomDrink(String name, int price, List<String> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getPrice() {
        return price;
    }
    
    @Override
    public String prepare() {
        return name + " seçtiniz içeceğiniz " + 
               String.join(", ", ingredients) + " içermektedir.";
    }
    
    /**
     * @return Hammadde listesi
     */
    public List<String> getIngredients() {
        return ingredients; 
    }
    

}