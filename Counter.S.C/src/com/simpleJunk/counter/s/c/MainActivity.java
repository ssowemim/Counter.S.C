package com.simpleJunk.counter.s.c;

import java.util.ArrayList;

import com.simpleJunk.counter.s.c.adapter.NavDrawerListAdapter;
import com.simpleJunk.counter.s.c.model.NavDrawerItem;

import android.app.Activity;
import android.content.res.TypedArray;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.widget.ListView;

public class MainActivity extends Activity{
	
	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;
	
	private CharSequence mDrawerTitle; // nav drawer title
	private CharSequence mTitle; //used to store app title
	
	//Slide menu items
	private String[] navMenuTitles;
	private TypedArray navMenuIcons;
	
	private ArrayList<NavDrawerItem> navDrawerItems;
	private NavDrawerListAdapter adapter;
	
}
