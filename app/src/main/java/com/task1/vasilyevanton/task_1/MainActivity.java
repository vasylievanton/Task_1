package com.task1.vasilyevanton.task_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int mImagesId[] = {
            R.drawable.carbon,
            R.drawable.example,
            R.drawable.carbon,
            R.drawable.model,
            R.drawable.example,
            R.drawable.model,
            R.drawable.example,
            R.drawable.model,
            R.drawable.example,
            R.drawable.carbon,
            R.drawable.example
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityInit();
    }

    private void activityInit() {
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.title);

        RecyclerView recyclerViewPhoto = (RecyclerView) findViewById(R.id.recycler_photo);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerViewPhoto.setLayoutManager(layoutManager);
        recyclerViewPhoto.setAdapter(new PhotoRecyclerAdapter(mImagesId));
        recyclerViewPhoto.setFocusable(false);
        recyclerViewPhoto.setNestedScrollingEnabled(false);

        TextView titleTV, descriptionTv, chapterTV, dateCreateTV, dateRegisterTV, dateDeadlineTV, executorTV;
        titleTV = (TextView) findViewById(R.id.main_text);
        titleTV.setOnClickListener(this);
        descriptionTv = (TextView) findViewById(R.id.description);
        descriptionTv.setOnClickListener(this);
        chapterTV = (TextView) findViewById(R.id.chapter);
        chapterTV.setOnClickListener(this);
        dateCreateTV = (TextView) findViewById(R.id.date_create);
        dateCreateTV.setOnClickListener(this);
        dateRegisterTV = (TextView) findViewById(R.id.date_register);
        dateRegisterTV.setOnClickListener(this);
        dateDeadlineTV = (TextView) findViewById(R.id.date_deadline);
        dateDeadlineTV.setOnClickListener(this);
        executorTV = (TextView) findViewById(R.id.executor);
        executorTV.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Log.w("id", item.getItemId() + "");
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this, "Button", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (id == android.R.id.home) {
            Toast.makeText(MainActivity.this, "Button", Toast.LENGTH_SHORT).show();
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.main_text: {
                Toast.makeText(MainActivity.this, "TextView", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.description: {
                Toast.makeText(MainActivity.this, "TextView", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.chapter: {
                Toast.makeText(MainActivity.this, "TextView", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.date_create: {
                Toast.makeText(MainActivity.this, "TextView", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.date_register: {
                Toast.makeText(MainActivity.this, "TextView", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.date_deadline: {
                Toast.makeText(MainActivity.this, "TextView", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.executor: {
                Toast.makeText(MainActivity.this, "TextView", Toast.LENGTH_SHORT).show();
                break;
            }
            default: {
                break;
            }
        }
    }
}
