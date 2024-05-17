import java.util.HashMap;
import java.util.Map;

public class CandyBag{
    private Map<String,Integer> treats;
    public CandyBag(){
        treats = new HashMap<>();
    }
    public void addTreat (String brand){
        treats.put(brand,treats.getOrDefault(brand,0)+1);
    }
    public void printTreats(){
        for (Map.Entry<String, Integer> entry : treats.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }}
    public int count(String brand) {
        return treats.getOrDefault(brand, 0);}

    public int size() {
        int totalTreats = 0;
        for(int count : treats.values()){
            totalTreats+=count;}
        return totalTreats;}

    public void removeTreat (String brand){
        int brandCount = treats.get(brand);
        if (treats.containsKey(brand)){
            if(brandCount==1){
                treats.remove(brand);}
            else{treats.put(brand,brandCount-1);}
        }
    }
    public void contains(String brand) {
        boolean result = treats.containsKey(brand);
        if (result) {
            System.out.println("This bag contains the key \"" + brand + "\"");
        } else {
            System.out.println("This bag does not contain the key \"" + brand + "\"");}}}