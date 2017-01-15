package com.matdroid.simplepermissions;

/**
 * Created by Gonzalo.Martin on 12/20/2016
 */
public interface SimplePermissionCallback {

    void onRequestPermissionGranted(String[] permission, int[] grantResults);

    void onRequestPermissionDenied(String[] permission, int[] grantResults);

}
