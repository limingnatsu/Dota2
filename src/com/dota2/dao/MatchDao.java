package com.dota2.dao;

import com.dota2.action.Match;
import com.dota2.dao.json.Result;
import com.google.gson.Gson;

/**
 * Created by nervliming on 2016/12/14.
 */
public class MatchDao {


    public Match queryByMatchId(int id) {
        Gson gson = new Gson();
        Result result = gson.fromJson(jsonData, Result.class);
//取出 weatherInfo
        List<WeatherinfoBean> weather =  result .getWeatherinfo();
        String city = " ";
        for(WeatherinfoBean city : weather ){
            city += city.getCity()+"\n";
        }

        Match match = new Match();
        return match;
    }
}
