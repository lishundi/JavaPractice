 class HundredYuanChicken{
        public void printChicken(){
            int x,y,z;
            for(x = 0;x <= 100/5; x ++)
                for(y = 0;y <= 100/3; y ++){
                    z = 100-x-y;
                    if(5*x + 3*y + z/3.0 == 100)
                        System.out.println("公鸡="+x+",母鸡="+y+",小鸡="+z);
                }
        }
    }
    public class BuyHundredChickens{
        public static void main(String[] args){
            (new HundredYuanChicken()).printChicken();
        }
    }

