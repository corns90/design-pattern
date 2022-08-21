package com.corn.decorator;

import lombok.Getter;
import lombok.Setter;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI }

    protected Size size = Size.TALL;

    String description = "";

    public abstract double cost();

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }
}
