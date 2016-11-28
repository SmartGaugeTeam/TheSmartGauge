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

<div class="fieldcontain ${hasErrors(bean: ministryDetailsInstance, field: 'q1', 'error')} required">
	<label for="q1">
		<g:message code="ministryDetails.q1.label" default="Q1" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="q1" required="" value="${ministryDetailsInstance?.q1}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ministryDetailsInstance, field: 'q2', 'error')} required">
	<label for="q2">
		<g:message code="ministryDetails.q2.label" default="Q2" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="q2" required="" value="${ministryDetailsInstance?.q2}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ministryDetailsInstance, field: 'q3', 'error')} required">
	<label for="q3">
		<g:message code="ministryDetails.q3.label" default="Q3" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="q3" required="" value="${ministryDetailsInstance?.q3}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ministryDetailsInstance, field: 'q4', 'error')} required">
	<label for="q4">
		<g:message code="ministryDetails.q4.label" default="Q4" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="q4" required="" value="${ministryDetailsInstance?.q4}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ministryDetailsInstance, field: 'q5', 'error')} required">
	<label for="q5">
		<g:message code="ministryDetails.q5.label" default="Q5" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="q5" required="" value="${ministryDetailsInstance?.q5}"/>

</div>

