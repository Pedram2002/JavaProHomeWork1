package homeWork4;
/**
 *JavaPro Homework5
 *@autor Pedram Kalami
 *@19.05.2023
 * решение этой задачи обсуждалось на продленке совместно с присутствующими одногруппнимами
 **/


public class CatEat {
    public static void main(String[] args){
        Cat[] cats = {
                new Cat(7),
                new Cat(10),
                new Cat(5)
        };

        Plate plate = new Plate(17);
        System.out.println("Plate: " + plate);

        for (Cat cat : cats) {
            if (!cat.isSatiety()) {
                cat.eat(plate);
                System.out.println("Cat ate: " + cat);
            }
        }

        System.out.println("Plate after feeding: " + plate);
    }
}

