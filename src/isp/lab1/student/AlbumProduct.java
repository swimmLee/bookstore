package isp.lab1.student;

import java.time.Duration;
import java.time.LocalDate;

public interface AlbumProduct {
    public String getTitle();

    public double getCost();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getArtist();

    public void order(int quantity);

    public Duration getPlayingTime();

    public String getFormattedReleaseDate();
}
