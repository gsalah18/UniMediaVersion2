package com.gsalah.uni_mediaversion2.Commands;

public interface Login {
    void PreLogin();
    void LoginSuccess(String type);

    void LoginFaluire(int type);

}
