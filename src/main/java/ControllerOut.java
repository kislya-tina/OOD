import java.util.List;

public class ControllerOut {
    private List<Question> questions;
    private List<Answer> answers;
    private ControllerIn contrIn;
    private Parser parser;

    public ControllerOut(ControllerIn controllerIn){
        contrIn = controllerIn;
    }

    public void makeQuestions(){
        questions = parser.makeQuestions(contrIn.getResponse());
    }
}
