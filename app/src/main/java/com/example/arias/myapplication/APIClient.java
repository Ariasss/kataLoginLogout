package com.example.arias.myapplication;

public class APIClient {
    private Clock miclock = new Clock();
    APIClient(Clock clock){
        miclock=clock;
    }
    public boolean login (String email, String password){
        if (email=="pedro@karumi.es")
            return true;
        else
            return false;
    }

    public boolean logout(){
        if ((miclock.getCurrentTime()%2)==0)
            return true;
        else
            return false;
    }
}
