package musiclibrary.rest;

import musiclibrary.mvc.controller.ArtistController;
import musiclibrary.mvc.model.modelswithmorphia.ArtistDBModel;
import musiclibrary.mvc.view.uiArtistView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/artists")
public class ArtistRest {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getArtists() {
        uiArtistView view = new uiArtistView(new ArtistController(new ArtistDBModel()));
        view.getAll();
        return "Got artists!";
    }
}
