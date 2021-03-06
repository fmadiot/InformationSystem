package org.obeonetwork.requirement.m2doc.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.obeonetwork.dsl.requirement.Requirement;

/**
 * AQL Services for Requirement's concepts.
 * 
 * @author Romain Guider
 *
 */
public class RequirementServices {
	/**
	 * Returns the list of {@link Requirement} that reference the specified
	 * eObject. For the service to work, eObject must be present in a
	 * 
	 * @param eObject
	 * @return the list of {@link Requirement} instances that reference the
	 *         specified eObject.
	 */
	public List<Requirement> relatedRequirements(EObject eObject) {
		Resource resource = eObject.eResource();
		List<Requirement> result = new ArrayList<Requirement>();
		if (resource != null) {
			ResourceSet resourceSet = resource.getResourceSet();
			if (resourceSet != null) {
				Collection<Setting> settings = EcoreUtil.UsageCrossReferencer.find(eObject, resourceSet);
				for (Setting setting : settings) {
					if (setting.getEObject() instanceof Requirement) {
						result.add(((Requirement) setting.getEObject()));
					}
				}
			}
		}
		return result;
	}

}
