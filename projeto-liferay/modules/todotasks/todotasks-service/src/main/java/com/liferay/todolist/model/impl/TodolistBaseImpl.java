/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.todolist.model.impl;

import com.liferay.todolist.model.Todolist;
import com.liferay.todolist.service.TodolistLocalServiceUtil;

/**
 * The extended model base implementation for the Todolist service. Represents a row in the &quot;todo_Todolist&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TodolistImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TodolistImpl
 * @see Todolist
 * @generated
 */
public abstract class TodolistBaseImpl
	extends TodolistModelImpl implements Todolist {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a todolist model instance should use the <code>Todolist</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			TodolistLocalServiceUtil.addTodolist(this);
		}
		else {
			TodolistLocalServiceUtil.updateTodolist(this);
		}
	}

}