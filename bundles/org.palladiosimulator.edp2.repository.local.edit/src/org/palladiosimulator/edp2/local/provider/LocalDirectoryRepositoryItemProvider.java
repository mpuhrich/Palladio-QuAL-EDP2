/**
 */
package org.palladiosimulator.edp2.local.provider;


import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.StyledString.Style;
import org.palladiosimulator.edp2.local.LocalDirectoryRepository;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.edp2.local.LocalDirectoryRepository} object.
 */
public class LocalDirectoryRepositoryItemProvider extends LocalDirectoryRepositoryItemProviderGen
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 */
	public LocalDirectoryRepositoryItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		var repo = ((LocalDirectoryRepository)object);
		
		return String.format("Local Directory [ID: %s, Data Folder: %s]", 
		        repo.getId(), repo.getUri().toString());
	}
	
	@Override
	public Object getStyledText(Object object) {
	    var repo = ((LocalDirectoryRepository)object);
	    var result = new StyledString("Local Directory");
	    result.append("ID: " + repo.getId(), Style.COUNTER_STYLER);
	    result.append("Data: " + repo.getUri().toString(), Style.COUNTER_STYLER);
	    return result;
	}

}
