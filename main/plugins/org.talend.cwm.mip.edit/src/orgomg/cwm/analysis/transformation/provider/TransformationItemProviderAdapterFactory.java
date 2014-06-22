/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package orgomg.cwm.analysis.transformation.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import orgomg.cwm.analysis.transformation.util.TransformationAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationItemProviderAdapterFactory extends TransformationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformationItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.transformation.Transformation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformationItemProvider transformationItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.transformation.Transformation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTransformationAdapter() {
        if (transformationItemProvider == null) {
            transformationItemProvider = new TransformationItemProvider(this);
        }

        return transformationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.transformation.DataObjectSet} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataObjectSetItemProvider dataObjectSetItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.transformation.DataObjectSet}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDataObjectSetAdapter() {
        if (dataObjectSetItemProvider == null) {
            dataObjectSetItemProvider = new DataObjectSetItemProvider(this);
        }

        return dataObjectSetItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.transformation.TransformationTask} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformationTaskItemProvider transformationTaskItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.transformation.TransformationTask}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTransformationTaskAdapter() {
        if (transformationTaskItemProvider == null) {
            transformationTaskItemProvider = new TransformationTaskItemProvider(this);
        }

        return transformationTaskItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.transformation.TransformationStep} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformationStepItemProvider transformationStepItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.transformation.TransformationStep}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTransformationStepAdapter() {
        if (transformationStepItemProvider == null) {
            transformationStepItemProvider = new TransformationStepItemProvider(this);
        }

        return transformationStepItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.transformation.TransformationActivity} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformationActivityItemProvider transformationActivityItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.transformation.TransformationActivity}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTransformationActivityAdapter() {
        if (transformationActivityItemProvider == null) {
            transformationActivityItemProvider = new TransformationActivityItemProvider(this);
        }

        return transformationActivityItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.transformation.PrecedenceConstraint} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PrecedenceConstraintItemProvider precedenceConstraintItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.transformation.PrecedenceConstraint}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPrecedenceConstraintAdapter() {
        if (precedenceConstraintItemProvider == null) {
            precedenceConstraintItemProvider = new PrecedenceConstraintItemProvider(this);
        }

        return precedenceConstraintItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.transformation.TransformationUse} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformationUseItemProvider transformationUseItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.transformation.TransformationUse}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTransformationUseAdapter() {
        if (transformationUseItemProvider == null) {
            transformationUseItemProvider = new TransformationUseItemProvider(this);
        }

        return transformationUseItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.transformation.TransformationMap} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformationMapItemProvider transformationMapItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.transformation.TransformationMap}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTransformationMapAdapter() {
        if (transformationMapItemProvider == null) {
            transformationMapItemProvider = new TransformationMapItemProvider(this);
        }

        return transformationMapItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.transformation.TransformationTree} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformationTreeItemProvider transformationTreeItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.transformation.TransformationTree}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTransformationTreeAdapter() {
        if (transformationTreeItemProvider == null) {
            transformationTreeItemProvider = new TransformationTreeItemProvider(this);
        }

        return transformationTreeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.transformation.ClassifierMap} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassifierMapItemProvider classifierMapItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.transformation.ClassifierMap}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createClassifierMapAdapter() {
        if (classifierMapItemProvider == null) {
            classifierMapItemProvider = new ClassifierMapItemProvider(this);
        }

        return classifierMapItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.transformation.FeatureMap} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FeatureMapItemProvider featureMapItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.transformation.FeatureMap}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createFeatureMapAdapter() {
        if (featureMapItemProvider == null) {
            featureMapItemProvider = new FeatureMapItemProvider(this);
        }

        return featureMapItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.transformation.StepPrecedence} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StepPrecedenceItemProvider stepPrecedenceItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.transformation.StepPrecedence}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createStepPrecedenceAdapter() {
        if (stepPrecedenceItemProvider == null) {
            stepPrecedenceItemProvider = new StepPrecedenceItemProvider(this);
        }

        return stepPrecedenceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.analysis.transformation.ClassifierFeatureMap} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassifierFeatureMapItemProvider classifierFeatureMapItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.analysis.transformation.ClassifierFeatureMap}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createClassifierFeatureMapAdapter() {
        if (classifierFeatureMapItemProvider == null) {
            classifierFeatureMapItemProvider = new ClassifierFeatureMapItemProvider(this);
        }

        return classifierFeatureMapItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose() {
        if (transformationItemProvider != null) transformationItemProvider.dispose();
        if (dataObjectSetItemProvider != null) dataObjectSetItemProvider.dispose();
        if (transformationTaskItemProvider != null) transformationTaskItemProvider.dispose();
        if (transformationStepItemProvider != null) transformationStepItemProvider.dispose();
        if (transformationActivityItemProvider != null) transformationActivityItemProvider.dispose();
        if (precedenceConstraintItemProvider != null) precedenceConstraintItemProvider.dispose();
        if (transformationUseItemProvider != null) transformationUseItemProvider.dispose();
        if (transformationMapItemProvider != null) transformationMapItemProvider.dispose();
        if (transformationTreeItemProvider != null) transformationTreeItemProvider.dispose();
        if (classifierMapItemProvider != null) classifierMapItemProvider.dispose();
        if (featureMapItemProvider != null) featureMapItemProvider.dispose();
        if (stepPrecedenceItemProvider != null) stepPrecedenceItemProvider.dispose();
        if (classifierFeatureMapItemProvider != null) classifierFeatureMapItemProvider.dispose();
    }

}