package com.gsalah.uni_mediaversion2.ViewModels;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.gsalah.uni_mediaversion2.Commands.Login;
import com.gsalah.uni_mediaversion2.Models.Lecturer;
import com.gsalah.uni_mediaversion2.Models.Student;

public class LoginVM extends ViewModel {
    private String Id, Password;

    private Login loginInterface;

    public LoginVM(Login loginInterface) {
        this.loginInterface = loginInterface;
    }

    public TextWatcher idTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Id = s.toString();
            }
        };
    }

    public TextWatcher passwordTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Password = s.toString();
            }
        };
    }

    public void LoginClick(View v) {

    }

    private Student getStudent(String Id) {
        return null;
    }

    private Lecturer getLecturer(String Id) {
        return null;
    }

}
