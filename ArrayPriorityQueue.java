/*
 * Team Mozzarella
 * Shantanu Jha, Elias Milborn, Henry Zhang
 * APCS2 pd9
 * HW35--Privileged Status Gets You to the Front of the Line  
 * 2016-05-04
 */


import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue  {
    ArrayList<Comparable> data;

    public ArrayPriorityQueue (){
        data = new ArrayList<Comparable>();
    }
    public void add(Comparable x){
        for(int i = 0; i < data.size(); i++){
            if(data.get(i).compareTo(x) >= 0){
                data.add(i, x);
                return;
            }
        }
        data.add(x);
    }
    public boolean isEmpty(){
        return (data.size() == 0);
    }
    public Comparable peekMin(){
        return data.get(data.size()-1);
    }
    public Comparable removeMin(){
        return data.remove(data.size()-1);
    }
}
