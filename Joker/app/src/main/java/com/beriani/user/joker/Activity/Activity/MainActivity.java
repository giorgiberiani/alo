package com.beriani.user.joker.Activity.Activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.beriani.user.joker.R;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    String edittext_1, edittext_2, edittext_3, edittext_4;

    EditText edittext1,edittext2,edittext3,edittext4;

    Spinner game_type_spinner,xishti_spinner;

    CheckBox couple_switch, remove_switch;

    String couple_switch_tostring, remove_switch_tostring;

    boolean coupleswitch = false, removeswitch = false;

    Button start_button;

    ImageButton history;
    String[] xishtspnnerarray ;
    String[] cxrianebispinnerarray;
    String[] gametypespinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);

        xishtspnnerarray= getResources().getStringArray(R.array.standartxishtarray);
        cxrianebispinnerarray = getResources().getStringArray(R.array.cxrianixishtarray);
        gametypespinner = getResources().getStringArray(R.array.gametypearray);









        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        history = (ImageButton) findViewById(R.id.history_button) ;


        edittext1 = (EditText) findViewById(R.id.first_edtxt);
        edittext2 = (EditText) findViewById(R.id.second_edtxt);
        edittext3 = (EditText) findViewById(R.id.third_edtxt);
        edittext4 = (EditText) findViewById(R.id.fourth_edtxt);
        game_type_spinner = (Spinner) findViewById(R.id.game_type_spinner);
        xishti_spinner = (Spinner) findViewById(R.id.xisht_spinner);
        couple_switch = (CheckBox) findViewById(R.id.couple_switch);
        remove_switch = (CheckBox) findViewById(R.id.ramove_switch);
        start_button = (Button) findViewById(R.id.start_button);







        couple_switch.setChecked(coupleswitch);
        remove_switch.setChecked(removeswitch);

        on_couple_swich_click(couple_switch);
        on_remove_switch_click(remove_switch);



        game_type_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                change_xishtspinner_resource(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });


        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (edittext1.getText().toString().trim().length()==0 || edittext2.getText().toString().trim().length()==0
                       || edittext3.getText().toString().trim().length()==0 || edittext4.getText().toString().trim().length()==0) {

                   start_button.setError(null);
                   Toast toast =  Toast.makeText(MainActivity.this,
                           "შეიყვანეთ მოთამაშეების სახელები", Toast.LENGTH_SHORT);
                   toast.setGravity(Gravity.CENTER,0,0);
                   toast.show();
                }else{

                   String game_type = game_type_spinner.getSelectedItem().toString();

                   edittext_1 = edittext1.getText().toString();
                   edittext_2 = edittext2.getText().toString();
                   edittext_3 = edittext3.getText().toString();
                   edittext_4 = edittext4.getText().toString();

                   if(game_type.equals(getResources().getString(R.string.cxrianebi)))
                   {
                       Intent intent = new Intent(MainActivity.this, Cxrianebi.class);
                       intent.putExtra("edit_1", edittext_1);
                       intent.putExtra("edit_2", edittext_2);
                       intent.putExtra("edit_3", edittext_3);
                       intent.putExtra("edit_4", edittext_4);
                       intent.putExtra("xishti", xishti_spinner.getSelectedItem().toString());
                       intent.putExtra("couple", couple_switch_tostring);
                       intent.putExtra("remove_last", remove_switch_tostring);
                       startActivity(intent);
                   }else if(game_type.equals(getResources().getString(R.string.standartuli)))
                   {
                       Intent intent = new Intent(MainActivity.this, Standartuli.class);
                       intent.putExtra("edit_1", edittext_1);
                       intent.putExtra("edit_2", edittext_2);
                       intent.putExtra("edit_3", edittext_3);
                       intent.putExtra("edit_4", edittext_4);
                       intent.putExtra("xishti", xishti_spinner.getSelectedItem().toString());
                       intent.putExtra("couple", couple_switch_tostring);
                       intent.putExtra("xisht_spiner_selected_item_position",  4);
                       intent.putExtra("remove_last", remove_switch_tostring);
                       startActivity(intent);
                   }else {

                       Intent intent = new Intent(MainActivity.this, ErtiPulkaCxrianebi.class);
                       intent.putExtra("edit_1", edittext_1);
                       intent.putExtra("edit_2", edittext_2);
                       intent.putExtra("edit_3", edittext_3);
                       intent.putExtra("edit_4", edittext_4);
                       intent.putExtra("xishti", xishti_spinner.getSelectedItem().toString());
                       intent.putExtra("couple", couple_switch_tostring);
                       intent.putExtra("remove_last", remove_switch_tostring);
                       startActivity(intent);
                   }
                }

            }
        });



    }

    public void change_xishtspinner_resource (int i){
        if (i == 1){
            ArrayAdapter<String> spinner_one_ArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, xishtspnnerarray);
            xishti_spinner.setAdapter(spinner_one_ArrayAdapter);
        }else{
            ArrayAdapter<String> spinner_one_ArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, cxrianebispinnerarray);
            xishti_spinner.setAdapter(spinner_one_ArrayAdapter);
        }

    }


    public void on_couple_swich_click(View view){

        boolean on = ((CheckBox) view).isChecked();

        if(on) {
            couple_switch_tostring = getResources().getString(R.string.on);
        }else{
            couple_switch_tostring = getResources().getString(R.string.off);
        }

    }
    public void on_remove_switch_click(View view){

        boolean on =((CheckBox) view).isChecked();
        if(on) {
            remove_switch_tostring = getResources().getString(R.string.on);
        }else{
           remove_switch_tostring = getResources().getString(R.string.off);
        }



    }

}

