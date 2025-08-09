package com.bilgem;
import java.util.Scanner;

public class MenuService {
    Scanner scanner = new Scanner(System.in);  // Kullanıcıdan input almak icin scanner nesnesi
    private final OrderService orderService;   // Dependency Injection için OrderService nesnesi

    public MenuService(OrderService orderService) {
        this.orderService = orderService;  // Constructor'da OrderService nesnesi inject ediliyor
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\nLütfen içmek istediğiniz kahvenin numarasını giriniz");
            System.out.println("1-Espresso(20 TL)\n2-Cappuccino(28 TL)\n3-CaffeLatte(28 TL)\n4-Mocha(32 TL)\n5-Americano(26 TL)\n6-DoubleEspresso(27 TL)\n7-HotWater(5 TL)\n0-Exit");

            int num = scanner.nextInt();
            if (num == 0) 
            {
                break;  // çıkış
            }

            orderService.processOrder(num);  // Kullanıcıdan alınan tercih OrderService e gönderiliyor.
          
        }
        scanner.close(); // Kullanıcıdan alınan input işlemi bittikten sonra Scanner nesnesi kapatılıyor
    } 
}
