import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

        private WaterBottle waterBottle;

        @Before
        public void before(){
            waterBottle = new WaterBottle(100);
        }

    @Test
    public void bottle_has_volume(){
        assertEquals(100, waterBottle.getVolume());
    }
    @Test
    public void can_drink_from_bottle(){
        assertEquals(90, waterBottle.canDrinkFromBottle());
    }

    @Test
    public void can_empty_bottle(){
        assertEquals(0, waterBottle.canEmptyBottle());
    }

    @Test
    public void can_fill_full_bottle(){
        assertEquals(100, waterBottle.canFillFullBottle());
    }
}

