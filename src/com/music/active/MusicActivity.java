package com.music.active;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

public class MusicActivity extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        SimpleAdapter adapter = new SimpleAdapter(this,getData(),R.layout.main,
                new String[]{"title","info","img"},
                new int[]{R.id.title,R.id.info,R.id.img});
        
        setListAdapter(adapter);
    }
    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
 
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "G1");
        map.put("info", "google 1");
        map.put("img", R.drawable.c73005473a3d2d77500ffe6c);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "G2");
        map.put("info", "google 2");
        map.put("img", R.drawable.ic_launcher);
        list.add(map);
 
        map = new HashMap<String, Object>();
        map.put("title", "G3");
        map.put("info", "google 3");
        map.put("img", R.drawable.c73005473a3d2d77500ffe6c);
        list.add(map);
         
        return list;
    }
}