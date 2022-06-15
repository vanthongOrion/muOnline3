import java.io.CharConversionException;

public class Main {
    public static void main(String[] args) {
        Character dk = new Character("Dark Night", "DK", 150, new Point(100, 25, 25, 40, 10, 0));
        Character dw = new Character("Dark Wizard", "DW", 150, new Point(100, 10, 30, 10, 20, 30));
        Character mg = new Character("Magic Gladiator", "MG", 170, new Point(100, 15, 25, 15, 10, 35));
        Character dl = new Character("Dark Lord", "DL", 190, new Point(100, 30, 20, 20, 10, 20));
        Character ef = new Character("Fairy Elf", "EF", 180, new Point(100, 20, 30, 10, 10, 20));


        System.out.println(dk);
        System.out.println(dw);
        System.out.println(mg);
        System.out.println(dl);
        System.out.println(ef);


    }
}
