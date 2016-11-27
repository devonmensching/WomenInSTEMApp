package com.example.user.womeninstem.Database;

/**
 * Created by user on 11/23/2016.
 */
public class Counter {
    public static final String tablename = "CounterTable";
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_COUNTER = "Counter";
    public static final String COLUMN_MUTE = "Mute";
    public static final String COLUMN_TIME = "Time";


    private int id;
    private int counter;
    private  int mute;
    private int time;

    public Counter(){}
    
    public Counter(int id, int counter, int mute, int time){
        this.id = id;
        this.counter = counter;
        this.mute = mute;
        this.time = time;
    }

    public int getId(){ return this.id; }

    public void setId(int id){ this.id = id; }

    public int getCounter(){ return this.counter; }

    public void setCounter(int counter){ this.counter = counter; }

    public int getMute(){ return this.mute; }

    public void setMute(int mute){ this.mute = mute; }

    public int getTime(){ return this.time; }

    public void setTime(int time){ this.time = time; }
}
