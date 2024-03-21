package com.isaac.OOPchallenge;

public class Skin extends Organ {
    private String color;
    private String softness;

    public Skin(String name, String medicalCondition, String color, String softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin color:"+ this.getColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSoftness() {
        return softness;
    }

    public void setSoftness(String softness) {
        this.softness = softness;
    }
}
