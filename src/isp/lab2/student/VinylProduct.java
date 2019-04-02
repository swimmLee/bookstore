package isp.lab2.student;

import isp.lab1.student.*;
import java.time.Duration;

public interface VinylProduct {
    
    public String getArtist();

    public Duration getPlayingTime();

    public String getFormattedPlayingTime();
}
