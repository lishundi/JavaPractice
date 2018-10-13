//public class BuyHorse {
//public static void main(String[] args){
//    int x = 0;
//    do{
//        int y = 0;
//        do{
//            int z = 0;
//            z = 100 -x -y;
//            if(z%2 == 0 && x*3+y*2+z/2 == 100)
//                System.out.println("大马数量为："+x+",中马数量为："
//                +y+"小马数量为："+z
//                );
//            y++;
//        }while(y <= 100/2);
//        x++;
//    }while(x <= 100/3);
//}
//}
public class BuyHorse{
    public static void main(String []args){
        for(int x = 0;  x<= 100/3; x++){
            for(int y = 0; y <= 100/2; y++){
                int z = 100-x-y;
                if(z%2==0 && x*3+y*2+z/2 == 100)
                    System.out.println("大马数量为："+x+",中马数量为："
                +y+"小马数量为："+z);
            }
        }
    }
}
