package com.example.a11711226cse225;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    public static String commonString;
    BottomNavigationView mainNav;
    FrameLayout mainFrame;
    private HomeFragment mHomeFragment;
    private SquareFragment mSquareFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainFrame = (FrameLayout)findViewById(R.id.main_frame);
        mainNav =(BottomNavigationView)findViewById(R.id.main_nav);


        mHomeFragment = new HomeFragment();
        mSquareFragment = new SquareFragment();

setFragment(mHomeFragment);
        mainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.square:
                        mainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(mSquareFragment);
                        return true;
                        
                    case R.id.Home2:
                        mainNav.setItemBackgroundResource(R.color.colorPrimary);
                        setFragment(mHomeFragment);
                        return true;

                    default:
                        return false;

                }
            }
        });

    }

    private void setFragment(Fragment fragment) {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.main_frame,fragment);
        ft.commit();



    }
    public void setN(String x){
        commonString = x;

    }
    public String getN()
    {
        return commonString;
    }


}
