public class CandyBagManager2 {
    public static void main(String[] args) {
        Bag2<String> CandyBag2 = new Bag2<>();
        Bag2<String> CandyBag3 = new Bag2<>();
        CandyBag2.add("Twix");
        CandyBag2.add("Twix");
        CandyBag2.add("Baby Ruth");
        for(int i=0;i<10;i++){
            CandyBag3.add("Almond Joy");}
        CandyBag3.add("Milky Way");
        CandyBag3.add("Milky Way");
        for(int i=0;i<15;i++){
            CandyBag2.add("Snickers");}
        System.out.println("Size Candy Bag #1: " + CandyBag2.size() + "\n" +
                "Size Candy Bag #2: " + CandyBag3.size());
        CandyBag2.merge(CandyBag3);
        CandyBag2.printThis(CandyBag2);
        CandyBag2.distinct(CandyBag2);

    }}

