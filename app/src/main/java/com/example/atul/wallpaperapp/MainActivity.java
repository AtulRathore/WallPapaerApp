package com.example.atul.wallpaperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    Integer img[] = {R.mipmap.ic_launcher, R.mipmap.ic_launcher,R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher, R.mipmap.ic_launcher};

    String names[] ={"name 1","name 2","name 3","name 4","name 5","name 6","name 7","name 8"};
    String downloads[]={"100","200","300","400","500","600","700","800"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //String str[] = {"T1","T2","T3","T4"};
        ListView listView = (ListView) findViewById(R.id.listView);
        CustomAdapter myCustomAdapter = new CustomAdapter();
        listView.setAdapter(myCustomAdapter);
    }


    public class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return img.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.custom_layout,parent,false);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            TextView name = (TextView) findViewById(R.id.Name);
            TextView nDownload = (TextView) findViewById(R.id.ndownloads1);
            imageView.setImageResource(img[position]);
            name.setText(names[position]);
            nDownload.setText(downloads[position]);
            return convertView;
        }
    }

}
