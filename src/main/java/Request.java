public class Request {
    private String http;

    public Request(String tag, String fromDate, String toDate){
        http = "https://api.stackexchange.com/2.3/questions?fromdate=" + fromDate + "&todate=" + toDate + "&order=desc&sort=creation&tagged=" + tag + "&site=stackoverflow";
    }

    public String getHttp() {
        return http;
    }
}
