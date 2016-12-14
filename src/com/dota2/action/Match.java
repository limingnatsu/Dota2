package com.dota2.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by nervliming on 2016/12/14.
 */
public class Match extends ActionSupport {

    public String queryByMatchId(int id){
        return SUCCESS;
    }
}
