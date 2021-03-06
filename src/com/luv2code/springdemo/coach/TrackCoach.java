package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneService;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Get on to the track and run for 20 minutes now";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	private void doMyCleanupStaffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStaffYoYo");
	}
}
