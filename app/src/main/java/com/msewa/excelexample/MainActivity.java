package com.msewa.excelexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.IOException;

import jxl.write.WriteException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        WriteExcel test = new WriteExcel();
//        test.setOutputFile("c:/temp/lars.xls");
//        try {
//            test.write();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (WriteException e) {
//            e.printStackTrace();
//        }


            ReadExcel test = new ReadExcel();
            test.setInputFile("c:/temp/lars.xls");
        try {
            test.read();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
