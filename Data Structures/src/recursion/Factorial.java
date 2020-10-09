package recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(calculatefactorial(3));
    }
    public static int calculatefactorial(int n){
        if(n == 0){
            return 1;
        }
        return n*calculatefactorial(n-1);
    }
}
