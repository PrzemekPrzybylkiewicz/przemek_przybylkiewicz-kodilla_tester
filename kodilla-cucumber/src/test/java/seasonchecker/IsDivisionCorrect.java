package seasonchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsDivisionCorrect implements En {
    private int number;
    private String result;
    private String answer;

    public IsDivisionCorrect() {
        Given("the number to be divided", () -> {
            // Write code here that turns the phrase above into concrete actions
//            throw new io.cucumber.java8.PendingException();
            this.number = 3;
        });

        When("should divide", () -> {
            // Write code here that turns the phrase above into concrete actions
            DivisionChecker divisionChecker = new DivisionChecker();
             this.result = divisionChecker.checkNumber(this.number, answer);
        });

        Then("if divided by {int} say {string}", (Integer int1, String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(int1, this.answer);
        });


    }
}
