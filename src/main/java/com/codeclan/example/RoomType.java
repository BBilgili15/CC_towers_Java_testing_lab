package com.codeclan.example;

public enum RoomType {
    SINGLE(1, 99),
    DOUBLE(2, 179),
    TRIPLE(3, 249),
    FAMILY(4, 349),
    DINING(20, 0),
    CONFERENCE(25, 2499);

    private final int capacity;
    private final int price;

    RoomType(int capacity, int price) {
        this.capacity = capacity;
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }
}
