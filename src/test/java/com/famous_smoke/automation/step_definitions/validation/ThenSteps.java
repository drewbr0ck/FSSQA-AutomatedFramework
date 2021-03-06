package com.famous_smoke.automation.step_definitions.validation;


import com.famous_smoke.automation.Hooks;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

import static com.famous_smoke.automation.assertions.FamousSmokeAssertions.assertThat;


/**
 * Created by drew on 11-01-2016.
 */
public class ThenSteps {

    @Then("^the brand identification should be visible$")
    public void the_brand_identification_should_be_vivisble() throws Throwable {
        assertThat(Hooks.testBrandPageData).isIdentified();
    }

    @Then("^the item identification should be visible$")
    public void the_item_identification_should_be_visible() throws Throwable {
        assertThat(Hooks.testBrandItemPageData).isIdentified();
    }

}
