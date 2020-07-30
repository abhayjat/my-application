package com.example.myapplication.stub;

import com.example.myapplication.model.Person;

import java.util.ArrayList;
import java.util.List;

public class DummyData {

    List<Person> myFriendsList;

    public DummyData(){
        String[] names ={"Ashutosh","Bhaggu","Chetan"};
        String[] phoneNumbers ={"8966091431","9340452167","8085555743"};
        this.myFriendsList = new ArrayList<>();
        for(int i=0;i<names.length;i++){
                Person p=new Person(names[i],phoneNumbers[i],i);
                myFriendsList.add(p);
        }
    }
    public List<Person> getMyFriendsList() {
        return myFriendsList;
    }

}
