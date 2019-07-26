import java.util.Stack;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*        Animal a = new Animal();
        Pig p = new Pig();
        Cow c = new Cow();

        System.out.println(a.sound());
        System.out.println(p.sound());
        System.out.println(c.sound());*/

        Operation o = new Operation();

        System.out.println(o.add(2, 3));
        System.out.println(o.add(2, 3, 4));
        System.out.println(o.add(2, 3, 4, 5));
    }
}