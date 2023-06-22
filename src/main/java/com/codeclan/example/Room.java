package com.codeclan.example;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity, ArrayList guests) {
        this.capacity = capacity;
        this.guests = guests;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int countGuests() {
        return this.guests.size();
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public void emptyRoom() {
        this.guests.clear();
    }
}
