public class Card {
    private String rank;
    private String suit;
    public int Card(String rank, String suit)
    {
        if(rank!=null&&suit!=null)
        {
            this.rank=rank;
            this.suit=suit;
        }
        else
        {
            throw IllegalArgumentException;
        }
        public boolean equals(Object obj)
        {
            if(!(obj instanceof Card)) return false;
            Card C=(Card) obj;
            return (rank.equals(C.rank)&&suit.equals(C.suit));
        }
        public int hashCode()
        {
            return rank.hashCode();
        }
    }
    public static void main(String[] args)
    {

    }
}
