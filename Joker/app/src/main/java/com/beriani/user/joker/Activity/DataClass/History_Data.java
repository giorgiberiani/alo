package com.beriani.user.joker.Activity.DataClass;

/**
 * Created by User on 25/12/2017.
 */

public class History_Data {


    private String first_player_name;
    private String second_player_name;
    private String third_player_name;
    private String fourth_player_name;

    private double first_player_rsult;
    private double second_player_rsult;
    private double third_player_rsult;
    private double fourth_player_rsult;
    private int id;
    private String datetime;
    private String gametype;
    int couple;

    double firstcoupleresult;
    double secondcoupleresult;

    public History_Data(int id,String first_player_name, String second_player_name, String third_player_name, String fourth_player_name, double first_player_rsult, double second_player_rsult, double third_player_rsult, double fourth_player_rsult, String datetime, String gametype, int couple, double firstcoupleresult, double secondcoupleresult) {
        this.first_player_name = first_player_name;
        this.id = id;
        this.second_player_name = second_player_name;
        this.third_player_name = third_player_name;
        this.fourth_player_name = fourth_player_name;
        this.first_player_rsult = first_player_rsult;
        this.second_player_rsult = second_player_rsult;
        this.third_player_rsult = third_player_rsult;
        this.fourth_player_rsult = fourth_player_rsult;
        this.datetime = datetime;
        this.gametype = gametype;
        this.couple = couple;
        this.firstcoupleresult = firstcoupleresult;
        this.secondcoupleresult = secondcoupleresult;
    }

    @Override
    public String toString() {
        return "History_Data{" + "id=" + id + '}';
    }

    public int getId() {return id;}

    public double getFirstcoupleresult() {
        return firstcoupleresult;
    }

    public double getSecondcoupleresult() {
        return secondcoupleresult;
    }

    public int getCouple() {
        return couple;
    }

    public String getGametype() {
        return gametype;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getFirst_player_name() {
        return first_player_name;
    }

    public String getSecond_player_name() {
        return second_player_name;
    }

    public String getThird_player_name() {
        return third_player_name;
    }

    public String getFourth_player_name() {
        return fourth_player_name;
    }

    public double getFirst_player_rsult() {
        return first_player_rsult;
    }

    public double getSecond_player_rsult() {
        return second_player_rsult;
    }

    public double getThird_player_rsult() {
        return third_player_rsult;
    }

    public double getFourth_player_rsult() {
        return fourth_player_rsult;
    }
}
