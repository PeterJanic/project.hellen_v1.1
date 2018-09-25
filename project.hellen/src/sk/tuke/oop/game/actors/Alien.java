package sk.tuke.oop.game.actors;

import sk.tuke.oop.framework.Actor;
import sk.tuke.oop.framework.Animation;
import sk.tuke.oop.framework.Input;
import sk.tuke.oop.framework.World;
import sk.tuke.oop.game.actions.Move;

public class Alien extends AbstractActor implements Movable {
    private int x, y;
    private int width, height;
    private int step;
    private String name = "YourNightmare";

    private int time, rand1, rand2;

    private Animation alienAnimation;




    public Alien() {

        x = 150;
        y = 150;

        alienAnimation = new Animation("resources/sprites/warrior_alien.png", 32, 32, 100);
        setAnimation(alienAnimation);
        alienAnimation.setPingPong(true);
        setPosition(x,y);
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
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Animation getAnimation() {
        return alienAnimation;
    }


    @Override
    public void act() {

        if (time == 0){
            rand1 = (int) (Math.random()*3);
            rand2 = (int) (Math.random()*3);
            step = (int) (Math.random()*2) + 1;
            time = 100;
        }
        time--;

        if (rand1 == 2)
            rand1 = -1;

        if (rand2 == 2)
            rand2 = -1;

        Move move = new Move();

        move.execute(this, step, rand1, rand2);

    }

    @Override
    public boolean intersects(Actor actor) {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
