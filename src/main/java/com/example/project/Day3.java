package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        int middleOfGrid = size/2, firstSnowflake = 0, thirdSnowflake = grid.length - 1;        
        for(int i = 0; i < size; i ++){
          for(int j = 0; j < size; j ++){
            if((i == middleOfGrid) || ((i == middleOfGrid - 1 || i == middleOfGrid + 1) && (j == middleOfGrid + 1 || j == middleOfGrid - 1 || j == middleOfGrid) || (j == middleOfGrid)) || ((j == firstSnowflake || j == thirdSnowflake) && (i != middleOfGrid && i != middleOfGrid + 1 && i != middleOfGrid - 1))){
              grid[i][j] = "*";
            }
            else{
              grid[i][j] = " ";
            }
          }
          firstSnowflake ++; thirdSnowflake --;
        }
        return grid;
      }

      /*grid[i - 1][middleOfGrid] = "*";
      grid[i - 1][thirdSnowflake] = "*";
      grid[grid.length - i][thirdSnowflake] = "*";
      grid[i - 1][firstSnowflake] = "*";*/

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      String[][] snowflake = generateSnowflake(7);
      for(int i = 0; i < snowflake.length; i ++){
        for(int j = 0; j < snowflake.length; j ++){
          System.out.print(snowflake[i][j]);
        }
        System.out.println();
      }
    }
}
