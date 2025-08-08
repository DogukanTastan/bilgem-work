package com.Coffee;
import com.bilgem.Coffee;
/**
 * Cappuccino kahvesini temsil eden sınıf.
 * {@link Coffee} interface ini uygular.
 */
public class Cappuccino implements Coffee {
  /**
     * Kahvenin adını döner.
     * 
     * @return "Cappuccino" stringi
     */
    @Override
    public String getName() {
        return "Cappuccino";
    }
    /**
     * kahvenin hazırlanma açıklamasını döner.
     * 
     * @return Kahve hazırlanma açıklaması
     */
    @Override
    public String prepare() {
        return "Cappuccino seçtiniz içeceğiniz 1x Espresso, 2x Steamed Milk, 2x Milk Foam içermektedir.";
    }
    /**
     * Kahvenin fiyatını TL cinsinden döner.
     * 
     * @return 28 (Türk Lirası)
     */
    @Override
    public int getPrice() {
        return 28;
    }

   
    
    
}