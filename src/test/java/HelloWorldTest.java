import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    
    @Test
    public void testApplication() {
        // Simple test to verify the application can be instantiated
        HelloWorld app = new HelloWorld();
        assertNotNull(app);
    }
}
