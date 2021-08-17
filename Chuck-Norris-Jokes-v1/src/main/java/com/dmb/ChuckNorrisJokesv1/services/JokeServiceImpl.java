
package com.dmb.ChuckNorrisJokesv1.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

// @author Declan Blackman
// @date Aug 17, 2021


@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
