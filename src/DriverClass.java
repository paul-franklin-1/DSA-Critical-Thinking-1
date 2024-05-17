public class DriverClass {
    public static void main(String[] args) {
        CandyBag JohnBag = new CandyBag();
        JohnBag.addTreat("Twix");
        JohnBag.addTreat("Twix");
        JohnBag.addTreat("Baby Ruth");
        for(int i=0;i<10;i++){
            JohnBag.addTreat("Almond Joy");}
        JohnBag.addTreat("Milky Way");
        JohnBag.addTreat("Milky Way");
        for(int i=0;i<15;i++){
            JohnBag.addTreat("Snickers");}
        JohnBag.printTreats();
        JohnBag.contains("Milky Way");
        JohnBag.contains("Mars Bar");
        System.out.println("Quantity of Milky Ways: " + JohnBag.count("Milky Way"));
        System.out.println("Quantity of Snickers: " + JohnBag.count("Snickers"));
        JohnBag.removeTreat("Milky Way");
        JohnBag.contains("Milky Way");
        System.out.println("Quantity of Milky Ways: " + JohnBag.count("Milky Way"));
        JohnBag.printTreats();
        System.out.println("Current size of bag: " + JohnBag.size());


}}
