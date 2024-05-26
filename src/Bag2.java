import java.util.*;
/**
     * this class constructs multisets that represent Halloween candy bags, and includes methods
     * to interact with multiset instances
     */
    public class Bag2<T>{
        /**
         * this attribute is a hashmap declaration that assists the constructor in creating
         * an instance's multiset
         */
        private Map<T,Integer> treats;

        /**
         * this is the constructor for the bag class that creates a new hashmap that is
         * part of the new class object
         */
        public Bag2(){
            treats = new HashMap<>();
        }

        /**
         * this method adds a new element to the multiset
         * @param brand
         */
        public void add (T brand){
            if (treats == null) {
                treats = new HashMap<>();}
            treats.put(brand,treats.getOrDefault(brand,0)+1);
        }

    public int count(T brand) {
        if (treats != null){
            return treats.getOrDefault(brand, 0);}
        else{return 0;}}
        /**
         * this method prints a string representation of all the elements in the class object's,
         * multiset, including all their keys and values
         */
    public void printThis(Bag2<T> bag){
        if(treats != null){
            System.out.println("\nCurrent contents of bag:\n[");
            for (Map.Entry<T, Integer> entry : treats.entrySet()) {
                T key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println("Key: " + key + ", Value: " + value);
            }System.out.println("]\n");}
        else{System.out.println("Alert: This bag does not exist");}}

        /**
         * @return the quantity of elements in class object's multiset
         * If hashmap "treats" is null, alert user via printed message
         */
        public int size() {
            if (treats != null){
                int totalTreats = 0;
                for(int count : treats.values()){
                    totalTreats+=count;}
                return totalTreats;}
            else{return 0;}}

        /**
         * --This method removes a specified String element from
         * multiset if more than one of the String argument exists
         * within multiset. The int value for the String key is
         * decremented by 1.
         * --If there is just one occurrence of the argument in the
         * multiset, the specified key is removed from the multiset
         * altogether
         * --If the argument is not found in the multiset, the method
         * will alert the user
         * --If the hashmap "treats" is null, the method will alert the user
         * @param brand
         */
        public void remove (T brand){
            int brandCount = treats.get(brand);
            if (brand != null && treats.containsKey(brand)){
                if(brandCount==1){
                    treats.remove(brand);}
                else{treats.put(brand,brandCount-1);}}
            else if (brand != null){
                System.out.println("Alert: this candy does not exist in this bag");}
            else{System.out.println("Alert: this bag does not exist");}}

        /**
         * --This method determines if an element exists within the multiset
         * --This method alerts the user if hashmap field "treats"
         * is null
         * --If "treats" is not null, method prints text to
         * tell user whether the element is in the multiset or not
         * @param brand
         */
        public void contains(T brand) {
            if (treats != null){
                boolean result = treats.containsKey(brand);
                if (result) {
                    System.out.println("This bag contains the key \"" + brand + "\"");
                } else {
                    System.out.println("This bag does not contain the key \"" + brand + "\"");}}
            else{System.out.println("Alert: This bag does not exist");}}
        public void merge(Bag2<T> otherBag){
            treats.putAll(otherBag.treats);}
        public void distinct(Bag2<String> bag){
            System.out.println("Unique candy brands: " + bag.treats.keySet());
            }}





