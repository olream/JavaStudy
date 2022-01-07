/**
 * @author daretodream
 * @create 2022-01-07 11:15
 */
public class ForTest {
    public static void main(String[] args) {

        /*
        * for(①初始化部分;②循环条件部分;④迭代部分)｛
            ③循环体部分;
           ｝
           * 1 234 234 234 234...
         * */
//        for(int i = 0; i < 10; i++){
//            System.out.println("i = " + i);
//        }


//        int num=1;
//        for(System.out.println('a');num<=3;System.out.println('b'), num++)
//            System.out.println('c');
//
//        for (int i = 1; i < 100; i++) {
//            if(i % 2 == 0){
//                System.out.println("i = " + i);
//            }
//
//        }
        int ge,shi,bai;
        int sum;
        for (int i = 100; i < 1000; i++) {
            ge = i%10;
            shi = i/10%10;
            bai = i/100;
            sum = (int)(Math.pow(ge, 3) + Math.pow(shi, 3) +Math.pow(bai, 3));
            if(i==sum)
                System.out.println(i);
        }


    }
}
