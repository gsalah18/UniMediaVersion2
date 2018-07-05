package com.gsalah.uni_mediaversion2.Views.Activites;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gsalah.uni_mediaversion2.R;
import com.gsalah.uni_mediaversion2.databinding.ActivityLoginBinding;

public class LoginActivity extends Activity {
    ActivityLoginBinding activityLoginBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        activityLoginBinding= DataBindingUtil.setContentView(this,R.layout.activity_login);

    }




    @Override
    public void onBackPressed() {

    }
}
