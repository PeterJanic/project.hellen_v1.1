package sk.tuke.oop.game.items;

import sk.tuke.oop.framework.Animation;
import sk.tuke.oop.framework.Item;
import sk.tuke.oop.game.actors.AbstractActor;

public class Energy extends AbstractActor implements Item {

    private String name;
    private int x, y, width, height;
    private Animation energy;

    public Energy() {
        //super();
        x = 20;
        y = 150;
        energy = new Animation("resources/sprites/energy.png", 16, 16, 100);
        setAnimation(energy);
        setPosition(getX(),getY());
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }


    @Override
    public Animation getAnimation() {
        return energy;
    }


    @Override
    public void act() {


    }

    @Override
    public String getName() {
        return name;
    }
}
