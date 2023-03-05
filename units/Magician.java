package units;

/**Колдун*/
public class Magician extends Priest {

    public Magician(String name, Point2D pointXY){
        super(name, 30, 17, 9, -5, -5, 12, pointXY.posX, pointXY.posY, 1); 
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Magician.super.name)
                .append("\t| ATK:\t").append(Magician.super.attack)
                .append("\t| HP:\t").append(Magician.super.health)
                .append(" \t| MP:\t").append(Magician.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Magician.super.pointXY.posX).append(".").append(Magician.super.pointXY.posY);
    }

}