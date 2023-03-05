package units;

/**Копейщик */
public class Spearman extends Warrior {

     public Spearman(String name, Point2D pointXY){
        super(name, 10, 4, 4, 3, 1, 5, pointXY.posX, pointXY.posY, 0); 
    }
 
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик:\t").append(Spearman.super.name)
                .append("\t| ATK:\t").append(Spearman.super.attack)
                .append("\t| HP:\t").append(Spearman.super.health)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Spearman.super.pointXY.posX).append(".").append(Spearman.super.pointXY.posY);
    }
 }
