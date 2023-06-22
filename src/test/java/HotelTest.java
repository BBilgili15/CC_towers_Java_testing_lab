import com.codeclan.example.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;
    DiningRoom diningRoom;
    Guest guest1 ;
    Guest guest2 ;
    Guest guest3 ;
    Hotel hotel;

    @Before
    public void before() {
        ArrayList<Guest> guests = new ArrayList<>();
        ArrayList<Guest> guests1 = new ArrayList<>();
        guest1 = new Guest("Angel Gonzalez");
        guests.add(guest1);
        guest2 = new Guest("Ben Bilgili");
        guests.add(guest2);
        guest3 = new Guest("Daniel");
        guests1.add(guest3);
        conferenceRoom1 = new ConferenceRoom(RoomType.CONFERENCE, RoomType.CONFERENCE.getCapacity(), guests, "The Big Conference");
        bedroom1 = new Bedroom(RoomType.TRIPLE, RoomType.CONFERENCE.getCapacity(), guests, 1);
        bedroom2 = new Bedroom(RoomType.TRIPLE, RoomType.CONFERENCE.getCapacity(), guests1, 2);
        bedroom3 = new Bedroom(RoomType.TRIPLE, RoomType.CONFERENCE.getCapacity(), new ArrayList<>(), 2);
        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom1);
        DiningRoom diningRoom1 = new DiningRoom("Fancy Room", RoomType.DINING, RoomType.DINING.getCapacity(), guests);
        HashMap<String, DiningRoom> diningRooms = new HashMap<>();
        diningRooms.put(diningRoom1.getName(), diningRoom1);
        hotel = new Hotel(bedrooms, conferenceRooms, diningRooms);
    }

    @Test
    public void countBedrooms() {
        assertEquals(3, hotel.countBedrooms());
    }

    @Test
    public void countConferenceRooms() {
        assertEquals(1, hotel.countConferenceRooms());
    }

    @Test
    public void canBookRoom() {
        Booking booking1 = hotel.bookRoom(bedroom3, 2);
        assertEquals(2, booking1.getNightsBooked());
        assertEquals(bedroom3, booking1.getBedroom());
    }

    @Test
    public void canCheckInGuest() {
        ArrayList<Guest> guestsToCheckIn = new ArrayList<>();
        Guest guest5 = new Guest("Peter");
        guestsToCheckIn.add(guest5);
        hotel.checkIn(guestsToCheckIn, bedroom3);
        assertEquals(1, bedroom3.countGuests());
    }

    @Test
    public void canCheckOutGuest() {
        hotel.checkOut(bedroom1);
        assertEquals(0, bedroom1.countGuests());
    }

    @Test
    public void cantCheckInGuestIfRoomOccupied() {
        ArrayList<Guest> guestsToCheckIn = new ArrayList<>();
        Guest guest5 = new Guest("Peter");
        guestsToCheckIn.add(guest5);
        hotel.checkIn(guestsToCheckIn, bedroom2);
        assertEquals(1, bedroom2.countGuests());
    }

    @Test
    public void canGetBill() {
        Booking booking1 = hotel.bookRoom(bedroom3, 2);
        assertEquals(498, booking1.getTotalBill());
    }

    @Test
    public void hasDiningRoom() {
        assertEquals(1, hotel.diningRoomExists());
    }
}
