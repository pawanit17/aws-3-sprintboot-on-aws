package io.bubblesort.springaws.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moviereviews")
public class WelcomeResource
{
    @RequestMapping("/{moviename}")
    public String getWelcomeMessage(@PathVariable("moviename") String movieName )
    {
        return "An Amazing Flick!";
    }
}
