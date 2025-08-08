public class CoffeeFactory {
    Coffee createCoffee(String type) {
        if (type.equals("Americano")) {
            return new Americano();
        } else if (type.equals("Mocha")) {
            return new Mocha();
        } else if (type.equals("CaffeLatte")) {
            return new CaffeLatte();
        } else if (type.equals("Cappuccino")) {
            return new Cappuccino();
        } else if (type.equals("DoubleEspresso")) {
            return new DoubleEspresso();
        } else if (type.equals("HotWater")) {
            return new HotWater();
        } else {
            return null;
        }
    }
    
}
