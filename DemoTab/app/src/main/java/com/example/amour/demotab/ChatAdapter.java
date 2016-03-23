package com.example.amour.demotab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Amour on 2016/3/16.
 */
public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.MyViewHolder> implements View.OnClickListener{
    private List<String> mString;
    private LayoutInflater mInflater;
    private View mv;
    private MyItemClickListen mListen =null;

    @Override
    public  void onClick(View v) {

        mListen.myOnclick(v);
    }


    public ChatAdapter(Context context, List<String> mString) {
        this.mInflater =LayoutInflater.from(context);
        this.mString = mString;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mv=mInflater.inflate(R.layout.chat_item,null);
        //mv.setOnClickListener(this);
        MyViewHolder vh= new MyViewHolder(mv);
        return new MyViewHolder(mv);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv.setText(mString.get(position));
    }

    @Override
    public int getItemCount() {
        return mString.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tv;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv= (TextView) itemView.findViewById(R.id.chat_item_title);
            //itemView.setOnClickListener(this);
        }

    }

    public static interface MyItemClickListen {
        void myOnclick(View v);
    }

    public  void setOnItemClickListen(MyItemClickListen listen){
        this.mListen=listen;
    }

//    public ChatAdapter(Context context,List<String> listString) {
//        this.mString=listString;
//        this.mInflater=LayoutInflater.from(context);
//    }
//
//    @Override
//    public int getCount() {
//        return mString.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View v=mInflater.inflate(R.layout.chat_item,null);
//        TextView tv=(TextView)v.findViewById(R.id.chat_item_title);
//        tv.setText(mString.get(position));
//        return null;
//    }
}
