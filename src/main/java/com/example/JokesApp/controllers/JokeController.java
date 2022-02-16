package com.example.JokesApp.controllers;

import com.example.JokesApp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping({"/",""})
    private String showJokes(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }

}
