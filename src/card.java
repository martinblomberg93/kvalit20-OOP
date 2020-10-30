public class card {


    //clubs = klöver
    //diamond  = ruter
    // hearts = hjärter
    //spades = spader

    //konstanter, final innebär att det är konstant
    public static final int CLUBS = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int SPADES = 3;

    // instansvariabler / egenskaper /attribut

    public int suit; // färg - använder konstanterna
    public int rank; // valör - heltal mellan 1 och 13

    // 1 2 3 4 5 6 7 8 9 10 11
    // 1 2 3 4 5 6 7 8 9 10 Jack,Queen,King

// arrayer som används vid utskrifter
    public static String [] RANKS = { null, "1","2","3","4","5","6","7","8","9","10","jack","Queen","King"};

    public static String [] SUITS = {"Clubs","Diamonds", "Hearts", "Spades"};
                                    // 0      ,   1       ,  2   ,     3


    // Flera konstanter
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;



}
