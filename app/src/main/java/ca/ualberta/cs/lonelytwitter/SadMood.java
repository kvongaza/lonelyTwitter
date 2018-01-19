package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Kvongaza on 2018-01-18.
 */

import java.util.Date;

public class SadMood extends CurrentMood {

    public SadMood(String mood){
        super(mood);
    }

    public SadMood(String mood, Date date){
        super(mood, date);
    }


    @Override
    public String getMood(){
        return super.getMood() + " feeling a little blue ;(";
    }
}
