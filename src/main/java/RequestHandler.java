public class RequestHandler {
    private Request request;
    private Response response;

    public RequestHandler(String tag, String fromDate, String toDate){
        request = new Request(tag, fromDate, toDate);
        response = null;
    }

    public Request getRequest() {
        return request;
    }

    public Response getResponse() {
        return response;
    }

    public void makeRequest(){
        // request to server here
        //todo
        String json = request.getHttp();
        response = new Response(json);
    }

    public void giveToParser(){
        Parser parser = new Parser(response);

    }
}
