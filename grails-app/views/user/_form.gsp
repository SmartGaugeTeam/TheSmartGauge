<%@ page import="thesmartguage.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'LGA', 'error')} required">
	<label for="LGA">
		<g:message code="user.LGA.label" default="LGA" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="LGA" required="" value="${userInstance?.LGA}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'city', 'error')} required">
	<label for="city">
		<g:message code="user.city.label" default="City" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="city" required="" value="${userInstance?.city}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'dob', 'error')} required">
	<label for="dob">
		<g:message code="user.dob.label" default="Dob" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dob" precision="day"  value="${userInstance?.dob}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="user.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email" required="" value="${userInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="user.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${userInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="user.lastName.label" default="Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" required="" value="${userInstance?.lastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="user.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="password" required="" value="${userInstance?.password}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'phone', 'error')} required">
	<label for="phone">
		<g:message code="user.phone.label" default="Phone" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="phone" required="" value="${userInstance?.phone}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'role', 'error')} required">
	<label for="role">
		<g:message code="user.role.label" default="Role" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="role" name="role.id" from="${thesmartguage.Role.list()}" optionKey="id" required="" value="${userInstance?.role?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'state', 'error')} required">
	<label for="state">
		<g:message code="user.state.label" default="State" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="state" required="" value="${userInstance?.state}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'userName', 'error')} required">
	<label for="userName">
		<g:message code="user.userName.label" default="User Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="userName" required="" value="${userInstance?.userName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'webSite', 'error')} required">
	<label for="webSite">
		<g:message code="user.webSite.label" default="Web Site" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="webSite" required="" value="${userInstance?.webSite}"/>

</div>

