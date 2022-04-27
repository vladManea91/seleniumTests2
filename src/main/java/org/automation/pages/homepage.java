package org.automation.pages;

import lombok.Getter;
import org.openqa.selenium.By;


@Getter
public final class homepage extends BasePage {

  By acceptCookiesButton = By.xpath("//body/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/a[1]");
  By searchBar = By.xpath("//body/div[1]/div[2]/form[1]/input[2]");
  By pokemons = By.partialLinkText("(Pok%C3%A9mon)");

  String communities = "communities";

  public void clickAcceptCookiesButton() {
    click(acceptCookiesButton, "cookies button");
  }

  public void fillSearchBar() {
    sendKeys(searchBar, communities, "communities searched");
  }

  public void search() {
    sendKeysButton(searchBar);
  }

}
