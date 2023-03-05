/*
Пример реализации шага лучника в архиве. 
Доработать шаг лучника в своём проекте. 
Сделать степ крестьян - если не труп то state = "Stand"
Сделать степ колдуна и монаха - если не труп то найти среди своих персонажа с здоровьем меньше максимального и вылечить его!
 */

import units.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static ArrayList<BaseHero> listResult = new ArrayList<>();
    public static ArrayList<BaseHero> team1 = new ArrayList<>();
    public static ArrayList<BaseHero> team2 = new ArrayList<>();
    
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();

        int teamCount1 = 10;
        Random rand = new Random();
        
        /** Создать в основной программе два списка. Команды GREEN и BLUE расставлены по левую и правую стороны поля 10х10*/
        // ArrayList<BaseHero> team1 = new ArrayList<>();
        for (int i = 0; i < teamCount1; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    team1.add(new Sniper(getName(),  new Point2D(i+1, 1)));
                    break;
                case 1:
                    team1.add(new Villager(getName(), new Point2D(i+1, 1)));
                    break;
                case 2:
                    team1.add(new Magician(getName(), new Point2D(i+1, 1)));
                    break;
                case 3:
                    team1.add(new Raider(getName(), new Point2D(i+1, 1)));
                    break;
                default:
                    break;
            }
        }

        int teamCount2 = 10;
        for (int i = 0; i < teamCount2; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    team2.add(new Arbalester(getName(), new Point2D(i+1, 10)));
                    break;
                case 1:
                    team2.add(new Villager(getName(), new Point2D(i+1, 10)));
                    break;
                case 2:
                    team2.add(new Monk(getName(), new Point2D(i+1, 10)));
                    break;
                case 3:
                    team2.add(new Spearman(getName(), new Point2D(i+1, 10)));
                    break;
                default:
                    break;
            }
        }

        listResult.addAll(team1);
        listResult.addAll(team2);

        // /** Сортировка всех персонажей по скорости */
        listResult.sort(new Comparator<BaseHero>() {

            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                if (o2.getSpeed() == o1.getSpeed())
                    return o2.getHP() - o1.getHP();
                return o2.getSpeed() - o1.getSpeed();
            }
        });


        /** Пошаговая борьба арбалетчиков, снайперов, магов, колдунов и крестьян */
        
        while (true) {
            View.view();
            user_input.nextLine();
            for (BaseHero baseHero: listResult) {
                if (team1.contains(baseHero)) baseHero.step(team1, team2);
                else baseHero.step(team2, team1);
            }
        }
  
    }
    static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

}
