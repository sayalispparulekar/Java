package com.javalearning;

public class House {
    private int noOfRooms;
    private String location;
    private Room room;

    public House(int noOfRooms, String location, Room room) {
        this.noOfRooms = noOfRooms;
        this.location = location;
        this.room = room;
    }
    public void getNames(String name){

        System.out.println("Name changed to : " );
        room.getRoomName(name);
    }
}
