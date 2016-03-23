package com.example.amour.demotab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private View tabChat;
    private View tabContact;
    private View tabFind;
    private View tabProfile;
    private ImageView chatIV;
    private ImageView contactIV;
    private ImageView findIV;
    private ImageView profileIV;
    private ViewPager vp;
    private List<Fragment> listFragment;
    private MyViewPagerAdapter myViewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("微信");
        initView();
        initData();



    }

    private void initData() {
        listFragment=new ArrayList<Fragment>();
        listFragment.add(new ChatFragment());
        listFragment.add(new ContactFragment());
        listFragment.add(new FindFragment());
        listFragment.add(new ProfileFragment());
        myViewPagerAdapter=new MyViewPagerAdapter(getSupportFragmentManager(),listFragment);
        vp.setAdapter(myViewPagerAdapter);
        vp.setCurrentItem(0);
        chatIV.setImageResource(R.drawable.weixin_pressed);

    }

    public void initView(){
        tabChat=findViewById(R.id.tab_chat);
        tabContact=findViewById(R.id.tab_contact);
        tabFind=findViewById(R.id.tab_find);
        tabProfile=findViewById(R.id.tab_profile);


        chatIV= (ImageView) findViewById(R.id.tab_chat_img);
        contactIV= (ImageView) findViewById(R.id.tab_contact_img);
        findIV= (ImageView) findViewById(R.id.tab_find_img);
        profileIV= (ImageView) findViewById(R.id.tab_profile_img);

        View.OnClickListener listener=new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int current=vp.getCurrentItem();
                switch (v.getId()) {
                    case R.id.tab_chat: {
                        if(current==0){
                            break;
                        }
                        vp.setCurrentItem(0);
                        resetTab();
                        chatIV.setImageResource(R.drawable.weixin_pressed);
                        break;
                    }
                    case R.id.tab_contact: {
                        if(current==1){
                            break;
                        }
                        vp.setCurrentItem(1);
                        resetTab();
                        contactIV.setImageResource(R.drawable.contact_list_pressed);
                        break;
                    }
                    case R.id.tab_find: {
                        if (current==2){
                            break;
                        }
                        vp.setCurrentItem(2);
                        resetTab();
                        findIV.setImageResource(R.drawable.find_pressed);
                        break;
                    }
                    case R.id.tab_profile: {
                        if (current==3){
                            break;
                        }
                        vp.setCurrentItem(3);
                        resetTab();
                        profileIV.setImageResource(R.drawable.profile_pressed);
                        break;
                    }
                    default:break;
                }
            }
        };


        tabChat.setOnClickListener(listener);
        tabContact.setOnClickListener(listener);
        tabFind.setOnClickListener(listener);
        tabProfile.setOnClickListener(listener);

        vp= (ViewPager) findViewById(R.id.vp_container);
        chatIV.setImageResource(R.drawable.weixin_pressed);
        vp.setOnPageChangeListener(new MyOnpageChangeListener());

    }
    public void resetTab(){
        chatIV.setImageResource(R.drawable.weixin_normal);
        contactIV.setImageResource(R.drawable.contact_list_normal);
        findIV.setImageResource(R.drawable.find_normal);
        profileIV.setImageResource(R.drawable.profile_normal);
    }

    public class MyOnpageChangeListener implements ViewPager.OnPageChangeListener{
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            resetTab();
            switch (position){
                case 0:chatIV.setImageResource(R.drawable.weixin_pressed);
                    break;
                case 1:contactIV.setImageResource(R.drawable.contact_list_pressed);
                    break;
                case 2:findIV.setImageResource(R.drawable.find_pressed);
                    break;
                case 3:profileIV.setImageResource(R.drawable.profile_pressed);
                    break;
                default:break;
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }

}
