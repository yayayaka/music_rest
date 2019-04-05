package musiclibrary.rest;

import musiclibrary.entities.Artist;
import musiclibrary.entities.Entity;

import java.util.List;

public final class JSONparser {
    private JSONparser() {
    }

    public static String getJSON(Artist artist) {
        return artist.toString();
    }

    public static String getJSON(List<Artist> artists) {
        String result = "";
        for (int pointer = 0; pointer < artists.size(); pointer++) {
            result += artists.get(pointer).toString();
            if (pointer != artists.size() - 1) {
                result += ", ";
            }
        }
        return result;
    }
}
