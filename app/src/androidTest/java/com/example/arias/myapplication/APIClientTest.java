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
    public void logout() throws Exception {
        APIClient apiClient = new APIClient(new Clock());
        boolean res = apiClient.logout();
        assertEquals(res,true);
    }



    class MockClock extends Clock{
    @Override
        public long getCurrentTime(){
            return 1000;
        }
    }

}