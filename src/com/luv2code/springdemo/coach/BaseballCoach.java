package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneService;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.Coach#getDailyWorkout()
	 */
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
