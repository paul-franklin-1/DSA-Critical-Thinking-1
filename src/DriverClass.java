public class DriverClass {
    public static void main(String[] args) {
        CandyBag JohnBag = new CandyBag();
        JohnBag.addTreat("Twix");
        JohnBag.addTreat("Twix");
        JohnBag.addTreat("Baby Ruth");
        for(int i=0;i<10;i++){
            JohnBag.addTreat("Almond Joy");}
        JohnBag.addTreat("Milky Way");
        for(int i=0;i<15;i++){
            JohnBag.addTreat("Snickers");}
        System.out.println(JohnBag.quantity());
        JohnBag.contains("Baby Ruth");
        JohnBag.contains("Mars Bar");



}}
