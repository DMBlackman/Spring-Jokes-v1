
package com.dmb.ChuckNorrisJokesv1.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dmb.ChuckNorrisJokesv1.services.JokeService;

// @author Declan Blackman
// @date Aug 17, 2021

public class JokeController {

	private final JokeService jokeService;
		
		public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
		
		@RequestMapping({"/", ""})
		public String showJoke(Model model) {
			
			model.addAttribute("joke", jokeService.getJoke());
			
			return "index";
		}
}
