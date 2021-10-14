package twodimensional;

import java.util.Arrays;

public class TwoDimension {
    public static void main(String[] args) {
        // create a two-dimensional array (literal syntax)
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // get the sum of the first row
        int firstRowSum = data[0][0] + data[0][1] + data[0][2];
        System.out.println(firstRowSum);

        // get the number of rows
        System.out.println(data.length);

        // get the number of cols in the first row
        System.out.println(data[0].length);

        // create a two-dimensional array with the size
        String[][] seats = new String[2][4];
        seats[0][0] = "Derrick";
        seats[0][1] = "Gabo";
        seats[0][2] = "Junya";
        seats[0][3] = "Kelbin";
        seats[1][0] = "Kose";
        seats[1][1] = "Mauricio";
        seats[1][2] = "Sasa";
        seats[1][3] = "Sena";

        // loop over seats to print their names
        // for each row print all the cols
        for (int r = 0; r < seats.length; r++) {
            for (int c = 0; c < seats[r].length; c++) {
                System.out.print(seats[r][c] + " ");
            }
            System.out.println();
        }

        // for-each loop
        for (String[] row : seats) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }
}
