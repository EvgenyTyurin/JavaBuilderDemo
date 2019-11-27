/**
 * Test build of a computer cpecification
 */

public class BuilderDemo {

    public static void main(String[] args) {
        Computer myComputer = new Computer.
                Builder("Pentium I7", "ASUS MB666", "Razer 16Gb").
                HDD("Seagate 2TB").
                DVD("ASUS DVD-R").
                build();
    }

}
