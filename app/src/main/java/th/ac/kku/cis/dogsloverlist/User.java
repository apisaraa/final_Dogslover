package th.ac.kku.cis.dogsloverlist;

public class User {

    String name, lastMessage, lastMsgTime, dogNo, country;
    int imageId;

    public User(String name, String lastMessage, String lastMsgTime, String phoneNo, String country, int imageId) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.lastMsgTime = lastMsgTime;
        this.dogNo = dogNo;
        this.country = country;
        this.imageId = imageId;
    }
}
