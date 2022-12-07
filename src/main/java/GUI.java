public class GUI {
    public void method() {
        String t = "rr", f = "10", wf = "20";
        ControllerIn controllerIn = new ControllerIn(t, f, wf);
        controllerIn.makeRequest();
        ControllerOut controllerOut = new ControllerOut(controllerIn);
        controllerOut.makeQuestions();
    }
}
