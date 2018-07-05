package com.gsalah.uni_mediaversion2.Models;

import com.google.gson.annotations.SerializedName;

public class Student {
    public Student(){}

    @SerializedName("std_id")
    private Long Id;

    @SerializedName("std_fname")
    private String FirstName;

    @SerializedName("std_lname")
    private String LastName;

    @SerializedName("std_password")
    private String Password;

    @SerializedName("std_email")
    private String Email;

    @SerializedName("std_major")
    private String Major;

    @SerializedName("std_year")
    private Integer Year;

    public Long getId() {
        return Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public String getMajor() {
        return Major;
    }

    public Integer getYear() {
        return Year;
    }
}
