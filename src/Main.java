import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        //Vector<Integer>	A generic class (Vector) using Integer as its type
        //Integer	A wrapper class for primitive int
        //<Integer>	Generic type parameter (used to enforce type-safety)
        Vector<Integer> v = new Vector<>(4,2);
        // Adding custom elements
        v.add(1);
        v.add(2);
        v.add(4);
        //v.removeElement(4);
        v.add(3,5);
        v.add(100);
        System.out.println("Vector v is : " + v);
        for(int num : v) {
        System.out.print(num + " ");
        }
        System.out.println();// this line moves the cursor to the next line
        System.out.println(v.size());

        Vector v1 = new Vector(); // No type specified vector (raw type)
        // Adding custom element using add() method
        v1.add(1);// int (auto boxed to Integer)
        v1.add(2);
        v1.add("geeks");
        v1.add("forGeeks");
        v1.add(3);
        v1.set(0,69);

        // Printing the vector elements to the console
        System.out.println("Vector v1 is " + v1);
        // Creating generic vector
        Vector<Integer> v2 = new Vector<Integer>();
        // Adding custom elements using add() method
        v2.add(1);
        v2.add(2);
        v2.add(3);
        v2.set(0,11);
        // Printing the vector elements to the console
        System.out.println("Vector v2 is " + v2);
    }
}