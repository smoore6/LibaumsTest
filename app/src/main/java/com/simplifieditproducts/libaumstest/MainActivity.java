package com.simplifieditproducts.libaumstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import com.github.mjdev.libaums.UsbMassStorageDevice;
import com.github.mjdev.libaums.fs.FileSystem;
import com.github.mjdev.libaums.fs.UsbFile;
import com.github.mjdev.libaums.fs.UsbFileInputStream;
import com.github.mjdev.libaums.fs.UsbFileOutputStream;
import com.github.mjdev.libaums.fs.UsbFileStreamFactory;
import com.github.mjdev.libaums.server.http.UsbFileHttpServerService;
import com.github.mjdev.libaums.server.http.server.AsyncHttpServer;
import com.github.mjdev.libaums.server.http.server.NanoHttpdServer;
import com.github.mjdev.libaums.storageprovider.UsbDocumentProvider;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
