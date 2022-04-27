package org.automation.tests;

import org.automation.dataproviders.DataProviders;
import org.automation.driver.DriverManager;
import org.automation.pages.BasePage;
import org.automation.pages.SearchResultsPage;
import org.automation.pages.homepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTests extends BaseSetup {


  @Test(testName = "pokemon search", description = "search for pokemon")
  public void searchPokemon() throws InterruptedException {
    homepage homepage = new homepage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();


    homepage.clickAcceptCookiesButton();
    homepage.fillSearchBar();
    homepage.search();

    searchResultsPage.clickAdvancedButton();
    searchResultsPage.tickBulbapediaCheckbox();
    searchResultsPage.clickSearchButton();
    searchResultsPage.countPokemons();
    searchResultsPage.searchYamask();

    DriverManager.getDriver().quit();

  }

}
