import java.util.Scanner;
import java.util.Random;

public class exercicisFull {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        final double PI = 3.1416;
        double areaCercle;
        double radi = 7;
        areaCercle = radi*radi*PI;
        System.out.println("l'area del cercle es " + areaCercle);

        //----------------------

        double num1, num2, suma;
        System.out.println("entra un nombre");
        num1= escaner.nextDouble();
        System.out.println("Entra un altre nombre");
        num2 = escaner.nextDouble();
        suma = num1 + num2;
        System.out.println("El resultat de la suma es " + suma);

        //------------------------

        double preu, preuAmbDescompte;
        System.out.println("Quan costa el producte");
        preu = escaner.nextDouble();
        preuAmbDescompte = preu/5*4;
        System.out.println("Amb el descompte el producte costa " + preuAmbDescompte);

        //--------------------------

        double preu2, descompte, preuFinal;
        System.out.println("Quan costa el producte");
        preu2 = escaner.nextDouble();
        System.out.println("Quin descompte s'aplica?");
        descompte = escaner.nextDouble();
        preuFinal = preu2*descompte/100;
        System.out.println("el preu final es " + preuFinal);

        //------------------------------

        String nom;
        System.out.println("com et dius?");
        nom = escaner.nextLine();
        System.out.println("Bon dia " + nom);

        //------------------------------

        double examen1;
        double examen2;
        double examen3;
        double notaModul;
        System.out.println("Què vas treure al primer examen?");
        examen1 = escaner.nextDouble();
        System.out.println("I al segon?");
        examen2 = escaner.nextDouble();
        System.out.println("I al tercer?");
        examen3 = escaner.nextDouble();
        notaModul = (examen1 + examen2 + examen3)/ 3;
        boolean aprovat = notaModul >= 5;
        System.out.println("has aprovat? " + aprovat);
        System.out.println("he tret un " + notaModul);

        //----------------------
        
        int anys, dies, segons;
        System.out.println("Quants anys tens?");
        anys = escaner.nextInt();
        dies = anys*365;
        segons = dies*24*3600;
        System.out.println("has viscut " + dies + "dies, o " + segons + " segons");

        //---------------------

        int x, y;
        System.out.println("Introdueix la primera variable");
        x = escaner.nextInt();
        System.out.println("Introdueix la segona variable");
        y = escaner.nextInt();
        int z;
        z = x;
        x = y;
        y = z;
        System.out.println("Ara la primera variable és " + x + " i la segona és " + y);

        //---------------------
        
        int a, b, c, d;
         System.out.println("Introdueix la primera variable");
        a = escaner.nextInt();
        System.out.println("Introdueix la segona variable");
        b = escaner.nextInt();
        System.out.println("Introdueix la tercera variable");
        c = escaner.nextInt();
        d = b;
        b = a;
        a = c;
        c = d;

        //----------------------
        
        double height, base, area;
        System.out.println("quina es la altura del triangle?");
        height= escaner.nextDouble();
        System.out.println("quina es la base del triangle?");
        base = escaner.nextDouble();
        area = height*base*2;
        System.out.println("L'area del triangle és " + area);

        //---------------------
        
        Random rand = new Random(); 	
        int random1 = rand.nextInt(10);
        int random2 = rand.nextInt(10);
        boolean correcte;
        int resultat;
        System.out.println("Quan dóna " + random1 + " més " + random2 + "?");
        resultat = escaner.nextInt();
        correcte = resultat == (random1 + random2);
        System.out.println(correcte);

        //---------------------

        double notaExamen = 3.5;
        double valorExamen = 0.6;
        double exerciciPerAprovar;
        exerciciPerAprovar = 5 - notaExamen*valorExamen;
        System.out.println("per aprovar cal un " + exerciciPerAprovar + "de nota als exercicis");

        //---------------




        escaner.close();
    }
}
