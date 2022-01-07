/**
 * @author daretodream
 * @create 2022-01-06 20:37
 */
/*
*运算符之六：三元运算符
1.结构：(条件表达式)？表达式1 : 表达式2
2. 说明
① 条件表达式的结果为boolean类型
② 根据条件表达式真或假，决定执行表达式1，还是表达式2.
  如果表达式为true,则执行表达式1
  如果表达式为false,则执行表达式2
③ 表达式1 和表达式2要求是一致的。
④ 三元运算符是可以嵌套的
3. 凡是可以使用三元运算的地方，都是可以改写if-else。
   反之，则不一定成立！！！
*/
public class TernaryOperator {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 5;
        int n3 = -43;
        int max1 = (n1 > n2)?n1:n2;
        int max2 = (max1>n3)?max1:n3;
        System.out.println("max2 = " + max2);
    }
}
