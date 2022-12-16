package Laba_4;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList <T> ListFruit = new ArrayList<>();

    private double MaxWeight=0.0;
    private double weight=0.0;
    public Box() {
        this.ListFruit = new ArrayList<>();
    }
    public  void addfruitdefault(T fruit){
        ListFruit.add(fruit);
        weight= fruit.getWeight();
    }
    public void AddFruit( int count) throws InstantiationException, IllegalAccessException {
        Class someClass = ListFruit.get(0).getClass();
            while (count != 0) {

                ListFruit.add((T) someClass.newInstance());
                weight = ListFruit.get(0).getWeight();
                count--;
            }
    }
    public void Print(Box<T>another){
        for (int i =0; i<another.ListFruit.size();i++){
            System.out.println(another.ListFruit.get(i));
        }
    }

    public double getMaxWeight() {
        return MaxWeight=ListFruit.size()*weight;
    }
    public boolean Compare(Box<?>another){
            if((MaxWeight==another.getMaxWeight())){
                return true;}
            else return false;
    }
    public void Transfer(Box<T>another){
        ListFruit.addAll (another.ListFruit);
        another.ListFruit.clear();
        //another.setMaxWeight(0.0);
    }


}
