package units;

public class Raider extends Warrior {

    public Raider(String name, Point2D pointXY){
        super(name, 10, 8, 6, 4, 2, 3, pointXY.posX, pointXY.posY, 0);
        
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Бандит: \t").append(Raider.super.name)
                .append("\t| ATK:\t").append(Raider.super.attack)
                .append("\t| HP:\t").append(Raider.super.health)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Raider.super.pointXY.posX).append(".").append(Raider.super.pointXY.posY);
    }

}