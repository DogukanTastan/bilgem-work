package com.bilgem;
import java.util.Scanner;

public class CoffeeApp {
    public void CoffeeMachine(){
        Scanner scanner = new Scanner(System.in);  

        while(true){
            System.out.println("\nKahve Makinesine Hoşgeldiniz...\nLütfen içmek istediğiniz kahvenin numarasını giriniz");
            System.out.println("1-Espresso\n2-Cappuccino\n3-CaffeLatte\n4-Mocha\n5-Americano\n6-DoubleEspresso\n7-HotWater\n8-Exit");

            try {
                int num = scanner.nextInt();
                if(num==8){
                    break;
                }

                CoffeeFactory factory = new CoffeeFactory();
                Coffee coffee = factory.createCoffee(num);
                if(coffee!=null){
                    System.out.println("Kahvenizin fiyatı: "+coffee.getPrice()+" TL");
                    System.out.println(coffee.prepare());
                }
                else{
                    System.out.println("Lutfen gecerli bir numara giriniz");
                }
            }
            catch(Exception e){
                System.out.println("Lutfen gecerli bir format giriniz");
                scanner.nextLine(); // Hatalı inputu temizle
            }
        }

        scanner.close();  
    }
}

