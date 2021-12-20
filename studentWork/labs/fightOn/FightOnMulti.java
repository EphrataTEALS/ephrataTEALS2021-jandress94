public class FightOnMulti {
    public static void main (String [] args) {
        singWholeSong();
        System.out.println();
        singWholeSong();
        System.out.println();
        singWholeSong();
        System.out.println();
        singWholeSong();
        System.out.println();
        singWholeSong();
    }

    public static void singWholeSong() {
        singFight();
        System.out.println("Fight on, fight on, We’ll show our Tiger’s might");
        singTonight();
        singFight();
        System.out.println();
        System.out.println("E - P - H - R - A - T - A");
        singTonight();
        singFight();
    }

    public static void singFight() {
        System.out.println("Fight on, fight on, Ephrata Tigers fight");
    }

    public static void singTonight() {
        System.out.println("Fight on, fight on, It’s victory tonight");
    }
} 