<%-- 
    Document   : newjsp
    Created on : 1/09/2023, 3:43:18 p. m.
    Author     : miran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RESULTADOS</title>
    </head>
    <body>
 <h1>Resultado del Cálculo</h1>

    <%-- Recoger los datos del formulario --%>
    <%
        int numAni = Integer.parseInt(request.getParameter("numAni"));
        int numHr = Integer.parseInt(request.getParameter("numHr"));

        int[] tamAni = new int[numAni];
        for (int i = 0; i < numAni; i++) {
            int tam = Integer.parseInt(request.getParameter("tamAni" + (i + 1)));
            tamAni[i] = tam;
        }

        // Llamar a la función precio
        int costoFi = precio(tamAni, numHr);
    %>

    <p>El costo total es: <%= costoFi %></p>
</body>
</html>

<%!
    public static int precio(int[] tama, int numhr) {
        int costo = 0;
        for (int i = 0; i < tama.length; i++) {
            if (tama[i] == 1) {
                costo += (10000 * numhr);
            } else if (tama[i] == 2) {
                costo += (5000 * numhr);
            } else if (tama[i] == 3) {
                costo += (3000 * numhr);
            }
        }
        if (tama.length > 1) {
            double descu = costo * 0.10;
            costo -= descu;
        }
        return costo;
    }
%>    </body>
</html>
