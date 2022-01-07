/**
 * @author daretodream
 * @create 2022-01-06 19:29
 */
public class LogicTest {
    public static void main(String[] args) {
        boolean b1 = false;
        int num1 = 10;
        // b2为false &右侧仍运算
        if (b1 & (num1++ > 0)){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
        System.out.println("num1 = " + num1);  // 11

        boolean b2 = false;
        int num2 = 10;
        // b2为false &&右侧不运算
        if (b2 && (num2++ > 0)){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
        System.out.println("num2 = " + num2);  // 10

        boolean x = true;
        boolean y = false;
        short z = 42;
        //if(y == true)
        if((z++==42)&&(y=true))z++;  // 44
        if((x=false)||(++z==45)) z++;
        System.out.println("z=" + z);	//46

    }
}
