package com.example.amour.demotab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Amour on 2016/3/21.
 */
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder> {
    private LayoutInflater inflater;
//    Activity activity;
    public ContactAdapter(Context context) {
//        this.activity= (Activity) context;
        this.inflater= LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.friend_item,null);
        MyViewHolder vh=new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText("Wei");
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView tv;
        public MyViewHolder(View view){
            super(view);
            this.tv= (TextView) view.findViewById(R.id.friend_name);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
//            Toast.makeText(activity,"kjghgjhg",Toast.LENGTH_SHORT);
        }
    }
}
