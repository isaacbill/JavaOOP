package com.isaac.oopsection;

public class Bird extends Animal{
    private int wing;

    public Bird(String name, String color, int legs, boolean hasTail, int wing) {
        super(name, color, legs, hasTail);
        this.wing = wing;
    }

    @Override
    public void eat(String food) {

        System.out.println("chewing "+ food);
    }

    public void fly(){
        System.out.println(this.getName() + " is flying");
    }
    public int getWing() {
        return wing;
    }

    public void setWing(int wing) {
        this.wing = wing;
    }
}
