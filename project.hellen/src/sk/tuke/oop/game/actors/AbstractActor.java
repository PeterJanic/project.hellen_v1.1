package sk.tuke.oop.game.actors;

import sk.tuke.oop.framework.Actor;
import sk.tuke.oop.framework.Animation;
import sk.tuke.oop.framework.World;

public abstract class AbstractActor implements Actor{

    private World world;
    private int x, y;
    private Animation animation;

    @Override
    public void addedToWorld(World world) {
        this.world = world;
    }

    @Override
    public World getWorld() {
        return world;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean intersects(Actor actor) {

        return false;
    }

    @Override
    public void setAnimation(Animation animation) {
        this.animation = animation;
    }
}
