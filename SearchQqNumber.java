public class SearchQqNumber {
    public static void main(String[]args){
        for(int y = 0;y <= 9; y ++){
            for(int x = 0; x <= 9; x ++){
                if((6*10000+7*1000+y*100+x*10+8)%78 == 0&&
                        (6*10000+7*1000+y*100+x*10+8)%67 == 0){
                    System.out.println("十位数的数字x = "+x);
                    System.out.println("百位数的数字y = "+y);
                }
            }
        }
    }
}
