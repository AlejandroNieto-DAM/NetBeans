<%@page import="java.util.List" %>
<%@page import="org.hibernate.Session" %>
<%@page import="org.hibernate.Query" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="frm_muestra_sede" method="post" action="controlador">
            <input type="hidden" name="op" value="muestraSede">
            <input type="hidden" name="idSede">
            <table border="1">
                <tr><td colspan="2" align="centre">Sedes[<a href="javascript:void(0)" onclick="javascript:document.
                            frm_muestra_sede.op.value = 'altaSede';document.frm_muestra_sede.
                            submit();">Nueva Sede</a>]</td></tr>
                <% Session s = Clases.NewHibernateUtil.getInstance().getSessionFactory().openSession();
                try{
                    Query q = s.createQuery("FROM Sede ORDER BY nomSede, idSede").setReadOnly(true);
                    
                    List<Clases.Sede> listaSedes = (List<Clases.Sede>) q.list();
                    if(listaSedes.isEmpty()){%>
                        <tr><td colspan = "2">No existen sedes</td></tr>
                        <%
                    }else{
                        for(Clases.Sede unaSede: listaSedes){%>
                            <tr>
                                <td><%=unaSede.getIdSede()%></td>
                                <td><a href="javascript:void(0)" 
                                        onclick="javascript:document.
                                        frm_muestra_sede.idSede.value = '<%=unaSede.getIdSede()%>';
                                document.frm_muestra_sede.submit();"><%=unaSede.getNomSede()%></a></td>
                                <td><a href="javascript:void(0)" 
                                        onclick="javascript:document.
                                        frm_muestra_sede.op.value = 'borrarSede';
                                        javascript:document.frm_muestra_sede.idSede.value = '<%=unaSede.getIdSede()%>';
                                        document.frm_muestra_sede.submit();"> Eliminar Sede </a></td>
                            </tr>
                            <%
                        }
                    }
                }catch(Exception e){
                    e.printStackTrace(System.err);
                }
                %>
            </table>
            
        </form>
    </body>
</html>