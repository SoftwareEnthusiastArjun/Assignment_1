public class Main_Q2 {
    public static void main(String[] args) {
        int var = 50;
        ol:
        for (int i = 2; i <= var; i++) {
            int sq = (int) Math.sqrt(i);
            for (int j = 2; j <= sq; j++) {
                if (i % j == 0) {
                    continue ol;
                }
            }            
            System.out.println(i);
        }
    }
}