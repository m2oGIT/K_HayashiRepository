<%@ page pageEncoding="Shift_JIS"
         contentType="text/html; charset=Shift_JIS" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<html>
<head>
<title>JSP: ���݂̓�������������m�F�p�T���v��</title>
</head>
<body>

<%
    Date d = new Date();
    DateFormat df = DateFormat.getDateTimeInstance();
%>

<p>
<br />
���[�J���T�[�o�[�̋N�����m�F���܂����B
<br />
<br />
���݂̎�����
<br />
<%= df.format(d) %>
<br />
�ł��B
<br />
</p>

</body>
</html>
