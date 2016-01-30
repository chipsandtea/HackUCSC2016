package com.example.christopher.ome;

import java.util.Date;

/**
 * Created by Christopher on 1/29/16.
 */
public class Payment {
    private int PayerID, ReceiverID;
    private int status;
    private final int STATUS_OPEN = 0;
    private final int STATUS_CLOSED = 1;
    private Date dateOpened;

    public Payment(int pID, int rID, Date currDate){
        PayerID = pID;
        ReceiverID = rID;
        dateOpened = currDate;;
        status = 0;
    }

    public void pay(){

    }
}
