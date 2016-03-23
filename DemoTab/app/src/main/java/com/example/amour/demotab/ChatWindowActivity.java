package com.example.amour.demotab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Amour on 2016/3/21.
 */
public class ChatWindowActivity extends AppCompatActivity {
    public static final String TAG ="ChatWindow" ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Amour");
        setContentView(R.layout.chat_window);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
