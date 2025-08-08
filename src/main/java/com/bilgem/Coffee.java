package com.bilgem;

/**
 * Kahve interface'i, tüm kahve türleri için temel metotları tanımlar.
 */
public interface Coffee {
    /**
     * Kahvenin adını döner.
     * 
     * @return Kahvenin adı
     */
    String getName();
    /**
     * Kahvenin fiyatını döner.
     * 
     * @return Kahvenin fiyatı TL cinsinden
     */
    int getPrice();
     /**
     * Kahvenin hazırlanma sürecini açıklar.
     * 
     * @return Hazırlama açıklaması
     */
    String prepare();
    
}
