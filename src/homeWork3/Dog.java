package homeWork3;
/**
 *JavaPro Homework5
 *@autor Pedram Kalami
 *@09.05.2023
 **/
public class Dog extends Animal {
    public Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }

    @Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return getClassName() + " couldn't swim " + distance;
        } else {
            return getClassName() + " successfully swim " + distance;
        }
    }
}