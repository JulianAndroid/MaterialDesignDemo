package io.julian.materialdesigndemo.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import io.julian.materialdesigndemo.R;
import io.julian.materialdesigndemo.ads.BannerAdsActivity;
import io.julian.materialdesigndemo.ads.InterstitialAdsActivity;
import io.julian.materialdesigndemo.bottomnavigation.BottomNavigationActivity;
import io.julian.materialdesigndemo.empty.EmptyActivity;
import io.julian.materialdesigndemo.fullscreen.FullscreenActivity;
import io.julian.materialdesigndemo.login.LoginActivity;
import io.julian.materialdesigndemo.maps.MapsActivity;
import io.julian.materialdesigndemo.masterdetailflow.ItemListActivity;
import io.julian.materialdesigndemo.scrolling.ScrollingActivity;
import io.julian.materialdesigndemo.settings.SettingsActivity;
import io.julian.materialdesigndemo.tabbed.ActionBarSpinnerActivity;
import io.julian.materialdesigndemo.tabbed.ActionBarTabsActivity;
import io.julian.materialdesigndemo.tabbed.SwipeViewsActivity;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            showSettingsUi();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_bottom_navigation) {
            // Handle the camera action
            showBottomNavigationUi();
        } else if (id == R.id.nav_empty) {
            showEmptyUi();
        } else if (id == R.id.nav_fullscreen) {
            showFullscreenUi();
        } else if (id == R.id.nav_interstitial_ads) {
            showInterstitialAdsUi();
        } else if (id == R.id.nav_banner_ads) {
            showBannerAdsUi();
        } else if (id == R.id.nav_maps) {
            showMapsUi();
        } else if (id == R.id.nav_login) {
            showLoginUi();
        } else if (id == R.id.nav_scrolling) {
            showScrollingUi();
        } else if (id == R.id.nav_swipe_views_tabs) {
            showSwipeViewsTabsUi();
        } else if (id == R.id.nav_action_bar_tabs) {
            showActionBarTabsUi();
        } else if (id == R.id.nav_action_bar_spinner) {
            showActionBarSpinnerUi();
        } else if (id == R.id.nav_master_detail_flow) {
            showMasterDetailFlow();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void showSettingsUi() {
        startActivity(new Intent(this, SettingsActivity.class));
    }

    private void showBottomNavigationUi() {
        startActivity(new Intent(this, BottomNavigationActivity.class));
    }

    private void showEmptyUi() {
        startActivity(new Intent(this, EmptyActivity.class));
    }

    private void showFullscreenUi() {
        startActivity(new Intent(this, FullscreenActivity.class));
    }

    private void showInterstitialAdsUi() {
        startActivity(new Intent(this, InterstitialAdsActivity.class));
    }

    private void showBannerAdsUi() {
        startActivity(new Intent(this, BannerAdsActivity.class));
    }

    private void showMapsUi() {
        startActivity(new Intent(this, MapsActivity.class));
    }

    private void showLoginUi() {
        startActivity(new Intent(this, LoginActivity.class));
    }

    private void showScrollingUi() {
        startActivity(new Intent(this, ScrollingActivity.class));
    }

    private void showSwipeViewsTabsUi() {
        startActivity(new Intent(this, SwipeViewsActivity.class));
    }

    private void showActionBarTabsUi() {
        startActivity(new Intent(this, ActionBarTabsActivity.class));
    }

    private void showActionBarSpinnerUi() {
        startActivity(new Intent(this, ActionBarSpinnerActivity.class));
    }

    private void showMasterDetailFlow() {
        startActivity(new Intent(this, ItemListActivity.class));
    }
}
