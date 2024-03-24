package test;

public class Test8 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n){
        return switch(n) {
            case 0, 1 -> 1;
            default -> {
                int result =1;
                for (int i = 2; i<=n;i++){
                    result*=i;
                }
                yield result;
            }
        };
    }
}
