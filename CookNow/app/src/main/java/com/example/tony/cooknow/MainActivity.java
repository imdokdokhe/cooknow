package com.example.tony.cooknow;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

import com.example.tony.ingredientTree.Ingredient;

import java.util.ArrayList;


/**
 * Created by Tony on 5/24/2016.
 */
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

        TabHost.TabSpec inventoryTab = tabHost.newTabSpec("Inventory");
        TabHost.TabSpec recipeTab = tabHost.newTabSpec("Recipes");
        TabHost.TabSpec favoriteTab = tabHost.newTabSpec("Favorites");
        TabHost.TabSpec historyTab = tabHost.newTabSpec("History");
        TabHost.TabSpec searchTab = tabHost.newTabSpec("Search");

//        inventoryTab.setIndicator("Inventory");
//        recipeTab.setIndicator("Recipes");
//        favoriteTab.setIndicator("Favorites");
//        historyTab.setIndicator("History");
//        searchTab.setIndicator("Search");
        inventoryTab.setIndicator(null, getResources().getDrawable(R.drawable.ic_list_black_48dp));
        recipeTab.setIndicator(null, getResources().getDrawable(R.drawable.ic_chrome_reader_mode_black_48dp));
        favoriteTab.setIndicator(null, getResources().getDrawable(R.drawable.ic_favorite_black_48dp));
        historyTab.setIndicator(null, getResources().getDrawable(R.drawable.ic_history_black_48dp));
        searchTab.setIndicator(null, getResources().getDrawable(R.drawable.ic_search_black_48dp));

        inventoryTab.setContent(new Intent(this, InventoryActivity.class));
        recipeTab.setContent(new Intent(this, RecipeActivity.class));
        favoriteTab.setContent(new Intent(this, FavoriteActivity.class));
        historyTab.setContent(new Intent(this, HistoryActivity.class));
        searchTab.setContent(new Intent(this, SearchActivity.class));

        tabHost.addTab(inventoryTab);
        tabHost.addTab(recipeTab);
        tabHost.addTab(favoriteTab);
        tabHost.addTab(historyTab);
        tabHost.addTab(searchTab);
    }

}
