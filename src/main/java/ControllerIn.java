
public class ControllerIn {
    private String tag;
    private String from;
    private String to;
    private RequestHandler requestHandler;

    public ControllerIn(String tag, String fromDate, String toDate){
        this.tag = tag;
        this.from = fromDate;
        this.to = toDate;
    }

    public void makeRequest(){
        requestHandler = new RequestHandler(tag, from, to);
        requestHandler.makeRequest();
    }

    public Response getResponse(){
        return requestHandler.getResponse();
    }

    public RequestHandler getRequestHandler() {
        return requestHandler;
    }
}
