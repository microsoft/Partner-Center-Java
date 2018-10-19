// -----------------------------------------------------------------------
// <copyright file="IFilterExpressionGenerator.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query.filters;

/**
 * Represents a filter expression generator using a language.
 */
public interface IFilterExpressionGenerator
{
    /**
     * Generates a simple filter expression.
     * 
     * @param field The filter field.
     * @param operation The filter operation.
     * @param value The filter value.
     * @param type The type of field.
     * @return The filter expression.
     */
    String generateSimpleExpression( String field, FieldFilterOperation operation, String value, FieldType type );

    /**
     * Generates a compound filter expression ( A equals 5 and ( B equals 8 or C notEquals 0 ) )
     * 
     * @param leftSideExpression The left side expression.
     * @param operation The filter operator.
     * @param rightSideExpression The right side expression.
     * @return The filter expression.
     */
    String generateCompoundExpression( String leftSideExpression, FieldFilterOperation operation, String rightSideExpression );
}