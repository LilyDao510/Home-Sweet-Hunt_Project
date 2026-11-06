package org.anitab;
import org.anitab.controller.Apartment;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Apartment a1 = new Apartment("123 Main St", 2, 1.5f, 2000);
        Apartment a2 = new Apartment("45 Oak Ave", 1, 1.0f, 1500);

        System.out.println(a1);
        System.out.println(a2);
    }
}


