import java.util.*;

class LargestNumber{
    
    public static void main(String[] args) {
        Vector<String> array = new Vector<>();
        array.add("54");
        array.add("546");
        array.add("548");
        array.add("60");
        //desired output : 6054854654
        largestNumber(array);
    }
    
    // A Vector is used instead of an array, it stores elements dynamically.
    //This function only accepts a vector of Strings. Specifically using Strings since the output might be very large. Hence a concat of String is done
    static void largestNumber(Vector<String> array){
        
        //Sorting this array using the Comparator interface which is used to compare 2 objects of a user defined class. We need to override compare method.
        Collections.sort(array, new Comparator<String>(){

            @Override
            public int compare(String A, String B){
                String AB = A + B;
                String BA = B + A;
                return AB.compareTo(BA) > 0 ? -1 : 1 ;
            }
            //The sorting order is decided by the return value of the compareTo() method.
            //The method returns a number indicating whether the object being compared is less than, equal to or greater than the object being passed as an argument.
            // This is done with using -1,0,1 depending on whether the element is less than, equal to, or greater than the element being compared to.

        });
        Iterator i = array.iterator();
        while(i.hasNext())
            System.out.println(i.next()); 
    }

}