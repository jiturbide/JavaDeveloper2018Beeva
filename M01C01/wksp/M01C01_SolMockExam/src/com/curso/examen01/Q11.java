package com.curso.examen01;

public class Q11 {
    public static void main(String[] args) {
        StringBuilder puzzle = new StringBuilder("Java");
        // 4. INSERT CODE HERE
        //String s = puzzle.append("vaJ$").substring(0, 4);  //JavavaJ$       //01234
        //puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1); //avaJ$
        puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());     //01234    
        System.out.println(puzzle);
        //System.out.println(s);
    }
}
/*
Question 11. Which of the following can replace line 4 to print "avaJ"?
(Choose all that apply)
3: StringBuilder puzzle = new StringBuilder("Java");
4: // INSERT CODE HERE
5: System.out.println(puzzle);
A. puzzle.reverse();
B. puzzle.append("vaJ$").substring(0, 4);
C. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
D. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
E. None of the above.

R: E
*/