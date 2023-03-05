package units;

/**Монах*/
public class Monk extends Priest {

    public Monk(String name, Point2D pointXY){
        super(name, 30, 12, 5, -4, -4, 7, pointXY.posX, pointXY.posY, 1);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Monk.super.name)
                .append("\t| ATK:\t").append(Monk.super.attack)
                .append("\t| HP:\t").append(Monk.super.health)
                .append(" \t| MP:\t").append(Monk.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Monk.super.pointXY.posX).append(".").append(Monk.super.pointXY.posY);
    }

}