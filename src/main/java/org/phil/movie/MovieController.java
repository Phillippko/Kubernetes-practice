package org.phil.movie;


import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class MovieController {
    private final Environment environment;

    @RequestMapping(value = "/")
    public List<String> available(){
        List<String> movies = new ArrayList<>();
        movies.add("Pshe (1984) from port " + environment.getProperty("server.port"));
        movies.add("Ghostbusters (2016)");
        return movies;

    }
}
