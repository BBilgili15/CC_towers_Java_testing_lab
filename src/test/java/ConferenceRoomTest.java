import com.codeclan.example.Bedroom;
import com.codeclan.example.ConferenceRoom;
import com.codeclan.example.Guest;
import com.codeclan.example.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest1 ;
    Guest guest2 ;


    @Before
    public void before() {
        ArrayList<Guest> guests = new ArrayList<>();
        guest1 = new Guest("Angel Gonzalez");
        guests.add(guest1);
        guest2 = new Guest("Ben Bilgili");
        guests.add(guest2);
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, RoomType.CONFERENCE.getCapacity(), guests, "The Big Conference");
    }

    @Test
    public void hasGuests() {
        assertEquals(2, conferenceRoom.countGuests());
    }

    @Test
    public void hasCapacity() {
        assertEquals(25, conferenceRoom.getCapacity());
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.CONFERENCE, conferenceRoom.getRoomType());
    }

    @Test
    public void hasName() {
        assertEquals("The Big Conference", conferenceRoom.getName());
    }
}
