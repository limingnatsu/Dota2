<%--
  Created by IntelliJ IDEA.
  User: nervliming
  Date: 2016/12/13
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head >
    <title>$Title$</title>
  </head>
  <body>
  <h5>Welcome to The International</h5>

  <form name="matcha" action="match" method="post">
      <table>
        <tr>
          <th>
            <!--只允许输入数字ID而且长度有限制-->
            <input type="text" name="matchId">请输入比赛ID
          </th>
        </tr>
        <tr>
          <td>
            <input type="submit" value="提交">
          </td>
          <td>
            <input type="reset" value="重置">
          </td>
        </tr>
      </table>
  </form>
  </body>
</html>
