import java.util.Scanner;

public class exercicis1 {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        double examen1;
        double examen2;
        double notaModul;
        System.out.println("Què vas treure al primer examen?");
        examen1 = escaner.nextDouble();
        System.out.println("I al segon?");
        examen2 = escaner.nextDouble();
        notaModul = (examen1 + examen2)/ 2;
        boolean aprovat = notaModul >= 5;
        System.out.println("has aprovat? " + aprovat);
        System.out.println("he tret un " + notaModul);

        //---------------------------------------

        boolean plou;
        boolean vaga;
        boolean agafoTren;

        System.out.println("Plou?");
        plou = escaner.nextBoolean();
        System.out.println("Hi ha vaga?");
        vaga = escaner.nextBoolean();
        System.out.println("Has d'agafar el tren?");
        agafoTren = escaner.nextBoolean();

        boolean arriboTard = agafoTren && (plou || vaga);
        System.out.println("Arribaràs tard? " + arriboTard);

        //------------------------------------

       
        String nom;
        String cognom;
        System.out.println("Quin es el teu nom?");
        nom = escaner.nextLine();
        System.out.println("Quin es el teu cognom?");
        cognom = escaner.nextLine();

        System.out.println("Em dic " + nom + " " + cognom);
        escaner.close();
    }
}