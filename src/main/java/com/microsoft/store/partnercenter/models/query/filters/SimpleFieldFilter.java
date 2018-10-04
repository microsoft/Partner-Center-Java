// -----------------------------------------------------------------------
// <copyright file="SimpleFieldFilter.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query.filters;

import java.text.MessageFormat;
import java.util.Locale;

/**
 * A simple filter applied to a field. An example is (Year lessThan 1999).
 */
public class SimpleFieldFilter
    extends FieldFilter
{
    /**
     * Initializes a new instance of the SimpleFieldFilter class.
     */
    public SimpleFieldFilter()
    {
        this.setFieldType( FieldType.STRING );
    }

    /**
     * Initializes a new instance of the SimpleFieldFilter class.
     * 
     * @param field The filter field name
     * @param value The value to execute the operator on.
     * @param operation The operator value.
     */
    public SimpleFieldFilter( String field, FieldFilterOperation operation, String value )
    {
        this( field, value, operation, FieldType.STRING );
    }

    /**
     * Initializes a new instance of the SimpleFieldFilter class.
     * 
     * @param field The filter field name
     * @param value The value to execute the operator on.
     * @param operation The operator value.
     */
    public SimpleFieldFilter( String field, String value, FieldFilterOperation operation )
    {
        this( field, value, operation, FieldType.STRING );
    }

    /**
     * Initializes a new instance of the SimpleFieldFilter class.
     * 
     * @param field The filter field name
     * @param value The value to execute the operator on.
     * @param operation The operator value.
     * @param fieldType The field type.x
     */
    public SimpleFieldFilter( String field, String value, FieldFilterOperation operation, FieldType fieldType )
    {
        this.setField( field );
        this.setValue( value );
        this.setOperator( operation );
        this.setFieldType( fieldType );
    }

    /**
     * Gets or sets the filtered field name.
     */
    private String __Field = new String();

    public String getField()
    {
        return __Field;
    }

    public void setField( String value )
    {
        __Field = value;
    }

    /**
     * Gets or sets the filter value.
     */
    private String __Value = new String();

    public String getValue()
    {
        return __Value;
    }

    public void setValue( String value )
    {
        __Value = value;
    }

    /**
     * Generates a filter expression string.
     * 
     * @param filterExpressionGenerator The filter expression generator to use.
     * @return The filter expression according to the provided generator language.
     * @throws ArgumentNullException if the passed filter expression generator is null.
     */
    public String generateExpression( IFilterExpressionGenerator filterExpressionGenerator )
    {
        if ( filterExpressionGenerator == null )
        {
            throw new IllegalArgumentException( "filterExpressionGenerator can't be null" );
        }

        return filterExpressionGenerator.generateSimpleExpression( 
            this.getField(), 
            this.getOperator(), 
            this.getValue(),
            this.getFieldType() );
    }

    /**
     * Prints the simple filter details.
     * 
     * @return Simple filter details
     */
    public String toString()
    {
        return MessageFormat.format( "( {0} {1} {2} )", this.getField(), this.getOperator(), this.getValue(),
                                     Locale.US );
    }

}
