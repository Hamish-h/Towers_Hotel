import Room.ConferenceRoom;
import enums.ConferenceType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Conference Room", ConferenceType.SMALL, 50.00);
    }

    @Test
    public void hasName(){
        assertEquals("Conference Room", conferenceRoom.getName());
    }

    @Test
    public void hastype(){
        assertEquals(ConferenceType.SMALL, conferenceRoom.getType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void canGetRate(){
        assertEquals(50, conferenceRoom.getRoomRate(), 0.01);
    }

}
