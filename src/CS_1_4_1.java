
public class CS_1_4_1 {
    public static void printNumbers(int n) {

        while(n!=1){
            System.out.println(n);

            if(n % 2 == 0){
                n = n / 2;
            } else{
                n = n * 3 + 1;
            }

        }
    }


}