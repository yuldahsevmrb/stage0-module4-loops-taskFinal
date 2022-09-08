package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = cathetusLength; j > 0; j--) {
                if(i >= j-1){
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= cathetusLength; j++) {
                if(j-1 <= i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
