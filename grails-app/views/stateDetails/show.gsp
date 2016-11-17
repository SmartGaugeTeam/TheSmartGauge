
<%@ page import="thesmartguage.StateDetails" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'stateDetails.label', default: 'StateDetails')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-stateDetails" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-stateDetails" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list stateDetails">
			
				<g:if test="${stateDetailsInstance?.bio}">
				<li class="fieldcontain">
					<span id="bio-label" class="property-label"><g:message code="stateDetails.bio.label" default="Bio" /></span>
					
						<span class="property-value" aria-labelledby="bio-label"><g:fieldValue bean="${stateDetailsInstance}" field="bio"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${stateDetailsInstance?.firstName}">
				<li class="fieldcontain">
					<span id="firstName-label" class="property-label"><g:message code="stateDetails.firstName.label" default="First Name" /></span>
					
						<span class="property-value" aria-labelledby="firstName-label"><g:fieldValue bean="${stateDetailsInstance}" field="firstName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${stateDetailsInstance?.fullName}">
				<li class="fieldcontain">
					<span id="fullName-label" class="property-label"><g:message code="stateDetails.fullName.label" default="Full Name" /></span>
					
						<span class="property-value" aria-labelledby="fullName-label"><g:fieldValue bean="${stateDetailsInstance}" field="fullName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${stateDetailsInstance?.imageName}">
				<li class="fieldcontain">
					<span id="imageName-label" class="property-label"><g:message code="stateDetails.imageName.label" default="Image Name" /></span>
					
						<span class="property-value" aria-labelledby="imageName-label"><g:fieldValue bean="${stateDetailsInstance}" field="imageName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${stateDetailsInstance?.lastName}">
				<li class="fieldcontain">
					<span id="lastName-label" class="property-label"><g:message code="stateDetails.lastName.label" default="Last Name" /></span>
					
						<span class="property-value" aria-labelledby="lastName-label"><g:fieldValue bean="${stateDetailsInstance}" field="lastName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${stateDetailsInstance?.mandate}">
				<li class="fieldcontain">
					<span id="mandate-label" class="property-label"><g:message code="stateDetails.mandate.label" default="Mandate" /></span>
					
						<span class="property-value" aria-labelledby="mandate-label"><g:fieldValue bean="${stateDetailsInstance}" field="mandate"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${stateDetailsInstance?.ministryDesignation}">
				<li class="fieldcontain">
					<span id="ministryDesignation-label" class="property-label"><g:message code="stateDetails.ministryDesignation.label" default="Ministry Designation" /></span>
					
						<span class="property-value" aria-labelledby="ministryDesignation-label"><g:fieldValue bean="${stateDetailsInstance}" field="ministryDesignation"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:stateDetailsInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${stateDetailsInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
