package org.dav.less01.task2;

public class Chicken implements HealtyFood{
    @Override
    public boolean getProneins() {
        return true;
    }

    @Override
    public boolean getFats() {
        return false;
    }

    @Override
    public boolean getCarbohydrates() {
        return false;
    }

    @Override
    public String getName() {
        return "Chicken";
    }
}
