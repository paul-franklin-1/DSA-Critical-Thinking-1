public class CandyBagManager2 {
    public static void main(String[] args) {
        Bag<String> CandyBag = new Bag<>();
        Bag<String> CandyBag2 = new Bag<>();
        CandyBag.add("Twix");
        CandyBag.add("Twix");
        CandyBag.add("Baby Ruth");
        for(int i=0;i<10;i++){
            CandyBag2.add("Almond Joy");}
        CandyBag2.add("Milky Way");
        CandyBag2.add("Milky Way");
        for(int i=0;i<15;i++){
            CandyBag2.add("Snickers");}
        System.out.println("Size Candy Bag #1: " + CandyBag2.size() + "\n" +
                "Size Candy Bag #2: " + CandyBag2.size());
        CandyBag.merge(CandyBag2);
        CandyBag.print(CandyBag);
        CandyBag.distinct(CandyBag);

    }}

