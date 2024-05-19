import Classes.Corta;
import Classes.Larga;
import Classes.Policia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Policia policia1 = new Policia("Juan", "Martinez", 20);
        Policia policia2 = new Policia("Carla", "Perez", 55);
        Policia policia3 = new Policia("Manuel", "Ruiz", 20);
        Policia policia4 = new Policia("Maria","Sanchez",12);

        Corta armaCorta1 = new Corta(20, 201, "Beretta", 10, "en uso", policia1, false);
        Corta armaCorta2 = new Corta(5, 20, "akka", 9, "en mantenimiento", policia3, true);
        Larga armaLarga1 = new Larga(30, 100, "Akkar", 9, "en uso", policia2, "trabajo", 3, true);
        Larga armaLarga2 = new Larga(20,300,"akkar",38,"nueva",policia4,"trabajo de campo",4,true);


        System.out.println(armaCorta1.enCondicion());
        System.out.println(armaCorta2.enCondicion());
        System.out.println(armaLarga1.enCondicion());
        System.out.println(armaLarga2.enCondicion());

        armaLarga1.compareTo(armaLarga2);
        armaLarga2.compareTo(armaLarga1);

        System.out.println(armaCorta1.efectividadMts());
        System.out.println(armaCorta2.efectividadMts());



    }
}
