
<%@ page import="thesmartguage.MinistryDetails" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'ministryDetails.label', default: 'MinistryDetails')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-ministryDetails" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-ministryDetails" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="bio" title="${message(code: 'ministryDetails.bio.label', default: 'Bio')}" />
					
						<g:sortableColumn property="firstName" title="${message(code: 'ministryDetails.firstName.label', default: 'First Name')}" />
					
						<g:sortableColumn property="fullName" title="${message(code: 'ministryDetails.fullName.label', default: 'Full Name')}" />
					
						<g:sortableColumn property="imageName" title="${message(code: 'ministryDetails.imageName.label', default: 'Image Name')}" />
					
						<g:sortableColumn property="lastName" title="${message(code: 'ministryDetails.lastName.label', default: 'Last Name')}" />
					
						<g:sortableColumn property="mandate" title="${message(code: 'ministryDetails.mandate.label', default: 'Mandate')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${ministryDetailsInstanceList}" status="i" var="ministryDetailsInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${ministryDetailsInstance.id}">${fieldValue(bean: ministryDetailsInstance, field: "bio")}</g:link></td>
					
						<td>${fieldValue(bean: ministryDetailsInstance, field: "firstName")}</td>
					
						<td>${fieldValue(bean: ministryDetailsInstance, field: "fullName")}</td>
					
						<td>${fieldValue(bean: ministryDetailsInstance, field: "imageName")}</td>
					
						<td>${fieldValue(bean: ministryDetailsInstance, field: "lastName")}</td>
					
						<td>${fieldValue(bean: ministryDetailsInstance, field: "mandate")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${ministryDetailsInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
