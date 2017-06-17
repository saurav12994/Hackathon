package com.example.sourabh.mathsquiz;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Sourabh on 17-06-2017.
 */
public class MathsQuiz extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
