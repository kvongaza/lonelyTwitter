package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/14/16.
 * Edited by kvongaza on 16/02/18
 */
public abstract class Tweet implements Tweetable, Comparable<Tweet> {
    protected String message;
    private Date date;

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date(System.currentTimeMillis());
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    abstract public boolean isImportant();

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

    public int compareTo(Tweet t1, Tweet t2) {
        return t1.getDate().compareTo(t2.getDate());
    }
}