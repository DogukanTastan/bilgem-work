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
    public void testAllDrinkTypes() {
        DrinkFactory factory = new DrinkFactory();
        
        // Tüm kahve türleri için test
        for (int i = 1; i <= 7; i++) {
            Drink drink = factory.createDrink(i);
            assertNotNull(drink);
            assertTrue(drink.getPrice() > 0);
            assertNotNull(drink.getName());
            assertNotNull(drink.prepare());
        }
    }


}

