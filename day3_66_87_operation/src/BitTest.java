/**
 * @author daretodream
 * @create 2022-01-06 19:57
 */
public class BitTest {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("num1 = " + (num1<<2));  // 左移一位乘以2
        System.out.println("num1 = " + (num1<<4));
        // 最高效方式的计算 2*8 ？ 2<<3 或 8<<1

        // >> ， 二进制最高位是0，右移后，空缺位补0
        // 最高位是1， 空缺位补1
        int num2 = 19;
        System.out.println("num2 = " + (num2>>2));  // 右移一位除以2 向下取整

        // >>> ， 二进制最高位无论是0或者是1， 空缺位都用0补

        // & | ^ ~ 按位求和、或、异或、反

        // 练习：交换两个变量的值
        int a1 = 10;
        int a2 = 20;
        // 方式一：
//        int temp = a1;
//        a1 = a2;
//        a2 = temp;
//        System.out.println("a1 = " + a1);
//        System.out.println("a2 = " + a2);

        // 方式二：不用定义临时变量
        // 弊端：①相加可能超出存储范围 ② 有局限性：只适用于数值类型
//        a1 = a1 + a2;
//        a2 = a1 - a2;
//        a1 = a1 - a2;
//        System.out.println("a1 = " + a1);
//        System.out.println("a2 = " + a2);

        // 方式三：
        a1 = a1 ^ a2;
        a2 = a1 ^ a2;  // a1
        a1 = a1 ^ a2;  // a2
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
    }
}
