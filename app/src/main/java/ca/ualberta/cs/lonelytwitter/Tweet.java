package ca.ualberta.cs.lonelytwitter;

/**Copyright 2018 Kiefer von Gaza

 Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 and associated documentation files (the "Software"), to deal in the Software without restriction,
 including without limitation the rights to use, copy, modify, merge, publish, distribute,
 sublicense, and/or sell copies of the Software, and to permit persons to whom the Software
 is furnished to do so, subject to the following conditions:

 * Created by sajediba on 1/17/18.
 */

import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author kvongaza
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */

public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;

    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     * @param date tweet data
     */

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Constructs a tweet object.
     * @param message
     */

    public Tweet(String message){
        this.message = message;
    }

    /**
     * Method for retrieving date.
     * @return date
     */

    public Date getDate(){
        return date;

    }

    /**
     * Method for retrieving message.
     * @return message
     */

    public String getMessage(){
        return message;
    }

    /**
     * Sets tweet message
     * @param message tweet message
     * @throws TweetTooLongException thrown if tweet exceeds description.
     */

    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 160){
            // throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    /**
     * Sets tweet date
     * @param date tweet date
     */

    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Method that checks if a tweet is important
     * @return true or false
     */

    public abstract boolean isImportant();

    @Override
    public String toString(){
        return message;
    }
}
