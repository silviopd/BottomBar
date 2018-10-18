package com.example.pavasnavaney.bottombar;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarBadge;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends ActionBarActivity {


    BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomBar = BottomBar.attach(this,savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.menu_main,new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int i) {
                if(i==R.id.Bottombaritemone)
                {
                    PeopleFragment f = new PeopleFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                else if(i==R.id.Bottombaritemtwo)
                {
                    Cardsfragment f =new Cardsfragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                else if(i==R.id.Bottombaritemthree)
                {
                    PhoneFragment f =new PhoneFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                else if(i==R.id.Bottombaritemfour)
                {
                    MailsFragment f =new MailsFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                else if(i==R.id.Bottombaritemfive)
                {
                    FavoritesFragment f =new FavoritesFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int i) {

            }
        });
        mBottomBar.mapColorForTab(0, "#F44336");
        mBottomBar.mapColorForTab(1,"#9C27B0");
        mBottomBar.mapColorForTab(2,"#03A9F4");
        mBottomBar.mapColorForTab(3,"#795548");
        mBottomBar.mapColorForTab(4,"#FF6F00");

        BottomBarBadge unread;
        unread = mBottomBar.makeBadgeForTabAt(3,"#FF0000",13);
        unread.show();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
