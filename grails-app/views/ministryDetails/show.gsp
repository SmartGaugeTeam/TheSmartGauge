
<%@ page import="thesmartguage.MinistryDetails" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'ministryDetails.label', default: 'MinistryDetails')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-ministryDetails" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-ministryDetails" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list ministryDetails">
			
				<g:if test="${ministryDetailsInstance?.bio}">
				<li class="fieldcontain">
					<span id="bio-label" class="property-label"><g:message code="ministryDetails.bio.label" default="Bio" /></span>
					
						<span class="property-value" aria-labelledby="bio-label"><g:fieldValue bean="${ministryDetailsInstance}" field="bio"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ministryDetailsInstance?.firstName}">
				<li class="fieldcontain">
					<span id="firstName-label" class="property-label"><g:message code="ministryDetails.firstName.label" default="First Name" /></span>
					
						<span class="property-value" aria-labelledby="firstName-label"><g:fieldValue bean="${ministryDetailsInstance}" field="firstName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ministryDetailsInstance?.fullName}">
				<li class="fieldcontain">
					<span id="fullName-label" class="property-label"><g:message code="ministryDetails.fullName.label" default="Full Name" /></span>
					
						<span class="property-value" aria-labelledby="fullName-label"><g:fieldValue bean="${ministryDetailsInstance}" field="fullName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ministryDetailsInstance?.imageName}">
				<li class="fieldcontain">
					<span id="imageName-label" class="property-label"><g:message code="ministryDetails.imageName.label" default="Image Name" /></span>
					
						<span class="property-value" aria-labelledby="imageName-label"><g:fieldValue bean="${ministryDetailsInstance}" field="imageName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ministryDetailsInstance?.lastName}">
				<li class="fieldcontain">
					<span id="lastName-label" class="property-label"><g:message code="ministryDetails.lastName.label" default="Last Name" /></span>
					
						<span class="property-value" aria-labelledby="lastName-label"><g:fieldValue bean="${ministryDetailsInstance}" field="lastName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ministryDetailsInstance?.mandate}">
				<li class="fieldcontain">
					<span id="mandate-label" class="property-label"><g:message code="ministryDetails.mandate.label" default="Mandate" /></span>
					
						<span class="property-value" aria-labelledby="mandate-label"><g:fieldValue bean="${ministryDetailsInstance}" field="mandate"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ministryDetailsInstance?.ministryDesignation}">
				<li class="fieldcontain">
					<span id="ministryDesignation-label" class="property-label"><g:message code="ministryDetails.ministryDesignation.label" default="Ministry Designation" /></span>
					
						<span class="property-value" aria-labelledby="ministryDesignation-label"><g:fieldValue bean="${ministryDetailsInstance}" field="ministryDesignation"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ministryDetailsInstance?.q1}">
				<li class="fieldcontain">
					<span id="q1-label" class="property-label"><g:message code="ministryDetails.q1.label" default="Q1" /></span>
					
						<span class="property-value" aria-labelledby="q1-label"><g:fieldValue bean="${ministryDetailsInstance}" field="q1"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ministryDetailsInstance?.q2}">
				<li class="fieldcontain">
					<span id="q2-label" class="property-label"><g:message code="ministryDetails.q2.label" default="Q2" /></span>
					
						<span class="property-value" aria-labelledby="q2-label"><g:fieldValue bean="${ministryDetailsInstance}" field="q2"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ministryDetailsInstance?.q3}">
				<li class="fieldcontain">
					<span id="q3-label" class="property-label"><g:message code="ministryDetails.q3.label" default="Q3" /></span>
					
						<span class="property-value" aria-labelledby="q3-label"><g:fieldValue bean="${ministryDetailsInstance}" field="q3"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ministryDetailsInstance?.q4}">
				<li class="fieldcontain">
					<span id="q4-label" class="property-label"><g:message code="ministryDetails.q4.label" default="Q4" /></span>
					
						<span class="property-value" aria-labelledby="q4-label"><g:fieldValue bean="${ministryDetailsInstance}" field="q4"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ministryDetailsInstance?.q5}">
				<li class="fieldcontain">
					<span id="q5-label" class="property-label"><g:message code="ministryDetails.q5.label" default="Q5" /></span>
					
						<span class="property-value" aria-labelledby="q5-label"><g:fieldValue bean="${ministryDetailsInstance}" field="q5"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:ministryDetailsInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${ministryDetailsInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
