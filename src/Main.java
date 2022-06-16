import java.io.CharConversionException;

public class Main {
    public static void main(String[] args) {
        Character dk = new Character("Dark Night", "DK", 150);
        Character dw = new Character("Dark Wizard", "DW", 150);
        Character mg = new Character("Magic Gladiator", "MG", 170);
        Character dl = new Character("Dark Lord", "DL", 190);
        Character ef = new Character("Fairy Elf", "EF", 180);

        dk.increasePoint("str",1000);


        System.out.println(dk);
        System.out.println(dw);
        System.out.println(mg);
        System.out.println(dl);
        System.out.println(ef);
//

    }
}
