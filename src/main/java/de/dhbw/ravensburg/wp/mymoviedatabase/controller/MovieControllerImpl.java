package de.dhbw.ravensburg.wp.mymoviedatabase.controller;

import de.dhbw.ravensburg.wp.mymoviedatabase.service.MovieServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MovieControllerImpl {

    MovieServiceImpl movieService;

    public MovieControllerImpl(MovieServiceImpl movieService){
        this.movieService = movieService;
    }

    public String getName(){
        return "MovieControllerImpl";
    }

    public String getServiceName(){
        return this.movieService.getName();
    }
}
