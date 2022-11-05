public class DataTypes {
    public static void main(String[] args) {
        //liczby całkowite
        //byte - 1 00000000
        //short - 2 00000000 00000000
        //int - 4 00000000 00000000 00000000 00000000
        //long - 8 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000

        //domyślnie liczby traktowane są jako int
        System.out.println(1234);
        System.out.println(123141564577L);

        byte b = -120;
        short s = 31678;
        int i = 1_123_231_312;
        long l = i*b;
        long itemNumber = 309182916818764L;
//        char c = 43;
//        System.out.println(c);


        //liczby zmiennoprzecinkwe
        //float - 4
        //duble - 8

        //domyślnie liczby zmiennoprzecinkowe traktowane są jako duble
        double a = 34.35;
        float f= 15.21F;
        double d = 1231237.12381373123;

        //typ znakowy
        System.out.println('a');
        System.out.println('\'');
        char c = 184;
        System.out.println(c);

        // typ logiczny
        System.out.println(true);
        System.out.println(false);
        boolean choosen = true;
        boolean q = false;
        System.out.println(q);

        //ciągi znaków
        String name = "Ala";
        System.out.println(name);
        System.out.println("cześć jestem "+name);

        System.out.println();

        System.out.println("" + 1 + 2 + "tekst");

    }
}
