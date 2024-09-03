import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    System.out.println("Hello and welcome!");


        List L = new ArrayList();
        L.add(5);
        L.add(10.4);
        L.add("Hello world");
        //Different ways to print ArrayList
        System.out.println(L);
        for(Object a: L)
            System.out.println(a);

       Object M[] =  L.toArray();
        for(int i=0; i<M.length; i++)
            System.out.println(M[i]);

        for(int i=0; i<L.size(); i++)
            System.out.println(L.get(i));
    }
}