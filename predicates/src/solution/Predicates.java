package solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Predicates{

    public static <T> void remove(Collection<T> coll, Predicate<T> pred){
        ArrayList<T> tempList = new ArrayList<>();
        for(T item : coll){
            if(pred.test(item)){
                tempList.add(item);
            }
        }
        coll.removeAll(tempList);
    }

    public static <T> void retain(Collection<T> coll, Predicate<T> pred){
        ArrayList<T> tempList = new ArrayList<>();
        for(T item : coll){
            if(!pred.test(item)){
                tempList.add(item);
            }
        }
        coll.removeAll(tempList);
    }

    public static <T> List<T> collect(Collection<T> coll, Predicate<T> pred){
        List<T> itemList = new ArrayList<>();
        for(T item : coll){
            if(pred.test(item)){
                itemList.add(item);
            }
        }
        return itemList;
    }

    public static <T> int find(ArrayList<T> list, Predicate<T> pred){
        for(int i = 0; i<list.size(); i++){
            if(pred.test(list.get(i))){
                return i;
            }
        }
        return -1;
    }
}
