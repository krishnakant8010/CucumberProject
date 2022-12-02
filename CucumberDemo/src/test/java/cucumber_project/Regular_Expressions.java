package cucumber_project;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Regular_Expressions {

	@Given("^i am interested in practising ([a-zA-Z]{1,}) GYM$")
	public void i_am_interested_in_practising_krishna_gym(String name) {
		System.out.println("i am interested in practising " + name + "GYM");
	}

	@Given("I want online to find krishna GYMs near me")
	public void i_want_online_to_find_krishna_gy_ms_near_me() {
		System.out.println("I want online to find krishna GYMs near me");
	}

	@Given("^I want to see the nearest GYM on 19th Jan (\\d+)$")
	public void i_want_to_see_the_nearest_gym_on_19th_jan(Integer year) {
		System.out.println("I want to see the nearest GYM on 19th Jan " + year);
	}

	@Given("they given me annual membership discount of {int}% from 19th Jan {int} to 19th Mar {int}.")
	public void they_given_me_annual_membership_discount_of_from_19th_jan_to_19th_mar(Integer int1, Integer int2, Integer int3) {
		System.out.println("they given me annual membership discount of {int}% from 19th Jan {int} to 19th Mar {int}.");
	}

	@When("my friends got to hear about this")
	public void my_friends_got_to_hear_about_this() {
		System.out.println("my friends got to hear about this");
	}

	@Then("{int} of them decided to join")
	public void of_them_decided_to_join(Integer int1) {
		System.out.println("{int} of them decided to join");
	}

	@Then("i future discount {int}% as referral bonus")
	public void i_future_discount_as_referral_bonus(Integer int1) {
		System.out.println("i future discount {int}% as referral bonus");
	}

	@Then("we could not start become of the lockdown")
	public void we_could_not_start_become_of_the_lockdown() {
		System.out.println("we could not start become of the lockdown");
	}
}
