package com.bilgem;

/**
 * Uygulamanın giriş noktası.
 * CoffeeApp sınıfını başlatır ve kahve makinesini çalıştırır.
 * 
 * @author Doğukan Taştan
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        CoffeeApp app = new CoffeeApp();   // işlemleri başlatan CoffeeApp sınıfı
        app.CoffeeMachine();
    }
}
