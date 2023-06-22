import com.codeclan.example.Bedroom;
import com.codeclan.example.Guest;
import com.codeclan.example.Room;
import com.codeclan.example.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest1 ;
    Guest guest2 ;


    @Before
    public void before() {
        ArrayList<Guest> guests = new ArrayList<>();
        guest1 = new Guest("Angel Gonzalez");
        guests.add(guest1);
        guest2 = new Guest("Ben Bilgili");
        guests.add(guest2);
        bedroom = new Bedroom(RoomType.FAMILY, RoomType.FAMILY.getCapacity(), guests, 6);
    }

    @Test
    public void hasGuests() {
        assertEquals(2, bedroom.countGuests());
    }

    @Test
    public void hasCapacity() {
        assertEquals(4, bedroom.getCapacity());
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.FAMILY, bedroom.getRoomType());
    }
}
