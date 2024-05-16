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
        if (treats.containsKey(brand)){
            if((treats.getOrDefault(brand,0)==1)){
                treats.put(brand,0);}
            else{
            }
        }
    }

    public boolean contains(String brand) {
        return treats.containsKey(brand);
    }


    public static void main(String[] args) {
        System.out.println("Hello world!!!");
    }
}