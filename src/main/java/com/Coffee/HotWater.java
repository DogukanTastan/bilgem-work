package com.Coffee;
import com.bilgem.Coffee;
/**
 * Sıcak suyu temsil eden sınıf.
 * {@link Coffee} interface ini uygular.
 */
public class HotWater implements Coffee {
    /**
     * Suyun Adını döner.
     * 
     * @return "Double" stringi
     */
    @Override
    public String getName() {
        return "HotWater";
    }
   /**
     *  Suyun hazırlanma açıklamasını döner.
     * 
     * @return Kahve hazırlanma açıklaması
     */
    @Override
    public String prepare() {
        return "HotWater seçtiniz içeceğiniz 5x Hot Water içermektedir.";
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