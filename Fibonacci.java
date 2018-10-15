class Calculate{
    public int getSum(int n){
        int f1 = 1,f2 = 1,f;
        int sum = f1+f2;
        for(int i = 3;i <= n; i ++){
            f = f1 + f2;
            sum = sum + f;
            f1 = f2;
            f2 = f;
        }
        return sum;
    }
}
public class Fibonacci {
    public static void main(String[]args){
        Calculate o = new Calculate();
        System.out.println("sum = "+ o.getSum(20));
    }
}
