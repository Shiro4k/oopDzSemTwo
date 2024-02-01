package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Parent> parentList = new ArrayList<>(Arrays.asList(
                new Human("Миша", 2.0, 2.0),
                new Human("Маша", 1.5, 4),
                new Cat("Барсик", 3.2, 5.0),
                new Cat("Пушок", 4.0, 6.0),
                new Robot("Андройд", 1.0, 1.5),
                new Robot("T1000", 2.5, 8)
        ));

        List<Obstacles> obstaclesList = new ArrayList<>(Arrays.asList(
                new Wall("Припятсмтвие низкое", 0.6),
                new Wall("Припятсмтвие среднее", 1),
                new Wall("Припятсмтвие высокое", 1.5),
                new Pathway("Длинна короткая", 0.5),
                new Pathway("Длинна средняя", 1.0),
                new Pathway("Длинна длинная", 2.0)
        ));


        for(Parent parent: parentList){
            System.out.println("Участник " + parent.getName());
            System.out.println("---------------------------");
            parent.run();
            for (Obstacles obstacles: obstaclesList){
                if( obstacles instanceof Wall){
                    parent.jump(((Wall) obstacles).getDistance());
                } else if (obstacles instanceof Pathway){
                    parent.runThrough(((Pathway) obstacles).getDistance());
                }
            }
            parent.endRace();
            System.out.println("---------------------------");
        }
    }
}