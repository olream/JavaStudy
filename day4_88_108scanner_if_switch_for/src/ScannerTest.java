import java.util.Scanner;

/**
 * @author daretodream
 * @create 2022-01-07 9:03
 */
public class ScannerTest {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("输入一个数字：");
//        int num = scan.nextInt();
//        System.out.println("num = " + num);
//
//        // 对于char型的获取，Scanner没有提供相关的方法，只能获取一个字符串1
//        System.out.print("输入一个char型数据：");
//        String gender = scan.next();
//        char genderChar = gender.charAt(0);
//        System.out.println("genderChar = " + genderChar);


//        Scanner scan = new Scanner(System.in);
//        System.out.print("输入成绩：");
//        int score = scan.nextInt();
//        if(score==100){
//            System.out.println("BMW");
//        }else if(score >= 80 && score < 99){
//            System.out.println("90");
//        }else{
//            System.out.println(0);
//        }

//        System.out.println("输入三个整数");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("输入一个整数：");
//        int num1 = scanner.nextInt();
//        System.out.print("输入一个整数：");
//        int num2 = scanner.nextInt();
//        System.out.print("输入一个整数：");
//        int num3 = scanner.nextInt();
        //输出最大值
//        int max1 = (num1 > num2) ? num1 : num2;
//        int max2 = (max1 > num3) ? max1 : num3;
//        System.out.println("max = " + max2);

        //从小到大排序
//        if(num1 >= num2) {
//            if (num3 >= num1) {
//                System.out.println(num2 + "," + num1 + "," + num3);
//            } else if (num2 >= num3) {
//                System.out.println(num3 + "," + num2 + "," + num1);
//            } else {
//                System.out.println(num2 + "," + num3 + "," + num1);
//            }
//        }else{
//            if(num3 >= num2){
//                System.out.println(num1 + "," + num2 + "," + num3);
//            }else if(num3 <= num1){
//                System.out.println(num3 + "," + num1 + "," + num2);
//            }else{
//                System.out.println(num1 + "," + num3 + "," + num2);
//            }
//        }

//        int x=5,y=1;
//        if(x>2)
//            if(y>2)
//                System.out.println(x+y);
//        else  // 就近原则
//            System.out.println("x is " + x);  // 输出

        // 狗龄
//        Scanner scan = new Scanner(System.in);
//        System.out.print("输入狗的年龄：");
//        int DogAge = scan.nextInt();
//        double PersonAge = 0;
//        if(DogAge>=2){
//            PersonAge = 2 * 10.5 + ( DogAge - 2 ) * 4;
//        }else{
//            PersonAge = DogAge * 10.5;
//        }
//        System.out.println("PersonAge = " + PersonAge);

        // 公式：[a, b]  (int)(Math.random() * (b - a + 1) + a)
        // Math.random() [0,1)
        int value = (int)(Math.random() * 90 + 10);

    }
}
