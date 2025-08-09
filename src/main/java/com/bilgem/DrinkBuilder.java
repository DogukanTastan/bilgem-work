package com.bilgem;

/**
 * İçecek nesnelerini oluşturmak için Builder pattern interface'i.
 */
public interface DrinkBuilder {
    /**
     * İçeceğin adını belirler.
     * 
     * @param name İçeceğin adı
     * @return Builder instance 
     */
    DrinkBuilder setName(String name);
    
    /**
     * İçeceğin fiyatını belirler.
     * 
     * @param price İçeceğin fiyatı TL cinsinden
     * @return Builder instance
     */
    DrinkBuilder setPrice(int price);
    
    /**
     * İçeceğe hammadde ekler.
     * 
     * @param ingredient Hammadde adı
     * @param quantity Miktar
     * @return Builder instance
     */
    DrinkBuilder addIngredient(String ingredient, int quantity); // içerik ,miktar
    
    /**
     * Builder'dan Drink nesnesi oluşturur.
     * 
     * @return Oluşturulan Drink nesnesi
     */
    Drink build();

}
