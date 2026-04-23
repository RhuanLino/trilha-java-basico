import java.util.ArrayList;
import java.util.List;

public class Joker {
    List<Number> list = new ArrayList<>();

    public void printList() {
        System.out.println(list);
    }

    // This method will not compile because the list is of type <?>, which means
    // it can be any type, so we can't add anything to it.
    list.add(23);
    
    List<? extends Number> list2 = new ArrayList<>();

    // So now we can add some numbers to the list2
    list2.add(23);

    // But we can't read anything in the list2
    list2.get(0);

    // And there is a type Super, that get the atributes from the parent class
    List<? super Number> list3 = list;
    
    list3.add(23.5);
    list3.add(23);
    list3.add(23.5f);
}
