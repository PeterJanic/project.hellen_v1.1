package sk.tuke.oop.game.actors;

import sk.tuke.oop.framework.Actor;
import sk.tuke.oop.framework.Animation;
import sk.tuke.oop.framework.Input;
import sk.tuke.oop.framework.World;
import sk.tuke.oop.game.actions.Move;

import static com.sun.awt.SecurityWarning.setPosition;

public class Ripley extends AbstractActor implements Movable {

    //super("Ripley");
    private String name = "Ripley";
    private int x, y;
    private int step = 2;
    private int width, height;
    private World world;
    private int health;

    private Animation ripleyAnimation;


    public Ripley() {
        health = 100;
        x = 110;
        y = 0;
        //width = 32;
        //height = 32;


        ripleyAnimation = new Animation("resources/sprites/player.png", 32, 32, 100);
        this.setAnimation(ripleyAnimation);
        this.ripleyAnimation.setPingPong(true);
        setPosition(x,y);



        //getWorld().centerOn(this);
        //getWorld().addActor(new Ripley());



    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public String getName() {
        return name;
    }

    @Override
    public int getX() {
        //maybe if nejaka kontorla ked existuje este hrac ale zatim jebem
        //well simply i revert/flip these two returns

        if (false) {
            return 0;
        }

        return x;

    }

    @Override
    public int getY() {

        if (false) {
            return 0;
        }

        return y;
    }

    @Override
    public int getWidth() {

        if (false) {
            return 0;
        }

        return width; //code for width xD
    }

    @Override
    public int getHeight() {

        if (false) {
            return 0;
        }

        return height; //code for height
    }

    @Override
    public Animation getAnimation() {
        return ripleyAnimation;
    }

    @Override
    public void setAnimation(Animation animation) {
        ripleyAnimation = animation;
    }

//    public Animation getRipleyAnimation() {
//        return ripleyAnimation;
//    }
//
//    public void setRipleyAnimation(Animation ripleyAnimation) {
//        this.ripleyAnimation = ripleyAnimation;
//    }

    @Override
    public void act() {

        for (Actor actor : getWorld()) {
            System.out.println(actor);
        }

        Move move = new Move();

        Input input = Input.getInstance();
        if(input.isKeyPressed(Input.Key.ESCAPE)){
            System.exit(0);
        }

        if(input.isKeyDown(Input.Key.UP)){
            move.execute(this, step, 0, -1);
        }else if(Input.getInstance().isKeyDown(Input.Key.DOWN)){
            move.execute(this, step, 0, 1);
        }else if(Input.getInstance().isKeyDown(Input.Key.RIGHT)){
            move.execute(this, step, 1, 0);
        }else if(input.isKeyDown(Input.Key.LEFT)){
            move.execute(this, step, -1, 0);
        }

        else if(!input.isKeyDown(Input.Key.UP) && !input.isKeyDown(Input.Key.DOWN) && !input.isKeyDown(Input.Key.RIGHT) && !input.isKeyDown(Input.Key.LEFT))
            move.execute(this, 0, 0, 0);


        //setAnimation(ripleyAnimation);


        /*
        Move move = new Move();

        Input input = Input.getInstance();
        if(input.isKeyPressed(Input.Key.ESCAPE)){
            System.exit(0);
        }

        if(input.isKeyDown(Input.Key.UP)){
            move.execute(this, step, 0, -1);
        }else if(input.isKeyDown(Input.Key.DOWN)){
            move.execute(this, step, 0, 1);
        }else if(input.isKeyDown(Input.Key.RIGHT)){
            move.execute(this, step, 1, 0);
        }else if(input.isKeyDown(Input.Key.LEFT)){
            move.execute(this, step, -1, 0);
        }

        else if(input.isKeyDown(Input.Key.LEFT) && input.isKeyDown(Input.Key.UP)){
            move.execute(this, step, -1, -1);
        }else if(input.isKeyDown(Input.Key.LEFT) && input.isKeyDown(Input.Key.DOWN)){
            move.execute(this, step, -1, 1);
        }else if(input.isKeyDown(Input.Key.RIGHT) && input.isKeyDown(Input.Key.UP)){
            move.execute(this, step, 1, -1);
        }else if(input.isKeyDown(Input.Key.RIGHT) && input.isKeyDown(Input.Key.DOWN)){
            move.execute(this, step, 1, 1);
        }

        // PROSTE PROBLEM JE TEN ZE JEDNA PREMENNA NEBUDE MAT 2 ROZNE STAVY NARAZ :D AJ KED BUDEM DRZAT 2 KLAVESY

        else if(!input.isKeyDown(Input.Key.UP) && !input.isKeyDown(Input.Key.DOWN) && !input.isKeyDown(Input.Key.RIGHT) && !input.isKeyDown(Input.Key.LEFT))
            move.execute(this, step, 0, 0);
         */




        //run.act();
        // asi sem
    }

    @Override
    public boolean intersects(Actor actor) {
        return false;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
