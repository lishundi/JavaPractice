class Fibo{
    public void printFibo(int n){
        for(int i = 1;i <= n; i ++){
            System.out.print(f(i)+" ");
            if(i % 10 == 0)
                System.out.println();
        }
    }
    long f (long i){
        if(i ==1 || i ==2)
            return 1;
        else
            return f(i-1)+f(i-2);
    }
}
public class Try {
public static void main(String[] args){
new Fibo().printFibo(20);
}
}
