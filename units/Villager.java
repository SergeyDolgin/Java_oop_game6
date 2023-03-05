package units;

import java.util.ArrayList;

/**Крестьянин*/
public class Villager extends Warrior {
  

    public Villager(String name, Point2D pointXY) {
        super(name, 1, 1, 1, 1, 1, 1, pointXY.posX, pointXY.posY, 1);
       
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Крестьянин: \t").append(Villager.super.name)
                .append("\t| ATK:\t").append(Villager.super.attack)
                .append("\t| HP:\t").append(Villager.super.health)
                .append(" \t| Delivery: ").append(Villager.this.delivery)
                .append("\t|").append("\t| (X.Y) : ").append(Villager.super.pointXY.posX).append(".").append(Villager.super.pointXY.posY);
    }


    /**Переопределить step крестьян так, чтобы он был если не Die, то Stand  */
    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (!state.equals("Die")) state = "Stand";
    }
}
