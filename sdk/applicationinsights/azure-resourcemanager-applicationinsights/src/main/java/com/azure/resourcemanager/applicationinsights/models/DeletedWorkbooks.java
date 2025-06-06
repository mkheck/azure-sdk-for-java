// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import java.util.List;

/**
 * Resource collection API of DeletedWorkbooks.
 */
public interface DeletedWorkbooks {
    /**
     * Get all recently deleted Workbooks in a specified subscription.
     * 
     * @throws com.azure.resourcemanager.applicationinsights.models.DeletedWorkbookErrorDefinitionException thrown if
     * the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all recently deleted Workbooks in a specified subscription as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<DeletedWorkbook> list();

    /**
     * Get all recently deleted Workbooks in a specified subscription.
     * 
     * @param category Category of workbook to return.
     * @param tags Tags presents on each workbook returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.DeletedWorkbookErrorDefinitionException thrown if
     * the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all recently deleted Workbooks in a specified subscription as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<DeletedWorkbook> list(CategoryType category, List<String> tags, Context context);
}
