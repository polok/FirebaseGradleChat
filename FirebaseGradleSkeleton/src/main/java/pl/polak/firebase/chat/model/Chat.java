package pl.polak.firebase.chat.model;

import java.util.Calendar;
import java.util.Date;

public class Chat {

    private String message;
    private String author;
    private Date date;

    @SuppressWarnings("unused")
    private Chat() {}

    public Chat(String message, String author) {
        this.message = message;
        this.author = author;
        this.date = Calendar.getInstance().getTime();
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }
}