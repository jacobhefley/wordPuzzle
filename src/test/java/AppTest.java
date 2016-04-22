import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

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
  // @Test
  // public void makePuzzle_returnsForA() {
  //   Scrabble yourApp = new Scrabble();
  //   String expected = "-";
  //   assertEquals(expected, yourApp.calculateScore("A"));
  // }
  // @Test
  // public void calculateScore_returnsScoreFor3pointers() {
  //   Scrabble yourApp = new Scrabble();
  //   Integer expected = 12;
  //   assertEquals(expected, yourApp.calculateScore("bcpm"));
  // }
  //
  // @Test
  // public void calculateScore_returnsScoreFor4pointers() {
  //   Scrabble yourApp = new Scrabble();
  //   Integer expected = 20;
  //   assertEquals(expected, yourApp.calculateScore("fhvwy"));
  // }
  //
  // @Test
  // public void calculateScore_returnsScoreFor5pointers() {
  //   Scrabble yourApp = new Scrabble();
  //   Integer expected = 5;
  //   assertEquals(expected, yourApp.calculateScore("k"));
  // }
  //
  // @Test
  // public void calculateScore_returnsScoreFor8pointers() {
  //   Scrabble yourApp = new Scrabble();
  //   Integer expected = 16;
  //   assertEquals(expected, yourApp.calculateScore("jx"));
  // }
  //
  // @Test
  // public void calculateScore_returnsScoreFor10pointers() {
  //   Scrabble yourApp = new Scrabble();
  //   Integer expected = 20;
  //   assertEquals(expected, yourApp.calculateScore("zq"));
  // }
  // @Test
  // public void calculateScore_returnsScoreForAll() {
  //   Scrabble yourApp = new Scrabble();
  //   Integer expected = 87;
  //   assertEquals(expected, yourApp.calculateScore("abcdefghijklmnopqrstuvwxyz"));
  // }
}
