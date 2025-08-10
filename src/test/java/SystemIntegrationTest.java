import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import com.bilgem.*;

public class SystemIntegrationTest {
    @Test
    void testCompleteOrderFlow() {  // tam akış kontrolü
        String simulatedInput = "1\n0\n"; // Select Espresso, then Exit
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        System.setOut(new PrintStream(outputStream));
        
        OrderService orderService = new OrderService();
        orderService.processOrder(1);
 
        String output = outputStream.toString();
        assertTrue(output.contains("Teşekkürler kahveniz hazırlanıyor..."));
        assertTrue(output.contains("Espresso seçtiniz"));
        assertTrue(output.contains("1x Espresso"));
        assertTrue(output.contains("Afiyet Olsun"));
        assertTrue(output.contains("20 TL"));
    }

    @Test
    void testInvalidOrderHandling() {
       
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        OrderService orderService = new OrderService();
        orderService.processOrder(999); // Invalid input
        
        String output = outputStream.toString();
        assertTrue(output.contains("Lütfen geçerli bir numara giriniz"));
    }

    @Test 
    void testMenuOrderServiceIntegration() {  // menu-order service integration (without actual input)
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
        System.setOut(new PrintStream(outputStream));
        
        // Simulate menu service usage
        OrderService orderService = new OrderService();
        MenuService menuService = new MenuService(orderService);
        
        orderService.processOrder(3); // Caffe Latte
        
        String output = outputStream.toString();
        assertTrue(output.contains("Teşekkürler kahveniz hazırlanıyor"));
        assertTrue(output.contains("Caffe Latte seçtiniz"));
        assertTrue(output.contains("28 TL"));
        assertTrue(output.contains("3x Steamed Milk"));
        assertTrue(output.contains("1x Milk Foam"));
    }


    
    
}
