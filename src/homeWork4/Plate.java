package homeWork4;
/**
 *JavaPro Homework5
 *@autor Pedram Kalami
 *@19.05.2023
 * решение этой задачи обсуждалось на продленке совместно с присутствующими одногруппнимами
 **/
public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        }
    }

    public void addFood(int n) {
        food += n;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}