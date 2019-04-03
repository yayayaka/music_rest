package com.example.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorld {
    @GET
//    @Produces(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Student getMessage() {
        return new Student();
    }
}

class Student {
    public int id;
    public String name;

    public Student() {
        this.id = 1;
        this.name = "My name";
    }
}