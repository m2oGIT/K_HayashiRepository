<%@ page pageEncoding="Shift_JIS"
         contentType="text/html; charset=Shift_JIS" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<html>
<head>
<title>JSP: 現在の日時を示す動作確認用サンプル</title>
</head>
<body>

<%
    Date d = new Date();
    DateFormat df = DateFormat.getDateTimeInstance();
%>

<p>
<br />
ローカルサーバーの起動を確認しました。
<br />
<br />
現在の時刻は
<br />
<%= df.format(d) %>
<br />
です。
<br />
</p>

</body>
</html>
