
import java.util.ArrayList;


public class ArrayListExample_2 {
    public static void main(String args[])
    {
        ArrayList<Integer> number=new ArrayList<>();
        
        // Adding elements in the list .
        
        number.add(12); // index:0
        number.add(34); // index:1
        number.add(21); // index:2
        number.add(88); // index:3
        System.out.print("Elements present in the array  :-" );
        for(Integer y : number){
            System.out.print(y+" ");
        }
        
        boolean check=number.isEmpty();  // If list is empty then returns True else returns False .
        System.out.println("The array list is empty :-"+check);
        
        boolean contain=number.contains(34); // If list is contains the value then return True else return False .
        System.out.println("The array list is containing 34 :-"+contain);
        
        int position=number.indexOf(34); // It returns the index of the element which is passed .
        System.out.println("The index of 34 is:-"+position);
        
        number.set(1, 40); // It is used to replace value of a index .
        System.out.print("After replacing the element of index 1:-" );
        for(Integer y : number){
            System.out.print(y+" ");
        }
        System.out.println("");
        
        int x = number.get(0);//
        System.out.print("The element present at index 0 is :-"+x );
        System.out.println("");
    }
}
