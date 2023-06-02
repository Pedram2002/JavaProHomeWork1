package homeWork8;

import java.util.ArrayList;

public class SeaBattle {

    public static void main(String[] args) {
        int[][] array = {
                {0, 0, 1},
                {0, 0, 0}};
        int [][][] gf;
        countBattles(array);
    }

    public static void countBattles(int[][] a) {
        int buttleCount = 0;
        for (int i = 0; i < a.length ; i++) {
            for (int y = 0; y < a[i].length ; y++) {
                if (a[i][y] == 1) {//насчел Battle
                    //вычислеяем он последний или нет
                    //последний вертикальный
                    boolean lastHorizantal = (i + 1 > a[0].length);
                    boolean lastVertical = (y + 1 >= a[1].length);
                    if ((!lastHorizantal && a[i + 1][y] == 0 ) && (!lastVertical && a[i][y +1] == 0) ) {
                        buttleCount++;
                    }



//                    if (lastHorizantal) {//последний горизонт
//                        if (lastVertical) {//последний вертикальный
//                            buttleCount++;
//                        } else if (a[i][y +1] == 0) {
//                            buttleCount++;
//                        }
//
//
//                        } else if (a[i + 1][y] == 0) {
//                        if (lastVertical) {//последний вертикальный
//                            buttleCount++;
//                        } else if (a[i][y +1] == 0) {
//                            buttleCount++;
//                        }
//
//                    }

                }

                }


            }
        System.out.println(buttleCount);
    }




    public void myBattle(int[] a, int[] b) {

    }
}
