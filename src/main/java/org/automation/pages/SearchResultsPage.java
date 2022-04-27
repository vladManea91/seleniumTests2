package org.automation.pages;

import lombok.Getter;
import org.automation.driver.DriverManager;
import org.openqa.selenium.By;


@Getter
public final class SearchResultsPage extends BasePage {

  By advanced = By.xpath("//a[contains(text(),'Advanced')]");
  By bulbapedia = By.xpath("//input[@id='mw-search-ns4']");
  By searchButton = By.xpath("//span[contains(text(),'Search')]");

  String yamask = "Yamask";


  public void clickAdvancedButton() {
    click(advanced, "advanced button clicked");
  }

  public void tickBulbapediaCheckbox() {
    click(bulbapedia, "bulbapedia checkbox ticked");
  }

  public void clickSearchButton() {
    click(searchButton, "search button clicked");
  }

  public void searchYamask () {
    pageSource(yamask);
  }

  public void countPokemons() {
    int size = DriverManager.getDriver().getPageSource().split("(Pok%C3%A9mon)").length-1;
  }


}
