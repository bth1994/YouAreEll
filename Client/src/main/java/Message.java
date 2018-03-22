public class Message {

    private String sequence;
    private String timestamp;
    private String fromid;
    private String toid;
    private String message;

    public Message(String sequence, String timeStamp, String fromId, String toId, String message) {
        this.sequence = sequence;
        this.timestamp = timeStamp;
        this.fromid = fromId;
        this.toid = toId;
        this.message = message;
    }

    public Message(String toId, String message, String fromId) {
        this.toid = toId;
        this.message = message;
        this.fromid = fromId;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getTimeStamp() {
        return timestamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timestamp = timeStamp;
    }

    public String getFromId() {
        return fromid;
    }

    public void setFromId(String fromId) {
        this.fromid = fromId;
    }

    public String getToId() {
        return toid;
    }

    public void setToId(String toId) {
        this.toid = toId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
