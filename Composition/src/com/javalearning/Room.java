package com.javalearning;

public class Room {
    private int windows;
    private String color;
    private int width;

    public Room(int windows, String color, int width) {
        this.windows = windows;
        this.color = color;
        this.width = width;
    }

    public void getRoomName(String name){
        System.out.println("This is the " + name);
    }
}
