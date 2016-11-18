<%@ page import="thesmartguage.MinistryDetails" %>



<div class="fieldcontain ${hasErrors(bean: ministryDetailsInstance, field: 'bio', 'error')} required">
	<label for="bio">
		<g:message code="ministryDetails.bio.label" default="Bio" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="bio" required="" value="${ministryDetailsInstance?.bio}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ministryDetailsInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="ministryDetails.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${ministryDetailsInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ministryDetailsInstance, field: 'fullName', 'error')} required">
	<label for="fullName">
		<g:message code="ministryDetails.fullName.label" default="Full Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="fullName" required="" value="${ministryDetailsInstance?.fullName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ministryDetailsInstance, field: 'imageName', 'error')} required">
	<label for="imageName">
		<g:message code="ministryDetails.imageName.label" default="Image Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="imageName" required="" value="${ministryDetailsInstance?.imageName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ministryDetailsInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="ministryDetails.lastName.label" default="Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" required="" value="${ministryDetailsInstance?.lastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ministryDetailsInstance, field: 'mandate', 'error')} required">
	<label for="mandate">
		<g:message code="ministryDetails.mandate.label" default="Mandate" />
		<span class="required-indicator">*</span>
	</label>
	<input type="file" id="mandate" name="mandate" />

</div>

<div class="fieldcontain ${hasErrors(bean: ministryDetailsInstance, field: 'ministryDesignation', 'error')} required">
	<label for="ministryDesignation">
		<g:message code="ministryDetails.ministryDesignation.label" default="Ministry Designation" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="ministryDesignation" required="" value="${ministryDetailsInstance?.ministryDesignation}"/>

</div>

