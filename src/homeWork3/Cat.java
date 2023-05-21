package homeWork3;
/**
 *JavaPro Homework5
 *@autor Pedram Kalami
 *@09.05.2023
 **/
public class Cat extends Animal {
    public Cat(int runLimit) {
        super(runLimit, -1);
    }

    @Override
    public String swim(int distance) {
        return getClassName() + " can't swim";
    }
}
