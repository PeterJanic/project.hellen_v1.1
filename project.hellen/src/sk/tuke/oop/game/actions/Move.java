package sk.tuke.oop.game.actions;

import sk.tuke.oop.game.actors.Movable;

public class Move{

    public Move() {

    }


    public void execute(Movable actor, int step, int dx, int dy){

        if (dx == 0 && dy == 0) {
            actor.getAnimation().stop();
            return;
        }

        actor.getAnimation().start();

        if (actor.getAnimation().getRotation() != (((Math.toDegrees(Math.atan2(dx, -dy))) + 720) % 360))
            actor.getAnimation().setRotation((int)(((Math.toDegrees(Math.atan2(dx, -dy))) + 720) % 360));

        actor.setPosition(actor.getX() + step * dx, actor.getY() + step * dy);



    }


}
