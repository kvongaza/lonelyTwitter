package ca.ualberta.cs.lonelytwitter;

/**Copyright 2018 Kiefer von Gaza

 Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 and associated documentation files (the "Software"), to deal in the Software without restriction,
 including without limitation the rights to use, copy, modify, merge, publish, distribute,
 sublicense, and/or sell copies of the Software, and to permit persons to whom the Software
 is furnished to do so, subject to the following conditions:

 * Created by sajediba on 1/17/18.
 */

/**
 * Interface for Tweet classes and subclasses,
 * this interface defines the structure at a high level that will be implmented in the classes.
 * @author kvongaza
 *
 */

public interface Tweetable {

    /**
     * Method for retrieving message
     * @return message
     */
    public String getMessage();

    /**
     * Sets tweet message
     * @param message tweet message
     * @throws TweetTooLongException throws is tweet length exceeds description.
     */
    public void setMessage(String message) throws TweetTooLongException;
}
