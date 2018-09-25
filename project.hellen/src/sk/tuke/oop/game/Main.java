package sk.tuke.oop.game;

import sk.tuke.oop.framework.SlickWorld;
import sk.tuke.oop.game.actors.Alien;
import sk.tuke.oop.game.actors.Ripley;
import sk.tuke.oop.game.items.Energy;

import static sk.tuke.oop.framework.SlickWorld.*;
import static sun.misc.PostVMInitHook.run;

public class Main {

    /**
     * The application's entry point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // your code goes here
        //private String name = getName;
        System.out.println("Greetings from Marklar");
        SlickWorld world = new SlickWorld("Aliens", 800,  600);
        //Ripley ripley = new Ripley();
        world.addActor(new Alien());
        world.addActor(new Ripley());
        world.addActor(new Energy());

        System.out.println(((Math.toDegrees(Math.atan2(-1,0))) + 720) % 360);
        //System.out.println(Math.toDegrees(Math.atan2(Math.sin(45), Math.cos(45))));

        world.run();

        // slickWorld.run();


    }
}
