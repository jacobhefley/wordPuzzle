import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import spark.ModelAndView;
import static java.lang.System.out;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String sentence = request.queryParams("sentence");
      String puzzle = makePuzzle(sentence);

      model.put("puzzle", puzzle);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String makePuzzle(String sentence) {
    String userInput= sentence; // create instance of input variable to manipulate and return
    String[] vowels = {"A","E","I","O","U","a","e","i","o","u"}; // all vowels
    for (int i = 0; i<vowels.length ;i++){
      userInput = userInput.replaceAll("(?i)"+vowels[i], "-");
    }
    return userInput;
  }
}
