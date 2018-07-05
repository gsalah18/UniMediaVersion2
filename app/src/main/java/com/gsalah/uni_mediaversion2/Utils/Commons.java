package com.gsalah.uni_mediaversion2.Utils;

public class Commons {
    public static String ServerIP="192.168.0.111";

    public static String GetDgreePrefix(String degree)
    {
        return degree.equalsIgnoreCase("doctor")?"Dr.":degree.equalsIgnoreCase("master")?"I.":"";
    }
}
