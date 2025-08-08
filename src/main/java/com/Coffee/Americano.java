package com.Coffee;
import com.bilgem.Coffee;

/**
 * Americano kahvesini temsil eden sınıf.
 * {@link Coffee} interface ini uygular.
 */
public class Americano implements Coffee {

    /**
     * Kahvenin adını döner.
     * 
     * @return "Americano" stringi
     */
    @Override
    public String getName() {
        return "Americano";
    }

    /**
     * Americanonun hazırlanma açıklamasını döner.
     * 
     * @return Kahve hazırlanma açıklaması
     */
    @Override
    public String prepare() {
        return "Americano seçtiniz içeceğiniz 1x Espresso, 4x Hot Water içermektedir.";
    }

    /**
     * Kahvenin fiyatını TL cinsinden döner.
     * 
     * @return 26 (Türk Lirası)
     */
    @Override
    public int getPrice() {
        return 26;
    }
}
