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

    public void removeTreat (String brand){
        int brandCount = treats.get(brand);
        if (treats.containsKey(brand)){
            if(brandCount==1){
                treats.remove(brand);}
            else{treats.put(brand,brandCount-1);}
        }
    }
    public boolean contains(String brand) {
        return treats.containsKey(brand);
    }}