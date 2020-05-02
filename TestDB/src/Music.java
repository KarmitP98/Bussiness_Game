import Model.Album;
import Model.Artist;
import Model.Datasource;
import Model.Song;

import java.util.ArrayList;
import java.util.List;

public class Music {

    Datasource datasource = null;
    int index = 3;

    public Music() {
        datasource = new Datasource();

        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        List list = datasource.queryArtists(index);
        if (list == null)
            System.out.println("No Artist!");
        else {
            if (index == 0) {
                for (Object obj : list) {
                    System.out.println("ID: " + ((Artist) obj).getId() + " || Name: " + ((Artist) obj).getName());
                }
            } else if (index == 1) {
                for (Object obj : list) {
                    System.out.println("ID: " + ((Song) obj).getId() + " || Name: " + ((Song) obj).getName() + " || Track: " + ((Song) obj).getTrack() + " || Album: " + ((Song) obj).getAlbumId());
                }
            } else {
                for (Object obj : list) {
                    System.out.println("ID: " + ((Album) obj).getId() + " || Name: " + ((Album) obj).getName() + " || Artist: " + ((Album) obj).getArtistId());
                }
            }
        }

    }

    public static void main(String[] args) {
        new Music();
    }

}
