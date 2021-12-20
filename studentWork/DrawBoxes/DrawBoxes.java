

public class DrawBoxes {
    public static void main (String[] args){
        drawOneBox();
        System.out.println();
        drawOneBox();
        System.out.println();
        drawOneBox();
    }  

    public static void drawOneBox() {
        drawHorizontal();
        drawVertical();
        drawHorizontal();
    }

    public static void drawHorizontal() {
        System.out.println("+------+");
    }

    public static void drawVertical() {
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
    }
}