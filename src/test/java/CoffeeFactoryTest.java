import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.bilgem.*;


public class CoffeeFactoryTest {

    @Test
    public void testCreateCoffee_ValidInput() {
        CoffeeFactory factory = new CoffeeFactory();
        Coffee espresso = factory.createCoffee(1);
        assertNotNull(espresso);
        assertEquals("Espresso", espresso.getName());
        assertEquals(20, espresso.getPrice());
    }

    @Test
    public void testCreateCoffee_InvalidInput() {
        CoffeeFactory factory = new CoffeeFactory();
        Coffee coffee = factory.createCoffee(999);
        assertNull(coffee);
    }
}

