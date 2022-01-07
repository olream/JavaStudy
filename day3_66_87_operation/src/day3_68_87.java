/**
 * @author daretodream
 * @create 2022-01-06 16:45
 */
public class day3_68_87 {
    public static void main(String[] args) {
        // 除号
        int num1 = 12;
        int num2 = 5;
        int result1 = num1 / num2;
        System.out.println("result1 = " + result1);  // 2

        int result2 = num1 / num2 * num2;
        System.out.println("result2 = " + result2);  // 10

        double result3 = num1 / num2;
        System.out.println("result3 = " + result3);  // 2.0

        double reuslt4 = num1 / num2 + 0.0;
        System.out.println("reuslt4 = " + reuslt4);  // 2.0

        double result5 = num1 / (num2 + 0.0);
        System.out.println("result5 = " + result5);  // 2.4

        double result6 = (double)num1 / num2;
        System.out.println("result6 = " + result6);  // 2.4

        // 结果的符号与被模数的符号相同
        System.out.println("num1 % num2 = " + num1 % num2);   // 2
        System.out.println("-num1 % num2 = " + -num1 % num2);   // -2
        System.out.println("num1 % -num2 = " + num1 % -num2);   // 2
        System.out.println("-num1 % -num2 = " + -num1 % -num2);   // -2

        // (前)++ (前)-- 先运算，后赋值
        // (后)++ (后)-- 先赋值，后运算
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = " + a1 + ",b1 = " + b1);  // 11 11

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = " + a2 + ",b2 = " + b2);  // 11 10

        // 注意
        short s1 = 10;
        // s1 = s1 + 1; // 错误
        // s1 = (short)(s1 + 1);  // 正确
        s1++;  // 自增不改变数据类型
        System.out.println("s1 = " + s1);

        byte bb1 = 127;
        bb1++;
        System.out.println("bb1 = " + bb1);  // -128
    }

}

