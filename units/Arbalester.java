package units;


public class Arbalester extends Shooter {

    public Arbalester(String name, Point2D pointXY) {
        super(name, 10, 6, 4, 3, 2, 3, 16, pointXY.posX, pointXY.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(Arbalester.super.name)
                .append("\t| ATK:\t").append(Arbalester.super.attack)
                .append("\t| HP:\t").append(Arbalester.super.health)
                .append(" \t| Arrows:").append(Arbalester.super.shoot)
                .append("\t|").append("\t| (X.Y) : ").append(Arbalester.super.pointXY.posX).append(".").append(Arbalester.super.pointXY.posY);
    }

}

