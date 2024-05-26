public class CandyBagManager2 {
    public static void main(String[] args) {
        Bag2<String> CandyBag2 = new Bag2<>();
        CandyBag2.add("Twix");
        CandyBag2.add("Twix");
        CandyBag2.add("Baby Ruth");
        for(int i=0;i<10;i++){
            CandyBag2.add("Almond Joy");}
        CandyBag2.add("Milky Way");
        CandyBag2.add("Milky Way");
        for(int i=0;i<15;i++){
            CandyBag2.add("Snickers");}
        CandyBag2.print(CandyBag2);
        CandyBag2.contains("Milky Way");
        CandyBag2.contains("Mars Bar");
        System.out.println("Quantity of Milky Ways: " + CandyBag2.count("Milky Way"));
        System.out.println("Quantity of Snickers: " + CandyBag2.count("Snickers"));
        CandyBag2.remove("Milky Way");
        CandyBag2.contains("Milky Way");
        System.out.println("Quantity of Milky Ways: " + CandyBag2.count("Milky Way"));
        CandyBag2.print(CandyBag2);
        CandyBag2.size();
    }}

