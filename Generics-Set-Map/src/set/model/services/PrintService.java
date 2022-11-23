package set.model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Type> { // This way, we can instantiate any type we want
    private List<Type> list = new ArrayList<>();

    public void addValue(Type value) {
        list.add(value);
    }

    public Type first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
