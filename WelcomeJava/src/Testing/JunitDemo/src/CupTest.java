import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c= new Cup("Juice", 55.5);
        assertEquals("Juice", c.getLiquidType());
    }
    @Test
    void getPercentFull() {
        Cup c= new Cup("Juice", 55.5);
        assertEquals(55.5, c.getPercentFull(), 0.001);
    }

    @Test
    void setLiquidType() {
        Cup c= new Cup("Juice", 55.5);
        c.setLiquidType("Orange Juice");
        assertEquals("Orange Juice", c.getLiquidType());
    }

    @Test
    void sePercentFull(){
        Cup c = new Cup("Juice", 55.5);
        c.setPercentFull(100);
        assertEquals(100, c.getPercentFull());
    }

}