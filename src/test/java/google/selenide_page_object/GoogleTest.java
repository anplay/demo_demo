package google.selenide_page_object;

import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

  public GooglePage googlePage = new GooglePage();
  public SearchResultsPage results = new SearchResultsPage();

  @Test
  public void userCanSearch() {
    open("https://google.com/ncr");
    googlePage.searchFor("selenide");

    results.getResults().shouldHave(sizeGreaterThan(1));
    results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
  }
}
