package com.Coffee;
import com.bilgem.Coffee;
/**
 * Espresso kahvesini temsil eden sınıf.
 * {@link Coffee} interface ini uygular.
 */
public class Espresso implements Coffee {
   /**
     * Kahvenin adını döner.
     * 
     * @return "Double" stringi
     */
    @Override
    public String getName() {
        return "Espresso";
    }
    /**
     * kahvenin hazırlanma açıklamasını döner.
     * 
     * @return Kahve hazırlanma açıklaması
     */
    @Override
    public String prepare() {
        return "Espresso seçtiniz içeceğiniz 1x Espresso içermektedir.";
    }
    /**
     * Kahvenin fiyatını TL cinsinden döner.
     * 
     * @return 20 (Türk Lirası)
     */
    @Override
    public int getPrice() {
        return 20;
    }

   
    
    
}
