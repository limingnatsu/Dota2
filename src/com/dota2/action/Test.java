package com.dota2.action; /**
 * Created by nervliming on 2016/12/14.
 */
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
public class Test extends ActionSupport {


    /**
     * 从url请求中获得返回的字符串
     *
     * @return JSON字符串
     */


    private String stringw;
    private String matchId;

    //private  long matchId= 2840887819l;
    public String execute() {
        System.out.println(matchId);
        String url = "https://api.steampowered.com/IDOTA2Match_570/GetMatchDetails/V001/?key=3415B33C81F7EC4904E21981EAE33B84&match_id=" + matchId;
        stringw = HttpRequest(url);
        System.out.println(stringw);
        if (Long.parseLong(matchId) < 10000) {
            System.out.println("id小于10000");
            return ERROR;
        } else return SUCCESS;
    }

    public static String HttpRequest(String requestUrl) {
        StringBuffer sb = new StringBuffer();
        InputStream ips = getInputStream(requestUrl);
        InputStreamReader isreader = null;
        try {
            isreader = new InputStreamReader(ips, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(isreader);
        String temp = null;
        try {
            while ((temp = bufferedReader.readLine()) != null) {
                sb.append(temp);
            }
            bufferedReader.close();
            isreader.close();
            ips.close();
            ips = null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /**
     * 从请求的URL中获取返回的流数据
     *
     * @param requestUrl
     * @return InputStream
     */
    private static InputStream getInputStream(String requestUrl) {
        URL url = null;
        HttpURLConnection conn = null;
        InputStream in = null;
        try {
            url = new URL(requestUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            conn = (HttpURLConnection) url.openConnection();
            conn.setDoInput(true);
            conn.setRequestMethod("GET");
            conn.connect();

            in = conn.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return in;
    }


    public String getStringw() {
        return stringw;
    }

    public void setStringw(String stringw) {
        this.stringw = stringw;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }
}
