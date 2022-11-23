package set.application;

import set.model.entities.Client;

public class Program3 {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); // Gives 'false' as answer. It compares the memory address of the two not the contents of the objects.
        System.out.println(s1 == s2); // Returns 'true' because the compiler treats literals differently.

    }
}
