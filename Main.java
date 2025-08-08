import java.util.Scanner;

public class Main {
   
    public static void main(String args[]) {
        CoffeMachine();
    }

    public static void CoffeMachine(){
        while(true){
            System.out.println("\nKahve Makinesine Hoşgeldiniz...\nLütfen içmek istediğiniz kahvenin numarasını giriniz");
            System.out.println("1-Espresso\n2-Cappuccino\n3-CaffeLatte\n4-Mocha\n5-Americano\n6-DoubleEspresso\n7-HotWater\n8-Exit");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            switch(num){
                case 1:
                    Espresso espresso = new Espresso();
                    System.out.println(espresso.getName());
                    System.out.println(espresso.getPrice());
                    System.out.println(espresso.prepare());
                    break;
                case 2:
                    Cappuccino cappuccino = new Cappuccino();
                    System.out.println(cappuccino.getName());
                    System.out.println(cappuccino.getPrice());
                    System.out.println(cappuccino.prepare());
                    break;
                case 3:
                    CaffeLatte caffeLatte = new CaffeLatte();
                    System.out.println(caffeLatte.getName());
                    System.out.println(caffeLatte.getPrice());
                    System.out.println(caffeLatte.prepare());
                    break;
                case 4:
                    Mocha mocha = new Mocha();
                    System.out.println(mocha.getName());
                    System.out.println(mocha.getPrice());
                    System.out.println(mocha.prepare());
                    break;
                case 5:
                    Americano americano = new Americano();
                    System.out.println(americano.getName());
                    System.out.println(americano.getPrice());
                    System.out.println(americano.prepare());
                    break;
                case 6:
                    DoubleEspresso doubleEspresso = new DoubleEspresso();
                    System.out.println(doubleEspresso.getName());
                    System.out.println(doubleEspresso.getPrice());
                    System.out.println(doubleEspresso.prepare());
                    break;
                case 7:
                    HotWater hotWater = new HotWater();
                    System.out.println(hotWater.getName());
                    System.out.println(hotWater.getPrice());
                    System.out.println(hotWater.prepare());
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lütfen 1-8 arasında bir sayı giriniz.");
                    break;
            }
        }
    }
}

