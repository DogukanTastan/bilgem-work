package com.Coffee;
import com.bilgem.Coffee;
/**
 * Caffe Latte kahvesini temsil eden sınıf.
 * {@link Coffee} interface ini uygular.
 */
public class CaffeLatte implements Coffee {
    /**
     * Kahvenin adını döner.
     * 
     * @return "Caffe Latte" stringi
     */
    @Override
    public String getName() {
        return "Caffe Latte";
    }
    /**
     * kahvenin hazırlanma açıklamasını döner.
     * 
     * @return Kahve hazırlanma açıklaması
     */
    @Override
    public String prepare() {
       return "Caffe Latte seçtiniz içeceğiniz 1x Espresso, 3x Steamed Milk, 1x Milk Foam içermektedir.";
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