package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by watts1 on 1/28/16.
 *  * Edited by kvongaza on 16/02/18
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }


    public void testAddTweet() throws IllegalAccessException {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test Tweet");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet() throws IllegalAccessException {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet() throws IllegalAccessException {
        TweetList tweets = new TweetList();
        Tweet t1 = new NormalTweet("t1 Tweet");
        Tweet t2 = new NormalTweet("t2 Tweet");

        tweets.add(t1);
        Tweet returnedTweet = tweets.getTweet(0);

        tweets.add(t2);

        assertEquals(returnedTweet.getMessage(), t1.getMessage());
        assertEquals(returnedTweet.getDate(), t1.getDate());
        assertEquals(returnedTweet.getMessage(), t2.getMessage());
        assertEquals(returnedTweet.getDate(), t2.getDate());
    }

    public void testDeleteTweet() throws IllegalAccessException {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetCount() throws IllegalAccessException {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet for count");
        tweets.add(tweet);
        int tweetCount = tweets.getCount();
        assertEquals(1, tweetCount);
    }

}
