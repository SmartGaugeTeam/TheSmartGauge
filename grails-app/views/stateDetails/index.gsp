
<%@ page import="thesmartguage.StateDetails" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'stateDetails.label', default: 'StateDetails')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-stateDetails" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-stateDetails" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="bio" title="${message(code: 'stateDetails.bio.label', default: 'Bio')}" />
					
						<g:sortableColumn property="firstName" title="${message(code: 'stateDetails.firstName.label', default: 'First Name')}" />
					
						<g:sortableColumn property="fullName" title="${message(code: 'stateDetails.fullName.label', default: 'Full Name')}" />
					
						<g:sortableColumn property="imageName" title="${message(code: 'stateDetails.imageName.label', default: 'Image Name')}" />
					
						<g:sortableColumn property="lastName" title="${message(code: 'stateDetails.lastName.label', default: 'Last Name')}" />
					
						<g:sortableColumn property="mandate" title="${message(code: 'stateDetails.mandate.label', default: 'Mandate')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${stateDetailsInstanceList}" status="i" var="stateDetailsInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${stateDetailsInstance.id}">${fieldValue(bean: stateDetailsInstance, field: "bio")}</g:link></td>
					
						<td>${fieldValue(bean: stateDetailsInstance, field: "firstName")}</td>
					
						<td>${fieldValue(bean: stateDetailsInstance, field: "fullName")}</td>
					
						<td>${fieldValue(bean: stateDetailsInstance, field: "imageName")}</td>
					
						<td>${fieldValue(bean: stateDetailsInstance, field: "lastName")}</td>
					
						<td>${fieldValue(bean: stateDetailsInstance, field: "mandate")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${stateDetailsInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
