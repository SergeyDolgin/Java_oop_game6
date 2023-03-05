package units;

/**Снайпер*/
public class Sniper extends Shooter {

    public Sniper(String name, Point2D pointXY){
        super(name, 15, 12, 9, 10, 8, 10, 32, pointXY.posX, pointXY.posY);
             
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:\t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.attack)
                .append("\t| HP:\t").append(Sniper.super.health)
                .append(" \t| Arrows:").append(Sniper.super.shoot)
                .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.pointXY.posX).append(".").append(Sniper.super.pointXY.posY);
    }

}
