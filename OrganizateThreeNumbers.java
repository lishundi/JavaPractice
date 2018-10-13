public class OrganizateThreeNumbers {
    public static void main(String[]args){
        int i,j,k,m = 0;
        System.out.println("满足条件的三位数分别是：");
        for(i = 1;i <= 4;i ++){
            for(j = 1;j <= 4;j ++) {
                for (k = 1; k <= 4; k++)
                    if (i != j && j != k && i != k) {
                        m++;
                        System.out.println(i * 100 + j * 10 + k);
                        if (m % 5 == 0)
                            System.out.println();
                    }
            }
        }
        System.out.println();
        System.out.println("这样的三位数共有"+m+"个");
    }
}
