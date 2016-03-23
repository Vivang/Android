package com.example.amour.demotab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amour on 2016/3/14.
 */
public class ChatFragment extends Fragment {

    private RecyclerView mRecycleview;
    public static List<String> stringList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        stringList=new ArrayList<String>();
        for(int i=0;i<30;i++){
            stringList.add(new String("chat       1"));
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.chat_fragment,container,false);
        mRecycleview= (RecyclerView) v.findViewById(R.id.chat_fragment_recycleview);
        mRecycleview.setLayoutManager(new LinearLayoutManager(getActivity()));
        ChatAdapter adapter=new ChatAdapter(getActivity(),stringList);
        adapter.setOnItemClickListen(new ChatAdapter.MyItemClickListen() {
            @Override
            public void myOnclick(View v) {
                startActivity(new Intent(getActivity(),ChatWindowActivity.class));
            }
        });
        mRecycleview.setAdapter(adapter);

        return v;
    }



}
