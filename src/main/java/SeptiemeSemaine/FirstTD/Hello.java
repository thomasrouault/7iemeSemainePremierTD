package SeptiemeSemaine.FirstTD;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, World");
        addition();
        soustraction();
    }

    public static int addition() 
    { 
        int a = 62; 
        int b = 18; 
        int c = Integer.sum(a, b);
        System.out.println("L\'addition de " + a + " + " + b + " = " + c);
		return c; 
    } 

    public static int soustraction() 
    { 
        int a = 62; 
        int b = 18; 
        int c = (a-b);
        System.out.println("L\'addition de " + a + " + " + b + " = " + c);
		return c; 
    } 
}