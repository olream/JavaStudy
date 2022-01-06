/**
 * @author daretodream
 * @create 2022-01-06 19:05
 */
public class SetValueTest {
    public static void main(String[] args) {
        int i1 = 10;
        int j1 = 10;

        int i2,j2;
        i2 = j2 = 10;

        int i3 = 10, j3 = 10;

        int num1 = 10;
        num1 += 2;
        System.out.println("num1 = " + num1);

        short s1 = 10;
        s1 += 2;  // 不改变变量本身的数据类型
        System.out.println("s1 = " + s1);

        // 开发中，变量实现+2的操作（前提：int num = 10;)
        // 方式一：num = num + 2;
        // 方式二：num += 2;

        // 开发中，变量实现+1的操作（前提：int num = 10;)
        // 方式一：num = num + 1;
        // 方式二：num += 1;
        // 方式三：num++;  // (推荐)

        int m = 2,n = 3;
        n *= m++;
        System.out.println("m = " + m);  // 3
        System.out.println("n = " + n);  // 6

        int n1 = 10;
        n1 += (++n1) + (n1++) + n1;  // 10 + 11 + 11 + 12
        n1 += (n1++) + (++n1);  // 10 + 10 + 12
        System.out.println("n1 = " + n1);  // 32
    }
}
