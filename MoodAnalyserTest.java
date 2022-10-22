package com.exceptionhandle;

import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyserTest {

	@Test
	public void givenMessgae_WhenSad_ShouldReturn_Sad() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Sad mood");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("SAD", mood);

	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in any mood");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	
	 @Test
	    public void givenNullMood_ShouldReturn_Happy() {
	        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
	        String mood = moodAnalyzer.analyseMood();
	        Assert.assertEquals("HAPPY",mood);
	    }

}
Footer
© 2022 GitHub, Inc.