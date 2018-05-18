import Room.DiningRoom;
import enums.DiningType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DiningRoomTest{

        DiningRoom diningroom;

        @Before
        public void before(){
            diningroom = new DiningRoom("The Big Feast", DiningType.RESTAURANT);
        }

        @Test
        public void hasName(){
            assertEquals("The Big Feast", diningroom.getName());
        }

        @Test
        public void hastype(){
            assertEquals(DiningType.RESTAURANT, diningroom.getDiningRoomType());
        }

        @Test
    public void canGetCapacity(){
            assertEquals(50, diningroom.getCapacity());
        }

}
