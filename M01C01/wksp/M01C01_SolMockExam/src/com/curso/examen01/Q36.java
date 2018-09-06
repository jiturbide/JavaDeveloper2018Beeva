package com.curso.examen01;

public class Q36 {
    public static void main(String[] args) {
    //caller((e) -> "Poof");
    //caller((e) -> {"Poof"});
    //caller((e) -> { String e = ""; "Poof" });
    //caller((e) -> { String e = ""; return "Poof"; });
    //caller((e) -> { String e = ""; return "Poof" });
    //caller((e) -> { String f = ""; return "Poof"; });        
    }
    public static void caller(Secret s){
        s.magic(100);
    }
}

interface Secret {
 String magic(double d);
}
class MySecret implements Secret {
 public String magic(double d) {
 return "Poof";
 }
}

/*
13
36. Which lambda can replace the MySecret class to return the same value?
(Choose all that apply)
interface Secret {
String magic(double d);
}
class MySecret implements Secret {
public String magic(double d) {
return "Poof";
}
}
A. caller((e) -> "Poof");
B. caller((e) -> {"Poof"});
C. caller((e) -> { String e = ""; "Poof" });
D. caller((e) -> { String e = ""; return "Poof"; });
E. caller((e) -> { String e = ""; return "Poof" });
F. caller((e) -> { String f = ""; return "Poof"; });

R: A,F
*/