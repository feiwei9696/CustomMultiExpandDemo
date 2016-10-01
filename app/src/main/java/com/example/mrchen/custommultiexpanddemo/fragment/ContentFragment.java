package com.example.mrchen.custommultiexpanddemo.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mrchen.custommultiexpanddemo.MainActivity;
import com.example.mrchen.custommultiexpanddemo.R;
import com.example.mrchen.custommultiexpanddemo.item.SideBarItem;


/**
 * Created by Mr.chen on 2016/9/30.
 * Description 内容栏
 */
public class ContentFragment extends BaseFragment {

    private TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View initView() {
        View view = View.inflate(context, R.layout.fragment_content, null);
        textView = (TextView) view.findViewById(R.id.tv_content);
        return view;
    }

    @Override
    public void initData() {
        ((MainActivity)context).getLeftFragment().setCurCheckItem(0);
    }

    public void setContentText(SideBarItem item) {
        if (item != null)
            textView.setText(item.getItemName());
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
