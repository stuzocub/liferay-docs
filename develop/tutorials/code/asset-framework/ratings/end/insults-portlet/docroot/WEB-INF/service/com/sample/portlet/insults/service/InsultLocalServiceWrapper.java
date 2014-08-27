/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sample.portlet.insults.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InsultLocalService}.
 *
 * @author nickgaskill
 * @see InsultLocalService
 * @generated
 */
public class InsultLocalServiceWrapper implements InsultLocalService,
	ServiceWrapper<InsultLocalService> {
	public InsultLocalServiceWrapper(InsultLocalService insultLocalService) {
		_insultLocalService = insultLocalService;
	}

	/**
	* Adds the insult to the database. Also notifies the appropriate model listeners.
	*
	* @param insult the insult
	* @return the insult that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.sample.portlet.insults.model.Insult addInsult(
		com.sample.portlet.insults.model.Insult insult)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.addInsult(insult);
	}

	/**
	* Creates a new insult with the primary key. Does not add the insult to the database.
	*
	* @param insultId the primary key for the new insult
	* @return the new insult
	*/
	@Override
	public com.sample.portlet.insults.model.Insult createInsult(long insultId) {
		return _insultLocalService.createInsult(insultId);
	}

	/**
	* Deletes the insult with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param insultId the primary key of the insult
	* @return the insult that was removed
	* @throws PortalException if a insult with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.sample.portlet.insults.model.Insult deleteInsult(long insultId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.deleteInsult(insultId);
	}

	/**
	* Deletes the insult from the database. Also notifies the appropriate model listeners.
	*
	* @param insult the insult
	* @return the insult that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.sample.portlet.insults.model.Insult deleteInsult(
		com.sample.portlet.insults.model.Insult insult)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.deleteInsult(insult);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _insultLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sample.portlet.insults.model.impl.InsultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sample.portlet.insults.model.impl.InsultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.sample.portlet.insults.model.Insult fetchInsult(long insultId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.fetchInsult(insultId);
	}

	/**
	* Returns the insult with the matching UUID and company.
	*
	* @param uuid the insult's UUID
	* @param companyId the primary key of the company
	* @return the matching insult, or <code>null</code> if a matching insult could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.sample.portlet.insults.model.Insult fetchInsultByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.fetchInsultByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the insult matching the UUID and group.
	*
	* @param uuid the insult's UUID
	* @param groupId the primary key of the group
	* @return the matching insult, or <code>null</code> if a matching insult could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.sample.portlet.insults.model.Insult fetchInsultByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.fetchInsultByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the insult with the primary key.
	*
	* @param insultId the primary key of the insult
	* @return the insult
	* @throws PortalException if a insult with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.sample.portlet.insults.model.Insult getInsult(long insultId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.getInsult(insultId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the insult with the matching UUID and company.
	*
	* @param uuid the insult's UUID
	* @param companyId the primary key of the company
	* @return the matching insult
	* @throws PortalException if a matching insult could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.sample.portlet.insults.model.Insult getInsultByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.getInsultByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the insult matching the UUID and group.
	*
	* @param uuid the insult's UUID
	* @param groupId the primary key of the group
	* @return the matching insult
	* @throws PortalException if a matching insult could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.sample.portlet.insults.model.Insult getInsultByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.getInsultByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the insults.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sample.portlet.insults.model.impl.InsultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of insults
	* @param end the upper bound of the range of insults (not inclusive)
	* @return the range of insults
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.sample.portlet.insults.model.Insult> getInsults(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.getInsults(start, end);
	}

	/**
	* Returns the number of insults.
	*
	* @return the number of insults
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getInsultsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.getInsultsCount();
	}

	/**
	* Updates the insult in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param insult the insult
	* @return the insult that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.sample.portlet.insults.model.Insult updateInsult(
		com.sample.portlet.insults.model.Insult insult)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.updateInsult(insult);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _insultLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_insultLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _insultLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.sample.portlet.insults.model.Insult addInsult(long userId,
		long groupId, java.lang.String insultString,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.addInsult(userId, groupId, insultString,
			serviceContext);
	}

	@Override
	public com.sample.portlet.insults.model.Insult updateInsult(long insultId,
		java.lang.String insultString,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _insultLocalService.updateInsult(insultId, insultString,
			serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public InsultLocalService getWrappedInsultLocalService() {
		return _insultLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedInsultLocalService(
		InsultLocalService insultLocalService) {
		_insultLocalService = insultLocalService;
	}

	@Override
	public InsultLocalService getWrappedService() {
		return _insultLocalService;
	}

	@Override
	public void setWrappedService(InsultLocalService insultLocalService) {
		_insultLocalService = insultLocalService;
	}

	private InsultLocalService _insultLocalService;
}