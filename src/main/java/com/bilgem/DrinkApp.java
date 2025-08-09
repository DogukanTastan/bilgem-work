package com.bilgem;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Kahve sipariş uygulamasının ana sınıfı.
 * Konsol üzerinden kullanıcıdan kahve seçimi alır,
 * sipariş oluşturur ve hazırlanma bilgilerini gösterir.
 */
public class DrinkApp {

    /**
     * Kullanıcıdan kahve seçimi alır, geçersiz girişlerde uyarır,
     * seçilen kahvenin fiyatını ve hazırlanma açıklamasını gösterir.
     * Program "0" tuşlandığında sonlanır.
     */
    public void coffeeMachine() {
        OrderService orderService = new OrderService();
        MenuService menuService = new MenuService(orderService);
        menuService.displayMenu();
       


       
    }
}
