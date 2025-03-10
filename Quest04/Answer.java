package Quest04;

import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select, temper;

        System.out.println("Hello world :)");

        System.out.println("---- 화씨온도와 섭씨온도를 바꾸는 프로그램 작성 ----");
        System.out.println("(1. 화씨온도, 2. 섭씨온도)");
        System.out.print(" - 온도 타입 입력: ");
        select = sc.nextInt();

        System.out.println();
        switch (select) {
            case 1:
                System.out.println("화씨온도를 섭씨온도로 변환합니다.");
                System.out.print(" - 화씨 온도 입력: ");
                temper = sc.nextInt();

                System.out.println();
                System.out.printf("화씨온도 %d℉ 의 화씨온도는 %.2f℃ 입니다.", temper, ((double) (temper - 32) * 5 / 9));
                break;

            case 2:
                System.out.println("섭씨온도를 화씨온도로 변환합니다.");
                System.out.print(" - 섭씨 온도 입력: ");
                temper = sc.nextInt();

                

                System.out.println();
                System.out.printf("섭씨온도 %d℃ 의 화씨온도는 %.2f℉ 입니다.", temper, ((double) (temper * 9 / 5) + 32));
                break;

            default:
                throw new AssertionError();
        }

    }
    // branch test01
}
