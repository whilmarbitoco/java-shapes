public class Pyramid {
    
    public static void pyramid(int y) {

        for (int i = 0; i < y; i++) {
            
            for (int j = y - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }


    }

}
