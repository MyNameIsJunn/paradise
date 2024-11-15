package choice;

import sceen.Sceen;

import java.util.Scanner;

public class MapSceenChoice {
    public static void mainSceenChoice () {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt ();

        if (choice == 1) {
            System.out.println("서울");
        } else if (choice == 2) {
            System.out.println("제주");
        } else if (choice == 3) {
            System.out.println("광양");
        } else if (choice == 4) {
            System.out.println("부산");
        } else if (choice == 5) {
            System.out.println("대전");
        } else if (choice == 6) {
            System.out.println("대구");
        } else {
            System.out.println("잘못된 입력입니다.");
            Sceen.sceen();
        }

    }
}
