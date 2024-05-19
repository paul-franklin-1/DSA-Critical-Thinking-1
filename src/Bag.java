import java.util.HashMap;
import java.util.Map;

public class Bag{
    private Map<String,Integer> treats;
    public Bag(){
        treats = new HashMap<>();
    }
    public void add (String brand){
        if (treats == null) {
            treats = new HashMap<>();}
        treats.put(brand,treats.getOrDefault(brand,0)+1);
    }
    public void print(){
        if(treats != null){
            System.out.println("\nCurrent contents of bag:\n[");
            for (Map.Entry<String, Integer> entry : treats.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println("Key: " + key + ", Value: " + value);
            }System.out.println("]\n");}
        else{System.out.println("Alert: This bag does not exist");}}


    public int count(String brand) {
        if (treats != null){
            return treats.getOrDefault(brand, 0);}
        else{return 0;}}

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