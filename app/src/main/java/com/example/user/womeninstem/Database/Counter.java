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
    public static final String COLUMN_ALARM = "Alarm";


    private int id;
    private int counter;
    private  int mute;
    private int time;
    private int alarm;

    public Counter(){}
    
    public Counter(int id, int counter, int mute, int time, int alarm){
        this.id = id;
        this.counter = counter;
        this.mute = mute;
        this.time = time;
        this.alarm = alarm;
    }

    public int getId(){ return this.id; }

    public void setId(int id){ this.id = id; }

    public int getCounter(){ return this.counter; }

    public void setCounter(int counter){ this.counter = counter; }

    public int getMute(){ return this.mute; }

    public void setMute(int mute){ this.mute = mute; }

    public int getTime(){ return this.time; }

    public void setTime(int time){ this.time = time; }

    public int getAlarm(){ return this.alarm; }

    public void setAlarm(int alarm){ this.alarm = alarm; }
}
