package com.codeclan.example;

import java.util.ArrayList;

public class DiningRoom extends Room {

    private String name;

    public DiningRoom(String name, RoomType roomType, int capacity, ArrayList<Guest> guests) {
        super(roomType.getCapacity(), guests);
        this.name = name;
    }

    public String getName() {
        return name;
    }




}
