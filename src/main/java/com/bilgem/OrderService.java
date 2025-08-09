package com.bilgem;

public class OrderService {
    public void processOrder(int selection) { 

        DrinkFactory factory = new DrinkFactory();
        Drink drink = factory.createDrink(selection);
        if (drink != null) {
            System.out.println("Teşekkürler kahveniz hazırlanıyor...");
            System.out.println(drink.prepare()+" Afiyet Olsun");
            System.out.println("Kahvenizin fiyatı: " + drink.getPrice() + " TL");
        } 
        else {
            System.out.println("Lütfen geçerli bir numara giriniz");
        }

    }

}
