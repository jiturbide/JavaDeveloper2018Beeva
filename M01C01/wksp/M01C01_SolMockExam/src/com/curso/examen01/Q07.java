package com.curso.examen01;

/**
 * @author JLIL
 */
public class Q07 {
    public static void main(String[] args) {
        do {
            int y = 1;
            System.out.print(y++ + " ");
        } while(y <= 10);        
    }
}

/*
Question 07.
What is the output of the following code snippet?
Choose 1 option.
3: do {
4: int y = 1;
5: System.out.print(y++ + " ");
6: } while(y <= 10);
A. 1 2 3 4 5 6 7 8 9
B. 1 2 3 4 5 6 7 8 9 10
C. 1 2 3 4 5 6 7 8 9 10 11
D. The code will not compile because of line 6.
E. The code contains an infinite loop and does not terminate.

R: D
*/