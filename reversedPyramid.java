public class reversedPyramid {
    
    public static void pyramid(int y) {

        for (int i = 0; i < y; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = y - i; k > 0; k--) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

}
