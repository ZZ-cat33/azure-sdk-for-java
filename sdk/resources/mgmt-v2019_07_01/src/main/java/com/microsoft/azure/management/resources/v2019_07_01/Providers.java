/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_07_01;

import rx.Observable;
import com.microsoft.azure.management.resources.v2019_07_01.implementation.ProvidersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Providers.
 */
public interface Providers extends HasInner<ProvidersInner> {
    /**
     * Unregisters a subscription from a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to unregister.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Provider> unregisterAsync(String resourceProviderNamespace);

    /**
     * Registers a subscription with a resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Provider> registerAsync(String resourceProviderNamespace);

    /**
     * Gets the specified resource provider at the tenant level.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Provider> getAtTenantScopeAsync(String resourceProviderNamespace);

    /**
     * Gets all resource providers for the tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Provider> listAtTenantScopeAsync();

    /**
     * Gets the specified resource provider.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Provider> getAsync(String resourceProviderNamespace);

    /**
     * Gets all resource providers for a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Provider> listAsync();

}