package com.dota2.dao;

import com.dota2.action.Match;
import com.dota2.dao.json.Result;
import com.google.gson.Gson;


/**
 * Created by nervliming on 2016/12/14.
 */
public class MatchDao {


    public Match queryByMatchId(int id) {
        Gson gson ;
        Match match = new Match();
        return match;
    }
}
