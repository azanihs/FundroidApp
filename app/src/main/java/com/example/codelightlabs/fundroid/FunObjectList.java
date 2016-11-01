package com.example.codelightlabs.fundroid;

import java.util.ArrayList;

/**
 * Created by codelightlabs on 11/1/2016.
 */

public class FunObjectList {

    private static ArrayList<FunOb> funList;

    public FunObjectList() {
        this.funList = new ArrayList<FunOb>();
        populateList();
    }

    private static void populateList(){
        funList.add(new FunOb(R.drawable.computer,"This is a Computer","#ba68c8"));
        funList.add(new FunOb(R.drawable.eraser,"This is a Eraser","#9c27b0"));
        funList.add(new FunOb(R.drawable.light_bulb,"This is a Light Bulb Ok","#80deea"));
    }

    public ArrayList<FunOb> getFunList() {
        return funList;
    }
}
