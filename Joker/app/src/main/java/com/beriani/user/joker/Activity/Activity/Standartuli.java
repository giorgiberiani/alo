package com.beriani.user.joker.Activity.Activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Paint;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.beriani.user.joker.Activity.Database.DatabaseHelper;
import com.beriani.user.joker.R;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Standartuli extends AppCompatActivity {

// Alertdialog

    TextView name_textview_0, name_textview_1, name_textview_2, name_textview_3, info_textview;

    TextView sum1, sum2, sum3, sum4, sum5, sum6, sum7, sum8, sum9, sum10, sum11, sum12, sum13, sum14, sum15, sum16;

    DatabaseHelper result_database;

    TextView tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8, tx9, tx10, tx11, tx12, tx13, tx14, tx15, tx16, tx17, tx18, tx19, tx20, tx21, tx22, tx23, tx24, tx25, tx26, tx27, tx28, tx29, tx30, tx31, tx32, tx33, tx34, tx35, tx36, tx37, tx38, tx39, tx40, tx41, tx42, tx43, tx44, tx45, tx46, tx47, tx48, tx49, tx50, tx51, tx52, tx53, tx54, tx55, tx56, tx57, tx58, tx59, tx60, tx61, tx62, tx63, tx64, tx1a, tx2a, tx3a, tx4a, tx5a, tx6a, tx7a, tx8a, tx9a, tx10a, tx11a, tx12a, tx13a, tx14a, tx15a, tx16a, tx17a, tx18a, tx19a, tx20a, tx21a, tx22a, tx23a, tx24a, tx25a, tx26a, tx27a, tx28a, tx29a, tx30a, tx31a, tx32a, tx1b, tx2b, tx3b, tx4b, tx5b, tx6b, tx7b, tx8b, tx9b, tx10b, tx11b, tx12b, tx13b, tx14b, tx15b, tx16b, tx17b, tx18b, tx19b, tx20b, tx21b, tx22b, tx23b, tx24b, tx25b, tx26b, tx27b, tx28b, tx29b, tx30b, tx31b, tx32b, tx33b, tx34b, tx35b, tx36b, tx37b, tx38b, tx39b, tx40b, tx41b, tx42b, tx43b, tx44b, tx45b, tx46b, tx47b, tx48b, tx49b, tx50b, tx51b, tx52b, tx53b, tx54b, tx55b, tx56b, tx57b, tx58b, tx59b, tx60b, tx61b, tx62b, tx63b, tx64b, tx1c, tx2c, tx3c, tx4c, tx5c, tx6c, tx7c, tx8c, tx9c, tx10c, tx11c, tx12c, tx13c, tx14c, tx15c, tx16c, tx17c, tx18c, tx19c, tx20c, tx21c, tx22c, tx23c, tx24c, tx25c, tx26c, tx27c, tx28c, tx29c, tx30c, tx31c, tx32c;


    Button button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_pass;
    ImageButton button_delete;


    double[] firstplayer = new double[3], secondplayer = new double[3], thirdplayer = new double[3], fourthplayer = new double[3];
    double[] standatrulifirstplayer = new double[7], standatrulisecondplayer = new double[7], standatrulithirdplayer = new double[7], standatrulifourthplayer = new double[7];
    double[] array = new double[2];


    int j = 0, i = 0, xisht = 0, premiebis_raodenoba = 0, sum = 0, taken_sum = 0, row = 0, shetenva_waglejva_shevseba = 0, row_count = 0;

    double first_player_taken_sum = 0, second_player_taken_sum = 0, third_player_taken_sum = 0, fourth_palyer_taken_sum = 0;
    double first_couple_taken_sum = 0, second_couple_taken_sum = 0, premiis_danamati = 0;

    int first_player_written_quantity = 0, second_player_written_quantity = 0, third_player_written_quantity = 0, fourth_player_written_quantity = 0;
    double first_player_max_value = 0, second_player_max_value = 0, third_player_max_value = 0, fourth_player_max_value = 0;
    int first_player_max_value_index = 0, second_player_max_value_index = 0, third_player_max_value_index = 0, fourth_player_max_value_index = 0;

    boolean enable_delete = true;

    boolean first_player_took_all = true, second_player_took_all = true, third_player_took_all = true, fourth_player_took_all = true, row1_first_player_took_all = true, row1_second_player_took_all = true, row1_third_player_took_all = true, row1_fourth_player_took_all = true, row2_first_player_took_all = true, row2_second_player_took_all = true, row2_third_player_took_all = true, row2_fourth_player_took_all = true, row3_first_player_took_all = true, row3_second_player_took_all = true, row3_third_player_took_all = true, row3_fourth_player_took_all = true, row4_first_player_took_all = true, row4_second_player_took_all = true, row4_third_player_took_all = true, row4_fourth_player_took_all = true, row5_first_player_took_all = true, row5_second_player_took_all = true, row5_third_player_took_all = true, row5_fourth_player_took_all = true, row6_first_player_took_all = true, row6_second_player_took_all = true, row6_third_player_took_all = true, row6_fourth_player_took_all = true, row7_first_player_took_all = true, row7_second_player_took_all = true, row7_third_player_took_all = true, row7_fourth_player_took_all = true, row8_first_player_took_all = true, row8_second_player_took_all = true, row8_third_player_took_all = true, row8_fourth_player_took_all = true;

    String couple_switch, remove_last_switch;

    DecimalFormat df = new DecimalFormat("###.#");

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        View alterdialogview = getLayoutInflater().inflate(R.layout.backpressed_alertdialog, null);

        Button positive_button = (Button) alterdialogview.findViewById(R.id.button_yes);
        Button negative_button = (Button) alterdialogview.findViewById(R.id.button_no);

        dialog.setView(alterdialogview);
        final AlertDialog dialog1 = dialog.create();
        dialog1.show();


        positive_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Standartuli.this.finish();

            }
        });

        negative_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog1.dismiss();

            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standartuli);
        getSupportActionBar().hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        result_database = new DatabaseHelper(this);

        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_7 = (Button) findViewById(R.id.button_7);
        button_8 = (Button) findViewById(R.id.button_8);
        button_9 = (Button) findViewById(R.id.button_9);
        button_pass = (Button) findViewById(R.id.button_pass);
        button_delete = (ImageButton) findViewById(R.id.button_delete);


        sum1 = (TextView) findViewById(R.id.sum1);
        sum2 = (TextView) findViewById(R.id.sum2);
        sum3 = (TextView) findViewById(R.id.sum3);
        sum4 = (TextView) findViewById(R.id.sum4);
        sum5 = (TextView) findViewById(R.id.sum5);
        sum6 = (TextView) findViewById(R.id.sum6);
        sum7 = (TextView) findViewById(R.id.sum7);
        sum8 = (TextView) findViewById(R.id.sum8);
        sum9 = (TextView) findViewById(R.id.sum9);
        sum10 = (TextView) findViewById(R.id.sum10);
        sum11 = (TextView) findViewById(R.id.sum11);
        sum12 = (TextView) findViewById(R.id.sum12);
        sum13 = (TextView) findViewById(R.id.sum13);
        sum14 = (TextView) findViewById(R.id.sum14);
        sum15 = (TextView) findViewById(R.id.sum15);
        sum16 = (TextView) findViewById(R.id.sum16);


        tx1 = (TextView) findViewById(R.id.tx1);
        tx2 = (TextView) findViewById(R.id.tx2);
        tx3 = (TextView) findViewById(R.id.tx3);
        tx4 = (TextView) findViewById(R.id.tx4);
        tx5 = (TextView) findViewById(R.id.tx5);
        tx6 = (TextView) findViewById(R.id.tx6);
        tx7 = (TextView) findViewById(R.id.tx7);
        tx8 = (TextView) findViewById(R.id.tx8);
        tx9 = (TextView) findViewById(R.id.tx9);
        tx10 = (TextView) findViewById(R.id.tx10);
        tx11 = (TextView) findViewById(R.id.tx11);
        tx12 = (TextView) findViewById(R.id.tx12);
        tx13 = (TextView) findViewById(R.id.tx13);
        tx14 = (TextView) findViewById(R.id.tx14);
        tx15 = (TextView) findViewById(R.id.tx15);
        tx16 = (TextView) findViewById(R.id.tx16);
        tx17 = (TextView) findViewById(R.id.tx17);
        tx18 = (TextView) findViewById(R.id.tx18);
        tx19 = (TextView) findViewById(R.id.tx19);
        tx20 = (TextView) findViewById(R.id.tx20);
        tx21 = (TextView) findViewById(R.id.tx21);
        tx22 = (TextView) findViewById(R.id.tx22);
        tx23 = (TextView) findViewById(R.id.tx23);
        tx24 = (TextView) findViewById(R.id.tx24);
        tx25 = (TextView) findViewById(R.id.tx25);
        tx26 = (TextView) findViewById(R.id.tx26);
        tx27 = (TextView) findViewById(R.id.tx27);
        tx28 = (TextView) findViewById(R.id.tx28);
        tx29 = (TextView) findViewById(R.id.tx29);
        tx30 = (TextView) findViewById(R.id.tx30);
        tx31 = (TextView) findViewById(R.id.tx31);
        tx32 = (TextView) findViewById(R.id.tx32);
        tx33 = (TextView) findViewById(R.id.tx33);
        tx34 = (TextView) findViewById(R.id.tx34);
        tx35 = (TextView) findViewById(R.id.tx35);
        tx36 = (TextView) findViewById(R.id.tx36);
        tx37 = (TextView) findViewById(R.id.tx37);
        tx38 = (TextView) findViewById(R.id.tx38);
        tx39 = (TextView) findViewById(R.id.tx39);
        tx40 = (TextView) findViewById(R.id.tx40);
        tx41 = (TextView) findViewById(R.id.tx41);
        tx42 = (TextView) findViewById(R.id.tx42);
        tx43 = (TextView) findViewById(R.id.tx43);
        tx44 = (TextView) findViewById(R.id.tx44);
        tx45 = (TextView) findViewById(R.id.tx45);
        tx46 = (TextView) findViewById(R.id.tx46);
        tx47 = (TextView) findViewById(R.id.tx47);
        tx48 = (TextView) findViewById(R.id.tx48);
        tx49 = (TextView) findViewById(R.id.tx49);
        tx50 = (TextView) findViewById(R.id.tx50);
        tx51 = (TextView) findViewById(R.id.tx51);
        tx52 = (TextView) findViewById(R.id.tx52);
        tx53 = (TextView) findViewById(R.id.tx53);
        tx54 = (TextView) findViewById(R.id.tx54);
        tx55 = (TextView) findViewById(R.id.tx55);
        tx56 = (TextView) findViewById(R.id.tx56);
        tx57 = (TextView) findViewById(R.id.tx57);
        tx58 = (TextView) findViewById(R.id.tx58);
        tx59 = (TextView) findViewById(R.id.tx59);
        tx60 = (TextView) findViewById(R.id.tx60);
        tx61 = (TextView) findViewById(R.id.tx61);
        tx62 = (TextView) findViewById(R.id.tx62);
        tx63 = (TextView) findViewById(R.id.tx63);
        tx64 = (TextView) findViewById(R.id.tx64);

        tx1a = (TextView) findViewById(R.id.tx1a);
        tx2a = (TextView) findViewById(R.id.tx2a);
        tx3a = (TextView) findViewById(R.id.tx3a);
        tx4a = (TextView) findViewById(R.id.tx4a);
        tx5a = (TextView) findViewById(R.id.tx5a);
        tx6a = (TextView) findViewById(R.id.tx6a);
        tx7a = (TextView) findViewById(R.id.tx7a);
        tx8a = (TextView) findViewById(R.id.tx8a);
        tx9a = (TextView) findViewById(R.id.tx9a);
        tx10a = (TextView) findViewById(R.id.tx10a);
        tx11a = (TextView) findViewById(R.id.tx11a);
        tx12a = (TextView) findViewById(R.id.tx12a);
        tx13a = (TextView) findViewById(R.id.tx13a);
        tx14a = (TextView) findViewById(R.id.tx14a);
        tx15a = (TextView) findViewById(R.id.tx15a);
        tx16a = (TextView) findViewById(R.id.tx16a);
        tx17a = (TextView) findViewById(R.id.tx17a);
        tx18a = (TextView) findViewById(R.id.tx18a);
        tx19a = (TextView) findViewById(R.id.tx19a);
        tx20a = (TextView) findViewById(R.id.tx20a);
        tx21a = (TextView) findViewById(R.id.tx21a);
        tx22a = (TextView) findViewById(R.id.tx22a);
        tx23a = (TextView) findViewById(R.id.tx23a);
        tx24a = (TextView) findViewById(R.id.tx24a);
        tx25a = (TextView) findViewById(R.id.tx25a);
        tx26a = (TextView) findViewById(R.id.tx26a);
        tx27a = (TextView) findViewById(R.id.tx27a);
        tx28a = (TextView) findViewById(R.id.tx28a);
        tx29a = (TextView) findViewById(R.id.tx29a);
        tx30a = (TextView) findViewById(R.id.tx30a);
        tx31a = (TextView) findViewById(R.id.tx31a);
        tx32a = (TextView) findViewById(R.id.tx32a);

        tx1b = (TextView) findViewById(R.id.tx1b);
        tx2b = (TextView) findViewById(R.id.tx2b);
        tx3b = (TextView) findViewById(R.id.tx3b);
        tx4b = (TextView) findViewById(R.id.tx4b);
        tx5b = (TextView) findViewById(R.id.tx5b);
        tx6b = (TextView) findViewById(R.id.tx6b);
        tx7b = (TextView) findViewById(R.id.tx7b);
        tx8b = (TextView) findViewById(R.id.tx8b);
        tx9b = (TextView) findViewById(R.id.tx9b);
        tx10b = (TextView) findViewById(R.id.tx10b);
        tx11b = (TextView) findViewById(R.id.tx11b);
        tx12b = (TextView) findViewById(R.id.tx12b);
        tx13b = (TextView) findViewById(R.id.tx13b);
        tx14b = (TextView) findViewById(R.id.tx14b);
        tx15b = (TextView) findViewById(R.id.tx15b);
        tx16b = (TextView) findViewById(R.id.tx16b);
        tx17b = (TextView) findViewById(R.id.tx17b);
        tx18b = (TextView) findViewById(R.id.tx18b);
        tx19b = (TextView) findViewById(R.id.tx19b);
        tx20b = (TextView) findViewById(R.id.tx20b);
        tx21b = (TextView) findViewById(R.id.tx21b);
        tx22b = (TextView) findViewById(R.id.tx22b);
        tx23b = (TextView) findViewById(R.id.tx23b);
        tx24b = (TextView) findViewById(R.id.tx24b);
        tx25b = (TextView) findViewById(R.id.tx25b);
        tx26b = (TextView) findViewById(R.id.tx26b);
        tx27b = (TextView) findViewById(R.id.tx27b);
        tx28b = (TextView) findViewById(R.id.tx28b);
        tx29b = (TextView) findViewById(R.id.tx29b);
        tx30b = (TextView) findViewById(R.id.tx30b);
        tx31b = (TextView) findViewById(R.id.tx31b);
        tx32b = (TextView) findViewById(R.id.tx32b);
        tx33b = (TextView) findViewById(R.id.tx33b);
        tx34b = (TextView) findViewById(R.id.tx34b);
        tx35b = (TextView) findViewById(R.id.tx35b);
        tx36b = (TextView) findViewById(R.id.tx36b);
        tx37b = (TextView) findViewById(R.id.tx37b);
        tx38b = (TextView) findViewById(R.id.tx38b);
        tx39b = (TextView) findViewById(R.id.tx39b);
        tx40b = (TextView) findViewById(R.id.tx40b);
        tx41b = (TextView) findViewById(R.id.tx41b);
        tx42b = (TextView) findViewById(R.id.tx42b);
        tx43b = (TextView) findViewById(R.id.tx43b);
        tx44b = (TextView) findViewById(R.id.tx44b);
        tx45b = (TextView) findViewById(R.id.tx45b);
        tx46b = (TextView) findViewById(R.id.tx46b);
        tx47b = (TextView) findViewById(R.id.tx47b);
        tx48b = (TextView) findViewById(R.id.tx48b);
        tx49b = (TextView) findViewById(R.id.tx49b);
        tx50b = (TextView) findViewById(R.id.tx50b);
        tx51b = (TextView) findViewById(R.id.tx51b);
        tx52b = (TextView) findViewById(R.id.tx52b);
        tx53b = (TextView) findViewById(R.id.tx53b);
        tx54b = (TextView) findViewById(R.id.tx54b);
        tx55b = (TextView) findViewById(R.id.tx55b);
        tx56b = (TextView) findViewById(R.id.tx56b);
        tx57b = (TextView) findViewById(R.id.tx57b);
        tx58b = (TextView) findViewById(R.id.tx58b);
        tx59b = (TextView) findViewById(R.id.tx59b);
        tx60b = (TextView) findViewById(R.id.tx60b);
        tx61b = (TextView) findViewById(R.id.tx61b);
        tx62b = (TextView) findViewById(R.id.tx62b);
        tx63b = (TextView) findViewById(R.id.tx63b);
        tx64b = (TextView) findViewById(R.id.tx64b);

        tx1c = (TextView) findViewById(R.id.tx1c);
        tx2c = (TextView) findViewById(R.id.tx2c);
        tx3c = (TextView) findViewById(R.id.tx3c);
        tx4c = (TextView) findViewById(R.id.tx4c);
        tx5c = (TextView) findViewById(R.id.tx5c);
        tx6c = (TextView) findViewById(R.id.tx6c);
        tx7c = (TextView) findViewById(R.id.tx7c);
        tx8c = (TextView) findViewById(R.id.tx8c);
        tx9c = (TextView) findViewById(R.id.tx9c);
        tx10c = (TextView) findViewById(R.id.tx10c);
        tx11c = (TextView) findViewById(R.id.tx11c);
        tx12c = (TextView) findViewById(R.id.tx12c);
        tx13c = (TextView) findViewById(R.id.tx13c);
        tx14c = (TextView) findViewById(R.id.tx14c);
        tx15c = (TextView) findViewById(R.id.tx15c);
        tx16c = (TextView) findViewById(R.id.tx16c);
        tx17c = (TextView) findViewById(R.id.tx17c);
        tx18c = (TextView) findViewById(R.id.tx18c);
        tx19c = (TextView) findViewById(R.id.tx19c);
        tx20c = (TextView) findViewById(R.id.tx20c);
        tx21c = (TextView) findViewById(R.id.tx21c);
        tx22c = (TextView) findViewById(R.id.tx22c);
        tx23c = (TextView) findViewById(R.id.tx23c);
        tx24c = (TextView) findViewById(R.id.tx24c);
        tx25c = (TextView) findViewById(R.id.tx25c);
        tx26c = (TextView) findViewById(R.id.tx26c);
        tx27c = (TextView) findViewById(R.id.tx27c);
        tx28c = (TextView) findViewById(R.id.tx28c);
        tx29c = (TextView) findViewById(R.id.tx29c);
        tx30c = (TextView) findViewById(R.id.tx30c);
        tx31c = (TextView) findViewById(R.id.tx31c);
        tx32c = (TextView) findViewById(R.id.tx32c);


        info_textview = (TextView) findViewById(R.id.info_textview);


        final TextView[] textViews1 = {tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8, tx9, tx10, tx11, tx12, tx13, tx14, tx15, tx16, tx17, tx18, tx19, tx20, tx21, tx22, tx23, tx24, tx25, tx26, tx27, tx28, tx29, tx30, tx31, tx32, tx33, tx34, tx35, tx36, tx37, tx38, tx39, tx40, tx41, tx42, tx43, tx44, tx45, tx46, tx47, tx48, tx49, tx50, tx51, tx52, tx53, tx54, tx55, tx56, tx57, tx58, tx59, tx60, tx61, tx62, tx63, tx64, tx1a, tx2a, tx3a, tx4a, tx5a, tx6a, tx7a, tx8a, tx9a, tx10a, tx11a, tx12a, tx13a, tx14a, tx15a, tx16a, tx17a, tx18a, tx19a, tx20a, tx21a, tx22a, tx23a, tx24a, tx25a, tx26a, tx27a, tx28a, tx29a, tx30a, tx31a, tx32a, tx1b, tx2b, tx3b, tx4b, tx5b, tx6b, tx7b, tx8b, tx9b, tx10b, tx11b, tx12b, tx13b, tx14b, tx15b, tx16b, tx17b, tx18b, tx19b, tx20b, tx21b, tx22b, tx23b, tx24b, tx25b, tx26b, tx27b, tx28b, tx29b, tx30b, tx31b, tx32b, tx33b, tx34b, tx35b, tx36b, tx37b, tx38b, tx39b, tx40b, tx41b, tx42b, tx43b, tx44b, tx45b, tx46b, tx47b, tx48b, tx49b, tx50b, tx51b, tx52b, tx53b, tx54b, tx55b, tx56b, tx57b, tx58b, tx59b, tx60b, tx61b, tx62b, tx63b, tx64b, tx1c, tx2c, tx3c, tx4c, tx5c, tx6c, tx7c, tx8c, tx9c, tx10c, tx11c, tx12c, tx13c, tx14c, tx15c, tx16c, tx17c, tx18c, tx19c, tx20c, tx21c, tx22c, tx23c, tx24c, tx25c, tx26c, tx27c, tx28c, tx29c, tx30c, tx31c, tx32c};


        name_textview_0 = (TextView) findViewById(R.id.textview_0);
        name_textview_1 = (TextView) findViewById(R.id.textview_1);
        name_textview_2 = (TextView) findViewById(R.id.textview_2);
        name_textview_3 = (TextView) findViewById(R.id.textview_3);

        final TextView[] names_textview_array = {name_textview_0, name_textview_1, name_textview_2, name_textview_3};

        final Intent intent = getIntent();

        name_textview_0.setText(intent.getStringExtra("edit_1"));
        name_textview_1.setText(intent.getStringExtra("edit_2"));
        name_textview_2.setText(intent.getStringExtra("edit_3"));
        name_textview_3.setText(intent.getStringExtra("edit_4"));
        couple_switch = intent.getStringExtra("couple");
        remove_last_switch = intent.getStringExtra("remove_last");

        if (intent.getStringExtra("xishti").equals("x100")) {
            xisht = 100;
        } else if (intent.getStringExtra("xishti").equals("200/500")) {
            xisht = 200;
        } else {
            xisht = Integer.parseInt(intent.getStringExtra("xishti"));
        }


        name_textview_0.setBackgroundResource(R.drawable.name_textview_background);

        info_textview.setText(getString(R.string.arigebs) + " " + names_textview_array[3].getText().toString());


        button_pass.setEnabled(true);
        button_1.setEnabled(true);
        button_2.setEnabled(false);
        button_3.setEnabled(false);
        button_4.setEnabled(false);
        button_5.setEnabled(false);
        button_6.setEnabled(false);
        button_7.setEnabled(false);
        button_8.setEnabled(false);
        button_9.setEnabled(false);

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String tavisi_waigo = getResources().getString(R.string.hundred50);
                String tavisi_ver_waigo = getResources().getString(R.string.twenty);
                on_button_click(textViews1, info_textview, couple_switch, remove_last_switch, 2, tavisi_waigo, tavisi_ver_waigo, names_textview_array);

            }

        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String tavisi_waigo = getResources().getString(R.string.twohundred);
                String tavisi_ver_waigo = getResources().getString(R.string.thirty);
                on_button_click(textViews1, info_textview, couple_switch, remove_last_switch, 3, tavisi_waigo, tavisi_ver_waigo, names_textview_array);


            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tavisi_waigo = getResources().getString(R.string.twohundred50);
                String tavisi_ver_waigo = getResources().getString(R.string.fourty);
                on_button_click(textViews1, info_textview, couple_switch, remove_last_switch, 4, tavisi_waigo, tavisi_ver_waigo, names_textview_array);

            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String tavisi_waigo = getResources().getString(R.string.threehundred);
                String tavisi_ver_waigo = getResources().getString(R.string.fifty);
                on_button_click(textViews1, info_textview, couple_switch, remove_last_switch, 5, tavisi_waigo, tavisi_ver_waigo, names_textview_array);
            }
        });


        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String tavisi_waigo = getResources().getString(R.string.threehundred50);
                String tavisi_ver_waigo = getResources().getString(R.string.sixty);
                on_button_click(textViews1, info_textview, couple_switch, remove_last_switch, 6, tavisi_waigo, tavisi_ver_waigo, names_textview_array);


            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String tavisi_waigo = getResources().getString(R.string.fourhundred);
                String tavisi_ver_waigo = getResources().getString(R.string.seventy);
                on_button_click(textViews1, info_textview, couple_switch, remove_last_switch, 7, tavisi_waigo, tavisi_ver_waigo, names_textview_array);

            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tavisi_waigo = getResources().getString(R.string.fourhundred50);
                String tavisi_ver_waigo = getResources().getString(R.string.eighty);
                on_button_click(textViews1, info_textview, couple_switch, remove_last_switch, 8, tavisi_waigo, tavisi_ver_waigo, names_textview_array);

            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tavisi_waigo = getResources().getString(R.string.ninehundred);
                String tavisi_ver_waigo = getResources().getString(R.string.ninety);
                on_button_click(textViews1, info_textview, couple_switch, remove_last_switch, 9, tavisi_waigo, tavisi_ver_waigo, names_textview_array);

            }
        });
        button_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tavisi_waigo = getResources().getString(R.string.fifty);
                if ((i >= 0 && i < 64) || (i > 95 && i < 160)) {
                    if (intent.getStringExtra("xishti").equals("x100")) {
                        switch (row_count) {
                            case 1:
                                xisht = 100;
                                break;
                            case 2:
                                xisht = 200;
                                break;
                            case 3:
                                xisht = 300;
                                break;
                            case 4:
                                xisht = 400;
                                break;
                            case 5:
                                xisht = 500;
                                break;
                            case 6:
                                xisht = 600;
                                break;
                            case 7:
                                xisht = 700;
                                break;
                            case 8:
                                xisht = 800;
                                break;
                        }

                    } else if (intent.getStringExtra("xishti").equals("200/500")) {
                        xisht = 200;
                    }

                } else {

                    if (intent.getStringExtra("xishti").equals("x100")) {
                        xisht = 900;
                    } else if (intent.getStringExtra("xishti").equals("200/500")) {
                        xisht = 500;
                    }

                }
                String tavisi_ver_waigo = ("-" + xisht);

                on_button_click(textViews1, info_textview, couple_switch, remove_last_switch, 0, tavisi_waigo, tavisi_ver_waigo, names_textview_array);

            }
        });


        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String tavisi_waigo = getResources().getString(R.string.onehundred);
                String tavisi_ver_waigo = getResources().getString(R.string.ten);
                on_button_click(textViews1, info_textview, couple_switch, remove_last_switch, 1, tavisi_waigo, tavisi_ver_waigo, names_textview_array);

            }
        });


        button_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (i == 0 || i == textViews1.length || !enable_delete) {
                } else {
                    i--;
                    String tavisi_waigo = "";
                    String tavisi_ver_waigo = "";
                    on_button_click(textViews1, info_textview, couple_switch, remove_last_switch, -1, tavisi_waigo, tavisi_ver_waigo, names_textview_array);
                }
            }
        });

    }

    private double[] find_max_value(double[] max_value) {
        double maximum = 0;
        double[] maxindexvalue = new double[2];

        for (int i = 0; i < max_value.length; i++) {
            if (maximum <= max_value[i]) {
                maximum = max_value[i];
                maxindexvalue[0] = maximum;
                maxindexvalue[1] = i;

            }
        }
        return maxindexvalue;
    }

    public void on_button_click_2(TextView[] textViews1, TextView info_textview, String couple_switch, String remove_last_switch, int button_number, String waigo, String ver_waigo, TextView[] names_textview_array) {


        if (i == 65 || i == 97 || i == 161) {

            first_player_max_value = 0;
            second_player_max_value = 0;
            third_player_max_value = 0;
            fourth_player_max_value = 0;


            first_player_took_all = true;
            second_player_took_all = true;
            third_player_took_all = true;
            fourth_player_took_all = true;

            row1_first_player_took_all = true;
            row1_second_player_took_all = true;
            row1_third_player_took_all = true;
            row1_fourth_player_took_all = true;

            row2_first_player_took_all = true;
            row2_second_player_took_all = true;
            row2_third_player_took_all = true;
            row2_fourth_player_took_all = true;

            row3_first_player_took_all = true;
            row3_second_player_took_all = true;
            row3_third_player_took_all = true;
            row3_fourth_player_took_all = true;

            row4_first_player_took_all = true;
            row4_second_player_took_all = true;
            row4_third_player_took_all = true;
            row4_fourth_player_took_all = true;

            row5_first_player_took_all = true;
            row5_second_player_took_all = true;
            row5_third_player_took_all = true;
            row5_fourth_player_took_all = true;

            row6_first_player_took_all = true;
            row6_second_player_took_all = true;
            row6_third_player_took_all = true;
            row6_fourth_player_took_all = true;

            row7_first_player_took_all = true;
            row7_second_player_took_all = true;
            row7_third_player_took_all = true;
            row7_fourth_player_took_all = true;

            row8_first_player_took_all = true;
            row8_second_player_took_all = true;
            row8_third_player_took_all = true;
            row8_fourth_player_took_all = true;

            premiebis_raodenoba = 0;

        }
        if (i % 8 == 0 && button_number != -1) {
            row++;
        }


        if (i == 0) {

            button_pass.setEnabled(true);
            button_1.setEnabled(true);
            button_2.setEnabled(false);
            button_3.setEnabled(false);
            button_4.setEnabled(false);
            button_5.setEnabled(false);
            button_6.setEnabled(false);
            button_7.setEnabled(false);
            button_8.setEnabled(false);
            button_9.setEnabled(false);


            row_count = 1;

        } else {

            if (row % 8 == 1) {
                if (i > 95 && i < 160) {
                    row_count = 4;

                } else {
                    row_count = 1;

                }
            } else if (row % 8 == 2) {
                if (i > 95 && i < 160) {

                    row_count = 3;
                } else {
                    row_count = 2;

                }
            } else if (row % 8 == 3) {
                if (i > 95 && i < 160) {

                    row_count = 2;
                } else {
                    row_count = 3;

                }
            } else if (row % 8 == 4) {
                if (i > 95 && i < 160) {

                    row_count = 1;
                } else {
                    row_count = 4;

                }
            } else if (row % 8 == 5) {
                if (i > 95 && i < 160) {


                    row_count = 8;
                } else {
                    row_count = 5;


                }
            } else if (row % 8 == 6) {
                if (i > 95 && i < 160) {

                    row_count = 7;
                } else {
                    row_count = 6;

                }
            } else if (row % 8 == 7) {
                if (i > 95 && i < 160) {

                    row_count = 6;
                } else {
                    row_count = 7;

                }
            } else {
                if (i > 95 && i < 160) {

                    row_count = 5;
                } else {
                    row_count = 8;

                }

            }


        }

        switch (i % 8) {
            case 0:

                if (button_number == -1) {


                    enable_delete = false;


                    textViews1[i].setText("");
                    info_textview.setText("");
                    sum = 0;

                    if (row % 4 == 1) {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 3) {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    }

                    if (i >= 8) {
                        if (textViews1[i - 8].getText().toString().equals("-")) {
                            first_player_written_quantity = 0;
                        } else {
                            first_player_written_quantity = Integer.parseInt(textViews1[i - 8].getText().toString());
                        }
                    }

                    row--;
                } else {


                    enable_delete = true;


                    if (row % 4 == 0) {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 1) {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    }


                    first_player_written_quantity = button_number;

                    sum = button_number;
                    if (button_number == 0) {
                        textViews1[i].setText(getResources().getString(R.string.pass));
                    } else {
                        textViews1[i].setText("" + button_number);
                    }
                    shetenva_waglejva_shevseba = row_count - sum;
                    if (shetenva_waglejva_shevseba == 0) {
                        info_textview.setText(getResources().getString(R.string.shevsebulia));
                    } else {
                        info_textview.setText(getResources().getString(R.string.shevseba) + " " + shetenva_waglejva_shevseba);
                    }
                    i++;

                }

                break;
            case 1:


                if (button_number == -1) {

                    if (row % 4 == 1) {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 3) {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    }

                    if (i >= 8) {
                        if (textViews1[i - 8].getText().toString().equals("-")) {
                            second_player_written_quantity = 0;
                        } else {
                            second_player_written_quantity = Integer.parseInt(textViews1[i - 8].getText().toString());
                        }
                    }


                    if (!textViews1[i].getText().toString().equals("-")) {
                        sum -= Integer.parseInt(textViews1[i].getText().toString());
                    }
                    shetenva_waglejva_shevseba = row_count - sum;
                    if (shetenva_waglejva_shevseba < 0) {
                        info_textview.setText(getResources().getString(R.string.waglejva));
                    } else if (shetenva_waglejva_shevseba == 0) {
                        info_textview.setText(getResources().getString(R.string.shevsebulia));
                    } else {
                        info_textview.setText(getResources().getString(R.string.shevseba) + " " + shetenva_waglejva_shevseba);
                    }
                    textViews1[i].setText("");

                } else {


                    if (row % 4 == 0) {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 1) {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    }

                    second_player_written_quantity = button_number;
                    sum += button_number;
                    if (button_number == 0) {
                        textViews1[i].setText(getResources().getString(R.string.pass));
                    } else {
                        textViews1[i].setText("" + button_number);
                    }
                    shetenva_waglejva_shevseba = row_count - sum;
                    if (shetenva_waglejva_shevseba < 0) {
                        info_textview.setText(getResources().getString(R.string.waglejva));
                    } else if (shetenva_waglejva_shevseba == 0) {
                        info_textview.setText(getResources().getString(R.string.shevsebulia));
                    } else {
                        info_textview.setText(getResources().getString(R.string.shevseba) + " " + shetenva_waglejva_shevseba);
                    }
                    i++;

                }


                // case 2
                break;
            case 2:

                if (button_number == -1) {

                    if (row_count == 1) {
                        sum += 8;
                    } else if (row_count == 2) {
                        sum += 7;
                    } else if (row_count == 3) {
                        sum += 6;
                    } else if (row_count == 4) {
                        sum += 5;
                    } else if (row_count == 5) {
                        sum += 4;
                    } else if (row_count == 6) {
                        sum += 3;
                    } else if (row_count == 7) {
                        sum += 2;
                    } else if (row_count == 8) {
                        sum += 1;
                    }

                    switch (sum) {
                        case 9:
                            button_pass.setEnabled(true);
                            break;
                        case 8:
                            button_1.setEnabled(true);
                            break;
                        case 7:
                            button_2.setEnabled(true);
                            break;
                        case 6:
                            button_3.setEnabled(true);
                            break;
                        case 5:
                            button_4.setEnabled(true);
                            break;
                        case 4:
                            button_5.setEnabled(true);
                            break;
                        case 3:
                            button_6.setEnabled(true);
                            break;
                        case 2:
                            button_7.setEnabled(true);
                            break;
                        case 1:
                            button_8.setEnabled(true);
                            break;

                    }

                    if (row_count == 1) {
                        sum -= 8;
                    } else if (row_count == 2) {
                        sum -= 7;
                    } else if (row_count == 3) {
                        sum -= 6;
                    } else if (row_count == 4) {
                        sum -= 5;
                    } else if (row_count == 5) {
                        sum -= 4;
                    } else if (row_count == 6) {
                        sum -= 3;
                    } else if (row_count == 7) {
                        sum -= 2;
                    } else if (row_count == 8) {
                        sum -= 1;
                    }

                    if (i >= 8) {
                        if (textViews1[i - 8].getText().toString().equals("-")) {
                            third_player_written_quantity = 0;
                        } else {
                            third_player_written_quantity = Integer.parseInt(textViews1[i - 8].getText().toString());
                        }
                    }

                    if (row % 4 == 1) {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 3) {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    }


                    if (!textViews1[i].getText().toString().equals("-")) {
                        sum -= Integer.parseInt(textViews1[i].getText().toString());
                    }
                    shetenva_waglejva_shevseba = row_count - sum;
                    if (shetenva_waglejva_shevseba < 0) {
                        info_textview.setText(getResources().getString(R.string.waglejva));
                    } else if (shetenva_waglejva_shevseba == 0) {
                        info_textview.setText(getResources().getString(R.string.shevsebulia));
                    } else {
                        info_textview.setText(getResources().getString(R.string.shevseba) + " " + shetenva_waglejva_shevseba);
                    }
                    textViews1[i].setText("");


                } else {


                    if (row % 4 == 0) {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 1) {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    }

                    third_player_written_quantity = button_number;
                    sum += button_number;
                    if (button_number == 0) {
                        textViews1[i].setText(getResources().getString(R.string.pass));
                    } else {
                        textViews1[i].setText("" + button_number);
                    }
                    shetenva_waglejva_shevseba = row_count - sum;
                    if (shetenva_waglejva_shevseba < 0) {
                        info_textview.setText(getResources().getString(R.string.waglejva));
                    } else if (shetenva_waglejva_shevseba == 0) {
                        info_textview.setText(getResources().getString(R.string.passgarda));
                    } else {
                        info_textview.setText(shetenva_waglejva_shevseba + "-" + getResources().getString(R.string.garda));
                    }
                    i++;

                    if (row_count == 1) {
                        sum += 8;
                    } else if (row_count == 2) {
                        sum += 7;
                    } else if (row_count == 3) {
                        sum += 6;
                    } else if (row_count == 4) {
                        sum += 5;
                    } else if (row_count == 5) {
                        sum += 4;
                    } else if (row_count == 6) {
                        sum += 3;
                    } else if (row_count == 7) {
                        sum += 2;
                    } else if (row_count == 8) {
                        sum += 1;
                    }

                    switch (sum) {
                        case 9:
                            button_pass.setEnabled(false);
                            break;
                        case 8:
                            button_1.setEnabled(false);
                            break;
                        case 7:
                            button_2.setEnabled(false);
                            break;
                        case 6:
                            button_3.setEnabled(false);
                            break;
                        case 5:
                            button_4.setEnabled(false);
                            break;
                        case 4:
                            button_5.setEnabled(false);
                            break;
                        case 3:
                            button_6.setEnabled(false);
                            break;
                        case 2:
                            button_7.setEnabled(false);
                            break;
                        case 1:
                            button_8.setEnabled(false);
                            break;
                        case 0:
                            button_9.setEnabled(false);
                            break;

                    }
                    if (row_count == 1) {
                        sum -= 8;
                    } else if (row_count == 2) {
                        sum -= 7;
                    } else if (row_count == 3) {
                        sum -= 6;
                    } else if (row_count == 4) {
                        sum -= 5;
                    } else if (row_count == 5) {
                        sum -= 4;
                    } else if (row_count == 6) {
                        sum -= 3;
                    } else if (row_count == 7) {
                        sum -= 2;
                    } else if (row_count == 8) {
                        sum -= 1;
                    }


                }

                break;

            // case 3
            case 3:

                if (row_count == 1) {
                    sum += 8;
                } else if (row_count == 2) {
                    sum += 7;
                } else if (row_count == 3) {
                    sum += 6;
                } else if (row_count == 4) {
                    sum += 5;
                } else if (row_count == 5) {
                    sum += 4;
                } else if (row_count == 6) {
                    sum += 3;
                } else if (row_count == 7) {
                    sum += 2;
                } else if (row_count == 8) {
                    sum += 1;
                }

                switch (sum) {
                    case 9:
                        button_pass.setEnabled(true);
                        break;
                    case 8:
                        button_1.setEnabled(true);
                        break;
                    case 7:
                        button_2.setEnabled(true);
                        break;
                    case 6:
                        button_3.setEnabled(true);
                        break;
                    case 5:
                        button_4.setEnabled(true);
                        break;
                    case 4:
                        button_5.setEnabled(true);
                        break;
                    case 3:
                        button_6.setEnabled(true);
                        break;
                    case 2:
                        button_7.setEnabled(true);
                        break;
                    case 1:
                        button_8.setEnabled(true);
                        break;


                }

                if (row_count == 1) {
                    sum -= 8;
                } else if (row_count == 2) {
                    sum -= 7;
                } else if (row_count == 3) {
                    sum -= 6;
                } else if (row_count == 4) {
                    sum -= 5;
                } else if (row_count == 5) {
                    sum -= 4;
                } else if (row_count == 6) {
                    sum -= 3;
                } else if (row_count == 7) {
                    sum -= 2;
                } else if (row_count == 8) {
                    sum -= 1;
                }
                if (button_number == -1) {

                    if (i >= 8) {
                        if (textViews1[i - 8].getText().toString().equals("-")) {
                            fourth_player_written_quantity = 0;
                        } else {
                            fourth_player_written_quantity = Integer.parseInt(textViews1[i - 8].getText().toString());
                        }
                    }

                    if (row % 4 == 1) {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 3) {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    }

                    if (!textViews1[i].getText().toString().equals("-")) {
                        sum -= Integer.parseInt(textViews1[i].getText().toString());
                    }
                    shetenva_waglejva_shevseba = row - sum;
                    if (shetenva_waglejva_shevseba < 0) {
                        info_textview.setText(getResources().getString(R.string.waglejva));
                    } else if (shetenva_waglejva_shevseba == 0) {
                        info_textview.setText(getResources().getString(R.string.passgarda));
                    } else {
                        info_textview.setText(shetenva_waglejva_shevseba + "-" + getResources().getString(R.string.garda));
                    }
                    textViews1[i].setText("");

                    if (row_count == 1) {
                        sum += 8;
                    } else if (row_count == 2) {
                        sum += 7;
                    } else if (row_count == 3) {
                        sum += 6;
                    } else if (row_count == 4) {
                        sum += 5;
                    } else if (row_count == 5) {
                        sum += 4;
                    } else if (row_count == 6) {
                        sum += 3;
                    } else if (row_count == 7) {
                        sum += 2;
                    } else if (row_count == 8) {
                        sum += 1;
                    }

                    switch (sum) {
                        case 9:
                            button_pass.setEnabled(false);
                            break;
                        case 8:
                            button_1.setEnabled(false);
                            break;
                        case 7:
                            button_2.setEnabled(false);
                            break;
                        case 6:
                            button_3.setEnabled(false);
                            break;
                        case 5:
                            button_4.setEnabled(false);
                            break;
                        case 4:
                            button_5.setEnabled(false);
                            break;
                        case 3:
                            button_6.setEnabled(false);
                            break;
                        case 2:
                            button_7.setEnabled(false);
                            break;
                        case 1:
                            button_8.setEnabled(false);
                            break;
                        case 0:
                            button_9.setEnabled(false);
                            break;

                    }

                    if (row_count == 1) {
                        sum -= 8;
                    } else if (row_count == 2) {
                        sum -= 7;
                    } else if (row_count == 3) {
                        sum -= 6;
                    } else if (row_count == 4) {
                        sum -= 5;
                    } else if (row_count == 5) {
                        sum -= 4;
                    } else if (row_count == 6) {
                        sum -= 3;
                    } else if (row_count == 7) {
                        sum -= 2;
                    } else if (row_count == 8) {
                        sum -= 1;
                    }

                } else {


                    if (row % 4 == 0) {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 1) {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    }

                    fourth_player_written_quantity = button_number;
                    sum += button_number;
                    if (button_number == 0) {
                        textViews1[i].setText(getResources().getString(R.string.pass));
                    } else {
                        textViews1[i].setText("" + button_number);
                    }
                    shetenva_waglejva_shevseba = row_count - sum;
                    if (shetenva_waglejva_shevseba < 0) {
                        info_textview.setText(getResources().getString(R.string.waglejva) + " " + shetenva_waglejva_shevseba * -1);
                    } else {
                        info_textview.setText(getResources().getString(R.string.shetenva) + " " + shetenva_waglejva_shevseba);
                    }

                    i++;

                }
                break;

            // case 4

            case 4:

                if (button_number == -1) {

                    if (row % 4 == 1) {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 3) {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    }


                    if (row % 8 == 1) {
                        if (j % 4 == 1) {
                            row1_first_player_took_all = true;
                        } else if (j % 4 == 2) {
                            row1_second_player_took_all = true;
                        } else if (j % 4 == 3) {
                            row1_third_player_took_all = true;
                        } else {
                            row1_fourth_player_took_all = true;
                        }

                    } else if (row % 8 == 2) {
                        if (j % 4 == 1) {
                            row2_first_player_took_all = true;
                        } else if (j % 4 == 2) {
                            row2_second_player_took_all = true;
                        } else if (j % 4 == 3) {
                            row2_third_player_took_all = true;
                        } else {
                            row2_fourth_player_took_all = true;
                        }

                    } else if (row % 8 == 3) {
                        if (j % 4 == 1) {
                            row3_first_player_took_all = true;
                        } else if (j % 4 == 2) {
                            row3_second_player_took_all = true;
                        } else if (j % 4 == 3) {
                            row3_third_player_took_all = true;
                        } else {
                            row3_fourth_player_took_all = true;
                        }

                    } else if (row % 8 == 4) {
                        if (j % 4 == 1) {
                            row4_first_player_took_all = true;
                        } else if (j % 4 == 2) {
                            row4_second_player_took_all = true;
                        } else if (j % 4 == 3) {
                            row4_third_player_took_all = true;
                        } else {
                            row4_fourth_player_took_all = true;
                        }

                    } else if (row % 8 == 5) {
                        if (j % 4 == 1) {
                            row5_first_player_took_all = true;
                        } else if (j % 4 == 2) {
                            row5_second_player_took_all = true;
                        } else if (j % 4 == 3) {
                            row5_third_player_took_all = true;
                        } else {
                            row5_fourth_player_took_all = true;
                        }

                    } else if (row % 8 == 6) {
                        if (j % 4 == 1) {
                            row6_first_player_took_all = true;
                        } else if (j % 4 == 2) {
                            row6_second_player_took_all = true;
                        } else if (j % 4 == 3) {
                            row6_third_player_took_all = true;
                        } else {
                            row6_fourth_player_took_all = true;
                        }

                    } else if (row % 8 == 7) {
                        if (j % 4 == 1) {
                            row7_first_player_took_all = true;
                        } else if (j % 4 == 2) {
                            row7_second_player_took_all = true;
                        } else if (j % 4 == 3) {
                            row7_third_player_took_all = true;
                        } else {
                            row7_fourth_player_took_all = true;
                        }
                    } else {
                        if (j % 4 == 1) {
                            row8_first_player_took_all = true;
                        } else if (j % 4 == 2) {
                            row8_second_player_took_all = true;
                        } else if (j % 4 == 3) {
                            row8_third_player_took_all = true;
                        } else {
                            row8_fourth_player_took_all = true;
                        }

                    }


                    if (j % 4 == 1) {
                        //წაღებული ქულების ჯამი
                        first_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების ჯამის გამოტანა

                        if (couple_switch.equals("true")) {

                            first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                            if (i > 0 && i < 64) {
                                sum1.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum5.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum9.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum13.setText(df.format(first_couple_taken_sum / 100));
                            }

                        } else {

                            if (i > 0 && i < 64) {
                                sum1.setText(df.format(first_player_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum5.setText(df.format(first_player_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum9.setText(df.format(first_player_taken_sum / 100));
                            } else if (i > 160) {
                                sum13.setText(df.format(first_player_taken_sum / 100));
                            }
                        }
                    } else if (j % 4 == 2) {
                        //წაღებული ქულების ჯამი
                        second_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების  ჯამის გამოტანა

                        if (couple_switch.equals("true")) {
                            second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                            if (i > 0 && i < 64) {
                                sum2.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum6.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum10.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum14.setText(df.format(second_couple_taken_sum / 100));
                            }

                        } else {

                            if (i > 0 && i < 64) {
                                sum2.setText(df.format(second_player_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum6.setText(df.format(second_player_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum10.setText(df.format(second_player_taken_sum / 100));
                            } else if (i > 160) {
                                sum14.setText(df.format(second_player_taken_sum / 100));
                            }
                        }

                    } else if (j % 4 == 3) {
                        // წაღებული ქულების ჯამი
                        third_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების  ჯამის გამოტანა


                        if (couple_switch.equals("true")) {
                            first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                            if (i > 0 && i < 64) {
                                sum1.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum5.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum9.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum13.setText(df.format(first_couple_taken_sum / 100));
                            }

                        } else {
                            if (i > 0 && i < 64) {
                                sum3.setText(df.format(third_player_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum7.setText(df.format(third_player_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum11.setText(df.format(third_player_taken_sum / 100));
                            } else if (i > 160) {
                                sum15.setText(df.format(third_player_taken_sum / 100));
                            }
                        }


                    } else {
                        //წაღებული ქულების ჯამი
                        fourth_palyer_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების  ჯამის გამოტანა

                        if (couple_switch.equals("true")) {
                            second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                            if (i > 0 && i < 64) {
                                sum2.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum6.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum10.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum14.setText(df.format(second_couple_taken_sum / 100));
                            }

                        } else {

                            if (i > 0 && i < 64) {
                                sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                            } else if (i > 160) {
                                sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                            }
                        }
                    }


                    if (row % 8 == 1) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);
                        }
                    } else if (row % 8 == 2) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        }
                    } else if (row % 8 == 3) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        }
                    } else if (row % 8 == 4) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        }
                    } else if (row % 8 == 5) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(true);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        }
                    } else if (row % 8 == 6) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        }
                    } else if (row % 8 == 7) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);
                        }
                    } else {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(true);
                            button_9.setEnabled(false);
                        }
                    }

                    textViews1[i].setText("");

                    j--;
                    taken_sum = 0;

// finish delete
                } else {


                    if (row % 4 == 0) {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 1) {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    }


                    taken_sum += button_number;
                    j++;
                    //თუ წაიღო რაც ეწერა
                    if (button_number == first_player_written_quantity) {
                        if (first_player_written_quantity == row_count) {
                            textViews1[i].setText("" + row_count * 100);
                        } else {
                            textViews1[i].setText(waigo);
                        }

                    } else {
                        textViews1[i].setText(ver_waigo);

                        if (row % 4 == 1) {
                            if (j % 4 == 1) {
                                row1_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row1_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row1_third_player_took_all = false;
                            } else {
                                row1_fourth_player_took_all = false;
                            }

                        } else if (row % 4 == 2) {
                            if (j % 4 == 1) {
                                row2_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row2_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row2_third_player_took_all = false;
                            } else {
                                row2_fourth_player_took_all = false;
                            }

                        } else if (row % 4 == 3) {
                            if (j % 4 == 1) {
                                row3_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row3_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row3_third_player_took_all = false;
                            } else {
                                row3_fourth_player_took_all = false;
                            }

                        } else if (row % 8 == 4) {
                            if (j % 4 == 1) {
                                row4_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row4_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row4_third_player_took_all = false;
                            } else {
                                row4_fourth_player_took_all = false;
                            }

                        } else if (row % 8 == 5) {
                            if (j % 4 == 1) {
                                row5_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row5_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row5_third_player_took_all = false;
                            } else {
                                row5_fourth_player_took_all = false;
                            }

                        } else if (row % 8 == 6) {
                            if (j % 4 == 1) {
                                row6_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row6_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row6_third_player_took_all = true;
                            } else {
                                row6_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 7) {
                            if (j % 4 == 1) {
                                row7_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row7_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row7_third_player_took_all = false;
                            } else {
                                row7_fourth_player_took_all = false;
                            }
                        } else {
                            if (j % 4 == 1) {
                                row8_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row8_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row8_third_player_took_all = false;
                            } else {
                                row8_fourth_player_took_all = false;
                            }

                        }


                    }


                    if (j % 4 == 1) {
                        //წაღებული ქულების ჯამი
                        first_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების ჯამის გამოტანა

                        if (couple_switch.equals("true")) {

                            first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                            if (i > 0 && i < 64) {
                                sum1.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum5.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum9.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum13.setText(df.format(first_couple_taken_sum / 100));
                            }

                        } else {

                            if (i > 0 && i < 64) {
                                sum1.setText(df.format(first_player_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum5.setText(df.format(first_player_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum9.setText(df.format(first_player_taken_sum / 100));
                            } else if (i > 160) {
                                sum13.setText(df.format(first_player_taken_sum / 100));
                            }
                        }


                    } else if (j % 4 == 2) {
                        //წაღებული ქულების ჯამი
                        second_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების  ჯამის გამოტანა

                        if (couple_switch.equals("true")) {
                            second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());


                            if (i > 0 && i < 64) {
                                sum2.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum6.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum10.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum14.setText(df.format(second_couple_taken_sum / 100));
                            }

                        } else {

                            if (i > 0 && i < 64) {
                                sum2.setText(df.format(second_player_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum6.setText(df.format(second_player_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum10.setText(df.format(second_player_taken_sum / 100));
                            } else if (i > 160) {
                                sum14.setText(df.format(second_player_taken_sum / 100));
                            }


                        }

                    } else if (j % 4 == 3) {
                        // წაღებული ქულების ჯამი
                        third_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების  ჯამის გამოტანა


                        if (couple_switch.equals("true")) {
                            first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                            if (i > 0 && i < 64) {
                                sum1.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum5.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum9.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum13.setText(df.format(first_couple_taken_sum / 100));
                            }


                        } else {
                            if (i > 0 && i < 64) {
                                sum3.setText(df.format(third_player_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum7.setText(df.format(third_player_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum11.setText(df.format(third_player_taken_sum / 100));
                            } else if (i > 160) {
                                sum15.setText(df.format(third_player_taken_sum / 100));
                            }

                        }

                    } else {
                        //წაღებული ქულების ჯამი
                        fourth_palyer_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების  ჯამის გამოტანა

                        if (couple_switch.equals("true")) {
                            second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                            if (i > 0 && i < 64) {
                                sum2.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum6.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum10.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum14.setText(df.format(second_couple_taken_sum / 100));
                            }


                        } else {

                            if (i > 0 && i < 64) {
                                sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                            } else if (i > 160) {
                                sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                            }

                        }

                    }

                    if (row_count == 1) {
                        if (taken_sum == 1) {
                            button_1.setEnabled(false);
                        }

                    } else if (row_count == 2) {
                        if (taken_sum == 1) {
                            button_2.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_1.setEnabled(false);
                            button_2.setEnabled(false);
                        }
                    } else if (row_count == 3) {
                        if (taken_sum == 1) {
                            button_3.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_1.setEnabled(false);
                        }
                    } else if (row_count == 4) {
                        if (taken_sum == 1) {
                            button_4.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_1.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        }
                    } else if (row_count == 5) {

                        if (taken_sum == 1) {
                            button_5.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_5.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_3.setEnabled(false);
                            button_5.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 5) {
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        }

                    } else if (row_count == 6) {
                        if (taken_sum == 1) {
                            button_6.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_6.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 5) {
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 6) {
                            button_1.setEnabled(false);
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        }
                    } else if (row_count == 7) {
                        if (taken_sum == 1) {
                            button_7.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_7.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_5.setEnabled(false);
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 5) {
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_7.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 6) {
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 7) {
                            button_1.setEnabled(false);
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        }
                    } else if (row_count == 8) {

                        if (taken_sum == 1) {
                            button_8.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_6.setEnabled(false);
                            button_8.setEnabled(false);
                            button_7.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_5.setEnabled(false);
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_8.setEnabled(false);
                        } else if (taken_sum == 5) {
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_8.setEnabled(false);
                            button_7.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 6) {
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_8.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 7) {
                            button_2.setEnabled(false);
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_8.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 8) {
                            button_1.setEnabled(false);
                            button_2.setEnabled(false);
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_8.setEnabled(false);
                            button_4.setEnabled(false);
                        }
                    }


                    i++;
                }
                break;
// case 5
            case 5:

                //delete
                if (button_number == -1) {

                    if (row % 4 == 1) {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 3) {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    }


                    for (int x = 0; x < 2; x++) {

                        if (row % 8 == 1) {
                            if (j % 4 == 1) {
                                row1_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row1_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row1_third_player_took_all = true;
                            } else {
                                row1_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 2) {
                            if (j % 4 == 1) {
                                row2_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row2_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row2_third_player_took_all = true;
                            } else {
                                row2_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 3) {
                            if (j % 4 == 1) {
                                row3_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row3_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row3_third_player_took_all = true;
                            } else {
                                row3_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 4) {
                            if (j % 4 == 1) {
                                row4_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row4_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row4_third_player_took_all = true;
                            } else {
                                row4_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 5) {
                            if (j % 4 == 1) {
                                row5_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row5_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row5_third_player_took_all = true;
                            } else {
                                row5_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 6) {
                            if (j % 4 == 1) {
                                row6_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row6_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row6_third_player_took_all = true;
                            } else {
                                row6_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 7) {
                            if (j % 4 == 1) {
                                row7_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row7_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row7_third_player_took_all = true;
                            } else {
                                row7_fourth_player_took_all = true;
                            }
                        } else {
                            if (j % 4 == 1) {
                                row8_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row8_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row8_third_player_took_all = true;
                            } else {
                                row8_fourth_player_took_all = true;
                            }

                        }


                        if (j % 4 == 1) {
                            //წაღებული ქულების ჯამი
                            first_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების ჯამის გამოტანა

                            if (couple_switch.equals("true")) {

                                first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_player_taken_sum / 100));
                                }
                            }
                        } else if (j % 4 == 2) {
                            //წაღებული ქულების ჯამი
                            second_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_player_taken_sum / 100));
                                }
                            }

                        } else if (j % 4 == 3) {
                            // წაღებული ქულების ჯამი
                            third_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა


                            if (couple_switch.equals("true")) {
                                first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }

                            } else {
                                if (i > 0 && i < 64) {
                                    sum3.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum7.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum11.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum15.setText(df.format(third_player_taken_sum / 100));
                                }
                            }


                        } else {
                            //წაღებული ქულების ჯამი
                            fourth_palyer_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 160) {
                                    sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                }
                            }
                        }
                        textViews1[i].setText("");
                        i--;
                        j--;
                    }


                    if (row % 8 == 1) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);
                        }
                    } else if (row % 8 == 2) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        }
                    } else if (row % 8 == 3) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        }
                    } else if (row % 8 == 4) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        }
                    } else if (row % 8 == 5) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(true);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        }
                    } else if (row % 8 == 6) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        }
                    } else if (row % 8 == 7) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);
                        }
                    } else {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(true);
                            button_9.setEnabled(false);
                        }
                    }


                    i++;
                    taken_sum = 0;

// finish delete
                } else {


                    if (row % 4 == 0) {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 1) {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    }


                    taken_sum += button_number;
                    j++;
                    //თუ წაიღო რაც ეწერა
                    if (button_number == second_player_written_quantity) {
                        if (second_player_written_quantity == row_count) {
                            textViews1[i].setText("" + row_count * 100);
                        } else {
                            textViews1[i].setText(waigo);
                        }

                    } else {
                        textViews1[i].setText(ver_waigo);

                        if (row % 4 == 1) {
                            if (j % 4 == 1) {
                                row1_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row1_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row1_third_player_took_all = false;
                            } else {
                                row1_fourth_player_took_all = false;
                            }

                        } else if (row % 4 == 2) {
                            if (j % 4 == 1) {
                                row2_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row2_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row2_third_player_took_all = false;
                            } else {
                                row2_fourth_player_took_all = false;
                            }

                        } else if (row % 4 == 3) {
                            if (j % 4 == 1) {
                                row3_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row3_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row3_third_player_took_all = false;
                            } else {
                                row3_fourth_player_took_all = false;
                            }

                        } else if (row % 8 == 4) {
                            if (j % 4 == 1) {
                                row4_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row4_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row4_third_player_took_all = false;
                            } else {
                                row4_fourth_player_took_all = false;
                            }

                        } else if (row % 8 == 5) {
                            if (j % 4 == 1) {
                                row5_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row5_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row5_third_player_took_all = false;
                            } else {
                                row5_fourth_player_took_all = false;
                            }

                        } else if (row % 8 == 6) {
                            if (j % 4 == 1) {
                                row6_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row6_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row6_third_player_took_all = true;
                            } else {
                                row6_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 7) {
                            if (j % 4 == 1) {
                                row7_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row7_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row7_third_player_took_all = false;
                            } else {
                                row7_fourth_player_took_all = false;
                            }
                        } else {
                            if (j % 4 == 1) {
                                row8_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row8_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row8_third_player_took_all = false;
                            } else {
                                row8_fourth_player_took_all = false;
                            }

                        }

                    }


                    if (j % 4 == 1) {
                        //წაღებული ქულების ჯამი
                        first_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების ჯამის გამოტანა

                        if (couple_switch.equals("true")) {

                            first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                            if (i > 0 && i < 64) {
                                sum1.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum5.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum9.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum13.setText(df.format(first_couple_taken_sum / 100));
                            }

                        } else {

                            if (i > 0 && i < 64) {
                                sum1.setText(df.format(first_player_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum5.setText(df.format(first_player_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum9.setText(df.format(first_player_taken_sum / 100));
                            } else if (i > 160) {
                                sum13.setText(df.format(first_player_taken_sum / 100));
                            }
                        }

                    } else if (j % 4 == 2) {
                        //წაღებული ქულების ჯამი
                        second_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების  ჯამის გამოტანა

                        if (couple_switch.equals("true")) {
                            second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());


                            if (i > 0 && i < 64) {
                                sum2.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum6.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum10.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum14.setText(df.format(second_couple_taken_sum / 100));
                            }

                        } else {

                            if (i > 0 && i < 64) {
                                sum2.setText(df.format(second_player_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum6.setText(df.format(second_player_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum10.setText(df.format(second_player_taken_sum / 100));
                            } else if (i > 160) {
                                sum14.setText(df.format(second_player_taken_sum / 100));
                            }


                        }

                    } else if (j % 4 == 3) {
                        // წაღებული ქულების ჯამი
                        third_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების  ჯამის გამოტანა


                        if (couple_switch.equals("true")) {
                            first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                            if (i > 0 && i < 64) {
                                sum1.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum5.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum9.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum13.setText(df.format(first_couple_taken_sum / 100));
                            }


                        } else {
                            if (i > 0 && i < 64) {
                                sum3.setText(df.format(third_player_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum7.setText(df.format(third_player_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum11.setText(df.format(third_player_taken_sum / 100));
                            } else if (i > 160) {
                                sum15.setText(df.format(third_player_taken_sum / 100));
                            }

                        }

                    } else {
                        //წაღებული ქულების ჯამი
                        fourth_palyer_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების  ჯამის გამოტანა

                        if (couple_switch.equals("true")) {
                            second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                            if (i > 0 && i < 64) {
                                sum2.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum6.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum10.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum14.setText(df.format(second_couple_taken_sum / 100));
                            }


                        } else {

                            if (i > 0 && i < 64) {
                                sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                            } else if (i > 160) {
                                sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                            }

                        }

                    }
                    if (row_count == 1) {
                        if (taken_sum == 1) {
                            button_1.setEnabled(false);
                        }

                    } else if (row_count == 2) {
                        if (taken_sum == 1) {
                            button_2.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_1.setEnabled(false);
                            button_2.setEnabled(false);
                        }
                    } else if (row_count == 3) {
                        if (taken_sum == 1) {
                            button_3.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_1.setEnabled(false);
                        }
                    } else if (row_count == 4) {
                        if (taken_sum == 1) {
                            button_4.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_1.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        }
                    } else if (row_count == 5) {

                        if (taken_sum == 1) {
                            button_5.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_5.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_3.setEnabled(false);
                            button_5.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 5) {
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        }

                    } else if (row_count == 6) {
                        if (taken_sum == 1) {
                            button_6.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_6.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 5) {
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 6) {
                            button_1.setEnabled(false);
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        }
                    } else if (row_count == 7) {
                        if (taken_sum == 1) {
                            button_7.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_7.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_5.setEnabled(false);
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 5) {
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_7.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 6) {
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 7) {
                            button_1.setEnabled(false);
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        }
                    } else if (row_count == 8) {

                        if (taken_sum == 1) {
                            button_8.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_6.setEnabled(false);
                            button_8.setEnabled(false);
                            button_7.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_5.setEnabled(false);
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_8.setEnabled(false);
                        } else if (taken_sum == 5) {
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_8.setEnabled(false);
                            button_7.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 6) {
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_8.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 7) {
                            button_2.setEnabled(false);
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_8.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 8) {
                            button_1.setEnabled(false);
                            button_2.setEnabled(false);
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_8.setEnabled(false);
                            button_4.setEnabled(false);
                        }
                    }


                    i++;
                }

                break;
//6
            case 6:

                //delete
                if (button_number == -1) {

                    if (row % 4 == 1) {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 3) {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    }


                    for (int x = 0; x < 3; x++) {

                        if (row % 8 == 1) {
                            if (j % 4 == 1) {
                                row1_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row1_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row1_third_player_took_all = true;
                            } else {
                                row1_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 2) {
                            if (j % 4 == 1) {
                                row2_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row2_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row2_third_player_took_all = true;
                            } else {
                                row2_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 3) {
                            if (j % 4 == 1) {
                                row3_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row3_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row3_third_player_took_all = true;
                            } else {
                                row3_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 4) {
                            if (j % 4 == 1) {
                                row4_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row4_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row4_third_player_took_all = true;
                            } else {
                                row4_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 5) {
                            if (j % 4 == 1) {
                                row5_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row5_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row5_third_player_took_all = true;
                            } else {
                                row5_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 6) {
                            if (j % 4 == 1) {
                                row6_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row6_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row6_third_player_took_all = true;
                            } else {
                                row6_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 7) {
                            if (j % 4 == 1) {
                                row7_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row7_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row7_third_player_took_all = true;
                            } else {
                                row7_fourth_player_took_all = true;
                            }
                        } else {
                            if (j % 4 == 1) {
                                row8_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row8_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row8_third_player_took_all = true;
                            } else {
                                row8_fourth_player_took_all = true;
                            }

                        }


                        if (j % 4 == 1) {
                            //წაღებული ქულების ჯამი
                            first_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების ჯამის გამოტანა

                            if (couple_switch.equals("true")) {

                                first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_player_taken_sum / 100));
                                }
                            }
                        } else if (j % 4 == 2) {
                            //წაღებული ქულების ჯამი
                            second_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_player_taken_sum / 100));
                                }
                            }

                        } else if (j % 4 == 3) {
                            // წაღებული ქულების ჯამი
                            third_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა


                            if (couple_switch.equals("true")) {
                                first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }

                            } else {
                                if (i > 0 && i < 64) {
                                    sum3.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum7.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum11.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum15.setText(df.format(third_player_taken_sum / 100));
                                }
                            }


                        } else {
                            //წაღებული ქულების ჯამი
                            fourth_palyer_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 160) {
                                    sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                }
                            }
                        }
                        textViews1[i].setText("");
                        i--;
                        j--;
                    }


                    if (row % 8 == 1) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);
                        }
                    } else if (row % 8 == 2) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        }
                    } else if (row % 8 == 3) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        }
                    } else if (row % 8 == 4) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        }
                    } else if (row % 8 == 5) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(true);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        }
                    } else if (row % 8 == 6) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        }
                    } else if (row % 8 == 7) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);
                        }
                    } else {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(true);
                            button_9.setEnabled(false);
                        }
                    }


                    i++;

                    taken_sum = 0;

// finish delete
                } else {


                    if (row % 4 == 0) {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 1) {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    }


                    taken_sum += button_number;
                    j++;
                    //თუ წაიღო რაც ეწერა

                    if (button_number == third_player_written_quantity) {
                        if (third_player_written_quantity == row_count) {
                            textViews1[i].setText("" + row_count * 100);
                        } else {
                            textViews1[i].setText(waigo);
                        }
                    } else {
                        textViews1[i].setText(ver_waigo);


                        if (row % 4 == 1) {
                            if (j % 4 == 1) {
                                row1_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row1_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row1_third_player_took_all = false;
                            } else {
                                row1_fourth_player_took_all = false;
                            }

                        } else if (row % 4 == 2) {
                            if (j % 4 == 1) {
                                row2_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row2_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row2_third_player_took_all = false;
                            } else {
                                row2_fourth_player_took_all = false;
                            }

                        } else if (row % 4 == 3) {
                            if (j % 4 == 1) {
                                row3_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row3_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row3_third_player_took_all = false;
                            } else {
                                row3_fourth_player_took_all = false;
                            }

                        } else if (row % 8 == 4) {
                            if (j % 4 == 1) {
                                row4_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row4_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row4_third_player_took_all = false;
                            } else {
                                row4_fourth_player_took_all = false;
                            }

                        } else if (row % 8 == 5) {
                            if (j % 4 == 1) {
                                row5_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row5_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row5_third_player_took_all = false;
                            } else {
                                row5_fourth_player_took_all = false;
                            }

                        } else if (row % 8 == 6) {
                            if (j % 4 == 1) {
                                row6_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row6_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row6_third_player_took_all = true;
                            } else {
                                row6_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 7) {
                            if (j % 4 == 1) {
                                row7_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row7_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row7_third_player_took_all = false;
                            } else {
                                row7_fourth_player_took_all = false;
                            }
                        } else {
                            if (j % 4 == 1) {
                                row8_first_player_took_all = false;
                            } else if (j % 4 == 2) {
                                row8_second_player_took_all = false;
                            } else if (j % 4 == 3) {
                                row8_third_player_took_all = false;
                            } else {
                                row8_fourth_player_took_all = false;
                            }

                        }

                    }


                    if (j % 4 == 1) {
                        //წაღებული ქულების ჯამი
                        first_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების ჯამის გამოტანა

                        if (couple_switch.equals("true")) {

                            first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                            if (i > 0 && i < 64) {
                                sum1.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum5.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum9.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum13.setText(df.format(first_couple_taken_sum / 100));
                            }

                        } else {

                            if (i > 0 && i < 64) {
                                sum1.setText(df.format(first_player_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum5.setText(df.format(first_player_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum9.setText(df.format(first_player_taken_sum / 100));
                            } else if (i > 160) {
                                sum13.setText(df.format(first_player_taken_sum / 100));
                            }
                        }


                    } else if (j % 4 == 2) {
                        //წაღებული ქულების ჯამი
                        second_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების  ჯამის გამოტანა

                        if (couple_switch.equals("true")) {
                            second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());


                            if (i > 0 && i < 64) {
                                sum2.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum6.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum10.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum14.setText(df.format(second_couple_taken_sum / 100));
                            }

                        } else {

                            if (i > 0 && i < 64) {
                                sum2.setText(df.format(second_player_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum6.setText(df.format(second_player_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum10.setText(df.format(second_player_taken_sum / 100));
                            } else if (i > 160) {
                                sum14.setText(df.format(second_player_taken_sum / 100));
                            }


                        }

                    } else if (j % 4 == 3) {
                        // წაღებული ქულების ჯამი
                        third_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების  ჯამის გამოტანა


                        if (couple_switch.equals("true")) {
                            first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                            if (i > 0 && i < 64) {
                                sum1.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum5.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum9.setText(df.format(first_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum13.setText(df.format(first_couple_taken_sum / 100));
                            }


                        } else {
                            if (i > 0 && i < 64) {
                                sum3.setText(df.format(third_player_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum7.setText(df.format(third_player_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum11.setText(df.format(third_player_taken_sum / 100));
                            } else if (i > 160) {
                                sum15.setText(df.format(third_player_taken_sum / 100));
                            }

                        }

                    } else {
                        //წაღებული ქულების ჯამი
                        fourth_palyer_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                        //

                        //წაღებული ქულების  ჯამის გამოტანა

                        if (couple_switch.equals("true")) {
                            second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                            if (i > 0 && i < 64) {
                                sum2.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum6.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum10.setText(df.format(second_couple_taken_sum / 100));
                            } else if (i > 160) {
                                sum14.setText(df.format(second_couple_taken_sum / 100));
                            }


                        } else {

                            if (i > 0 && i < 64) {
                                sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                            } else if (i > 64 && i < 96) {
                                sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                            } else if (i > 96 && i < 160) {
                                sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                            } else if (i > 160) {
                                sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                            }

                        }

                    }

                    if (row_count == 1) {
                        if (taken_sum == 1) {
                            button_1.setEnabled(false);
                        } else {
                            button_pass.setEnabled(false);
                        }

                    } else if (row_count == 2) {
                        if (taken_sum == 1) {
                            button_pass.setEnabled(false);
                            button_2.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_1.setEnabled(false);
                            button_2.setEnabled(false);
                        } else {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                        }
                    } else if (row_count == 3) {
                        if (taken_sum == 1) {
                            button_1.setEnabled(false);
                            button_pass.setEnabled(false);
                            button_3.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_pass.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_1.setEnabled(false);
                        } else {
                            button_pass.setEnabled(false);
                            button_2.setEnabled(false);
                            button_1.setEnabled(false);
                        }
                    } else if (row_count == 4) {
                        if (taken_sum == 1) {
                            button_pass.setEnabled(false);
                            button_2.setEnabled(false);
                            button_1.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_pass.setEnabled(false);
                            button_2.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_2.setEnabled(false);
                            button_1.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                        } else {
                            button_pass.setEnabled(false);
                            button_2.setEnabled(false);
                            button_1.setEnabled(false);
                            button_3.setEnabled(false);
                        }
                    } else if (row_count == 5) {

                        if (taken_sum == 1) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_pass.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        } else if (taken_sum == 5) {

                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        } else {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        }

                    } else if (row_count == 6) {
                        if (taken_sum == 1) {
                            button_5.setEnabled(true);
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_6.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                        } else if (taken_sum == 5) {
                            button_pass.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                        }
                        if (taken_sum == 6) {

                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                        } else {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                        }
                    } else if (row_count == 7) {
                        if (taken_sum == 1) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_7.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                        } else if (taken_sum == 5) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                        } else if (taken_sum == 6) {
                            button_pass.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                        } else if (taken_sum == 7) {
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                        } else {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                        }
                    } else if (row_count == 8) {


                        if (taken_sum == 1) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                            button_8.setEnabled(false);
                        } else if (taken_sum == 2) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                        } else if (taken_sum == 3) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                        } else if (taken_sum == 4) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                        } else if (taken_sum == 5) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                        } else if (taken_sum == 6) {
                            button_pass.setEnabled(false);
                            button_1.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                        } else if (taken_sum == 7) {
                            button_pass.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_2.setEnabled(false);
                            button_4.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                        } else if (taken_sum == 8) {
                            button_1.setEnabled(false);
                            button_2.setEnabled(false);
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_8.setEnabled(false);
                            button_4.setEnabled(false);
                        } else {
                            button_1.setEnabled(false);
                            button_2.setEnabled(false);
                            button_7.setEnabled(false);
                            button_6.setEnabled(false);
                            button_5.setEnabled(false);
                            button_3.setEnabled(false);
                            button_pass.setEnabled(false);
                            button_4.setEnabled(false);


                        }
                    }

                    i++;
                }
                break;

            //7
            case 7:


//delete
                if (button_number == -1) {

                    if (row % 4 == 1) {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 3) {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    }


                    j--;


                    if ((i == 63 || i == 95 || i == 159) && (premiebis_raodenoba > 0)) {

                        if (premiebis_raodenoba == 1) {

                            if (!first_player_took_all) {


                                first_player_taken_sum += first_player_max_value;

                                if (couple_switch.equals("true")) {
                                    if (!third_player_took_all) {

                                        textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));


                                        first_couple_taken_sum += first_player_max_value;


                                    }


                                } else {

                                    textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));


                                }

                            }

                            if (!second_player_took_all) {

                                second_player_taken_sum += second_player_max_value;

                                if (couple_switch.equals("true")) {

                                    if (!fourth_player_took_all) {

                                        textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                        second_couple_taken_sum += second_player_max_value;

                                    }
                                } else {

                                    textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                }

                            }

                            if (!third_player_took_all) {


                                third_player_taken_sum += third_player_max_value;

                                if (couple_switch.equals("true")) {
                                    if (!first_player_took_all) {

                                        textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                        first_couple_taken_sum += third_player_max_value;

                                    }

                                } else {

                                    textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                }

                            }

                            if (!fourth_player_took_all) {


                                fourth_palyer_taken_sum += fourth_player_max_value;

                                if (couple_switch.equals("true")) {
                                    if (!second_player_took_all) {

                                        textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[fourth_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                        second_couple_taken_sum += fourth_player_max_value;


                                    }

                                } else {

                                    textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[fourth_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                }

                            }
                        }


                        // თუ პრემიაზე 2 ან 3გავიდა

                        if (premiebis_raodenoba > 1) {


                            if (couple_switch.equals("true")) {
                                if (first_player_took_all & third_player_took_all & !second_player_took_all & !fourth_player_took_all) {


                                    if (!second_player_took_all) {

                                        textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                        second_player_taken_sum += second_player_max_value;


                                        second_couple_taken_sum += second_player_max_value;


                                    }


                                    if (!fourth_player_took_all) {

                                        textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[fourth_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                        fourth_palyer_taken_sum += fourth_player_max_value;


                                        second_couple_taken_sum += fourth_player_max_value;

                                    }


                                } else if (second_player_took_all && fourth_player_took_all & !first_player_took_all & !third_player_took_all) {
                                    if (!first_player_took_all) {

                                        textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                                        first_player_taken_sum += first_player_max_value;


                                        first_couple_taken_sum += first_player_max_value;


                                    }


                                    if (!third_player_took_all) {

                                        textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                                        third_player_taken_sum += third_player_max_value;

                                        first_couple_taken_sum += third_player_max_value;

                                    }


                                }
                            }

                            if (remove_last_switch.equals("true")) {
                                if (!first_player_took_all) {

                                    textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                                    first_player_taken_sum += first_player_max_value;


                                }

                                if (!second_player_took_all) {
                                    textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                                    second_player_taken_sum += second_player_max_value;

                                }

                                if (!third_player_took_all) {

                                    textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                                    third_player_taken_sum += third_player_max_value;


                                }

                                if (!fourth_player_took_all) {

                                    textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                                    fourth_palyer_taken_sum += fourth_player_max_value;


                                }

                            }

                        }


                    }

                    for (int x = 0; x < 4; x++) {


                        if (row % 8 == 1) {
                            if (j % 4 == 1) {
                                row1_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row1_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row1_third_player_took_all = true;
                            } else {
                                row1_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 2) {
                            if (j % 4 == 1) {
                                row2_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row2_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row2_third_player_took_all = true;
                            } else {
                                row2_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 3) {
                            if (j % 4 == 1) {
                                row3_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row3_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row3_third_player_took_all = true;
                            } else {
                                row3_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 4) {
                            if (j % 4 == 1) {
                                row4_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row4_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row4_third_player_took_all = true;
                            } else {
                                row4_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 5) {
                            if (j % 4 == 1) {
                                row5_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row5_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row5_third_player_took_all = true;
                            } else {
                                row5_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 6) {
                            if (j % 4 == 1) {
                                row6_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row6_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row6_third_player_took_all = true;
                            } else {
                                row6_fourth_player_took_all = true;
                            }

                        } else if (row % 8 == 7) {
                            if (j % 4 == 1) {
                                row7_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row7_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row7_third_player_took_all = true;
                            } else {
                                row7_fourth_player_took_all = true;
                            }
                        } else {
                            if (j % 4 == 1) {
                                row8_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row8_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row8_third_player_took_all = true;
                            } else {
                                row8_fourth_player_took_all = true;
                            }

                        }


                        if (j % 4 == 1) {
                            //წაღებული ქულების ჯამი
                            first_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების ჯამის გამოტანა

                            if (couple_switch.equals("true")) {

                                first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_player_taken_sum / 100));
                                }
                            }
                        } else if (j % 4 == 2) {
                            //წაღებული ქულების ჯამი
                            second_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_player_taken_sum / 100));
                                }
                            }

                        } else if (j % 4 == 3) {
                            // წაღებული ქულების ჯამი
                            third_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა


                            if (couple_switch.equals("true")) {
                                first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }

                            } else {
                                if (i > 0 && i < 64) {
                                    sum3.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum7.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum11.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum15.setText(df.format(third_player_taken_sum / 100));
                                }
                            }


                        } else {
                            //წაღებული ქულების ჯამი
                            fourth_palyer_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 160) {
                                    sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                }
                            }
                        }
                        textViews1[i].setText("");
                        i--;
                        j--;
                    }

//
                    first_player_took_all = true;
                    second_player_took_all = true;
                    third_player_took_all = true;
                    fourth_player_took_all = true;
                    premiebis_raodenoba = 0;

//
                    if (row % 8 == 1) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);
                        }
                    } else if (row % 8 == 2) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        }
                    } else if (row % 8 == 3) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        }
                    } else if (row % 8 == 4) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(false);
                            button_3.setEnabled(false);
                            button_4.setEnabled(false);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(false);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);

                        }
                    } else if (row % 8 == 5) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(true);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        }
                    } else if (row % 8 == 6) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        }
                    } else if (row % 8 == 7) {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);
                        }
                    } else {
                        if (i > 95 && i < 160) {

                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(false);
                            button_7.setEnabled(false);
                            button_8.setEnabled(false);
                            button_9.setEnabled(false);


                        } else {
                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(true);
                            button_9.setEnabled(false);
                        }
                    }


                    i++;

                    taken_sum = 0;
// finish delete


                } else {

                    if (row % 4 == 0) {
                        names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 1) {
                        names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                    } else if (row % 4 == 2) {
                        names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    } else {
                        names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                        names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                    }

                    taken_sum += button_number;


                    if (taken_sum == row_count) {


                        j++;
                        //თუ წაიღო რაც ეწერა

                        if (button_number == fourth_player_written_quantity) {
                            if (fourth_player_written_quantity == row_count) {
                                textViews1[i].setText("" + row_count * 100);
                            } else {
                                textViews1[i].setText(waigo);
                            }
                        } else {
                            textViews1[i].setText(ver_waigo);


                            if (row % 4 == 1) {
                                if (j % 4 == 1) {
                                    row1_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row1_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row1_third_player_took_all = false;
                                } else {
                                    row1_fourth_player_took_all = false;
                                }

                            } else if (row % 4 == 2) {
                                if (j % 4 == 1) {
                                    row2_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row2_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row2_third_player_took_all = false;
                                } else {
                                    row2_fourth_player_took_all = false;
                                }

                            } else if (row % 4 == 3) {
                                if (j % 4 == 1) {
                                    row3_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row3_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row3_third_player_took_all = false;
                                } else {
                                    row3_fourth_player_took_all = false;
                                }

                            } else if (row % 8 == 4) {
                                if (j % 4 == 1) {
                                    row4_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row4_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row4_third_player_took_all = false;
                                } else {
                                    row4_fourth_player_took_all = false;
                                }

                            } else if (row % 8 == 5) {
                                if (j % 4 == 1) {
                                    row5_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row5_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row5_third_player_took_all = false;
                                } else {
                                    row5_fourth_player_took_all = false;
                                }

                            } else if (row % 8 == 6) {
                                if (j % 4 == 1) {
                                    row6_first_player_took_all = true;
                                } else if (j % 4 == 2) {
                                    row6_second_player_took_all = true;
                                } else if (j % 4 == 3) {
                                    row6_third_player_took_all = true;
                                } else {
                                    row6_fourth_player_took_all = true;
                                }

                            } else if (row % 8 == 7) {
                                if (j % 4 == 1) {
                                    row7_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row7_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row7_third_player_took_all = false;
                                } else {
                                    row7_fourth_player_took_all = false;
                                }
                            } else {
                                if (j % 4 == 1) {
                                    row8_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row8_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row8_third_player_took_all = false;
                                } else {
                                    row8_fourth_player_took_all = false;
                                }

                            }

                        }


                        if (j % 4 == 1) {
                            //წაღებული ქულების ჯამი
                            first_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების ჯამის გამოტანა

                            if (couple_switch.equals("true")) {

                                first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_player_taken_sum / 100));
                                }
                            }


                        } else if (j % 4 == 2) {
                            //წაღებული ქულების ჯამი
                            second_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());


                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_player_taken_sum / 100));
                                }


                            }

                        } else if (j % 4 == 3) {
                            // წაღებული ქულების ჯამი
                            third_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა


                            if (couple_switch.equals("true")) {
                                first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }


                            } else {
                                if (i > 0 && i < 64) {
                                    sum3.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum7.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum11.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum15.setText(df.format(third_player_taken_sum / 100));
                                }

                            }

                        } else {
                            //წაღებული ქულების ჯამი
                            fourth_palyer_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }


                            } else {

                                if (i > 0 && i < 64) {
                                    sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 160) {
                                    sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                }

                            }

                        }

                        // PREMIA

                        if (i == 63 || i == 95 || i == 159 || i == 191) {

                            if (i == 63) {

                                standatrulifirstplayer[0] = Double.parseDouble(textViews1[4].getText().toString());
                                standatrulifirstplayer[1] = Double.parseDouble(textViews1[15].getText().toString());
                                standatrulifirstplayer[2] = Double.parseDouble(textViews1[22].getText().toString());
                                standatrulifirstplayer[3] = Double.parseDouble(textViews1[29].getText().toString());
                                standatrulifirstplayer[4] = Double.parseDouble(textViews1[36].getText().toString());
                                standatrulifirstplayer[5] = Double.parseDouble(textViews1[47].getText().toString());
                                standatrulifirstplayer[6] = Double.parseDouble(textViews1[54].getText().toString());

                                standatrulisecondplayer[0] = Double.parseDouble(textViews1[5].getText().toString());
                                standatrulisecondplayer[1] = Double.parseDouble(textViews1[12].getText().toString());
                                standatrulisecondplayer[2] = Double.parseDouble(textViews1[23].getText().toString());
                                standatrulisecondplayer[3] = Double.parseDouble(textViews1[30].getText().toString());
                                standatrulisecondplayer[4] = Double.parseDouble(textViews1[37].getText().toString());
                                standatrulisecondplayer[5] = Double.parseDouble(textViews1[44].getText().toString());
                                standatrulisecondplayer[6] = Double.parseDouble(textViews1[55].getText().toString());

                                standatrulithirdplayer[0] = Double.parseDouble(textViews1[6].getText().toString());
                                standatrulithirdplayer[1] = Double.parseDouble(textViews1[13].getText().toString());
                                standatrulithirdplayer[2] = Double.parseDouble(textViews1[20].getText().toString());
                                standatrulithirdplayer[3] = Double.parseDouble(textViews1[31].getText().toString());
                                standatrulithirdplayer[4] = Double.parseDouble(textViews1[38].getText().toString());
                                standatrulithirdplayer[5] = Double.parseDouble(textViews1[45].getText().toString());
                                standatrulithirdplayer[6] = Double.parseDouble(textViews1[52].getText().toString());

                                standatrulifourthplayer[0] = Double.parseDouble(textViews1[7].getText().toString());
                                standatrulifourthplayer[1] = Double.parseDouble(textViews1[14].getText().toString());
                                standatrulifourthplayer[2] = Double.parseDouble(textViews1[21].getText().toString());
                                standatrulifourthplayer[3] = Double.parseDouble(textViews1[28].getText().toString());
                                standatrulifourthplayer[4] = Double.parseDouble(textViews1[39].getText().toString());
                                standatrulifourthplayer[5] = Double.parseDouble(textViews1[46].getText().toString());
                                standatrulifourthplayer[6] = Double.parseDouble(textViews1[53].getText().toString());


                            } else if (i == 159) {

                                standatrulifirstplayer[0] = Double.parseDouble(textViews1[4+96].getText().toString());
                                standatrulifirstplayer[1] = Double.parseDouble(textViews1[15+96].getText().toString());
                                standatrulifirstplayer[2] = Double.parseDouble(textViews1[22+96].getText().toString());
                                standatrulifirstplayer[3] = Double.parseDouble(textViews1[29+96].getText().toString());
                                standatrulifirstplayer[4] = Double.parseDouble(textViews1[36+96].getText().toString());
                                standatrulifirstplayer[5] = Double.parseDouble(textViews1[47+96].getText().toString());
                                standatrulifirstplayer[6] = Double.parseDouble(textViews1[54+96].getText().toString());

                                standatrulisecondplayer[0] = Double.parseDouble(textViews1[5+96].getText().toString());
                                standatrulisecondplayer[1] = Double.parseDouble(textViews1[12+96].getText().toString());
                                standatrulisecondplayer[2] = Double.parseDouble(textViews1[23+96].getText().toString());
                                standatrulisecondplayer[3] = Double.parseDouble(textViews1[30+96].getText().toString());
                                standatrulisecondplayer[4] = Double.parseDouble(textViews1[37+96].getText().toString());
                                standatrulisecondplayer[5] = Double.parseDouble(textViews1[44+96].getText().toString());
                                standatrulisecondplayer[6] = Double.parseDouble(textViews1[55+96].getText().toString());

                                standatrulithirdplayer[0] = Double.parseDouble(textViews1[6+96].getText().toString());
                                standatrulithirdplayer[1] = Double.parseDouble(textViews1[13+96].getText().toString());
                                standatrulithirdplayer[2] = Double.parseDouble(textViews1[20+96].getText().toString());
                                standatrulithirdplayer[3] = Double.parseDouble(textViews1[31+96].getText().toString());
                                standatrulithirdplayer[4] = Double.parseDouble(textViews1[38+96].getText().toString());
                                standatrulithirdplayer[5] = Double.parseDouble(textViews1[45+96].getText().toString());
                                standatrulithirdplayer[6] = Double.parseDouble(textViews1[52+96].getText().toString());

                                standatrulifourthplayer[0] = Double.parseDouble(textViews1[7+96].getText().toString());
                                standatrulifourthplayer[1] = Double.parseDouble(textViews1[14+96].getText().toString());
                                standatrulifourthplayer[2] = Double.parseDouble(textViews1[21+96].getText().toString());
                                standatrulifourthplayer[3] = Double.parseDouble(textViews1[28+96].getText().toString());
                                standatrulifourthplayer[4] = Double.parseDouble(textViews1[39+96].getText().toString());
                                standatrulifourthplayer[5] = Double.parseDouble(textViews1[46+96].getText().toString());
                                standatrulifourthplayer[6] = Double.parseDouble(textViews1[53+96].getText().toString());


                            }


                            array = find_max_value(standatrulifirstplayer);
                            first_player_max_value = array[0];
                            if (array[1] == 0) {
                                first_player_max_value_index = 4;
                            } else if (array[1] == 1) {
                                first_player_max_value_index = 15;

                            } else if (array[1] == 2){
                                first_player_max_value_index = 22;
                            }else if (array[1] == 3){
                                first_player_max_value_index = 29;
                            }else if (array[1] == 4){
                                first_player_max_value_index = 36;
                            }else if (array[1] == 5){
                                first_player_max_value_index = 47;
                            }else if (array[1] == 6){
                                first_player_max_value_index = 54;
                            }


                            array = find_max_value(standatrulisecondplayer);
                            second_player_max_value = array[0];
                            if (array[1] == 0) {
                                second_player_max_value_index = 5;
                            } else if (array[1] == 1) {
                                second_player_max_value_index = 12;
                            } else if(array[1] == 2){
                                second_player_max_value_index = 23;
                            }else if(array[1] == 3){
                                second_player_max_value_index = 30;
                            }else if(array[1] == 4){
                                second_player_max_value_index = 37;
                            }else if(array[1] == 5){
                                second_player_max_value_index = 44;
                            }else if(array[1] == 6){
                                second_player_max_value_index = 55;
                            }


                            array = find_max_value(standatrulithirdplayer);
                            third_player_max_value = array[0];

                            if (array[1] == 0) {
                                third_player_max_value_index = 6;
                            } else if (array[1] == 1) {
                                third_player_max_value_index = 13;

                            } else if (array[1] == 2) {
                                third_player_max_value_index = 20;
                            }else if (array[1] == 3) {
                                third_player_max_value_index = 31;
                            }else if (array[1] == 4) {
                                third_player_max_value_index = 38;
                            }else if (array[1] == 5) {
                                third_player_max_value_index = 45;
                            }else if (array[1] == 6) {
                                third_player_max_value_index = 52;
                            }


                            array = find_max_value(standatrulifourthplayer);
                            fourth_player_max_value = array[0];

                            if (array[1] == 0) {
                                fourth_player_max_value_index = 7;
                            } else if (array[1] == 1) {
                                fourth_player_max_value_index = 14;

                            } else if (array[1] == 2) {
                                fourth_player_max_value_index = 21;
                            } else if (array[1] == 3) {
                                fourth_player_max_value_index = 28;
                            } else if (array[1] == 4) {
                                fourth_player_max_value_index = 39;
                            } else if (array[1] == 5) {
                                fourth_player_max_value_index = 46;
                            } else if (array[1] == 6) {
                                fourth_player_max_value_index = 53;
                            }


                            if (i == 159) {
                                first_player_max_value_index += 96;
                                second_player_max_value_index += 96;
                                third_player_max_value_index += 96;
                                fourth_player_max_value_index += 96;

                            }


                            if (!row1_first_player_took_all || !row2_first_player_took_all || !row3_first_player_took_all || !row4_first_player_took_all || !row5_first_player_took_all || !row6_first_player_took_all || !row7_first_player_took_all || !row8_first_player_took_all) {
                                first_player_took_all = false;
                            }

                            if (!row1_second_player_took_all || !row2_second_player_took_all || !row3_second_player_took_all || !row4_second_player_took_all || !row5_second_player_took_all || !row6_second_player_took_all || !row7_second_player_took_all || !row8_second_player_took_all) {
                                second_player_took_all = false;
                            }

                            if (!row1_third_player_took_all || !row2_third_player_took_all || !row3_third_player_took_all || !row4_third_player_took_all || !row5_third_player_took_all || !row6_third_player_took_all || !row7_third_player_took_all || !row8_third_player_took_all) {
                                third_player_took_all = false;
                            }

                            if (!row1_fourth_player_took_all || !row2_fourth_player_took_all || !row3_fourth_player_took_all || !row4_fourth_player_took_all || !row5_fourth_player_took_all || !row6_fourth_player_took_all || !row7_fourth_player_took_all || !row8_fourth_player_took_all) {
                                fourth_player_took_all = false;
                            }


                            if (first_player_took_all || second_player_took_all || third_player_took_all || fourth_player_took_all) {


                                //  DAWERA
                                if (first_player_took_all) {

                                    premiebis_raodenoba++;

                                    first_player_taken_sum += first_player_max_value;
                                    if (couple_switch.equals("true")) {
                                        first_couple_taken_sum += first_player_max_value;

                                        if (i == 63) {
                                            sum1.setText(df.format(first_couple_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[61].getText().toString()) + first_player_max_value;
                                            textViews1[61].setText(df.format(premiis_danamati));
                                        } else if (i == 95) {
                                            sum5.setText(df.format(first_couple_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[93].getText().toString()) + first_player_max_value;
                                            textViews1[93].setText(df.format(premiis_danamati));
                                        } else if (i == 159) {
                                            sum9.setText(df.format(first_couple_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[157].getText().toString()) + first_player_max_value;
                                            textViews1[157].setText(df.format(premiis_danamati));
                                        } else {
                                            sum13.setText(df.format(first_couple_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[189].getText().toString()) + first_player_max_value;
                                            textViews1[189].setText(df.format(premiis_danamati));
                                        }

                                    } else {

                                        if (i == 63) {
                                            sum1.setText(df.format(first_player_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[61].getText().toString()) + first_player_max_value;
                                            textViews1[61].setText(df.format(premiis_danamati));
                                        } else if (i == 95) {
                                            sum5.setText(df.format(first_player_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[93].getText().toString()) + first_player_max_value;
                                            textViews1[93].setText(df.format(premiis_danamati));
                                        } else if (i == 159) {
                                            sum9.setText(df.format(first_player_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[157].getText().toString()) + first_player_max_value;
                                            textViews1[157].setText(df.format(premiis_danamati));
                                        } else {
                                            sum13.setText(df.format(first_player_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[189].getText().toString()) + first_player_max_value;
                                            textViews1[189].setText(df.format(premiis_danamati));
                                        }

                                    }


                                }
                                if (second_player_took_all) {

                                    premiebis_raodenoba++;

                                    second_player_taken_sum += second_player_max_value;

                                    if (couple_switch.equals("true")) {

                                        second_couple_taken_sum += second_player_max_value;


                                        if (i == 63) {
                                            sum2.setText(df.format(second_couple_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[62].getText().toString()) + second_player_max_value;
                                            textViews1[62].setText(df.format(premiis_danamati));
                                        } else if (i == 95) {
                                            sum6.setText(df.format(second_couple_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[94].getText().toString()) + second_player_max_value;
                                            textViews1[94].setText(df.format(premiis_danamati));
                                        } else if (i == 159) {
                                            sum10.setText(df.format(second_couple_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[158].getText().toString()) + second_player_max_value;
                                            textViews1[158].setText(df.format(premiis_danamati));
                                        } else {
                                            sum14.setText(df.format(second_couple_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[190].getText().toString()) + second_player_max_value;
                                            textViews1[190].setText(df.format(premiis_danamati));
                                        }


                                    } else {

                                        if (i == 63) {
                                            sum2.setText(df.format(second_player_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[62].getText().toString()) + second_player_max_value;
                                            textViews1[62].setText(df.format(premiis_danamati));
                                        } else if (i == 95) {
                                            sum6.setText(df.format(second_player_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[94].getText().toString()) + second_player_max_value;
                                            textViews1[94].setText(df.format(premiis_danamati));
                                        } else if (i == 159) {
                                            sum10.setText(df.format(second_player_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[158].getText().toString()) + second_player_max_value;
                                            textViews1[158].setText(df.format(premiis_danamati));
                                        } else {
                                            sum14.setText(df.format(second_player_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[190].getText().toString()) + second_player_max_value;
                                            textViews1[190].setText(df.format(premiis_danamati));
                                        }


                                    }
                                }
                            }
                            if (third_player_took_all) {

                                premiebis_raodenoba++;

                                third_player_taken_sum += third_player_max_value;

                                if (couple_switch.equals("true")) {
                                    first_couple_taken_sum += third_player_max_value;

                                    if (i == 63) {
                                        sum1.setText(df.format(first_couple_taken_sum / 100));
                                        premiis_danamati = Double.parseDouble(textViews1[63].getText().toString()) + third_player_max_value;
                                        textViews1[63].setText(df.format(premiis_danamati));
                                    } else if (i == 95) {
                                        sum5.setText(df.format(first_couple_taken_sum / 100));
                                        premiis_danamati = Double.parseDouble(textViews1[95].getText().toString()) + third_player_max_value;
                                        textViews1[95].setText(df.format(premiis_danamati));
                                    } else if (i == 159) {
                                        sum9.setText(df.format(first_couple_taken_sum / 100));
                                        premiis_danamati = Double.parseDouble(textViews1[159].getText().toString()) + third_player_max_value;
                                        textViews1[159].setText(df.format(premiis_danamati));
                                    } else {
                                        sum13.setText(df.format(first_couple_taken_sum / 100));
                                        premiis_danamati = Double.parseDouble(textViews1[191].getText().toString()) + third_player_max_value;
                                        textViews1[191].setText(df.format(premiis_danamati));
                                    }

                                } else {

                                    if (i == 63) {
                                        premiis_danamati = Double.parseDouble(textViews1[63].getText().toString()) + third_player_max_value;
                                        textViews1[63].setText(df.format(premiis_danamati));
                                        sum3.setText(df.format(third_player_taken_sum / 100));
                                    } else if (i == 95) {
                                        premiis_danamati = Double.parseDouble(textViews1[95].getText().toString()) + third_player_max_value;
                                        textViews1[95].setText(df.format(premiis_danamati));
                                        sum7.setText(df.format(third_player_taken_sum / 100));
                                    } else if (i == 159) {
                                        premiis_danamati = Double.parseDouble(textViews1[159].getText().toString()) + third_player_max_value;
                                        textViews1[159].setText(df.format(premiis_danamati));
                                        sum11.setText(df.format(third_player_taken_sum / 100));
                                    } else {
                                        premiis_danamati = Double.parseDouble(textViews1[191].getText().toString()) + third_player_max_value;
                                        textViews1[191].setText(df.format(premiis_danamati));
                                        sum15.setText(df.format(third_player_taken_sum / 100));
                                    }
                                }

                            }
                            if (fourth_player_took_all) {

                                premiebis_raodenoba++;

                                fourth_palyer_taken_sum += fourth_player_max_value;

                                if (couple_switch.equals("true")) {

                                    second_couple_taken_sum += fourth_player_max_value;

                                    if (i == 63) {
                                        sum2.setText(df.format(second_couple_taken_sum / 100));
                                        premiis_danamati = Double.parseDouble(textViews1[60].getText().toString()) + fourth_player_max_value;
                                        textViews1[60].setText(df.format(premiis_danamati));
                                    } else if (i == 95) {
                                        premiis_danamati = Double.parseDouble(textViews1[92].getText().toString()) + fourth_player_max_value;
                                        textViews1[92].setText(df.format(premiis_danamati));
                                        sum6.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i == 159) {
                                        sum10.setText(df.format(second_couple_taken_sum / 100));
                                        premiis_danamati = Double.parseDouble(textViews1[156].getText().toString()) + fourth_player_max_value;
                                        textViews1[156].setText(df.format(premiis_danamati));
                                    } else {
                                        premiis_danamati = Double.parseDouble(textViews1[188].getText().toString()) + fourth_player_max_value;
                                        textViews1[188].setText(df.format(premiis_danamati));
                                        sum14.setText(df.format(second_couple_taken_sum / 100));
                                    }

                                } else {


                                    if (i == 63) {
                                        premiis_danamati = Double.parseDouble(textViews1[60].getText().toString()) + fourth_player_max_value;
                                        textViews1[60].setText(df.format(premiis_danamati));
                                        sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else if (i == 95) {
                                        premiis_danamati = Double.parseDouble(textViews1[92].getText().toString()) + fourth_player_max_value;
                                        textViews1[92].setText(df.format(premiis_danamati));
                                        sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else if (i == 159) {
                                        premiis_danamati = Double.parseDouble(textViews1[156].getText().toString()) + fourth_player_max_value;
                                        textViews1[156].setText(df.format(premiis_danamati));
                                        sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else {
                                        premiis_danamati = Double.parseDouble(textViews1[188].getText().toString()) + fourth_player_max_value;
                                        textViews1[188].setText(df.format(premiis_danamati));
                                        sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                    }
                                }
                            }

                            // WASHLA

                            // თუ პრემიაზე 1 გავიდა
                            if (premiebis_raodenoba == 1) {

                                if (!first_player_took_all) {


                                    first_player_taken_sum -= first_player_max_value;

                                    if (couple_switch.equals("true")) {
                                        if (!third_player_took_all) {
                                            textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

                                            first_couple_taken_sum -= first_player_max_value;

                                            if (i == 63) {
                                                sum1.setText(df.format(first_couple_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum5.setText(df.format(first_couple_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum9.setText(df.format(first_couple_taken_sum / 100));
                                            } else {
                                                sum13.setText(df.format(first_couple_taken_sum / 100));
                                            }

                                        }


                                    } else {

                                        textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

                                        if (i == 63) {
                                            sum1.setText(df.format(first_player_taken_sum / 100));
                                        } else if (i == 95) {
                                            sum5.setText(df.format(first_player_taken_sum / 100));
                                        } else if (i == 159) {
                                            sum9.setText(df.format(first_player_taken_sum / 100));
                                        } else {
                                            sum13.setText(df.format(first_player_taken_sum / 100));
                                        }
                                    }

                                }

                                if (!second_player_took_all) {

                                    second_player_taken_sum -= second_player_max_value;

                                    if (couple_switch.equals("true")) {

                                        if (!fourth_player_took_all) {
                                            textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                            second_couple_taken_sum -= second_player_max_value;

                                            if (i == 63) {
                                                sum2.setText(df.format(second_couple_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum6.setText(df.format(second_couple_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum10.setText(df.format(second_couple_taken_sum / 100));
                                            } else {
                                                sum14.setText(df.format(second_couple_taken_sum / 100));
                                            }


                                        }
                                    } else {

                                        textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);


                                        if (i == 63) {
                                            sum2.setText(df.format(second_player_taken_sum / 100));
                                        } else if (i == 95) {
                                            sum6.setText(df.format(second_player_taken_sum / 100));
                                        } else if (i == 159) {
                                            sum10.setText(df.format(second_player_taken_sum / 100));
                                        } else {
                                            sum14.setText(df.format(second_player_taken_sum / 100));
                                        }

                                    }

                                }

                                if (!third_player_took_all) {


                                    third_player_taken_sum -= third_player_max_value;

                                    if (couple_switch.equals("true")) {
                                        if (!first_player_took_all) {
                                            textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                            first_couple_taken_sum -= third_player_max_value;

                                            if (i == 63) {
                                                sum1.setText(df.format(first_couple_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum5.setText(df.format(first_couple_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum9.setText(df.format(first_couple_taken_sum / 100));
                                            } else {
                                                sum13.setText(df.format(first_couple_taken_sum / 100));
                                            }
                                        }

                                    } else {

                                        textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);


                                        if (i == 63) {
                                            sum3.setText(df.format(third_player_taken_sum / 100));
                                        } else if (i == 95) {
                                            sum7.setText(df.format(third_player_taken_sum / 100));
                                        } else if (i == 159) {
                                            sum11.setText(df.format(third_player_taken_sum / 100));
                                        } else {
                                            sum15.setText(df.format(third_player_taken_sum / 100));
                                        }

                                    }

                                }

                                if (!fourth_player_took_all) {


                                    fourth_palyer_taken_sum -= fourth_player_max_value;

                                    if (couple_switch.equals("true")) {
                                        if (!second_player_took_all) {
                                            textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[fourth_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                            second_couple_taken_sum -= fourth_player_max_value;

                                            if (i == 63) {
                                                sum2.setText(df.format(second_couple_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum6.setText(df.format(second_couple_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum10.setText(df.format(second_couple_taken_sum / 100));
                                            } else {
                                                sum14.setText(df.format(second_couple_taken_sum / 100));
                                            }

                                        }

                                    } else {

                                        textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[fourth_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

                                        if (i == 63) {
                                            sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                        } else if (i == 95) {
                                            sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                        } else if (i == 159) {
                                            sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                        } else {
                                            sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                        }
                                    }

                                }
                            }


                            // თუ პრემიაზე 2 ან 3გავიდა

                            if (premiebis_raodenoba > 1) {


                                if (couple_switch.equals("true")) {
                                    if (first_player_took_all & third_player_took_all & !second_player_took_all & !fourth_player_took_all) {


                                        if (!second_player_took_all) {
                                            textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                            second_player_taken_sum -= second_player_max_value;


                                            second_couple_taken_sum -= second_player_max_value;

                                            if (i == 63) {
                                                sum2.setText(df.format(second_couple_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum6.setText(df.format(second_couple_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum10.setText(df.format(second_couple_taken_sum / 100));
                                            } else {
                                                sum14.setText(df.format(second_couple_taken_sum / 100));
                                            }


                                        }


                                        if (!fourth_player_took_all) {

                                            textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[fourth_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                            fourth_palyer_taken_sum -= fourth_player_max_value;


                                            second_couple_taken_sum -= fourth_player_max_value;

                                            if (i == 63) {
                                                sum2.setText(df.format(second_couple_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum6.setText(df.format(second_couple_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum10.setText(df.format(second_couple_taken_sum / 100));
                                            } else {
                                                sum14.setText(df.format(second_couple_taken_sum / 100));
                                            }

                                        }


                                    } else if (second_player_took_all && fourth_player_took_all & !first_player_took_all & !third_player_took_all) {
                                        if (!first_player_took_all) {

                                            textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                            first_player_taken_sum -= first_player_max_value;


                                            first_couple_taken_sum -= first_player_max_value;

                                            if (i == 63) {
                                                sum1.setText(df.format(first_couple_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum5.setText(df.format(first_couple_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum9.setText(df.format(first_couple_taken_sum / 100));
                                            } else {
                                                sum13.setText(df.format(first_couple_taken_sum / 100));
                                            }

                                        }


                                        if (!third_player_took_all) {

                                            textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                            third_player_taken_sum -= third_player_max_value;

                                            first_couple_taken_sum -= third_player_max_value;

                                            if (i == 63) {
                                                sum1.setText(df.format(first_couple_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum5.setText(df.format(first_couple_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum9.setText(df.format(first_couple_taken_sum / 100));
                                            } else {
                                                sum13.setText(df.format(first_couple_taken_sum / 100));
                                            }
                                        }


                                    }
                                }

                                if (remove_last_switch.equals("true") && !couple_switch.equals("true")) {
                                    if (!first_player_took_all) {

                                        textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                        first_player_taken_sum -= first_player_max_value;

                                        if (i == 63) {
                                            sum1.setText(df.format(first_player_taken_sum / 100));
                                        } else if (i == 95) {
                                            sum5.setText(df.format(first_player_taken_sum / 100));
                                        } else if (i == 159) {
                                            sum9.setText(df.format(first_player_taken_sum / 100));
                                        } else {
                                            sum13.setText(df.format(first_player_taken_sum / 100));
                                        }

                                    }

                                    if (!second_player_took_all) {
                                        textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                        second_player_taken_sum -= second_player_max_value;

                                        if (i == 63) {
                                            sum2.setText(df.format(second_player_taken_sum / 100));
                                        } else if (i == 95) {
                                            sum6.setText(df.format(second_player_taken_sum / 100));
                                        } else if (i == 159) {
                                            sum10.setText(df.format(second_player_taken_sum / 100));
                                        } else {
                                            sum14.setText(df.format(second_player_taken_sum / 100));
                                        }

                                    }

                                    if (!third_player_took_all) {

                                        textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                        third_player_taken_sum -= third_player_max_value;

                                        if (i == 63) {
                                            sum3.setText(df.format(third_player_taken_sum / 100));
                                        } else if (i == 95) {
                                            sum7.setText(df.format(third_player_taken_sum / 100));
                                        } else if (i == 159) {
                                            sum11.setText(df.format(third_player_taken_sum / 100));
                                        } else {
                                            sum15.setText(df.format(third_player_taken_sum / 100));
                                        }


                                    }

                                    if (!fourth_player_took_all) {

                                        textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[fourth_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                        fourth_palyer_taken_sum -= fourth_player_max_value;

                                        if (i == 63) {
                                            sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                        } else if (i == 95) {
                                            sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                        } else if (i == 159) {
                                            sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                        } else {
                                            sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                        }

                                    }

                                }

                            }

                        }


                        switch (row % 4) {

                            case 1:
                                info_textview.setText(getString(R.string.arigebs) + " " + names_textview_array[0].getText().toString());
                                break;
                            case 2:
                                info_textview.setText(getString(R.string.arigebs) + " " + names_textview_array[1].getText().toString());
                                break;
                            case 3:
                                info_textview.setText(getString(R.string.arigebs) + " " + names_textview_array[2].getText().toString());
                                break;
                            case 0:
                                info_textview.setText(getString(R.string.arigebs) + " " + names_textview_array[3].getText().toString());
                                break;
                        }


                        if (row % 8 == 1) {
                            if (i > 95 && i < 160) {

                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(true);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                            } else {
                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);

                            }
                        } else if (row % 8 == 2) {
                            if (i > 95 && i < 160) {

                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                            } else {
                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(true);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);


                            }
                        } else if (row % 8 == 3) {
                            if (i > 95 && i < 160) {
                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(false);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                            } else {
                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(true);
                                button_4.setEnabled(true);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);

                            }
                        } else if (row % 8 == 4) {
                            if (i > 95 && i < 160) {

                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(true);
                                button_4.setEnabled(true);
                                button_5.setEnabled(true);
                                button_6.setEnabled(true);
                                button_7.setEnabled(true);
                                button_8.setEnabled(true);
                                button_9.setEnabled(true);

                            } else {
                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(true);
                                button_4.setEnabled(true);
                                button_5.setEnabled(true);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);


                            }
                        } else if (row % 8 == 5) {
                            if (i > 95 && i < 160) {

                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(true);
                                button_4.setEnabled(true);
                                button_5.setEnabled(true);
                                button_6.setEnabled(true);
                                button_7.setEnabled(true);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);

                            } else {
                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(true);
                                button_4.setEnabled(true);
                                button_5.setEnabled(true);
                                button_6.setEnabled(true);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);


                            }
                        } else if (row % 8 == 6) {
                            if (i > 95 && i < 160) {

                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(true);
                                button_4.setEnabled(true);
                                button_5.setEnabled(true);
                                button_6.setEnabled(true);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);

                            } else {
                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(true);
                                button_4.setEnabled(true);
                                button_5.setEnabled(true);
                                button_6.setEnabled(true);
                                button_7.setEnabled(true);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                            }
                        } else if (row % 8 == 7) {
                            if (i > 95 && i < 160) {

                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(true);
                                button_4.setEnabled(true);
                                button_5.setEnabled(true);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                            } else {
                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(true);
                                button_4.setEnabled(true);
                                button_5.setEnabled(true);
                                button_6.setEnabled(true);
                                button_7.setEnabled(true);
                                button_8.setEnabled(true);
                                button_9.setEnabled(false);
                            }
                        } else {

                            if (i > 95 && i < 160) {

                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(true);
                                button_4.setEnabled(true);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                            } else {

                                button_pass.setEnabled(true);
                                button_1.setEnabled(true);
                                button_2.setEnabled(true);
                                button_3.setEnabled(true);
                                button_4.setEnabled(true);
                                button_5.setEnabled(true);
                                button_6.setEnabled(true);
                                button_7.setEnabled(true);
                                button_8.setEnabled(true);
                                button_9.setEnabled(true);
                            }
                        }

                        taken_sum = 0;
                        j += 1;
                        i++;

                        break;
                    } else {
                        taken_sum -= button_number;
                    }


                }

        }

    }


    public void on_button_click(TextView[] textViews1, TextView info_textview, final String couple_switch, final String remove_last_switch, int button_number, String waigo, String ver_waigo, TextView[] names_textview_array) {


        if ((i >= 0 && i < 64) || (i > 95 && i < 160)) {

            String tavisi_waigo = "";
            String tavisi_ver_waigo = "";

            switch (button_number) {
                case 2:

                    tavisi_waigo = getResources().getString(R.string.hundred50);
                    tavisi_ver_waigo = getResources().getString(R.string.twenty);
                    break;
                case 3:
                    tavisi_waigo = getResources().getString(R.string.twohundred);
                    tavisi_ver_waigo = getResources().getString(R.string.thirty);
                    break;

                case 4:
                    tavisi_waigo = getResources().getString(R.string.twohundred50);
                    tavisi_ver_waigo = getResources().getString(R.string.fourty);
                    break;
                case 5:
                    tavisi_waigo = getResources().getString(R.string.threehundred);
                    tavisi_ver_waigo = getResources().getString(R.string.fifty);
                    break;
                case 6:
                    tavisi_waigo = getResources().getString(R.string.threehundred50);
                    tavisi_ver_waigo = getResources().getString(R.string.sixty);
                    break;
                case 7:
                    tavisi_waigo = getResources().getString(R.string.fourhundred);
                    tavisi_ver_waigo = getResources().getString(R.string.seventy);
                    break;
                case 8:
                    tavisi_waigo = getResources().getString(R.string.fourhundred50);
                    tavisi_ver_waigo = getResources().getString(R.string.eighty);
                    break;
                case 9:
                    tavisi_waigo = getResources().getString(R.string.ninehundred);
                    tavisi_ver_waigo = getResources().getString(R.string.ninety);
                    break;
                case 0:
                    tavisi_waigo = getResources().getString(R.string.fifty);
                    tavisi_ver_waigo = ("-" + xisht);
                    break;
                case 1:
                    tavisi_waigo = getResources().getString(R.string.onehundred);
                    tavisi_ver_waigo = getResources().getString(R.string.ten);
                    break;

                case -1:
                    tavisi_waigo = "";
                    tavisi_ver_waigo = "";
                    break;

            }

            on_button_click_2(textViews1, info_textview, couple_switch, remove_last_switch, button_number, tavisi_waigo, tavisi_ver_waigo, names_textview_array);

        } else {

            if (i == 65 || i == 97 || i == 161) {

                first_player_max_value = 0;
                second_player_max_value = 0;
                third_player_max_value = 0;
                fourth_player_max_value = 0;


                first_player_took_all = true;
                second_player_took_all = true;
                third_player_took_all = true;
                fourth_player_took_all = true;

                row1_first_player_took_all = true;
                row1_second_player_took_all = true;
                row1_third_player_took_all = true;
                row1_fourth_player_took_all = true;

                row2_first_player_took_all = true;
                row2_second_player_took_all = true;
                row2_third_player_took_all = true;
                row2_fourth_player_took_all = true;

                row3_first_player_took_all = true;
                row3_second_player_took_all = true;
                row3_third_player_took_all = true;
                row3_fourth_player_took_all = true;

                row4_first_player_took_all = true;
                row4_second_player_took_all = true;
                row4_third_player_took_all = true;
                row4_fourth_player_took_all = true;

                row5_first_player_took_all = true;
                row5_second_player_took_all = true;
                row5_third_player_took_all = true;
                row5_fourth_player_took_all = true;

                row6_first_player_took_all = true;
                row6_second_player_took_all = true;
                row6_third_player_took_all = true;
                row6_fourth_player_took_all = true;

                row7_first_player_took_all = true;
                row7_second_player_took_all = true;
                row7_third_player_took_all = true;
                row7_fourth_player_took_all = true;

                row8_first_player_took_all = true;
                row8_second_player_took_all = true;
                row8_third_player_took_all = true;
                row8_fourth_player_took_all = true;

                premiebis_raodenoba = 0;

            }


            switch (i % 8) {
                case 0:


                    if (button_number == -1) {


                        enable_delete = false;


                        textViews1[i].setText("");
                        info_textview.setText("");
                        sum = 0;

                        if (row % 4 == 1) {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 3) {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        }

                        if (i >= 8) {
                            if (textViews1[i - 8].getText().toString().equals("-")) {
                                first_player_written_quantity = 0;
                            } else {
                                first_player_written_quantity = Integer.parseInt(textViews1[i - 8].getText().toString());
                            }
                        }

                        row--;


                    } else {


                        enable_delete = true;


                        row++;

                        if (row % 4 == 0) {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 1) {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        }


                        first_player_written_quantity = button_number;

                        sum = button_number;
                        if (button_number == 0) {
                            textViews1[i].setText(getResources().getString(R.string.pass));
                        } else {
                            textViews1[i].setText("" + button_number);
                        }
                        shetenva_waglejva_shevseba = 9 - sum;
                        if (shetenva_waglejva_shevseba == 0) {
                            info_textview.setText(getResources().getString(R.string.shevsebulia));
                        } else {
                            info_textview.setText(getResources().getString(R.string.shevseba) + " " + shetenva_waglejva_shevseba);
                        }
                        i++;
                    }
                    break;

                case 1:


                    if (button_number == -1) {

                        if (i >= 8) {
                            if (textViews1[i - 8].getText().toString().equals("-")) {
                                second_player_written_quantity = 0;
                            } else {
                                second_player_written_quantity = Integer.parseInt(textViews1[i - 8].getText().toString());
                            }
                        }

                        if (row % 4 == 1) {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 3) {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        }


                        if (!textViews1[i].getText().toString().equals("-")) {
                            sum -= Integer.parseInt(textViews1[i].getText().toString());
                        }
                        shetenva_waglejva_shevseba = 9 - sum;
                        if (shetenva_waglejva_shevseba < 0) {
                            info_textview.setText(getResources().getString(R.string.waglejva));
                        } else if (shetenva_waglejva_shevseba == 0) {
                            info_textview.setText(getResources().getString(R.string.shevsebulia));
                        } else {
                            info_textview.setText(getResources().getString(R.string.shevseba) + " " + shetenva_waglejva_shevseba);
                        }
                        textViews1[i].setText("");

                    } else {


                        if (row % 4 == 0) {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 1) {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        }

                        second_player_written_quantity = button_number;
                        sum += button_number;
                        if (button_number == 0) {
                            textViews1[i].setText(getResources().getString(R.string.pass));
                        } else {
                            textViews1[i].setText("" + button_number);
                        }
                        shetenva_waglejva_shevseba = 9 - sum;
                        if (shetenva_waglejva_shevseba < 0) {
                            info_textview.setText(getResources().getString(R.string.waglejva));
                        } else if (shetenva_waglejva_shevseba == 0) {
                            info_textview.setText(getResources().getString(R.string.shevsebulia));
                        } else {
                            info_textview.setText(getResources().getString(R.string.shevseba) + " " + shetenva_waglejva_shevseba);
                        }
                        i++;

                    }
                    break;

                case 2:
                    if (button_number == -1) {

                        switch (sum) {
                            case 9:
                                button_pass.setEnabled(true);
                                break;
                            case 8:
                                button_1.setEnabled(true);
                                break;
                            case 7:
                                button_2.setEnabled(true);
                                break;
                            case 6:
                                button_3.setEnabled(true);
                                break;
                            case 5:
                                button_4.setEnabled(true);
                                break;
                            case 4:
                                button_5.setEnabled(true);
                                break;
                            case 3:
                                button_6.setEnabled(true);
                                break;
                            case 2:
                                button_7.setEnabled(true);
                                break;
                            case 1:
                                button_8.setEnabled(true);
                                break;
                            case 0:
                                button_9.setEnabled(true);
                                break;

                        }

                        if (row % 4 == 1) {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 3) {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        }

                        if (i >= 8) {
                            if (textViews1[i - 8].getText().toString().equals("-")) {
                                third_player_written_quantity = 0;
                            } else {
                                third_player_written_quantity = Integer.parseInt(textViews1[i - 8].getText().toString());
                            }
                        }


                        if (!textViews1[i].getText().toString().equals("-")) {
                            sum -= Integer.parseInt(textViews1[i].getText().toString());
                        }
                        shetenva_waglejva_shevseba = 9 - sum;
                        if (shetenva_waglejva_shevseba < 0) {
                            info_textview.setText(getResources().getString(R.string.waglejva));
                        } else if (shetenva_waglejva_shevseba == 0) {
                            info_textview.setText(getResources().getString(R.string.shevsebulia));
                        } else {
                            info_textview.setText(getResources().getString(R.string.shevseba) + " " + shetenva_waglejva_shevseba);
                        }
                        textViews1[i].setText("");


                    } else {


                        if (row % 4 == 0) {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 1) {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        }

                        third_player_written_quantity = button_number;
                        sum += button_number;
                        if (button_number == 0) {
                            textViews1[i].setText(getResources().getString(R.string.pass));
                        } else {
                            textViews1[i].setText("" + button_number);
                        }
                        shetenva_waglejva_shevseba = 9 - sum;
                        if (shetenva_waglejva_shevseba < 0) {
                            info_textview.setText(getResources().getString(R.string.waglejva));
                        } else if (shetenva_waglejva_shevseba == 0) {
                            info_textview.setText(getResources().getString(R.string.passgarda));
                        } else {
                            info_textview.setText(shetenva_waglejva_shevseba + "-" + getResources().getString(R.string.garda));
                        }
                        i++;


                        switch (sum) {
                            case 9:
                                button_pass.setEnabled(false);
                                break;
                            case 8:
                                button_1.setEnabled(false);
                                break;
                            case 7:
                                button_2.setEnabled(false);
                                break;
                            case 6:
                                button_3.setEnabled(false);
                                break;
                            case 5:
                                button_4.setEnabled(false);
                                break;
                            case 4:
                                button_5.setEnabled(false);
                                break;
                            case 3:
                                button_6.setEnabled(false);
                                break;
                            case 2:
                                button_7.setEnabled(false);
                                break;
                            case 1:
                                button_8.setEnabled(false);
                                break;
                            case 0:
                                button_9.setEnabled(false);
                                break;

                        }


                    }

                    break;

                case 3:


                    switch (sum) {
                        case 9:
                            button_pass.setEnabled(true);
                            break;
                        case 8:
                            button_1.setEnabled(true);
                            break;
                        case 7:
                            button_2.setEnabled(true);
                            break;
                        case 6:
                            button_3.setEnabled(true);
                            break;
                        case 5:
                            button_4.setEnabled(true);
                            break;
                        case 4:
                            button_5.setEnabled(true);
                            break;
                        case 3:
                            button_6.setEnabled(true);
                            break;
                        case 2:
                            button_7.setEnabled(true);
                            break;
                        case 1:
                            button_8.setEnabled(true);
                            break;
                        case 0:
                            button_9.setEnabled(true);
                            break;

                    }
                    if (button_number == -1) {

                        if (i >= 8) {
                            if (textViews1[i - 8].getText().toString().equals("-")) {
                                fourth_player_written_quantity = 0;
                            } else {
                                fourth_player_written_quantity = Integer.parseInt(textViews1[i - 8].getText().toString());
                            }
                        }

                        if (row % 4 == 1) {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 3) {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        }

                        if (!textViews1[i].getText().toString().equals("-")) {
                            sum -= Integer.parseInt(textViews1[i].getText().toString());
                        }
                        shetenva_waglejva_shevseba = 9 - sum;
                        if (shetenva_waglejva_shevseba < 0) {
                            info_textview.setText(getResources().getString(R.string.waglejva));
                        } else if (shetenva_waglejva_shevseba == 0) {
                            info_textview.setText(getResources().getString(R.string.passgarda));
                        } else {
                            info_textview.setText(shetenva_waglejva_shevseba + "-" + getResources().getString(R.string.garda));
                        }
                        textViews1[i].setText("");

                        switch (sum) {
                            case 9:
                                button_pass.setEnabled(false);
                                break;
                            case 8:
                                button_1.setEnabled(false);
                                break;
                            case 7:
                                button_2.setEnabled(false);
                                break;
                            case 6:
                                button_3.setEnabled(false);
                                break;
                            case 5:
                                button_4.setEnabled(false);
                                break;
                            case 4:
                                button_5.setEnabled(false);
                                break;
                            case 3:
                                button_6.setEnabled(false);
                                break;
                            case 2:
                                button_7.setEnabled(false);
                                break;
                            case 1:
                                button_8.setEnabled(false);
                                break;
                            case 0:
                                button_9.setEnabled(false);
                                break;

                        }

                    } else {


                        if (row % 4 == 0) {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 1) {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        }

                        fourth_player_written_quantity = button_number;
                        sum += button_number;
                        if (button_number == 0) {
                            textViews1[i].setText(getResources().getString(R.string.pass));
                        } else {
                            textViews1[i].setText("" + button_number);
                        }
                        shetenva_waglejva_shevseba = 9 - sum;
                        if (shetenva_waglejva_shevseba < 0) {
                            info_textview.setText(getResources().getString(R.string.waglejva) + " " + shetenva_waglejva_shevseba * -1);
                        } else {
                            info_textview.setText(getResources().getString(R.string.shetenva) + " " + shetenva_waglejva_shevseba);
                        }

                        i++;

                    }
                    break;

                case 4:

                    //case 4

                    //delete
                    if (button_number == -1) {

                        if (row % 4 == 1) {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 3) {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        }


                        if (row % 4 == 1) {
                            if (j % 4 == 1) {
                                row1_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row1_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row1_third_player_took_all = true;
                            } else {
                                row1_fourth_player_took_all = true;
                            }

                        } else if (row % 4 == 2) {
                            if (j % 4 == 1) {
                                row2_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row2_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row2_third_player_took_all = true;
                            } else {
                                row2_fourth_player_took_all = true;
                            }

                        } else if (row % 4 == 3) {
                            if (j % 4 == 1) {
                                row3_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row3_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row3_third_player_took_all = true;
                            } else {
                                row3_fourth_player_took_all = true;
                            }

                        } else {
                            if (j % 4 == 1) {
                                row4_first_player_took_all = true;
                            } else if (j % 4 == 2) {
                                row4_second_player_took_all = true;
                            } else if (j % 4 == 3) {
                                row4_third_player_took_all = true;
                            } else {
                                row4_fourth_player_took_all = true;
                            }

                        }


                        if (j % 4 == 1) {
                            //წაღებული ქულების ჯამი
                            first_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების ჯამის გამოტანა

                            if (couple_switch.equals("true")) {

                                first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_player_taken_sum / 100));
                                }
                            }
                        } else if (j % 4 == 2) {
                            //წაღებული ქულების ჯამი
                            second_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_player_taken_sum / 100));
                                }
                            }

                        } else if (j % 4 == 3) {
                            // წაღებული ქულების ჯამი
                            third_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა


                            if (couple_switch.equals("true")) {
                                first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }

                            } else {
                                if (i > 0 && i < 64) {
                                    sum3.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum7.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum11.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum15.setText(df.format(third_player_taken_sum / 100));
                                }
                            }


                        } else {
                            //წაღებული ქულების ჯამი
                            fourth_palyer_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 160) {
                                    sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                }
                            }
                        }


                        button_pass.setEnabled(true);
                        button_1.setEnabled(true);
                        button_2.setEnabled(true);
                        button_3.setEnabled(true);
                        button_4.setEnabled(true);
                        button_5.setEnabled(true);
                        button_6.setEnabled(true);
                        button_7.setEnabled(true);
                        button_8.setEnabled(true);
                        button_9.setEnabled(true);

                        textViews1[i].setText("");

                        j--;
                        taken_sum = 0;

// finish delete
                    } else {


                        if (row % 4 == 0) {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 1) {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        }


                        taken_sum += button_number;
                        j++;
                        //თუ წაიღო რაც ეწერა
                        if (button_number == first_player_written_quantity) {
                            textViews1[i].setText(waigo);

                        } else {
                            textViews1[i].setText(ver_waigo);

                            if (row % 4 == 1) {
                                if (j % 4 == 1) {
                                    row1_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row1_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row1_third_player_took_all = false;
                                } else {
                                    row1_fourth_player_took_all = false;
                                }

                            } else if (row % 4 == 2) {
                                if (j % 4 == 1) {
                                    row2_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row2_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row2_third_player_took_all = false;
                                } else {
                                    row2_fourth_player_took_all = false;
                                }

                            } else if (row % 4 == 3) {
                                if (j % 4 == 1) {
                                    row3_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row3_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row3_third_player_took_all = false;
                                } else {
                                    row3_fourth_player_took_all = false;
                                }

                            } else {
                                if (j % 4 == 1) {
                                    row4_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row4_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row4_third_player_took_all = false;
                                } else {
                                    row4_fourth_player_took_all = false;
                                }

                            }


                        }


                        if (j % 4 == 1) {
                            //წაღებული ქულების ჯამი
                            first_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების ჯამის გამოტანა

                            if (couple_switch.equals("true")) {

                                first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_player_taken_sum / 100));
                                }
                            }

                        } else if (j % 4 == 2) {
                            //წაღებული ქულების ჯამი
                            second_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());


                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_player_taken_sum / 100));
                                }


                            }
                        } else if (j % 4 == 3) {
                            // წაღებული ქულების ჯამი
                            third_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა


                            if (couple_switch.equals("true")) {
                                first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }


                            } else {
                                if (i > 0 && i < 64) {
                                    sum3.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum7.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum11.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum15.setText(df.format(third_player_taken_sum / 100));
                                }

                            }

                        } else {
                            //წაღებული ქულების ჯამი
                            fourth_palyer_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }


                            } else {

                                if (i > 0 && i < 64) {
                                    sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 160) {
                                    sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                }

                            }

                        }

                        switch (taken_sum) {
                            case 9:
                                button_1.setEnabled(false);
                                button_2.setEnabled(false);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 8:
                                button_2.setEnabled(false);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 7:
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 6:
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 5:
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 4:
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 3:
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 2:
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 1:
                                button_9.setEnabled(false);
                                break;
                        }

                        i++;
                    }
                    break;
// 5
                case 5:


//delete
                    if (button_number == -1) {

                        if (row % 4 == 1) {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 3) {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        }


                        for (int x = 0; x < 2; x++) {

                            if (row % 4 == 1) {
                                if (j % 4 == 1) {
                                    row1_first_player_took_all = true;
                                } else if (j % 4 == 2) {
                                    row1_second_player_took_all = true;
                                } else if (j % 4 == 3) {
                                    row1_third_player_took_all = true;
                                } else {
                                    row1_fourth_player_took_all = true;
                                }

                            } else if (row % 4 == 2) {
                                if (j % 4 == 1) {
                                    row2_first_player_took_all = true;
                                } else if (j % 4 == 2) {
                                    row2_second_player_took_all = true;
                                } else if (j % 4 == 3) {
                                    row2_third_player_took_all = true;
                                } else {
                                    row2_fourth_player_took_all = true;
                                }

                            } else if (row % 4 == 3) {
                                if (j % 4 == 1) {
                                    row3_first_player_took_all = true;
                                } else if (j % 4 == 2) {
                                    row3_second_player_took_all = true;
                                } else if (j % 4 == 3) {
                                    row3_third_player_took_all = true;
                                } else {
                                    row3_fourth_player_took_all = true;
                                }

                            } else {
                                if (j % 4 == 1) {
                                    row4_first_player_took_all = true;
                                } else if (j % 4 == 2) {
                                    row4_second_player_took_all = true;
                                } else if (j % 4 == 3) {
                                    row4_third_player_took_all = true;
                                } else {
                                    row4_fourth_player_took_all = true;
                                }

                            }


                            if (j % 4 == 1) {
                                //წაღებული ქულების ჯამი
                                first_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების ჯამის გამოტანა

                                if (couple_switch.equals("true")) {

                                    first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum1.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum5.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum9.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum13.setText(df.format(first_couple_taken_sum / 100));
                                    }

                                } else {

                                    if (i > 0 && i < 64) {
                                        sum1.setText(df.format(first_player_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum5.setText(df.format(first_player_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum9.setText(df.format(first_player_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum13.setText(df.format(first_player_taken_sum / 100));
                                    }
                                }
                            } else if (j % 4 == 2) {
                                //წაღებული ქულების ჯამი
                                second_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების  ჯამის გამოტანა

                                if (couple_switch.equals("true")) {
                                    second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum2.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum6.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum10.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum14.setText(df.format(second_couple_taken_sum / 100));
                                    }

                                } else {

                                    if (i > 0 && i < 64) {
                                        sum2.setText(df.format(second_player_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum6.setText(df.format(second_player_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum10.setText(df.format(second_player_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum14.setText(df.format(second_player_taken_sum / 100));
                                    }
                                }

                            } else if (j % 4 == 3) {
                                // წაღებული ქულების ჯამი
                                third_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების  ჯამის გამოტანა


                                if (couple_switch.equals("true")) {
                                    first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum1.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum5.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum9.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum13.setText(df.format(first_couple_taken_sum / 100));
                                    }

                                } else {
                                    if (i > 0 && i < 64) {
                                        sum3.setText(df.format(third_player_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum7.setText(df.format(third_player_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum11.setText(df.format(third_player_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum15.setText(df.format(third_player_taken_sum / 100));
                                    }
                                }


                            } else {
                                //წაღებული ქულების ჯამი
                                fourth_palyer_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების  ჯამის გამოტანა

                                if (couple_switch.equals("true")) {
                                    second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum2.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum6.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum10.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum14.setText(df.format(second_couple_taken_sum / 100));
                                    }

                                } else {

                                    if (i > 0 && i < 64) {
                                        sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                    }
                                }
                            }
                            textViews1[i].setText("");
                            i--;
                            j--;
                        }


                        button_pass.setEnabled(true);
                        button_1.setEnabled(true);
                        button_2.setEnabled(true);
                        button_3.setEnabled(true);
                        button_4.setEnabled(true);
                        button_5.setEnabled(true);
                        button_6.setEnabled(true);
                        button_7.setEnabled(true);
                        button_8.setEnabled(true);
                        button_9.setEnabled(true);


                        i++;
                        taken_sum = 0;

// finish delete
                    } else {


                        if (row % 4 == 0) {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 1) {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        }


                        taken_sum += button_number;
                        j++;
                        //თუ წაიღო რაც ეწერა
                        if (button_number == second_player_written_quantity) {
                            textViews1[i].setText(waigo);

                        } else {
                            textViews1[i].setText(ver_waigo);

                            if (row % 4 == 1) {
                                if (j % 4 == 1) {
                                    row1_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row1_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row1_third_player_took_all = false;
                                } else {
                                    row1_fourth_player_took_all = false;
                                }

                            } else if (row % 4 == 2) {
                                if (j % 4 == 1) {
                                    row2_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row2_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row2_third_player_took_all = false;
                                } else {
                                    row2_fourth_player_took_all = false;
                                }

                            } else if (row % 4 == 3) {
                                if (j % 4 == 1) {
                                    row3_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row3_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row3_third_player_took_all = false;
                                } else {
                                    row3_fourth_player_took_all = false;
                                }

                            } else {
                                if (j % 4 == 1) {
                                    row4_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row4_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row4_third_player_took_all = false;
                                } else {
                                    row4_fourth_player_took_all = false;
                                }

                            }
                        }


                        if (j % 4 == 1) {
                            //წაღებული ქულების ჯამი
                            first_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების ჯამის გამოტანა

                            if (couple_switch.equals("true")) {

                                first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_player_taken_sum / 100));
                                }
                            }

                        } else if (j % 4 == 2) {
                            //წაღებული ქულების ჯამი
                            second_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());


                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_player_taken_sum / 100));
                                }


                            }

                        } else if (j % 4 == 3) {
                            // წაღებული ქულების ჯამი
                            third_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა


                            if (couple_switch.equals("true")) {
                                first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }


                            } else {
                                if (i > 0 && i < 64) {
                                    sum3.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum7.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum11.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum15.setText(df.format(third_player_taken_sum / 100));
                                }

                            }

                        } else {
                            //წაღებული ქულების ჯამი
                            fourth_palyer_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }


                            } else {

                                if (i > 0 && i < 64) {
                                    sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 160) {
                                    sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                }

                            }

                        }

                        switch (taken_sum) {
                            case 9:
                                button_1.setEnabled(false);
                                button_2.setEnabled(false);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 8:
                                button_2.setEnabled(false);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 7:
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 6:
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 5:
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 4:
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 3:
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 2:
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 1:
                                button_9.setEnabled(false);
                                break;
                        }


                        i++;
                    }

                    break;
// 6
                case 6:


//delete
                    if (button_number == -1) {

                        if (row % 4 == 1) {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 3) {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        }


                        for (int x = 0; x < 3; x++) {

                            if (row % 4 == 1) {
                                if (j % 4 == 1) {
                                    row1_first_player_took_all = true;
                                } else if (j % 4 == 2) {
                                    row1_second_player_took_all = true;
                                } else if (j % 4 == 3) {
                                    row1_third_player_took_all = true;
                                } else {
                                    row1_fourth_player_took_all = true;
                                }

                            } else if (row % 4 == 2) {
                                if (j % 4 == 1) {
                                    row2_first_player_took_all = true;
                                } else if (j % 4 == 2) {
                                    row2_second_player_took_all = true;
                                } else if (j % 4 == 3) {
                                    row2_third_player_took_all = true;
                                } else {
                                    row2_fourth_player_took_all = true;
                                }

                            } else if (row % 4 == 3) {
                                if (j % 4 == 1) {
                                    row3_first_player_took_all = true;
                                } else if (j % 4 == 2) {
                                    row3_second_player_took_all = true;
                                } else if (j % 4 == 3) {
                                    row3_third_player_took_all = true;
                                } else {
                                    row3_fourth_player_took_all = true;
                                }

                            } else {
                                if (j % 4 == 1) {
                                    row4_first_player_took_all = true;
                                } else if (j % 4 == 2) {
                                    row4_second_player_took_all = true;
                                } else if (j % 4 == 3) {
                                    row4_third_player_took_all = true;
                                } else {
                                    row4_fourth_player_took_all = true;
                                }

                            }


                            if (j % 4 == 1) {
                                //წაღებული ქულების ჯამი
                                first_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების ჯამის გამოტანა

                                if (couple_switch.equals("true")) {

                                    first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum1.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum5.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum9.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum13.setText(df.format(first_couple_taken_sum / 100));
                                    }

                                } else {

                                    if (i > 0 && i < 64) {
                                        sum1.setText(df.format(first_player_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum5.setText(df.format(first_player_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum9.setText(df.format(first_player_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum13.setText(df.format(first_player_taken_sum / 100));
                                    }
                                }
                            } else if (j % 4 == 2) {
                                //წაღებული ქულების ჯამი
                                second_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების  ჯამის გამოტანა

                                if (couple_switch.equals("true")) {
                                    second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum2.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum6.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum10.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum14.setText(df.format(second_couple_taken_sum / 100));
                                    }

                                } else {

                                    if (i > 0 && i < 64) {
                                        sum2.setText(df.format(second_player_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum6.setText(df.format(second_player_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum10.setText(df.format(second_player_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum14.setText(df.format(second_player_taken_sum / 100));
                                    }
                                }

                            } else if (j % 4 == 3) {
                                // წაღებული ქულების ჯამი
                                third_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების  ჯამის გამოტანა


                                if (couple_switch.equals("true")) {
                                    first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum1.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum5.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum9.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum13.setText(df.format(first_couple_taken_sum / 100));
                                    }

                                } else {
                                    if (i > 0 && i < 64) {
                                        sum3.setText(df.format(third_player_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum7.setText(df.format(third_player_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum11.setText(df.format(third_player_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum15.setText(df.format(third_player_taken_sum / 100));
                                    }
                                }


                            } else {
                                //წაღებული ქულების ჯამი
                                fourth_palyer_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების  ჯამის გამოტანა

                                if (couple_switch.equals("true")) {
                                    second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum2.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum6.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum10.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum14.setText(df.format(second_couple_taken_sum / 100));
                                    }

                                } else {

                                    if (i > 0 && i < 64) {
                                        sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                    }
                                }
                            }
                            textViews1[i].setText("");
                            i--;
                            j--;
                        }


                        button_pass.setEnabled(true);
                        button_1.setEnabled(true);
                        button_2.setEnabled(true);
                        button_3.setEnabled(true);
                        button_4.setEnabled(true);
                        button_5.setEnabled(true);
                        button_6.setEnabled(true);
                        button_7.setEnabled(true);
                        button_8.setEnabled(true);
                        button_9.setEnabled(true);


                        i++;

                        taken_sum = 0;

// finish delete
                    } else {


                        if (row % 4 == 0) {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 1) {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        }


                        taken_sum += button_number;
                        j++;
                        //თუ წაიღო რაც ეწერა
                        if (button_number == third_player_written_quantity) {
                            textViews1[i].setText(waigo);

                        } else {
                            textViews1[i].setText(ver_waigo);

                            if (row % 4 == 1) {
                                if (j % 4 == 1) {
                                    row1_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row1_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row1_third_player_took_all = false;
                                } else {
                                    row1_fourth_player_took_all = false;
                                }

                            } else if (row % 4 == 2) {
                                if (j % 4 == 1) {
                                    row2_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row2_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row2_third_player_took_all = false;
                                } else {
                                    row2_fourth_player_took_all = false;
                                }

                            } else if (row % 4 == 3) {
                                if (j % 4 == 1) {
                                    row3_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row3_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row3_third_player_took_all = false;
                                } else {
                                    row3_fourth_player_took_all = false;
                                }

                            } else {
                                if (j % 4 == 1) {
                                    row4_first_player_took_all = false;
                                } else if (j % 4 == 2) {
                                    row4_second_player_took_all = false;
                                } else if (j % 4 == 3) {
                                    row4_third_player_took_all = false;
                                } else {
                                    row4_fourth_player_took_all = false;
                                }

                            }
                        }


                        if (j % 4 == 1) {
                            //წაღებული ქულების ჯამი
                            first_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების ჯამის გამოტანა

                            if (couple_switch.equals("true")) {

                                first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_player_taken_sum / 100));
                                }
                            }


                        } else if (j % 4 == 2) {
                            //წაღებული ქულების ჯამი
                            second_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());


                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }

                            } else {

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_player_taken_sum / 100));
                                }


                            }

                        } else if (j % 4 == 3) {
                            // წაღებული ქულების ჯამი
                            third_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა


                            if (couple_switch.equals("true")) {
                                first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                }


                            } else {
                                if (i > 0 && i < 64) {
                                    sum3.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum7.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum11.setText(df.format(third_player_taken_sum / 100));
                                } else if (i > 160) {
                                    sum15.setText(df.format(third_player_taken_sum / 100));
                                }

                            }

                        } else {
                            //წაღებული ქულების ჯამი
                            fourth_palyer_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                            //

                            //წაღებული ქულების  ჯამის გამოტანა

                            if (couple_switch.equals("true")) {
                                second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                if (i > 0 && i < 64) {
                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                } else if (i > 160) {
                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                }


                            } else {

                                if (i > 0 && i < 64) {
                                    sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 64 && i < 96) {
                                    sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 96 && i < 160) {
                                    sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                } else if (i > 160) {
                                    sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                }

                            }

                        }

                        switch (taken_sum) {
                            case 9:
                                button_1.setEnabled(false);
                                button_2.setEnabled(false);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 8:
                                button_pass.setEnabled(false);
                                button_2.setEnabled(false);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 7:
                                button_1.setEnabled(false);
                                button_pass.setEnabled(false);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 6:
                                button_1.setEnabled(false);
                                button_2.setEnabled(false);
                                button_pass.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 5:
                                button_1.setEnabled(false);
                                button_2.setEnabled(false);
                                button_3.setEnabled(false);
                                button_pass.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 4:
                                button_1.setEnabled(false);
                                button_2.setEnabled(false);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_pass.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 3:
                                button_1.setEnabled(false);
                                button_2.setEnabled(false);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_pass.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 2:
                                button_1.setEnabled(false);
                                button_2.setEnabled(false);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_pass.setEnabled(false);
                                button_8.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 1:
                                button_1.setEnabled(false);
                                button_2.setEnabled(false);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_pass.setEnabled(false);
                                button_9.setEnabled(false);
                                break;
                            case 0:
                                button_1.setEnabled(false);
                                button_2.setEnabled(false);
                                button_3.setEnabled(false);
                                button_4.setEnabled(false);
                                button_5.setEnabled(false);
                                button_6.setEnabled(false);
                                button_7.setEnabled(false);
                                button_8.setEnabled(false);
                                button_pass.setEnabled(false);
                                break;
                        }

                        i++;
                    }
                    break;
                // case 7
                case 7:


//delete
                    if (button_number == -1) {

                        if (row % 4 == 1) {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 3) {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        }


                        j--;


                        if ((i == 159 || i == 63 || i == 95) && (premiebis_raodenoba > 0)) {

                            if (premiebis_raodenoba == 1) {

                                if (!first_player_took_all) {


                                    first_player_taken_sum += first_player_max_value;

                                    if (couple_switch.equals("true")) {
                                        if (!third_player_took_all) {

                                            textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));


                                            first_couple_taken_sum += first_player_max_value;


                                        }


                                    } else {

                                        textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));


                                    }

                                }

                                if (!second_player_took_all) {

                                    second_player_taken_sum += second_player_max_value;

                                    if (couple_switch.equals("true")) {

                                        if (!fourth_player_took_all) {

                                            textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                            second_couple_taken_sum += second_player_max_value;

                                        }
                                    } else {

                                        textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                    }

                                }

                                if (!third_player_took_all) {


                                    third_player_taken_sum += third_player_max_value;

                                    if (couple_switch.equals("true")) {
                                        if (!first_player_took_all) {

                                            textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                            first_couple_taken_sum += third_player_max_value;

                                        }

                                    } else {

                                        textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                    }

                                }

                                if (!fourth_player_took_all) {


                                    fourth_palyer_taken_sum += fourth_player_max_value;

                                    if (couple_switch.equals("true")) {
                                        if (!second_player_took_all) {

                                            textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[fourth_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                            second_couple_taken_sum += fourth_player_max_value;


                                        }

                                    } else {

                                        textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[fourth_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                    }

                                }
                            }


                            // თუ პრემიაზე 2 ან 3გავიდა

                            if (premiebis_raodenoba > 1) {


                                if (couple_switch.equals("true")) {
                                    if (first_player_took_all & third_player_took_all & !second_player_took_all & !fourth_player_took_all) {


                                        if (!second_player_took_all) {

                                            textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                            second_player_taken_sum += second_player_max_value;


                                            second_couple_taken_sum += second_player_max_value;


                                        }


                                        if (!fourth_player_took_all) {

                                            textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[fourth_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));

                                            fourth_palyer_taken_sum += fourth_player_max_value;


                                            second_couple_taken_sum += fourth_player_max_value;

                                        }


                                    } else if (second_player_took_all && fourth_player_took_all & !first_player_took_all & !third_player_took_all) {
                                        if (!first_player_took_all) {

                                            textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                                            first_player_taken_sum += first_player_max_value;


                                            first_couple_taken_sum += first_player_max_value;


                                        }


                                        if (!third_player_took_all) {

                                            textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                                            third_player_taken_sum += third_player_max_value;

                                            first_couple_taken_sum += third_player_max_value;

                                        }


                                    }
                                }

                                if (remove_last_switch.equals("true")) {
                                    if (!first_player_took_all) {

                                        textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                                        first_player_taken_sum += first_player_max_value;


                                    }

                                    if (!second_player_took_all) {
                                        textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                                        second_player_taken_sum += second_player_max_value;

                                    }

                                    if (!third_player_took_all) {

                                        textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                                        third_player_taken_sum += third_player_max_value;


                                    }

                                    if (!fourth_player_took_all) {

                                        textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                                        fourth_palyer_taken_sum += fourth_player_max_value;


                                    }

                                }

                            }


                        }

                        for (int x = 0; x < 4; x++) {


                            if (row % 4 == 1) {
                                if (j % 4 == 1) {
                                    row1_first_player_took_all = true;
                                } else if (j % 4 == 2) {
                                    row1_second_player_took_all = true;
                                } else if (j % 4 == 3) {
                                    row1_third_player_took_all = true;
                                } else {
                                    row1_fourth_player_took_all = true;
                                }

                            } else if (row % 4 == 2) {
                                if (j % 4 == 1) {
                                    row2_first_player_took_all = true;
                                } else if (j % 4 == 2) {
                                    row2_second_player_took_all = true;
                                } else if (j % 4 == 3) {
                                    row2_third_player_took_all = true;
                                } else {
                                    row2_fourth_player_took_all = true;
                                }

                            } else if (row % 4 == 3) {
                                if (j % 4 == 1) {
                                    row3_first_player_took_all = true;
                                } else if (j % 4 == 2) {
                                    row3_second_player_took_all = true;
                                } else if (j % 4 == 3) {
                                    row3_third_player_took_all = true;
                                } else {
                                    row3_fourth_player_took_all = true;
                                }

                            } else if (row % 4 == 0) {
                                if (j % 4 == 1) {
                                    row4_first_player_took_all = true;
                                } else if (j % 4 == 2) {
                                    row4_second_player_took_all = true;
                                } else if (j % 4 == 3) {
                                    row4_third_player_took_all = true;
                                } else {
                                    row4_fourth_player_took_all = true;
                                }

                            }


                            if (j % 4 == 1) {
                                //წაღებული ქულების ჯამი
                                first_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების ჯამის გამოტანა

                                if (couple_switch.equals("true")) {

                                    first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum1.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum5.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum9.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum13.setText(df.format(first_couple_taken_sum / 100));
                                    }

                                } else {

                                    if (i > 0 && i < 64) {
                                        sum1.setText(df.format(first_player_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum5.setText(df.format(first_player_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum9.setText(df.format(first_player_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum13.setText(df.format(first_player_taken_sum / 100));
                                    }
                                }
                            } else if (j % 4 == 2) {
                                //წაღებული ქულების ჯამი
                                second_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების  ჯამის გამოტანა

                                if (couple_switch.equals("true")) {
                                    second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum2.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum6.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum10.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum14.setText(df.format(second_couple_taken_sum / 100));
                                    }

                                } else {

                                    if (i > 0 && i < 64) {
                                        sum2.setText(df.format(second_player_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum6.setText(df.format(second_player_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum10.setText(df.format(second_player_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum14.setText(df.format(second_player_taken_sum / 100));
                                    }
                                }

                            } else if (j % 4 == 3) {
                                // წაღებული ქულების ჯამი
                                third_player_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების  ჯამის გამოტანა


                                if (couple_switch.equals("true")) {
                                    first_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum1.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum5.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum9.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum13.setText(df.format(first_couple_taken_sum / 100));
                                    }

                                } else {
                                    if (i > 0 && i < 64) {
                                        sum3.setText(df.format(third_player_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum7.setText(df.format(third_player_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum11.setText(df.format(third_player_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum15.setText(df.format(third_player_taken_sum / 100));
                                    }
                                }


                            } else {
                                //წაღებული ქულების ჯამი
                                fourth_palyer_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების  ჯამის გამოტანა

                                if (couple_switch.equals("true")) {
                                    second_couple_taken_sum -= Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum2.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum6.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum10.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum14.setText(df.format(second_couple_taken_sum / 100));
                                    }

                                } else {

                                    if (i > 0 && i < 64) {
                                        sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                    }
                                }
                            }
                            textViews1[i].setText("");
                            i--;
                            j--;
                        }

//
                        first_player_took_all = true;
                        second_player_took_all = true;
                        third_player_took_all = true;
                        fourth_player_took_all = true;
                        premiebis_raodenoba = 0;

//
                        button_pass.setEnabled(true);
                        button_1.setEnabled(true);
                        button_2.setEnabled(true);
                        button_3.setEnabled(true);
                        button_4.setEnabled(true);
                        button_5.setEnabled(true);
                        button_6.setEnabled(true);
                        button_7.setEnabled(true);
                        button_8.setEnabled(true);
                        button_9.setEnabled(true);


                        i++;

                        taken_sum = 0;
// finish delete


                    } else {

                        if (row % 4 == 0) {
                            names_textview_array[0].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 1) {
                            names_textview_array[1].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                        } else if (row % 4 == 2) {
                            names_textview_array[2].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[3].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        } else {
                            names_textview_array[3].setBackgroundResource(R.drawable.name_textview_background);
                            names_textview_array[1].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[2].setBackgroundResource(R.drawable.textviews_border);
                            names_textview_array[0].setBackgroundResource(R.drawable.textviews_border);
                        }

                        taken_sum += button_number;
                        if (taken_sum == 9) {


                            j++;
                            //თუ წაიღო რაც ეწერა
                            if (button_number == fourth_player_written_quantity) {
                                textViews1[i].setText(waigo);

                            } else {
                                textViews1[i].setText(ver_waigo);

                                if (row % 4 == 1) {
                                    if (j % 4 == 1) {
                                        row1_first_player_took_all = false;
                                    } else if (j % 4 == 2) {
                                        row1_second_player_took_all = false;
                                    } else if (j % 4 == 3) {
                                        row1_third_player_took_all = false;
                                    } else {
                                        row1_fourth_player_took_all = false;
                                    }

                                } else if (row % 4 == 2) {
                                    if (j % 4 == 1) {
                                        row2_first_player_took_all = false;
                                    } else if (j % 4 == 2) {
                                        row2_second_player_took_all = false;
                                    } else if (j % 4 == 3) {
                                        row2_third_player_took_all = false;
                                    } else {
                                        row2_fourth_player_took_all = false;
                                    }

                                } else if (row % 4 == 3) {
                                    if (j % 4 == 1) {
                                        row3_first_player_took_all = false;
                                    } else if (j % 4 == 2) {
                                        row3_second_player_took_all = false;
                                    } else if (j % 4 == 3) {
                                        row3_third_player_took_all = false;
                                    } else {
                                        row3_fourth_player_took_all = false;
                                    }

                                } else {
                                    if (j % 4 == 1) {
                                        row4_first_player_took_all = false;
                                    } else if (j % 4 == 2) {
                                        row4_second_player_took_all = false;
                                    } else if (j % 4 == 3) {
                                        row4_third_player_took_all = false;
                                    } else {
                                        row4_fourth_player_took_all = false;
                                    }

                                }
                            }


                            if (j % 4 == 1) {
                                //წაღებული ქულების ჯამი
                                first_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების ჯამის გამოტანა

                                if (couple_switch.equals("true")) {

                                    first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum1.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum5.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum9.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum13.setText(df.format(first_couple_taken_sum / 100));
                                    }

                                } else {

                                    if (i > 0 && i < 64) {
                                        sum1.setText(df.format(first_player_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum5.setText(df.format(first_player_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum9.setText(df.format(first_player_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum13.setText(df.format(first_player_taken_sum / 100));
                                    }
                                }

                            } else if (j % 4 == 2) {
                                //წაღებული ქულების ჯამი
                                second_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების  ჯამის გამოტანა

                                if (couple_switch.equals("true")) {
                                    second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());


                                    if (i > 0 && i < 64) {
                                        sum2.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum6.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum10.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum14.setText(df.format(second_couple_taken_sum / 100));
                                    }

                                } else {

                                    if (i > 0 && i < 64) {
                                        sum2.setText(df.format(second_player_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum6.setText(df.format(second_player_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum10.setText(df.format(second_player_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum14.setText(df.format(second_player_taken_sum / 100));
                                    }


                                }


                            } else if (j % 4 == 3) {
                                // წაღებული ქულების ჯამი
                                third_player_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების  ჯამის გამოტანა


                                if (couple_switch.equals("true")) {
                                    first_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum1.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum5.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum9.setText(df.format(first_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum13.setText(df.format(first_couple_taken_sum / 100));
                                    }


                                } else {
                                    if (i > 0 && i < 64) {
                                        sum3.setText(df.format(third_player_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum7.setText(df.format(third_player_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum11.setText(df.format(third_player_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum15.setText(df.format(third_player_taken_sum / 100));
                                    }

                                }

                            } else {
                                //წაღებული ქულების ჯამი
                                fourth_palyer_taken_sum += Double.parseDouble(textViews1[i].getText().toString());
                                //

                                //წაღებული ქულების  ჯამის გამოტანა

                                if (couple_switch.equals("true")) {
                                    second_couple_taken_sum += Double.parseDouble(textViews1[i].getText().toString());

                                    if (i > 0 && i < 64) {
                                        sum2.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum6.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum10.setText(df.format(second_couple_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum14.setText(df.format(second_couple_taken_sum / 100));
                                    }


                                } else {

                                    if (i > 0 && i < 64) {
                                        sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else if (i > 64 && i < 96) {
                                        sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else if (i > 96 && i < 160) {
                                        sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                    } else if (i > 160) {
                                        sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                    }

                                }

                            }

                            // PREMIA

                            if (i == 63 || i == 95 || i == 159 || i == 191) {


                                if (i == 95) {

                                    firstplayer[0] = Double.parseDouble(textViews1[4 + 64].getText().toString());
                                    firstplayer[1] = Double.parseDouble(textViews1[15 + 64].getText().toString());
                                    firstplayer[2] = Double.parseDouble(textViews1[22 + 64].getText().toString());

                                    secondplayer[0] = Double.parseDouble(textViews1[5 + 64].getText().toString());
                                    secondplayer[1] = Double.parseDouble(textViews1[12 + 64].getText().toString());
                                    secondplayer[2] = Double.parseDouble(textViews1[23 + 64].getText().toString());

                                    thirdplayer[0] = Double.parseDouble(textViews1[6 + 64].getText().toString());
                                    thirdplayer[1] = Double.parseDouble(textViews1[13 + 64].getText().toString());
                                    thirdplayer[2] = Double.parseDouble(textViews1[20 + 64].getText().toString());

                                    fourthplayer[0] = Double.parseDouble(textViews1[7 + 64].getText().toString());
                                    fourthplayer[1] = Double.parseDouble(textViews1[14 + 64].getText().toString());
                                    fourthplayer[2] = Double.parseDouble(textViews1[21 + 64].getText().toString());

                                } else if (i == 191) {

                                    firstplayer[0] = Double.parseDouble(textViews1[4 + 160].getText().toString());
                                    firstplayer[1] = Double.parseDouble(textViews1[15 + 160].getText().toString());
                                    firstplayer[2] = Double.parseDouble(textViews1[22 + 160].getText().toString());

                                    secondplayer[0] = Double.parseDouble(textViews1[5 + 160].getText().toString());
                                    secondplayer[1] = Double.parseDouble(textViews1[12 + 160].getText().toString());
                                    secondplayer[2] = Double.parseDouble(textViews1[23 + 160].getText().toString());

                                    thirdplayer[0] = Double.parseDouble(textViews1[6 + 160].getText().toString());
                                    thirdplayer[1] = Double.parseDouble(textViews1[13 + 160].getText().toString());
                                    thirdplayer[2] = Double.parseDouble(textViews1[20 + 160].getText().toString());

                                    fourthplayer[0] = Double.parseDouble(textViews1[7 + 160].getText().toString());
                                    fourthplayer[1] = Double.parseDouble(textViews1[14 + 160].getText().toString());
                                    fourthplayer[2] = Double.parseDouble(textViews1[21 + 160].getText().toString());

                                }


                                array = find_max_value(firstplayer);
                                first_player_max_value = array[0];
                                if (array[1] == 0) {
                                    first_player_max_value_index = 4;
                                } else if (array[1] == 1) {
                                    first_player_max_value_index = 15;

                                } else {
                                    first_player_max_value_index = 22;
                                }


                                array = find_max_value(secondplayer);
                                second_player_max_value = array[0];
                                if (array[1] == 0) {
                                    second_player_max_value_index = 5;
                                } else if (array[1] == 1) {
                                    second_player_max_value_index = 12;

                                } else {
                                    second_player_max_value_index = 23;
                                }


                                array = find_max_value(thirdplayer);
                                third_player_max_value = array[0];

                                if (array[1] == 0) {
                                    third_player_max_value_index = 6;
                                } else if (array[1] == 1) {
                                    third_player_max_value_index = 13;

                                } else {
                                    third_player_max_value_index = 20;
                                }


                                array = find_max_value(fourthplayer);
                                fourth_player_max_value = array[0];

                                if (array[1] == 0) {
                                    fourth_player_max_value_index = 7;
                                } else if (array[1] == 1) {
                                    fourth_player_max_value_index = 14;

                                } else {
                                    fourth_player_max_value_index = 21;
                                }


                                if (i == 95) {
                                    first_player_max_value_index += 64;
                                    second_player_max_value_index += 64;
                                    third_player_max_value_index += 64;
                                    fourth_player_max_value_index += 64;

                                }
                                if (i == 191) {
                                    first_player_max_value_index += 160;
                                    second_player_max_value_index += 160;
                                    third_player_max_value_index += 160;
                                    fourth_player_max_value_index += 160;

                                }


                                if (!row1_first_player_took_all || !row2_first_player_took_all || !row3_first_player_took_all || !row4_first_player_took_all) {
                                    first_player_took_all = false;
                                }

                                if (!row1_second_player_took_all || !row2_second_player_took_all || !row3_second_player_took_all || !row4_second_player_took_all) {
                                    second_player_took_all = false;
                                }

                                if (!row1_third_player_took_all || !row2_third_player_took_all || !row3_third_player_took_all || !row4_third_player_took_all) {
                                    third_player_took_all = false;
                                }

                                if (!row1_fourth_player_took_all || !row2_fourth_player_took_all || !row3_fourth_player_took_all || !row4_fourth_player_took_all) {
                                    fourth_player_took_all = false;
                                }


                                if (first_player_took_all || second_player_took_all || third_player_took_all || fourth_player_took_all) {


                                    //  DAWERA
                                    if (first_player_took_all) {

                                        premiebis_raodenoba++;

                                        first_player_taken_sum += first_player_max_value;
                                        if (couple_switch.equals("true")) {
                                            first_couple_taken_sum += first_player_max_value;

                                            if (i == 63) {
                                                sum1.setText(df.format(first_couple_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[61].getText().toString()) + first_player_max_value;
                                                textViews1[61].setText(df.format(premiis_danamati));
                                            } else if (i == 95) {
                                                sum5.setText(df.format(first_couple_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[93].getText().toString()) + first_player_max_value;
                                                textViews1[93].setText(df.format(premiis_danamati));
                                            } else if (i == 159) {
                                                sum9.setText(df.format(first_couple_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[157].getText().toString()) + first_player_max_value;
                                                textViews1[157].setText(df.format(premiis_danamati));
                                            } else {
                                                sum13.setText(df.format(first_couple_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[189].getText().toString()) + first_player_max_value;
                                                textViews1[189].setText(df.format(premiis_danamati));
                                            }

                                        } else {

                                            if (i == 63) {
                                                sum1.setText(df.format(first_player_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[61].getText().toString()) + first_player_max_value;
                                                textViews1[61].setText(df.format(premiis_danamati));
                                            } else if (i == 95) {
                                                sum5.setText(df.format(first_player_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[93].getText().toString()) + first_player_max_value;
                                                textViews1[93].setText(df.format(premiis_danamati));
                                            } else if (i == 159) {
                                                sum9.setText(df.format(first_player_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[157].getText().toString()) + first_player_max_value;
                                                textViews1[157].setText(df.format(premiis_danamati));
                                            } else {
                                                sum13.setText(df.format(first_player_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[189].getText().toString()) + first_player_max_value;
                                                textViews1[189].setText(df.format(premiis_danamati));
                                            }

                                        }


                                    }
                                    if (second_player_took_all) {

                                        premiebis_raodenoba++;

                                        second_player_taken_sum += second_player_max_value;

                                        if (couple_switch.equals("true")) {

                                            second_couple_taken_sum += second_player_max_value;


                                            if (i == 63) {
                                                sum2.setText(df.format(second_couple_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[62].getText().toString()) + second_player_max_value;
                                                textViews1[62].setText(df.format(premiis_danamati));
                                            } else if (i == 95) {
                                                sum6.setText(df.format(second_couple_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[94].getText().toString()) + second_player_max_value;
                                                textViews1[94].setText(df.format(premiis_danamati));
                                            } else if (i == 159) {
                                                sum10.setText(df.format(second_couple_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[158].getText().toString()) + second_player_max_value;
                                                textViews1[158].setText(df.format(premiis_danamati));
                                            } else {
                                                sum14.setText(df.format(second_couple_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[190].getText().toString()) + second_player_max_value;
                                                textViews1[190].setText(df.format(premiis_danamati));
                                            }


                                        } else {

                                            if (i == 63) {
                                                sum2.setText(df.format(second_player_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[62].getText().toString()) + second_player_max_value;
                                                textViews1[62].setText(df.format(premiis_danamati));
                                            } else if (i == 95) {
                                                sum6.setText(df.format(second_player_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[94].getText().toString()) + second_player_max_value;
                                                textViews1[94].setText(df.format(premiis_danamati));
                                            } else if (i == 159) {
                                                sum10.setText(df.format(second_player_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[158].getText().toString()) + second_player_max_value;
                                                textViews1[158].setText(df.format(premiis_danamati));
                                            } else {
                                                sum14.setText(df.format(second_player_taken_sum / 100));
                                                premiis_danamati = Double.parseDouble(textViews1[190].getText().toString()) + second_player_max_value;
                                                textViews1[190].setText(df.format(premiis_danamati));
                                            }


                                        }
                                    }
                                }
                                if (third_player_took_all) {

                                    premiebis_raodenoba++;

                                    third_player_taken_sum += third_player_max_value;

                                    if (couple_switch.equals("true")) {
                                        first_couple_taken_sum += third_player_max_value;

                                        if (i == 63) {
                                            sum1.setText(df.format(first_couple_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[63].getText().toString()) + third_player_max_value;
                                            textViews1[63].setText(df.format(premiis_danamati));
                                        } else if (i == 95) {
                                            sum5.setText(df.format(first_couple_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[95].getText().toString()) + third_player_max_value;
                                            textViews1[95].setText(df.format(premiis_danamati));
                                        } else if (i == 159) {
                                            sum9.setText(df.format(first_couple_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[159].getText().toString()) + third_player_max_value;
                                            textViews1[159].setText(df.format(premiis_danamati));
                                        } else {
                                            sum13.setText(df.format(first_couple_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[191].getText().toString()) + third_player_max_value;
                                            textViews1[191].setText(df.format(premiis_danamati));
                                        }

                                    } else {

                                        if (i == 63) {
                                            premiis_danamati = Double.parseDouble(textViews1[63].getText().toString()) + third_player_max_value;
                                            textViews1[63].setText(df.format(premiis_danamati));
                                            sum3.setText(df.format(third_player_taken_sum / 100));
                                        } else if (i == 95) {
                                            premiis_danamati = Double.parseDouble(textViews1[95].getText().toString()) + third_player_max_value;
                                            textViews1[95].setText(df.format(premiis_danamati));
                                            sum7.setText(df.format(third_player_taken_sum / 100));
                                        } else if (i == 159) {
                                            premiis_danamati = Double.parseDouble(textViews1[159].getText().toString()) + third_player_max_value;
                                            textViews1[159].setText(df.format(premiis_danamati));
                                            sum11.setText(df.format(third_player_taken_sum / 100));
                                        } else {
                                            premiis_danamati = Double.parseDouble(textViews1[191].getText().toString()) + third_player_max_value;
                                            textViews1[191].setText(df.format(premiis_danamati));
                                            sum15.setText(df.format(third_player_taken_sum / 100));
                                        }
                                    }

                                }
                                if (fourth_player_took_all) {

                                    premiebis_raodenoba++;

                                    fourth_palyer_taken_sum += fourth_player_max_value;

                                    if (couple_switch.equals("true")) {

                                        second_couple_taken_sum += fourth_player_max_value;

                                        if (i == 63) {
                                            sum2.setText(df.format(second_couple_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[60].getText().toString()) + fourth_player_max_value;
                                            textViews1[60].setText(df.format(premiis_danamati));
                                        } else if (i == 95) {
                                            premiis_danamati = Double.parseDouble(textViews1[92].getText().toString()) + fourth_player_max_value;
                                            textViews1[92].setText(df.format(premiis_danamati));
                                            sum6.setText(df.format(second_couple_taken_sum / 100));
                                        } else if (i == 159) {
                                            sum10.setText(df.format(second_couple_taken_sum / 100));
                                            premiis_danamati = Double.parseDouble(textViews1[156].getText().toString()) + fourth_player_max_value;
                                            textViews1[156].setText(df.format(premiis_danamati));
                                        } else {
                                            premiis_danamati = Double.parseDouble(textViews1[188].getText().toString()) + fourth_player_max_value;
                                            textViews1[188].setText(df.format(premiis_danamati));
                                            sum14.setText(df.format(second_couple_taken_sum / 100));
                                        }

                                    } else {


                                        if (i == 63) {
                                            premiis_danamati = Double.parseDouble(textViews1[60].getText().toString()) + fourth_player_max_value;
                                            textViews1[60].setText(df.format(premiis_danamati));
                                            sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                        } else if (i == 95) {
                                            premiis_danamati = Double.parseDouble(textViews1[92].getText().toString()) + fourth_player_max_value;
                                            textViews1[92].setText(df.format(premiis_danamati));
                                            sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                        } else if (i == 159) {
                                            premiis_danamati = Double.parseDouble(textViews1[156].getText().toString()) + fourth_player_max_value;
                                            textViews1[156].setText(df.format(premiis_danamati));
                                            sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                        } else {
                                            premiis_danamati = Double.parseDouble(textViews1[188].getText().toString()) + fourth_player_max_value;
                                            textViews1[188].setText(df.format(premiis_danamati));
                                            sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                        }
                                    }
                                }

                                // WASHLA

                                // თუ პრემიაზე 1 გავიდა
                                if (premiebis_raodenoba == 1) {

                                    if (!first_player_took_all) {


                                        first_player_taken_sum -= first_player_max_value;

                                        if (couple_switch.equals("true")) {
                                            if (!third_player_took_all) {
                                                textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

                                                first_couple_taken_sum -= first_player_max_value;

                                                if (i == 63) {
                                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                                } else if (i == 95) {
                                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                                } else if (i == 159) {
                                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                                } else {
                                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                                }

                                            }


                                        } else {

                                            textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

                                            if (i == 63) {
                                                sum1.setText(df.format(first_player_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum5.setText(df.format(first_player_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum9.setText(df.format(first_player_taken_sum / 100));
                                            } else {
                                                sum13.setText(df.format(first_player_taken_sum / 100));
                                            }
                                        }

                                    }

                                    if (!second_player_took_all) {

                                        second_player_taken_sum -= second_player_max_value;

                                        if (couple_switch.equals("true")) {

                                            if (!fourth_player_took_all) {
                                                textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                                second_couple_taken_sum -= second_player_max_value;

                                                if (i == 63) {
                                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                                } else if (i == 95) {
                                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                                } else if (i == 159) {
                                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                                } else {
                                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                                }


                                            }
                                        } else {

                                            textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);


                                            if (i == 63) {
                                                sum2.setText(df.format(second_player_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum6.setText(df.format(second_player_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum10.setText(df.format(second_player_taken_sum / 100));
                                            } else {
                                                sum14.setText(df.format(second_player_taken_sum / 100));
                                            }

                                        }

                                    }

                                    if (!third_player_took_all) {


                                        third_player_taken_sum -= third_player_max_value;

                                        if (couple_switch.equals("true")) {
                                            if (!first_player_took_all) {
                                                textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                                first_couple_taken_sum -= third_player_max_value;

                                                if (i == 63) {
                                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                                } else if (i == 95) {
                                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                                } else if (i == 159) {
                                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                                } else {
                                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                                }
                                            }

                                        } else {

                                            textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);


                                            if (i == 63) {
                                                sum3.setText(df.format(third_player_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum7.setText(df.format(third_player_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum11.setText(df.format(third_player_taken_sum / 100));
                                            } else {
                                                sum15.setText(df.format(third_player_taken_sum / 100));
                                            }

                                        }

                                    }

                                    if (!fourth_player_took_all) {


                                        fourth_palyer_taken_sum -= fourth_player_max_value;

                                        if (couple_switch.equals("true")) {
                                            if (!second_player_took_all) {
                                                textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[fourth_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                                second_couple_taken_sum -= fourth_player_max_value;

                                                if (i == 63) {
                                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                                } else if (i == 95) {
                                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                                } else if (i == 159) {
                                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                                } else {
                                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                                }

                                            }

                                        } else {

                                            textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[fourth_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

                                            if (i == 63) {
                                                sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                            } else {
                                                sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                            }
                                        }

                                    }
                                }


                                // თუ პრემიაზე 2 ან 3გავიდა

                                if (premiebis_raodenoba > 1) {


                                    if (couple_switch.equals("true")) {
                                        if (first_player_took_all & third_player_took_all & !second_player_took_all & !fourth_player_took_all) {


                                            if (!second_player_took_all) {
                                                textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                                second_player_taken_sum -= second_player_max_value;


                                                second_couple_taken_sum -= second_player_max_value;

                                                if (i == 63) {
                                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                                } else if (i == 95) {
                                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                                } else if (i == 159) {
                                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                                } else {
                                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                                }


                                            }


                                            if (!fourth_player_took_all) {

                                                textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[fourth_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                                fourth_palyer_taken_sum -= fourth_player_max_value;


                                                second_couple_taken_sum -= fourth_player_max_value;

                                                if (i == 63) {
                                                    sum2.setText(df.format(second_couple_taken_sum / 100));
                                                } else if (i == 95) {
                                                    sum6.setText(df.format(second_couple_taken_sum / 100));
                                                } else if (i == 159) {
                                                    sum10.setText(df.format(second_couple_taken_sum / 100));
                                                } else {
                                                    sum14.setText(df.format(second_couple_taken_sum / 100));
                                                }

                                            }


                                        } else if (second_player_took_all && fourth_player_took_all & !first_player_took_all & !third_player_took_all) {
                                            if (!first_player_took_all) {

                                                textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                                first_player_taken_sum -= first_player_max_value;


                                                first_couple_taken_sum -= first_player_max_value;

                                                if (i == 63) {
                                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                                } else if (i == 95) {
                                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                                } else if (i == 159) {
                                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                                } else {
                                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                                }

                                            }


                                            if (!third_player_took_all) {

                                                textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                                third_player_taken_sum -= third_player_max_value;

                                                first_couple_taken_sum -= third_player_max_value;

                                                if (i == 63) {
                                                    sum1.setText(df.format(first_couple_taken_sum / 100));
                                                } else if (i == 95) {
                                                    sum5.setText(df.format(first_couple_taken_sum / 100));
                                                } else if (i == 159) {
                                                    sum9.setText(df.format(first_couple_taken_sum / 100));
                                                } else {
                                                    sum13.setText(df.format(first_couple_taken_sum / 100));
                                                }
                                            }


                                        }
                                    }

                                    if (remove_last_switch.equals("true") && !couple_switch.equals("true")) {
                                        if (!first_player_took_all) {

                                            textViews1[first_player_max_value_index].setPaintFlags(textViews1[first_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                            first_player_taken_sum -= first_player_max_value;

                                            if (i == 63) {
                                                sum1.setText(df.format(first_player_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum5.setText(df.format(first_player_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum9.setText(df.format(first_player_taken_sum / 100));
                                            } else {
                                                sum13.setText(df.format(first_player_taken_sum / 100));
                                            }

                                        }

                                        if (!second_player_took_all) {
                                            textViews1[second_player_max_value_index].setPaintFlags(textViews1[second_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                            second_player_taken_sum -= second_player_max_value;

                                            if (i == 63) {
                                                sum2.setText(df.format(second_player_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum6.setText(df.format(second_player_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum10.setText(df.format(second_player_taken_sum / 100));
                                            } else {
                                                sum14.setText(df.format(second_player_taken_sum / 100));
                                            }

                                        }

                                        if (!third_player_took_all) {

                                            textViews1[third_player_max_value_index].setPaintFlags(textViews1[third_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                            third_player_taken_sum -= third_player_max_value;

                                            if (i == 63) {
                                                sum3.setText(df.format(third_player_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum7.setText(df.format(third_player_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum11.setText(df.format(third_player_taken_sum / 100));
                                            } else {
                                                sum15.setText(df.format(third_player_taken_sum / 100));
                                            }


                                        }

                                        if (!fourth_player_took_all) {

                                            textViews1[fourth_player_max_value_index].setPaintFlags(textViews1[fourth_player_max_value_index].getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                                            fourth_palyer_taken_sum -= fourth_player_max_value;

                                            if (i == 63) {
                                                sum4.setText(df.format(fourth_palyer_taken_sum / 100));
                                            } else if (i == 95) {
                                                sum8.setText(df.format(fourth_palyer_taken_sum / 100));
                                            } else if (i == 159) {
                                                sum12.setText(df.format(fourth_palyer_taken_sum / 100));
                                            } else {
                                                sum16.setText(df.format(fourth_palyer_taken_sum / 100));
                                            }

                                        }

                                    }

                                }

                            }


                            switch (row % 4) {

                                case 1:
                                    this.info_textview.setText(getString(R.string.arigebs) + " " + names_textview_array[0].getText().toString());
                                    break;
                                case 2:
                                    this.info_textview.setText(getString(R.string.arigebs) + " " + names_textview_array[1].getText().toString());
                                    break;
                                case 3:
                                    this.info_textview.setText(getString(R.string.arigebs) + " " + names_textview_array[2].getText().toString());
                                    break;
                                case 0:
                                    this.info_textview.setText(getString(R.string.arigebs) + " " + names_textview_array[3].getText().toString());
                                    break;
                            }


                            button_pass.setEnabled(true);
                            button_1.setEnabled(true);
                            button_2.setEnabled(true);
                            button_3.setEnabled(true);
                            button_4.setEnabled(true);
                            button_5.setEnabled(true);
                            button_6.setEnabled(true);
                            button_7.setEnabled(true);
                            button_8.setEnabled(true);
                            button_9.setEnabled(true);
                            if (i == 95) {
                                button_9.setEnabled(false);
                            }

                            taken_sum = 0;
                            j += 1;
                            i++;

                            break;
                        } else {
                            taken_sum -= button_number;
                        }


                    }

            }

            if (i == 192) {

                info_textview.setText("");

                button_1.setEnabled(false);
                button_2.setEnabled(false);
                button_3.setEnabled(false);
                button_4.setEnabled(false);
                button_5.setEnabled(false);
                button_6.setEnabled(false);
                button_7.setEnabled(false);
                button_8.setEnabled(false);
                button_9.setEnabled(false);
                button_pass.setEnabled(false);
                button_delete.setEnabled(false);

                final AlertDialog.Builder dialog = new AlertDialog.Builder(this);


                if (!couple_switch.equals("true")) {
                    View alterdialogview = getLayoutInflater().inflate(R.layout.results_alert_dialog, null);


                    TextView result_name_textview_0 = (TextView) alterdialogview.findViewById(R.id.reslt_name_0);
                    TextView result_name_textview_1 = (TextView) alterdialogview.findViewById(R.id.reslt_name_1);
                    TextView result_name_textview_2 = (TextView) alterdialogview.findViewById(R.id.reslt_name_2);
                    TextView result_name_textview_3 = (TextView) alterdialogview.findViewById(R.id.reslt_name_3);

                    TextView result_value_textview_0 = (TextView) alterdialogview.findViewById(R.id.reslt_value_0);
                    TextView result_value_textview_1 = (TextView) alterdialogview.findViewById(R.id.reslt_value_1);
                    TextView result_value_textview_2 = (TextView) alterdialogview.findViewById(R.id.reslt_value_2);
                    TextView result_value_textview_3 = (TextView) alterdialogview.findViewById(R.id.reslt_value_3);

                    Button main_actyvity_button = (Button) alterdialogview.findViewById(R.id.button_back_to_mainactivity);
                    Button button_save = (Button) alterdialogview.findViewById(R.id.button_save_results);

                    result_name_textview_0.setText(name_textview_0.getText());
                    result_name_textview_1.setText(name_textview_1.getText());
                    result_name_textview_2.setText(name_textview_2.getText());
                    result_name_textview_3.setText(name_textview_3.getText());

                    result_value_textview_0.setText(sum13.getText());
                    result_value_textview_1.setText(sum14.getText());
                    result_value_textview_2.setText(sum15.getText());
                    result_value_textview_3.setText(sum16.getText());

                    main_actyvity_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Standartuli.this.finish();
                        }
                    });

                    button_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            String date = getDateTime();

                            boolean isinserted = result_database.insert_data(name_textview_0.getText().toString(), name_textview_1.getText().toString(), name_textview_2.getText().toString(), name_textview_3.getText().toString(), Double.parseDouble(sum13.getText().toString()), Double.parseDouble(sum14.getText().toString()), Double.parseDouble(sum15.getText().toString()), Double.parseDouble(sum16.getText().toString()), date, getResources().getString(R.string.standartuli), 0, 0.0, 0.0);

                            if (!isinserted)
                                Toast.makeText(getApplicationContext(), "database do not respond", Toast.LENGTH_LONG).show();


                            Standartuli.this.finish();


                        }
                    });


                    dialog.setView(alterdialogview);
                    final AlertDialog dialog1 = dialog.create();
                    dialog1.show();

                } else {

                    View alterdialogview = getLayoutInflater().inflate(R.layout.couple_resulalt_alertdialog, null);


                    TextView result_name_textview_0 = (TextView) alterdialogview.findViewById(R.id.couple_reslt_name_0);
                    TextView result_name_textview_1 = (TextView) alterdialogview.findViewById(R.id.couple_reslt_name_1);
                    TextView result_name_textview_2 = (TextView) alterdialogview.findViewById(R.id.couple_reslt_name_2);
                    TextView result_name_textview_3 = (TextView) alterdialogview.findViewById(R.id.couple_reslt_name_3);

                    TextView result_value_textview_0 = (TextView) alterdialogview.findViewById(R.id.couple_reslt_value_0);
                    TextView result_value_textview_1 = (TextView) alterdialogview.findViewById(R.id.couple_reslt_value_1);


                    Button main_actyvity_button = (Button) alterdialogview.findViewById(R.id.couple_button_back_to_mainactivity);
                    Button button_save = (Button) alterdialogview.findViewById(R.id.couple_button_save_results);

                    result_name_textview_0.setText(name_textview_0.getText());
                    result_name_textview_1.setText(name_textview_2.getText());
                    result_name_textview_2.setText(name_textview_1.getText());
                    result_name_textview_3.setText(name_textview_3.getText());

                    result_value_textview_0.setText(sum13.getText());
                    result_value_textview_1.setText(sum14.getText());


                    main_actyvity_button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Standartuli.this.finish();
                        }
                    });

                    button_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            String date = getDateTime();

                            boolean isinserted = result_database.insert_data(name_textview_0.getText().toString(), name_textview_1.getText().toString(), name_textview_2.getText().toString(), name_textview_3.getText().toString(), 0.0, 0.0, 0.0, 0.0, date, getResources().getString(R.string.standartuli), 1, Double.parseDouble(sum13.getText().toString()), Double.parseDouble(sum14.getText().toString()));

                            if (!isinserted)
                                Toast.makeText(getApplicationContext(), "database do not respond", Toast.LENGTH_LONG).show();


                            Standartuli.this.finish();

                        }
                    });


                    dialog.setView(alterdialogview);
                    final AlertDialog dialog1 = dialog.create();
                    dialog1.show();

                }
            }

        }

        Log.e("first", "" + first_player_max_value + "/n");
        Log.e("first index", "" + first_player_max_value_index + "/n");
        Log.e("second", "" + second_player_max_value + "/n");
        Log.e("second index", "" + second_player_max_value_index + "/n");
        Log.e("third", "" + third_player_max_value + "/n");
        Log.e("third index", "" + third_player_max_value_index + "/n");
        Log.e("fourth", "" + fourth_player_max_value + "/n");
        Log.e("fourth index", "" + fourth_player_max_value_index + "/n");


}
    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd   HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}







