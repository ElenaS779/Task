public class Main {
    public static void main(String[] args) {

        for (int n= 6; n > 0; n--){
            System.out.print(n + " ");

            for(int i=1; i<=n; i++){
                System.out.print("#");
            }
            System.out.print('\n');
        }
    }
}
