import java.util.HashMap;
import java.util.Map;

/**
 * this class constructs multisets that represent Halloween candy bags, and includes methods
 * to interact with multiset instances
 */
public class Bag{
    /**
     * this attribute is a hashmap declaration that assists the constructor in creating
     * an instance's multiset
     */
    private Map<String,Integer> treats;

    /**
     * this is the constructor for the bag class that creates a new hashmap that is
     * part of the new class object
     */
    public Bag(){
        treats = new HashMap<>();
    }

    /**
     * this method adds a new element to the multiset
     * @param brand
     */
    public void add (String brand){
        if (treats == null) {
            treats = new HashMap<>();}
        treats.put(brand,treats.getOrDefault(brand,0)+1);
    }

    /**
     * this method prints a string representation of all the elements in the class object's,
     * multiset, including all their keys and values
     */
    public void print(){
        if(treats != null){
            System.out.println("\nCurrent contents of bag:\n[");
            for (Map.Entry<String, Integer> entry : treats.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println("Key: " + key + ", Value: " + value);
            }System.out.println("]\n");}
        else{System.out.println("Alert: This bag does not exist");}}

    /**
     * @param brand
     * @return the int value associated with the key entered by user as an argument
     * If hashmap "treats" is null, method returns 0
     */
    public int count(String brand) {
        if (treats != null){
            return treats.getOrDefault(brand, 0);}
        else{return 0;}}

    /**
     *
     * @return
     */
    public int size() {
        int totalTreats = 0;
        for(int count : treats.values()){
            totalTreats+=count;}
        return totalTreats;}

    public void remove (String brand){
        int brandCount = treats.get(brand);
        if (brand != null && treats.containsKey(brand)){
            if(brandCount==1){
                treats.remove(brand);}
            else{treats.put(brand,brandCount-1);}
        }
    }
    public void contains(String brand) {
        if (treats != null){
            boolean result = treats.containsKey(brand);
            if (result) {
                System.out.println("This bag contains the key \"" + brand + "\"");
            } else {
                System.out.println("This bag does not contain the key \"" + brand + "\"");}}
        else{System.out.println("Alert: This bag does not exist");}}}