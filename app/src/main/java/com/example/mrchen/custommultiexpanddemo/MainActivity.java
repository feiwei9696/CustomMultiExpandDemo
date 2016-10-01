package com.example.mrchen.custommultiexpanddemo;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mrchen.custommultiexpanddemo.fragment.ContentFragment;
import com.example.mrchen.custommultiexpanddemo.fragment.LeftFragment;

public class MainActivity extends AppCompatActivity {
    private ContentFragment rightFragment;
    private LeftFragment leftFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();

    }

    private void initView() {
        FragmentManager manager = getFragmentManager();
        leftFragment = (LeftFragment) manager.findFragmentById(R.id.leftfragment);
        rightFragment = (ContentFragment) manager.findFragmentById(R.id.rightfragment);
    }

    private void initData() {

    }


    public ContentFragment getContentFragment(){
        return rightFragment;
    }

    public LeftFragment getLeftFragment(){
        return leftFragment;
    }
}
