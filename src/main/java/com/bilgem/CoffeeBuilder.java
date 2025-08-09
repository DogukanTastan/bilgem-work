package com.bilgem;
import java.util.ArrayList;
import java.util.List;

/**
 * Kahve nesnelerini oluşturmak için Builder pattern implementasyonu.
 */
public class CoffeeBuilder implements DrinkBuilder {
    private String name;
    private int price;
    private List<String> ingredients = new ArrayList<>(); // içerik listesi (string)
    
    @Override
    public DrinkBuilder setName(String name) {
        this.name = name;
        return this; // düzenledikten sonra diğer düzenlemeler için objenin kendisini return ediyor 
    }
    
    @Override
    public DrinkBuilder setPrice(int price) {
        this.price = price;
        return this;
    }
    
    @Override
    public DrinkBuilder addIngredient(String ingredient, int quantity) {
        ingredients.add(quantity + "x " + ingredient);
        return this;
    }
    
    @Override
    public Drink build() {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Drink name cannot be null or empty");
        }
        if (price <= 0) {
            throw new IllegalStateException("Drink price must be positive");
        }
        if (ingredients.isEmpty()) {
            throw new IllegalStateException("Drink must have at least one ingredient");
        }
        
        return new CustomDrink(name, price, new ArrayList<>(ingredients));
    }
    
    /**
     * Builder'ı temizler ve yeni bir içecek için hazırlar.
     * 
     * @return Temizlenmiş builder instance
     */
    public CoffeeBuilder reset() {
        this.name = null;
        this.price = 0;
        this.ingredients.clear();
        return this;
    }
}