package chap10_Strategy;

public class Hand {
    public static final int HANDVALUE_GUU = 1;
    public static final int HANDVALUE_CHO = 2;
    public static final int HANDVALUE_PAA = 3;
    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };
    public static final String[] name ={
            "グー","チョキ","パー"
    };
    private int handvalue;

    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue) {
        return hand[handvalue];
    }
    public boolean isStrongerThan(Hand h) {
        return fight(h)==1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if (this==h){
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }
    public String toString() {
        return name[handvalue];
    }

}
