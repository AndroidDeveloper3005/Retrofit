package com.himel.androiddeveloper3005.retrofit.Api;

import com.himel.androiddeveloper3005.retrofit.ApiInterface.ApiInterfaces;

import retrofit.RestAdapter;

public class Api {
    public static ApiInterfaces getClient() {

        // change your base URL
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint("http://mobileappdatabase.in/") //Set the Root URL
                .build(); //Finally building the adapter

        //Creating object for our interface
        ApiInterfaces api = adapter.create(ApiInterfaces.class);
        return api; // return the APIInterface object
    }
}
