import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;

public class YouAreEll {

    YouAreEll() {
    }

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        YouAreEll urlhandler = new YouAreEll();
        System.out.println(urlhandler.MakeURLCall("/ids", "GET", ""));
        System.out.println(urlhandler.MakeURLCall("/messages", "GET", ""));

        Id id = new Id("Brian", "bth1994TestAgain");
        Message message = new Message("bth1994", "Pst", "bth1994");

        try {
            String idInfo = objectMapper.writeValueAsString(id);
            urlhandler.MakeURLCall("/ids", "POST", idInfo);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        try {
            String messageInfo = objectMapper.writeValueAsString(message);
            urlhandler.MakeURLCall("/ids/bth1994/messages", "POST", messageInfo);
        } catch (JsonProcessingException e) {
                e.printStackTrace();
        }
    }

    public String get_ids() {
        return MakeURLCall("/ids", "GET", "");
    }

    public String get_messages() {
        return MakeURLCall("/messages", "GET", "");
    }

    public String MakeURLCall(String mainurl, String method, String jpayload) {
        String url = "http://zipcode.rocks:8085" + mainurl;
        GetRequest request = Unirest.get(url);

        if(method.equals("GET")) {
            try {
                return request.asJson().getBody().toString();
            } catch (UnirestException ue) {
                ue.printStackTrace();
            }
        } else if(method.equals("POST")) {
            try {
                return Unirest.post(url).body(jpayload).asJson().getBody().toString();
            } catch (UnirestException ue) {
                ue.printStackTrace();
            }
        }
        return "nada";
    }
}
