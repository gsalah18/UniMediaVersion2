package com.gsalah.uni_mediaversion2.Models;

import com.google.gson.annotations.SerializedName;

public class Lecturer {
    public Lecturer(){}

    @SerializedName("lec_id")
    private Long Id;

    @SerializedName("lec_fname")
    private String FistName;

    @SerializedName("lec_lname")
    private String LastName;

    @SerializedName("lec_password")
    private String Password;

    @SerializedName("lec_major")
    private String Major;

    @SerializedName("lec_degree")
    private String Degree;
}
