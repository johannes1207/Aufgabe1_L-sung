package de.dhbw.ravensburg.wp.mymoviedatabase.controller;

import de.dhbw.ravensburg.wp.mymoviedatabase.service.MovieService;
import org.springframework.stereotype.Controller;

@Controller
public class MovieControllerImpl implements MovieController {

    private MovieService movieService;

    public MovieControllerImpl(MovieService movieService){
        this.movieService = movieService;
    }


    @Override
    public String getName(){
        return "MovieControllerImpl";
    }

    @Override
    public String getServiceName(){
        return this.movieService.getName();
    }

}
