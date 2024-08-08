public class Box {
    
    public static void box(int x, int y) {

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
            
                if (i == 0 || i == y - 1 || j == 0 || j == x - 1) {
                    System.err.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

}
