import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.junit.*;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void makePuzzle_returnsForA() {
    App yourApp = new App();
    String expected = "-";
    assertEquals(expected, yourApp.makePuzzle("A"));
  }
  @Test
  public void makePuzzle_returnsForABC() {
    App yourApp = new App();
    String expected = "-BC";
    assertEquals(expected, yourApp.makePuzzle("ABC"));
  }
  @Test
  public void makePuzzle_returnsForFox() {
    App yourApp = new App();
    String expected = "Th- q--ck br-wn f-x j-mps -v-r th- l-zy d-g";
    assertEquals(expected, yourApp.makePuzzle("The quick brown fox jumps over the lazy dog"));
  }
  @Test
    public void rootTestandFoxEntry() {
      goTo("http://localhost:4567/");
      fill("#sentence").with("The quick brown fox jumps over the lazy dog");
      submit(".btn");
      assertThat(pageSource()).contains("Th- q--ck br-wn f-x j-mps -v-r th- l-zy d-g");
  }
}
