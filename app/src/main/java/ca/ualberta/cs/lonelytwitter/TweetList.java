package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Comparator;


/**
 * Created by watts1 on 1/28/16.
 * Edited by Kvongaza on 16/02/18.
 */
public class TweetList extends Exception {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public void add(Tweet tweet) throws IllegalAccessException{
        if(!hasTweet(tweet)) {
            tweets.add(tweet);
        }else{
            throw new IllegalAccessException();
        }
//        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public int getCount() {
        return tweets.size();
    }

    public ArrayList<Tweet> getTweets(){
        return tweets;
    }

}
