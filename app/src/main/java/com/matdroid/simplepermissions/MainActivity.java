package com.matdroid.simplepermissions;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


@RegisterPermission(permissions = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE})
public class MainActivity extends SimplePermissionActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onRequestPermissionGranted(String[] permission, int[] grantResults) {
        Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRequestPermissionDenied(String[] permission, int[] grantResults) {
        Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
    }
}
