package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Kvongaza on 2018-01-18.
 */

import java.util.Date;

public class HappyMood extends CurrentMood {

    public HappyMood(String mood){
        super(mood);
    }

    public HappyMood(String mood, Date date){
        super(mood, date);
    }

    @Override
    public String getMood(){
        return super.getMood() + " feeling ontop of the world :D";
    }
}
