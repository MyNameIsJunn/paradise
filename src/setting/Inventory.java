package setting;

public class Inventory {
    int LowerPotion = 0; // 소형 포션
    int MiddlePotion = 0; // 중형 포션
    int HighPotion = 0; // 대형 포션

    public Inventory () {
        this.LowerPotion = 5;
        this.MiddlePotion = 0;
        this.HighPotion = 0;
    }

    public void print () {
        nextText ();
        System.out.println ("                      소형 포션 : " + this.LowerPotion);
        System.out.println ("                      중형 포션 : " + this.MiddlePotion);
        System.out.println ("                      대형 포션 : " + this.HighPotion);
        blank ();
        sec3 ();
        nextText ();
    }

    // 공백 추가
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
