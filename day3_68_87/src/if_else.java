/**
 * @author daretodream
 * @create 2022-01-06 21:14
 */
public class if_else {
    public static void main(String[] args) {
        //例1
        int heartbeats = 79;
        if(heartbeats<60 || heartbeats>100){
            System.out.println("需要进一步检查");
        }
        System.out.println("检查结束");

        //例2
        int age = 23;
        if(age > 18){
            System.out.println("成年");
        }else{
            System.out.println("未成年");
        }


    }
}
