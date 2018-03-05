package com.beriani.user.joker.Activity.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.beriani.user.joker.Activity.DataClass.History_Data;
import com.beriani.user.joker.Activity.Database.DatabaseHelper;
import com.beriani.user.joker.R;
import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

import java.util.List;



public class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.MyViewHolder> {

    private List<History_Data> datalist;
    private History_Data data;



    public RecyclerView_Adapter(List<History_Data> datalist) {
        this.datalist = datalist;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;

          view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_expandable_layout, parent, false);
           return new MyViewHolder(view);


    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {


        data = datalist.get(position);

        holder.date_textview.setText(data.getDatetime());
        holder.game_type.setText(data.getGametype());



        if (data.getCouple() == 0) {

            holder.first_player_name.setText(data.getFirst_player_name());
            holder.second_player_name.setText(data.getSecond_player_name());
            holder.third_player_name.setText(data.getThird_player_name());
            holder.fourth_player_name.setText(data.getFourth_player_name());
            holder.first_player_rsult.setText("" + data.getFirst_player_rsult());
            holder.second_player_rsult.setText("" + data.getSecond_player_rsult());
            holder.third_player_rsult.setText("" + data.getThird_player_rsult());
            holder.fourth_player_rsult.setText("" + data.getFourth_player_rsult());
            } else {
            holder.first_player_name.setText(data.getFirst_player_name());
            holder.second_player_name.setText(data.getThird_player_name());
            holder.third_player_name.setText(data.getSecond_player_name());
            holder.fourth_player_name.setText(data.getFourth_player_name());
            holder.first_player_rsult.setVisibility(View.GONE);
            holder.third_player_rsult.setVisibility(View.GONE);
            holder.second_player_rsult.setText("" + data.getFirstcoupleresult());
            holder.fourth_player_rsult.setText("" + data.getSecondcoupleresult());
            }

             holder.linearLayout.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     holder.expandableRelativeLayout.toggle();
                 }
             });


    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{


            TextView first_player_name, second_player_name, third_player_name, fourth_player_name;
            TextView first_player_rsult, second_player_rsult, third_player_rsult, fourth_player_rsult;
            TextView date_textview, game_type;
            ImageView dropdown;
            LinearLayout linearLayout;
            ExpandableRelativeLayout expandableRelativeLayout;


        public MyViewHolder(View itemView) {
            super(itemView);



                    expandableRelativeLayout = (ExpandableRelativeLayout) itemView.findViewById(R.id.expandableLayout1);
                    linearLayout = (LinearLayout) itemView.findViewById(R.id.linearlayout);
                    dropdown = (ImageView) itemView.findViewById(R.id.dropdownimageview);
                    game_type = (TextView) itemView.findViewById(R.id.game_type);
                    date_textview = (TextView) itemView.findViewById(R.id.date_textview);
                    first_player_name = (TextView) itemView.findViewById(R.id.first_player_name);
                    second_player_name = (TextView) itemView.findViewById(R.id.second_player_name);
                    third_player_name = (TextView) itemView.findViewById(R.id.third_player_name);
                    fourth_player_name = (TextView) itemView.findViewById(R.id.fourth_player_name);
                    first_player_rsult = (TextView) itemView.findViewById(R.id.first_player_rsult);
                    second_player_rsult = (TextView) itemView.findViewById(R.id.second_player_rsult);
                    third_player_rsult = (TextView) itemView.findViewById(R.id.third_player_rsult);
                    fourth_player_rsult = (TextView) itemView.findViewById(R.id.fourth_player_rsult);

        }


    }
    public int remove(int position,DatabaseHelper db) {

         datalist.remove(position);
         Integer result = db.delete_data(""+data.getId());
         notifyItemRemoved(position);
         return result;
        }


}


