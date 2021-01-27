package google.selenide_page_object_with_fields;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
  private ElementsCollection results = $$("#res .g");

  public SelenideElement getResult(int index) {
    return results.get(index);
  }
  
  public ElementsCollection getResults() {
    return results;
  }
}
