package com.Coffee;
import com.bilgem.Coffee;
/**
 * Double Espresso kahvesini temsil eden sınıf.
 * {@link Coffee} interface ini uygular.
 */
public class DoubleEspresso implements Coffee {
    /**
     * Kahvenin adını döner.
     * 
     * @return "Double Espresso" stringi
     */
    @Override
    public String getName() {
        return "Double Espresso";
    }
    /**
     * kahvenin hazırlanma açıklamasını döner.
     * 
     * @return Kahve hazırlanma açıklaması
     */
    @Override
    public String prepare() {
        return "Double Espresso seçtiniz içeceğiniz 2x Espresso içermektedir.";
    }
    /**
     * Kahvenin fiyatını TL cinsinden döner.
     * 
     * @return 27 (Türk Lirası)
     */
    @Override
    public int getPrice() {
        return 27;
    }

  
    
    
}