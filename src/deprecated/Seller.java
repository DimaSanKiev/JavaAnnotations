package deprecated;

import java.awt.Image;
import java.util.List;

public class Seller {

    @Deprecated
    public void placeAdInNewspaper(String adText, int numDays) {
        // Do all of the old school things
    }

    public void postInCraigslist(String adText, List<Image> images) {
        // Do all of the new school stuff
    }
}
