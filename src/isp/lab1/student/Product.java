package isp.lab1.student;

import isp.lab1.*;
import java.time.Duration;
import java.time.LocalDate;

public interface Product {

    public String getTitle();

    public double getCost();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public void order(int quantity);

    public String getFormattedReleaseDate();

}
