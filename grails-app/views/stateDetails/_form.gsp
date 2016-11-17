<%@ page import="thesmartguage.StateDetails" %>



<div class="fieldcontain ${hasErrors(bean: stateDetailsInstance, field: 'bio', 'error')} required">
	<label for="bio">
		<g:message code="stateDetails.bio.label" default="Bio" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="bio" required="" value="${stateDetailsInstance?.bio}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: stateDetailsInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="stateDetails.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${stateDetailsInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: stateDetailsInstance, field: 'fullName', 'error')} required">
	<label for="fullName">
		<g:message code="stateDetails.fullName.label" default="Full Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="fullName" required="" value="${stateDetailsInstance?.fullName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: stateDetailsInstance, field: 'imageName', 'error')} required">
	<label for="imageName">
		<g:message code="stateDetails.imageName.label" default="Image Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="imageName" required="" value="${stateDetailsInstance?.imageName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: stateDetailsInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="stateDetails.lastName.label" default="Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" required="" value="${stateDetailsInstance?.lastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: stateDetailsInstance, field: 'mandate', 'error')} required">
	<label for="mandate">
		<g:message code="stateDetails.mandate.label" default="Mandate" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="mandate" required="" value="${stateDetailsInstance?.mandate}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: stateDetailsInstance, field: 'ministryDesignation', 'error')} required">
	<label for="ministryDesignation">
		<g:message code="stateDetails.ministryDesignation.label" default="Ministry Designation" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="ministryDesignation" required="" value="${stateDetailsInstance?.ministryDesignation}"/>

</div>

