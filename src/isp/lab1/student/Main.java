package isp.lab1.student;

import isp.lab1.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Original Program");

        HardcoverBook book1 = new HardcoverBook("The Hunger Games", "9780439023528", 8.79, 12, LocalDate.of(2010, Month.JULY, 3), "Suzanne Collins", 384);
        PaperbackBook book2 = new PaperbackBook("A Wrinkle in Time", "9780312367541", 6.19, 4, LocalDate.of(2007, Month.MAY, 1), "Madeleine L'Engle", 256);
        VinylRecord record = new VinylRecord("Kind of Blue", 13.54, 18, LocalDate.of(2011, Month.APRIL, 12), "Miles Davis", Duration.ofMinutes(46));

        System.out.println(book1.toString());
        System.out.println("\n");
        System.out.println(book2.toString());
        System.out.println("\n");
        System.out.println(record.toString());
        System.out.println("\nSecond Time through\n");
        
        List<Product> inventory = new ArrayList<>();
        
        Product book1a = new HardcoverBook("The Hunger Games", "9780439023528", 8.79, 12, LocalDate.of(2010, Month.JULY, 3), "Suzanne Collins", 384);
        Product book2a = new PaperbackBook("A Wrinkle in Time", "9780312367541", 6.19, 4, LocalDate.of(2007, Month.MAY, 1), "Madeleine L'Engle", 256);
        Product recorda = new VinylRecord("Kind of Blue", 13.54, 18, LocalDate.of(2011, Month.APRIL, 12), "Miles Davis", Duration.ofMinutes(46));
        
        inventory.add(book1a);
        inventory.add(book2a);
        inventory.add(recorda);
        
        for(Product p : inventory){
            System.out.println(p.toString()+"\n");
            
        }

        System.out.println(book1a.toString());
        System.out.println("\n");
        System.out.println(book2a.toString());
        System.out.println("\n");
        System.out.println(recorda.toString());
    }
}
