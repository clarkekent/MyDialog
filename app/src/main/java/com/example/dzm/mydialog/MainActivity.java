package com.example.dzm.mydialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DialogFragment aDialogFrag = new DialogFragment(){
            @Override
            public Dialog onCreateDialog(Bundle savedInstanceState) {

                return new AlertDialog.Builder(getActivity()).setMessage("message").setView(getLayoutInflater().inflate(R.layout.dialog_layout, null)).create();
            }
        };
        FragmentManager fragManager = getFragmentManager();
//        fragManager.beginTransaction().add(aDialogFrag, "aaa").commit();
        aDialogFrag.show(fragManager, "hello frag");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
