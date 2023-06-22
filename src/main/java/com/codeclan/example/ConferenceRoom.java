package com.codeclan.example;

import java.util.ArrayList;

public class ConferenceRoom extends Room {
    private String name;
    private RoomType roomType;

    public ConferenceRoom(RoomType roomType, int capacity, ArrayList guests, String name) {
        super(roomType.getCapacity(), guests);
        this.name = name;
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return roomType;
    }


    public int getCapacity() {
        return this.roomType.getCapacity();
    }

    public String getName() {
        return name;
    }
}