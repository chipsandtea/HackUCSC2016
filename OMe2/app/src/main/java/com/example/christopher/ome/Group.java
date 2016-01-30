package com.example.christopher.ome;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Christopher on 1/29/16.
 */
public class Group {
    private int groupID;
    private String groupName;
    private ArrayList<Integer> admins;
    private HashMap<Integer, Member> members;
    private ArrayList<Payment> paymentHistory;

    public Group(int ID, String name, Member creator) {
        groupID = ID;
        groupName = name;
        members = new HashMap<Integer, Member>();
        members.put(creator.getID(), creator);
        admins = new ArrayList<Integer>();
        admins.add(creator.getID());
    }

    public int getGroupID(){
        return groupID;
    }

    public String getGroupName(){
        return groupName;
    }

    public Member getMember(int membID){
        return members.get(membID);
    }

    //Clearance codes are 0 = regular user, 1 = admin
    //Return codes 0 = fail, 1 = success
    public int addMember(int memberClearance, Member memToAdd){
        if(memberClearance == 1){
            members.add(memToAdd);
            return 1;
        }else{
            return 0;
        }
    }
}
