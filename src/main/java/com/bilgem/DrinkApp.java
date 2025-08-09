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
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan input almak icin scanner nesnesi

        while (true) {
            System.out.println("\nLütfen içmek istediğiniz kahvenin numarasını giriniz");
            System.out.println("1-Espresso(20 TL)\n2-Cappuccino(28 TL)\n3-CaffeLatte(28 TL)\n4-Mocha(32 TL)\n5-Americano(26 TL)\n6-DoubleEspresso(27 TL)\n7-HotWater(5 TL)\n0-Exit");

            try {
                int num = scanner.nextInt();
                if (num == 0) {
                    break;
                }
                System.out.println("Teşekkürler kahveniz hazırlanıyor...");

                DrinkFactory factory = new DrinkFactory();
                Drink drink = factory.createDrink(num);
                if (drink != null) {
                    System.out.println(drink.prepare()+" Afiyet Olsun");
                    System.out.println("Kahvenizin fiyatı: " + drink.getPrice() + " TL");
                } else {
                    System.out.println("Lütfen geçerli bir numara giriniz");
                }
            } 
            catch (NumberFormatException e) {
                System.out.println("Lütfen geçerli bir format giriniz");
                scanner.nextLine(); // Hatalı inputu temizle
            }
            catch (InputMismatchException e) {
                System.out.println("Lütfen sayı giriniz");
                scanner.nextLine(); // Hatalı inputu temizle
            }
        }
        scanner.close();
    }
}
