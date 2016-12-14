package com.dota2.service;

import com.dota2.action.Match;
import com.dota2.dao.MatchDao;

/**
 * Created by nervliming on 2016/12/14.
 */
public class MatchService {
    private MatchDao matchDao;
    public Match queryByMatchId(int id){
        return matchDao.queryByMatchId(id);
    }

}
