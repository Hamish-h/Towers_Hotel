import Room.Bedroom;
import enums.BedroomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(666, BedroomType.SINGLE, 50.00);
    }

    @Test
    public void hasNumber(){
        assertEquals(666, bedroom.getNumber());
    }

    @Test
    public void hastype(){
        assertEquals(BedroomType.SINGLE, bedroom.getType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void canGetRate(){
        assertEquals(50.00, bedroom.getRoomRate(), 0.01);
    }

}
