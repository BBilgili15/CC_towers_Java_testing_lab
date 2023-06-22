package com.codeclan.example;

import java.util.ArrayList;

public class Bedroom extends Room {
    private int roomNumber;
    private RoomType roomType;

    public Bedroom(RoomType roomType, int capacity, ArrayList guests, int roomNumber) {
        super(roomType.getCapacity(), guests);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }


    public int getCapacity() {
        return this.roomType.getCapacity();
    }
}
