package com.bilgem;

/**
 * İçecegin interface'i, tüm içecek türleri için temel metotları tanımlar.
 */
public interface Drink {
    /**
     * İçecegin adını döner.
     * 
     * @return Kahvenin adı
     */
    String getName();
    /**
     * İçecegin fiyatını döner.
     * 
     * @return Kahvenin fiyatı TL cinsinden
     */
    int getPrice();
     /**
     * İçecegin hazırlanma sürecini açıklar.
     * 
     * @return Hazırlama açıklaması
     */
    String prepare();
    
}
