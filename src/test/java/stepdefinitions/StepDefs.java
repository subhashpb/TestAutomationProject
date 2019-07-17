package stepdefinitions;

import io.cucumber.java.en.Given;

public class StepDefs {
	@Given("^add values$")
	public void add_values() throws Throwable {
		System.out.println("Hello World");
	}
}
