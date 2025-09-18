import java.util.Scanner;

public class exerciciExtra {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int percentatgeExamens;
        int percentatgeTreballs;
        double examen1, examen2, treball1, treball2;
        examen1 = 6.4;
        examen2 = 6.2;
        treball1 = 8.8;
        treball2 = 8.5;

        System.out.println("Quin percentatge puntuen els examens?");
        percentatgeExamens = escaner.nextInt();
        percentatgeTreballs = 100 - percentatgeExamens;

        double mitjanaExamens = (examen1 + examen2)/2;
        double mitjanaTreballs = (treball1 + treball2)/2;
        double notaFinal = mitjanaExamens*percentatgeExamens/100 + mitjanaTreballs*percentatgeTreballs/100;

        System.out.println("la teva nota final és " + notaFinal);

        escaner.close();
    }
}
