package com.example.user.womeninstem.Database;

/**
 * Created by user on 11/23/2016.
 */
public class Women {
    public static final String tablename = "WomenTable";
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_NAME = "Name";
    public static final String COLUMN_DESCRIPTION  ="Description";

    private int id;
    private String name;
    private String descrption;

    public Women(){}

    public Women(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.descrption = description;
    }

    public int getId(){ return this.id; }

    public void setId(int id){ this.id = id; }

    public String getName(){ return this.name; }

    public void setName(String name){ this.name = name; }

    public String getDescrption(){ return this.descrption; }

    public void setDescrption(String descrption){ this.descrption = descrption; }
}
