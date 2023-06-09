package homeWork4;
/**
 *JavaPro Homework5
 *@autor Pedram Kalami
 *@19.05.2023
 * решение этой задачи обсуждалось на продленке совместно с присутствующими одногруппнимами
 **/
public class Cat {
    private final int appetite;
    private boolean satiety;

    public Cat(int appetite) {
        this.appetite = appetite;
        this.satiety = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            satiety = true;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}