package com.gsalah.uni_mediaversion2.ViewModels;

import android.arch.lifecycle.ViewModel;
import android.support.design.widget.Snackbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.gsalah.uni_mediaversion2.Commands.Login;
import com.gsalah.uni_mediaversion2.Models.Student;
import com.gsalah.uni_mediaversion2.Utils.Commons;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

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
        //getStudent();
        loginInterface.PreLogin();
        Snackbar.make(v, "Hello", Snackbar.LENGTH_LONG).show();
    }

    private void getStudent() {

        String query = "SELECT * FROM student WHERE std_id='" + Id + "'";
        Commons.getAPIClient().getStudent(query)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<Student>() {
                    @Override
                    public void onSuccess(Student value) {
                        if (value != null) {
                            if (value.getPassword().equals(Password)) {
                                loginInterface.LoginSuccess("student");
                            } else loginInterface.LoginFaluire(2);
                        } else {
                            getLecturer();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }


    private void getLecturer() {
        String query = "SELECT * FROM lecturer WHERE lec_id='" + Id + "'";
        Commons.getAPIClient().getStudent(query)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<Student>() {
                    @Override
                    public void onSuccess(Student value) {
                        if (value != null) {
                            if (value.getPassword().equals(Password)) {
                                loginInterface.LoginSuccess("student");
                            } else loginInterface.LoginFaluire(2);
                        } else {
                            loginInterface.LoginFaluire(1);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }


}
