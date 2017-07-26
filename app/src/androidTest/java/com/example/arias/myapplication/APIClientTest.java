package com.example.arias.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

public class APIClientTest {

    @Test
    public void login() throws Exception {
        APIClient apiClient = new APIClient(new Clock());
        boolean res = apiClient.login("pedro@karumi.es","123456");
        assertEquals(res,true);
    }

    @Test
    public void logoutOK() throws Exception {
        APIClient apiClient = new APIClient(new MockClock(1000));
        boolean res = apiClient.logout();
        assertEquals(res,true);
    }

    @Test
    public void logoutFail() throws Exception {
        APIClient apiClient = new APIClient(new MockClock(1001));
        boolean res = apiClient.logout();
        assertEquals(res,false);
    }
}

class MockClock extends Clock{
    private int fixedTime;
    MockClock(int timeToSend){
        fixedTime = timeToSend;
    }
    @Override
    public long getCurrentTime(){
        return 1000;
    }
}