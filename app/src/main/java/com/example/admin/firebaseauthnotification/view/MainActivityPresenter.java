package com.example.admin.firebaseauthnotification.view;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.example.admin.firebaseauthnotification.Main2Activity;
import com.example.admin.firebaseauthnotification.MainActivity;
import com.example.admin.firebaseauthnotification.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Admin on 8/28/2017.
 */

public class MainActivityPresenter implements MainActivityContract.presenter {

    MainActivityContract.view view;

    public void attachView(MainActivityContract.view view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

}
