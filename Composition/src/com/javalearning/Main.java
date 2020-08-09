package com.javalearning;

public class Main {

    public static void main(String[] args) { 
    Room room = new Room (4, "Blue", 200);
	House house = new House(5, "Mumbai", room);

	room.getRoomName("Drawing room");
	house.getNames("Study room");
    }
}
