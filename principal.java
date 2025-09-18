public class principal {
    public static void main(String[] args) {
        int x;
        int y, z;
        double dec;
        boolean married;
        char character;
        String name;
        x = 0;
        y = 8;
        z = 25;
        dec = 7.4;
        married = true;
        

        //noms de variables no poden començar amb nombres(1, 2...) signes(@, - ...) o paraules reservades(true, final...)

        int suma = y + z;
        System.out.println(suma);
        System.out.println("Is he married? " + married);
        System.out.println(character + name);
        boolean esMesGran = dec > 7;
        System.out.println("el nombre decimal és més gran que 7? " + esMesGran);

        boolean esIgual = z == 50;
        System.out.println("z es igual a 50? " + esIgual);

        boolean esMesPetitIgualZero = (x == 0 && x <0);
        System.out.println("x es igual i mes petit que 0? " + esMesPetitIgualZero);
    }
}
