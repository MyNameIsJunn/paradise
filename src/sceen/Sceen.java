package sceen;

import setting.Inventory;
import setting.Player;
import setting.Shop;

import java.util.Scanner;

public class Sceen {
    public static void sceen() {
        Scanner sc = new Scanner (System.in);
        Player player = new Player ();
        Inventory inventory = new Inventory ();
        player.print();

        while (true) {
            nextText();
            System.out.println("               1. 맵, 2. 스탯, 3. 인벤토리, 4. 상점, 5. 저장, 6. 종료");
            blank();
            int select = sc.nextInt ();
            if (select == 1) {
                Map.map ();
                int choice = sc.nextInt();
                if (choice == 1) {
                    Seoul.seoul(); // 서울로 이동
                } else if (choice == 2) {
                    Jeju.jeju(); // 제주로 이동
                } else if (choice == 3) {
                    Guangyang.guangyang(); // 광양으로 이동
                } else if (choice == 4) {
                    Busan.busan(); // 부산으로 이동
                } else if (choice == 5) {
                    Daejun.daejun(); // 대전으로 이동
                } else if (choice == 6) {
                    Daegu.daegu(); // 대구로 이동
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            } else if (select == 2) {
                player.print();
            } else if (select == 3) {
                inventory.print();
            } else if (select == 4) {
                int shopchoice = sc.nextInt();
                Shop.shop(shopchoice);
            } else if (select == 5) {
                System.out.println("저장");
            } else if (select == 6) {
                System.out.println("종료");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

    }
    private static void blank() {
        for (int i = 0; i < 15; i++) {
            System.out.println ();
        }
    }

    // 다음 텍스트 전환 (스크롤)
    private static void nextText() {
        for (int i = 0; i < 100; i++) {
            System.out.println ();
        }
    }

    // 3초 대기
    private static void sec3() {
        try {
            Thread.sleep(1800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
