package com.gsalah.uni_mediaversion2.Views.Activites;

import android.app.Activity;
import android.app.AlertDialog;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.gsalah.uni_mediaversion2.Commands.Login;
import com.gsalah.uni_mediaversion2.R;
import com.gsalah.uni_mediaversion2.ViewModels.LoginVM;
import com.gsalah.uni_mediaversion2.databinding.ActivityLoginBinding;

import dmax.dialog.SpotsDialog;

public class LoginActivity extends Activity implements Login {
    ActivityLoginBinding activityLoginBinding;

    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        activityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        activityLoginBinding.setLoginVM(new LoginVM(this));
        dialog = new SpotsDialog.Builder()
                .setContext(this)
                .setMessage(getResources().getString(R.string.loading))
                .setTheme(R.style.Custom)
                .build();
    }


    @Override
    public void onBackPressed() {

    }


    @Override
    public void PreLogin() {
        dialog.show();
    }

    @Override
    public void LoginSuccess(String type) {
        if (type.equals("student")) {

        } else if (type.equals("lecturer")) {

        }
        dialog.dismiss();
    }

    @Override
    public void LoginFaluire(int type) {
        if (type == 1) {

        } else if (type == 2) {

        }
        dialog.dismiss();
    }
}
