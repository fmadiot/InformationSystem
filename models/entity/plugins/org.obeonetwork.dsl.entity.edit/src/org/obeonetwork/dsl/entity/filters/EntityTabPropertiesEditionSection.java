package org.obeonetwork.dsl.entity.filters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.jface.viewers.IFilter;
import org.obeonetwork.dsl.entity.Entity;

public class EntityTabPropertiesEditionSection implements IFilter {

	
	public boolean select(Object toTest) {
		EObject eObj = EEFUtils.resolveSemanticObject(toTest);
		return (eObj != null && eObj instanceof Entity) ;
	}
}

