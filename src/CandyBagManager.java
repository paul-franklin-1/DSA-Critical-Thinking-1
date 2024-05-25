/**
 * This driver class allows user to interact with class "Bag"
 * via the Bag class' constructor and methods
 */
public class CandyBagManager {
    /**
     * This is the main method and this is
     * the first method run by the program
     * @param args
     */
    public static void main(String[] args) {
        Bag CandyBag = new Bag();
        CandyBag.add("Twix");
        CandyBag.add("Twix");
        CandyBag.add("Baby Ruth");
        for(int i=0;i<10;i++){
            CandyBag.add("Almond Joy");}
        CandyBag.add("Milky Way");
        CandyBag.add("Milky Way");
        for(int i=0;i<15;i++){
            CandyBag.add("Snickers");}
        CandyBag.print();
        CandyBag.contains("Milky Way");
        CandyBag.contains("Mars Bar");
        System.out.println("Quantity of Milky Ways: " + CandyBag.count("Milky Way"));
        System.out.println("Quantity of Snickers: " + CandyBag.count("Snickers"));
        CandyBag.remove("Milky Way");
        CandyBag.contains("Milky Way");
        System.out.println("Quantity of Milky Ways: " + CandyBag.count("Milky Way"));
        CandyBag.print();
        CandyBag.size();
}}
