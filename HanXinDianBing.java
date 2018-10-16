class HanXin {
    public int getNum(){
        int n = 1;
        while (true){
            if (n % 3 == 1 && n % 5 == 2 && n % 7 == 4 && n % 13 == 6)
                break;
            n++;
        }
        return n;
    }
}
public class HanXinDianBing {
    public static void main(String []args){
  System.out.println(new HanXin().getNum());
    }
}
