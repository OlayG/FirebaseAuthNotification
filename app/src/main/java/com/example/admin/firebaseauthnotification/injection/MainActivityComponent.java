package com.example.admin.firebaseauthnotification.injection;

import com.example.admin.firebaseauthnotification.MainActivity;

import dagger.Component;

/**
 * Created by Admin on 8/28/2017.
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
}
