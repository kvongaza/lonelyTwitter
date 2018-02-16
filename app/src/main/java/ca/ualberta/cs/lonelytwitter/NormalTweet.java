package ca.ualberta.cs.lonelytwitter;

/**
 * Created by romansky on 1/14/16.
 *  * Edited by kvongaza on 16/02/18
 */
public class NormalTweet extends Tweet implements Tweetable {
    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public boolean isImportant() {
        return false;
    }

    public String getMessage() {
        return this.message;
    }

    public int compareTo(Tweet another) {
        return 0;
    }
}
