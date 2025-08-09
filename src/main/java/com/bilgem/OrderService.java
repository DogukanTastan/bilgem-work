package com.bilgem;

public class OrderService {
    public void processOrder(int selection) { 

        DrinkFactory factory = new DrinkFactory(); // Kullanıcının seçimine göre içecek oluşturacak olan Factory nesnesi oluşturuluyor.
        Drink drink = factory.createDrink(selection);  // Kullanıcının seçimi factory nesnesine verilerek oluşturulacak Drink nesnesi alınıyor
        
        if (drink != null) // ek kontroller
        {
            System.out.println("Teşekkürler kahveniz hazırlanıyor...");
            System.out.println(drink.prepare()+" Afiyet Olsun");
            System.out.println("Kahvenizin fiyatı: " + drink.getPrice() + " TL");
        } 
        else 
        {
            System.out.println("Lütfen geçerli bir numara giriniz");
        }

    }

}
