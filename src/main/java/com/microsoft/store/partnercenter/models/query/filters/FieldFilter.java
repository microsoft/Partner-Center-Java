// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.query.filters;

/**
 * A base class that represents a filter applied to a field.
 */
public abstract class FieldFilter
{
    /**
     * Gets or sets the filter operator.
     */
    private FieldFilterOperation __Operator = FieldFilterOperation.EQUALS;

    public FieldFilterOperation getOperator()
    {
        return __Operator;
    }

    public void setOperator(FieldFilterOperation value)
    {
        __Operator = value;
    }

    /**
     * Gets or sets the filter Type.
     */
    private FieldType __FieldType = FieldType.STRING;

    public FieldType getFieldType()
    {
        return __FieldType;
    }

    public void setFieldType(FieldType value)
    {
        __FieldType = value;
    }

    /**
     * Generates a filter expression string.
     * 
     * @param filterExpressionGenerator The filter expression generator to use.
     * @return The filter expression according to the provided generator language.
     */
    public abstract String generateExpression(IFilterExpressionGenerator filterExpressionGenerator);

}
