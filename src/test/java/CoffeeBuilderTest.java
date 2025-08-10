import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.bilgem.*;

public class CoffeeBuilderTest {

    @Test
    void testCreateEspresso() {
        DrinkBuilder builder =new CoffeeBuilder();
        Drink espresso = builder
            .setName("Espresso")
            .setPrice(20)
            .addIngredient("Espresso", 1)
            .build();
        
        assertEquals("Espresso", espresso.getName());
        assertEquals(20, espresso.getPrice());
        assertTrue(espresso.prepare().contains("1x Espresso"));
    }

    @Test
    void testSpecialCharactersInName() {
        DrinkBuilder builder =new CoffeeBuilder();   // isim karekter testi
      
        Drink drink = builder
            .setName("Café Latté™")
            .setPrice(30)
            .addIngredient("Espresso", 1)
            .build();
       
        assertEquals("Café Latté™", drink.getName());
    }

    @Test
    void testLargeQuantityIngredient() {
        DrinkBuilder builder =new CoffeeBuilder(); // fazla sipariş testi
        Drink drink = builder
            .setName("Extreme Coffee")
            .setPrice(100)
            .addIngredient("Espresso", 10000)
            .build();
        
        
        assertTrue(drink.prepare().contains("10000x Espresso"));
    }

     
    @Test
    void testMaximumPrice() {
        DrinkBuilder builder =new CoffeeBuilder();
        Drink drink = builder
            .setName("Expensive Coffee")
            .setPrice(Integer.MAX_VALUE)
            .addIngredient("Gold Espresso", 1)
            .build();
        
        assertEquals(Integer.MAX_VALUE, drink.getPrice());
    }



}
