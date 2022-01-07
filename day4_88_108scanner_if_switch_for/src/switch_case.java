import com.sun.xml.internal.bind.v2.runtime.output.DOMOutput;

import java.util.Scanner;

/**
 * @author daretodream
 * @create 2022-01-07 10:26
 */
public class switch_case {
    public static void main(String[] args) {
//        int num = 2;
//        switch (num){
//            case 0:
//                System.out.println("zero");
//            case 1:
//                System.out.println("one");
//            case 2:
//                System.out.println("two");
//                System.out.println(123);
//            case 3:
//                System.out.println("three");
//            default:
//                System.out.println("too large");
//         }


//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        char c = word.charAt(0);
//        switch (c){
//            case 'a':
//            case 'b':
//            case 'c':
//            case 'd':
//            case 'e':
//                System.out.println((char)(c - 32));
//                break;
//            default:
//                System.out.println("other");
//                break;
//        }


//        int score = 50;
//        switch(score/60){
//            case 0:
//                System.out.println("不合格");
//                break;
//            case 1:
//                System.out.println("合格");
//                break;
//        }

        int year = 2019,month = 10, day = 20;
        int sumDays = 0;
        switch (month){
            case 12:
                sumDays += 31;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
//                if((year%4==0 && year%100!=0)||(year%400==0))
//                    sumDays += 29;
//                else
//                    sumDays += 28;
                sumDays += ((year%4==0 && year%100!=0)||(year%400==0))?29:28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
                System.out.println("sumDays = " + sumDays);
        }

    }
}
