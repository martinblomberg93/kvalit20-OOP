public class Uppgift_13_6 {
    public static void main(String[] args) {

        card c1 = new card();
        //färg
        c1. suit = card.SPADES;
        //valör
        c1. rank = card.QUEEN;

        System.out.println("---kort 1 ---");

        card(c1);


        card c2 = new card();
        //färg
        c2.suit = card.CLUBS;
        //valör
        c2.rank = 7;

        System.out.println("---kort 2 ---");

        card(c2);
    }

    private static void card(card c) {
        System.out.println(c.suit + " of " + c.rank);
        System.out.println(card.RANKS[c.rank] + " of " + card.SUITS [c.suit] );
    }
}
