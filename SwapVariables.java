public class SwapVariables {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // swap x,y values without using 3rd variable

        x = x + y; // x:30 y:20
        y = x - y; // x:30 y:10
        x = x - y; // x:20 y:10

        System.out.println("x:" + x + " y:" + y);
    }
}
