package homeWork3;
/**
 *JavaPro Homework5
 *@autor Pedram Kalami
 *@09.05.2023
 **/
public abstract class Animal extends Actions {
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    private static int countOfAnimals;

    static {
        countOfAnimals = 0;
    }

    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
        countOfAnimals++;
    }

    public String getClassName() {
        return className;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    @Override
    public String run(int distance) {
        if (distance > runLimit) {
            return className + "O no! couldn't run " + distance;
        } else {
            return className + "good job! successfully run " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return className + "O no! couldn't swim " + distance;
        } else {
            return className + "good job!  successfully swim " + distance;
        }
    }

    @Override
    public String toString() {
        return className + ". runLimit: " + runLimit + ". swimLimit: " + swimLimit;
    }
}