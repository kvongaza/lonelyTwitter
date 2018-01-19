package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Kvongaza on 2018-01-18.
 */

import java.util.Date;

public abstract class CurrentMood {

    private String mood;
    private Date date;

    Mood(){
    }

    // constructor that sets date by default
    public CurrentMood(String mood) {
        this.mood = mood;
        date = new Date();
    }

    // constructor with date provided as argument
    public CurrentMood(String mood, Date date){
        this.mood = mood;
        this.date = date;
    }

    // date getter
    public Date getDate(){
        return date;
    }

    // date setter
    public void setDate(Date date){
        this.date = date;
    }

    // mood getter
    public String getMood(){
        return mood;
    }

    // mood setter
    public void setMood(String mood){
        this.mood = mood;
    }
}
