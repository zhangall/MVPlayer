package com.itheima.activity;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

import com.itheima.R;

public class MainActivity extends BaseActivity {

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        super.init();
    }

    //复写方法,实现菜单栏
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //解析菜单布局,添加到menu中
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * 处理菜单栏的点击事件
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //通过id来区分点击的不同的id
        switch (item.getItemId()) {
            case R.id.settings:
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
