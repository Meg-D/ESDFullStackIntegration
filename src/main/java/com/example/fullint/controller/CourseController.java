package com.example.fullint.controller;

import com.example.fullint.Service.CourseService;
import com.example.fullint.bean.Courses;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

@Path("course")
public class CourseController {

    @POST
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addCourse(Courses course) throws URISyntaxException{
        boolean val = new CourseService().addCourse(course);
        if (val == true)
        return Response.ok().build();
        else
        return Response.status(203).build();
    }
}
