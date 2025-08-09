package com.bilgem;

/**
 * İçecek nesnelerini oluşturan factory sınıfı.
 * Builder pattern kullanarak içecek üretimi sağlar.
 */
public class DrinkFactory {

    private final DrinkBuilder builder; // içecek oluşturacak builder nesnesi
    
    /**
     * DrinkFactory constructor.
     * CoffeeBuilder ile initialize edilir.
     */
    public DrinkFactory() {
        this.builder = new CoffeeBuilder(); // constructorda initialize ediliyor
    }
    
    /**
     * Kullanıcının seçimine göre içecek oluşturur.
     * 
     * @param num Kullanıcının seçtiği içecek numarası
     * @return Oluşturulan Drink nesnesi veya null (geçersiz seçim)
     */
    public Drink createDrink(int num) {
        try {
            // Builder'ı temizle (yeniden kullanım için)
            if (builder instanceof CoffeeBuilder) {
                ((CoffeeBuilder) builder).reset();
            }
            
            switch (num) {
                case 1: // Espresso
                    return builder.setName("Espresso")
                                 .setPrice(20)
                                 .addIngredient("Espresso", 1)
                                 .build();
                
                case 2: // Cappuccino
                    return builder.setName("Cappuccino")
                                 .setPrice(28)
                                 .addIngredient("Espresso", 1)
                                 .addIngredient("Steamed Milk", 2)
                                 .addIngredient("Milk Foam", 2)
                                 .build();
                
                case 3: // Caffe Latte
                    return builder.setName("Caffe Latte")
                                 .setPrice(28)
                                 .addIngredient("Espresso", 1)
                                 .addIngredient("Steamed Milk", 3)
                                 .addIngredient("Milk Foam", 1)
                                 .build();
                
                case 4: // Mocha
                    return builder.setName("Mocha")
                                 .setPrice(32)
                                 .addIngredient("Espresso", 1)
                                 .addIngredient("Steamed Milk", 1)
                                 .addIngredient("Milk Foam", 1)
                                 .addIngredient("Hot Chocolate", 2)
                                 .build();
                
                case 5: // Americano
                    return builder.setName("Americano")
                                 .setPrice(26)
                                 .addIngredient("Espresso", 1)
                                 .addIngredient("Hot Water", 4)
                                 .build();
                
                case 6: // Double Espresso
                    return builder.setName("Double Espresso")
                                 .setPrice(27)
                                 .addIngredient("Espresso", 2)
                                 .build();
                
                case 7: // Hot Water
                    return builder.setName("Hot Water")
                                 .setPrice(5)
                                 .addIngredient("Hot Water", 5)
                                 .build();
                
                default:
                    return null; // Geçersiz seçim
            }
        } 
        catch (IllegalStateException e) {
            System.err.println("Drink creation failed: " + e.getMessage());
            return null;
        }
    }
    
    

     /* 
    public Drink createLegacyDrink(int num) { // Buildersız eski metot
        switch (num) {
            case 1: return new Espresso();
            case 2: return new Cappuccino();
            case 3: return new CaffeLatte();
            case 4: return new Mocha();
            case 5: return new Americano();
            case 6: return new DoubleEspresso();
            case 7: return new HotWater();
            default: return null;
        }
    }
        */
}