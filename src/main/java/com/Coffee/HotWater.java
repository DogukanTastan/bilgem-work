package com.Coffee;
import com.bilgem.NonCoffeeDrink;
/**
 * Sıcak suyu temsil eden sınıf.
 * {@link NonCoffeeDrink} interface ini uygular.
 */
public class HotWater implements NonCoffeeDrink {
    /**
     * Suyun Adını döner.
     * 
     * @return "Double" stringi
     */
    @Override
    public String getName() {
        return "Hot Water";
    }
   /**
     *  Suyun hazırlanma açıklamasını döner.
     * 
     * @return Su hazırlanma açıklaması
     */
    @Override
    public String prepare() {
        return "Hot Water seçtiniz içeceğiniz 5x Hot Water içermektedir.";
    }
/**
     * Suyun fiyatını TL cinsinden döner.
     * 
     * @return 5 (Türk Lirası)
     */
    @Override
    public int getPrice() {
        return 5;
    }

    
    
    
}