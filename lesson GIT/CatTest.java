import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest extends OutputTest {

    @Test
    public void feed() {
        System.out.print("Cat feed: Chrum-Chrum");
        assertEquals("Cat feed: Chrum-Chrum",output.toString());
    }

    @Test
    public void voice() {
        System.out.print("Cat voice: Meow-Meow");
        assertEquals("Cat voice: Meow-Meow",output.toString());
    }

    @Test
    public void run() {
    }

    @Test
    public void attack() {
    }

    @Test
    public void defence() {
    }
}