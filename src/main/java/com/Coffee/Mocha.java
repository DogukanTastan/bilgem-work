package com.Coffee;
import com.bilgem.Coffee;
/**
 * 
 * Mocha kahvesini temsil eden sınıf.
 * {@link Coffee} interface ini uygular.
 */
public class Mocha implements Coffee {
   /**
     * Kahvenin adını döner.
     * 
     * @return "Mocha" stringi
     */
    @Override
    public String getName() {
        return "Mocha";
    }
 /**
     * kahvenin hazırlanma açıklamasını döner.
     * 
     * @return Kahve hazırlanma açıklaması
     */
    @Override
    public String prepare() {
        return "Mocha seçtiniz içeceğiniz 1x Espresso, 1x Steamed Milk, 1x Milk Foam, 1x Hot Chocolate içermektedir.";
    }
    /**
     * Kahvenin fiyatını TL cinsinden döner.
     * 
     * @return 32 (Türk Lirası)
     */
    @Override
    public int getPrice() {
        return 32;
    }
}