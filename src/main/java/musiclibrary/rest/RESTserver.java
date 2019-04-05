package musiclibrary.rest;

import com.google.inject.Inject;
import musiclibrary.entities.Artist;
import musiclibrary.mvc.controller.ArtistController;
import musiclibrary.mvc.model.Model;
import musiclibrary.mvc.model.modelswithmorphia.ArtistDBModel;
import musiclibrary.mvc.view.uiArtistView;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/artists")
public class RESTserver {
    private uiArtistView view;

//    @Inject
    public RESTserver() {
        this.view = new uiArtistView(new ArtistController(new ArtistDBModel()));
    }

    @GET
//    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllArtists() {
        return JSONparser.getJSON(view.getAll());
    }

}
