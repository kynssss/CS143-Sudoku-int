import java.util.*;
import java.io.*;

public class SudokuEngine {
   public static void main(String[] args) {
      String fileName = "boards/data1.sdk";
      SudokuBoard board = new SudokuBoard(fileName);  
      System.out.println(board); 
      if (!board.isValid()) {
        System.out.println("The board can't be solved.");
      } else if (board.isSolved()) {
        System.out.println("The board is already solved."); 
      } else if (board.solve()) {
        System.out.println("The Sudoku puzzle solved successfully:");
        System.out.println(board);
      } else {
        System.out.println("This Sudoku puzzle couldn't be solved.");
      }
   }
}

/*
# PROGRAM OUTPUT

     +-------+-------+-------+
 | 2 7 8 | 1 4 5 | 6 9 3 |
 | 3 5 4 | 6 9 8 | 7 1 2 |
 | 9 1 6 | 2 7 3 | 4 8 5 |
 +-------+-------+-------+
 | 6 9 2 | 8 1 7 | 3 5 4 |
 | 8 3 7 | 5 6 4 | 1 2 9 |
 | 1 4 5 | 3 2 9 | 8 7 6 |
 +-------+-------+-------+
 | 4 2 3 | 7 5 1 | 9 6 8 |
 | 5 8 1 | 9 3 6 | 2 4 7 |
 | 7 6 9 | 4 8 2 | 5 3 1 |
 +-------+-------+-------+


*/