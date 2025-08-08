import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.bilgem.*;


public class DrinkFactoryTest {

    @Test
    public void testCreateCoffee_ValidInput() {
        DrinkFactory factory = new DrinkFactory();
        Drink espresso = factory.createDrink(1);
        assertNotNull(espresso);
        assertEquals("Espresso", espresso.getName());
        assertEquals(20, espresso.getPrice());
    }

    @Test
    public void testCreateCoffee_InvalidInput() {
        DrinkFactory factory = new DrinkFactory();
        Drink coffee = factory.createDrink(999);
        assertNull(coffee);  // coffee değişkeninin null olmasını bekler.
    }

    @Test
    public void testCreateDrink_NegativeInput() {
        DrinkFactory factory = new DrinkFactory();
        Drink drink = factory.createDrink(-1);
        assertNull(drink, "Negative input should return null");
    }
    @Test
    public void testHotWaterIsNonCoffeeDrink() {
        DrinkFactory factory = new DrinkFactory();
        Drink hotWater = factory.createDrink(7);
        assertNotNull(hotWater);
        assertEquals("Hot Water", hotWater.getName());
        //interface kontrolü 
        assertTrue(hotWater instanceof com.bilgem.NonCoffeeDrink, "HotWater should be instance of NonCoffeeDrink");
    }
}

