import java.util.*;

public class App {

    public static Set union(Set numbers, Set letters){
        Set union = new HashSet(numbers);
        union.addAll(letters);
        return union;
    }

    public static Set intersect(Set set1, Set set2){
        Set intersect = new HashSet(set2);
        intersect.retainAll(set1);
        return intersect;
    }

    public static Set diff(Set set1, Set set2){
        Set diff = new HashSet(set1);
        for (Object o : set2){
            if (diff.contains(o)){
                diff.remove(o);
            }
        }
        return diff;
    }

    public static boolean isSubset(Set set1, Set set2){
        return set1.containsAll(set2);
    }

    public static Set cartesiano(Set set1, Set set2){
        Set cartesiano = new TreeSet();
        String val;
        for (Object o : set1){
            for (Object b: set2){
                val = o.toString() + b.toString();
                cartesiano.add(val);
            }
        }
        return cartesiano;
    }
    public static void main(String[] args) {

        Set numbers = new HashSet();
        Collections.addAll(numbers,1,2,3);

        Set letters = new HashSet();
        Collections.addAll(letters,"a","b","c");

        Set aux = new HashSet();
        Collections.addAll(aux,1,2);


        Set union = union(numbers,letters);
        Set intersect = intersect(numbers,aux);
        Set diff = diff(numbers,aux);
        Set cartesiano = cartesiano(numbers,letters);

        System.out.println(union);
        System.out.println(intersect);
        System.out.println(diff);
        System.out.println(isSubset(numbers,aux));
        System.out.println(cartesiano);



    }
}
