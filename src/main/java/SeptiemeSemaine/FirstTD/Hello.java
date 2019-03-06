package SeptiemeSemaine.FirstTD;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, World");
        addition();
    }

    public static void addition() 
    { 
        int a = 62; 
        int b = 18; 
        System.out.println("L\'addition de " + a + " + " + b + " = " + Integer.sum(a, b)); 
    } 

}