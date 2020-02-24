<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.Query"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="sede" scope="request" class="Clases.Sede"/>
<jsp:setProperty name="sede" property="*"/>

<%
    Clases.Sede sedeBean = (Clases.Sede) request.getAttribute("sede");
    if (sedeBean == null) {
%>
ERROR: no se especific&oacute; sede a mostrar.
<%
} else {
    Session s = Clases.NewHibernateUtil.getInstance().getSessionFactory().openSession();
    try {
        s.refresh(sedeBean);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sede <%=sedeBean.getIdSede()%> - <%=sedeBean.getNomSede()%></title>
    </head>
    <body>
        <p>Sede <%=sedeBean.getIdSede()%> - <%=sedeBean.getNomSede()%></p>
        <table border="1"><tr><td colspan="2" align="center">Departamentos</td></tr>
                    <%
                      if (sedeBean.getDepartamentos().isEmpty()) {%>
            <tr><td colspan="2">No existen departamentos en esta sede</td></tr>
            <%
            } else {
                Iterator itDeptos = sedeBean.getDepartamentos().iterator();
                while (itDeptos.hasNext()) {
                    Clases.Departamento unDepto = (Clases.Departamento) itDeptos.next();
            %>
            <tr>
                <td><%=unDepto.getIdDepto()%></td>
                <td><%=unDepto.getNomDepto()%></td>
            </tr>
            <%
                    }
                }
            %>
        </table>
    </body>
</html>
<%
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
%>
