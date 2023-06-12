package homeWork11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static List<Point> findClosestPoints(List<Point> points, int N) {
        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                double dist1 = Math.sqrt(p1.getX() * p1.getX() + p1.getY() * p1.getY());
                double dist2 = Math.sqrt(p2.getX() * p2.getX() + p2.getY() * p2.getY());
                return Double.compare(dist1, dist2);
            }
        });


        return points.subList(0, N);
    }


    public static void main(String[] args) {

        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 1));
        points.add(new Point(2, 2));
        points.add(new Point(5, 5));

        int N = 2;


        List<Point> closestPoints = findClosestPoints(points, N);

        // Выводим
        for (Point point : closestPoints) {
            System.out.println("(" + point.getX() + ", " + point.getY() + ")");
        }
    }
}
