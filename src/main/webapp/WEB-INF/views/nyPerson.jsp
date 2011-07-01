<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "sf" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<title>Lagre ny person</title>
</head>
<body>
<h1>Ny person</h1>
${controllerMessage}

<sf:form method="POST" modelAttribute="person" action="registrering/lagre">
  <fieldset>
    <table cellspacing="0">
      <tr>
        <th><label for="person_initialer">Initialer:</label></th>
        <td><sf:input path="initialer" size="3" id="person_initialer"/></td>
      </tr>
      <tr>
        <th><label for="person_navn">Navn:</label></th>
        <td><sf:input path="navn" size="30" maxlength="30" id="person_navn"/><small id="navn_msg">Fornavn, Etternavn.</small></td>
      </tr>
      <tr>
        <th></th>
        <td>
          <sf:checkbox path="aktiv" id="person_aktiv"/>
          <label for="person_aktiv">Aktiv</label>
        </td>
      </tr>
      <tr>
      <td colspan="2"><input type="submit" value="Lagre"/></td>
      </tr>

    </table>
  </fieldset>
</sf:form>
</body>
</html>
