package setting;

public class Player {
    int kill; // 잡은 좀비
    int Money; // 소지금
    int HP; // 체력
    int MP; // 마나
    double DAMAGE; // 공격력
    boolean SpecialAttack; // 특수 공격 사용 가능 여부
    double rating; // 지지율
    double Infectiousness; // 감염율


    public Player () {
        this.kill = 0;
        this.Money = 1000;
        this.HP = 300;
        this.MP = 100;
        this.DAMAGE = 33.0;
        this.SpecialAttack = false;
        this.rating = 1.0;
        this.Infectiousness = 0.0;
    }

    // 현재 상태 출력
    public void print () {
        nextText ();
        System.out.println ("                             MONEY : " + this.Money);
        System.out.println ("                                HP : " + this.HP);
        System.out.println ("                                MP : " + this.MP);
        System.out.println ("                            DAMEGE : " + this.DAMAGE);
        if (this.SpecialAttack) {
            System.out.println ("                        특수 공격 사용 가능");
        }

        System.out.println ("                              지지율 : " + this.rating);
        System.out.println("                              감염율 : " + this.Infectiousness);

        blank ();
        sec5 ();
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

    // 5초 대기
    private static void sec5() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
