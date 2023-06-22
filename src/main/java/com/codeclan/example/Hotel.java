package com.codeclan.example;

import com.sun.source.tree.LambdaExpressionTree;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(ArrayList bedrooms, ArrayList conferenceRooms, HashMap<String, DiningRoom> diningRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public int countConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public Booking bookRoom(Bedroom bedroom, int numOfNights) {
        return new Booking(bedroom, numOfNights);
    }

    public void checkIn(ArrayList<Guest> guestsToCheckIn, Room room){
        if (room.countGuests() == 0) {
            room.setGuests(guestsToCheckIn);
        }
    }

    public int diningRoomExists() {
        return this.diningRooms.size();
    }

    public void checkOut(Room room) {
        room.emptyRoom();
    }


}
