import java.io.CharConversionException;

public class Main {
    public static void main(String[] args) {
        Character dk = new Character("Dark Night", "DK", 50);
        Character dw = new Character("Dark Wizard", "DW", 50);
        Character mg = new Character("Magic Gladiator", "MG", 50);
        Character dl = new Character("Dark Lord", "DL", 50);
        Character ef = new Character("Fairy Elf", "EF", 50);

        dk.increasePoint("str",59000);
        dk.increasePoint("en",12000);
        dk.increasePoint("ag",10000);
        dk.increasePoint("mn",5000);
        dk.increasePoint("sta",2000);

        dl.increasePoint("en",12000);
        dl.increasePoint("ag",10000);
        dl.increasePoint("mn",5000);
        dl.increasePoint("sta",2000);
        dl.increasePoint("str",2000);

        mg.increasePoint("en",12000);
        mg.increasePoint("ag",1000);
        mg.increasePoint("mn",500);
        mg.increasePoint("sta",200);
        mg.increasePoint("str",200);

        dw.increasePoint("en",1200);
        dw.increasePoint("ag",1000);
        dw.increasePoint("mn",9300);
        dw.increasePoint("sta",200);
        dw.increasePoint("str",200);

        ef.increasePoint("en",1200);
        ef.increasePoint("ag",1000);
        ef.increasePoint("mn",500);
        ef.increasePoint("sta",200);
        ef.increasePoint("str",200);


        System.out.println(dk);
        System.out.println(dw);
        System.out.println(mg);
        System.out.println(dl);
        System.out.println(ef);
//

    }
}
