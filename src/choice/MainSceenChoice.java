package choice;

import java.util.Scanner;
import sceen.*;

public class MainSceenChoice {
    public static void mainSceenChoice () {
        Scanner sc = new Scanner(System.in);

        int coice = sc.nextInt ();

        if (coice == 1) {
//            System.out.println ("게임을 시작합니다.");
        } else if (coice == 2) {
//            System.out.println ("게임방법을 출력합니다.");
            System.out.println("게임방법");
            System.out.println("당신의 목표는 대통령이 되는 것 입니다.");
            System.out.println("당신은 여러 지역 중 하나의 도시를 선택할 수 있습니다. (각 도시마다 몬스터 스폰률이 다릅니다.)");
            System.out.println("만약 서울을 선택하면 서울로 이동합니다.");
            System.out.println("서울에서는 하급, 중급, 상급, 감염, 보스 좀비가 스폰됩니다.");
            System.out.println("각각 50, 100, 200, 500, 10000골드가 드랍됩니다.");
            System.out.println("코인으로 상점에서 포션과 무기 스텟이 구매 가능합니다.");

        } else {
            System.out.println ("잘못된 입력입니다.");
        }

    }
}
