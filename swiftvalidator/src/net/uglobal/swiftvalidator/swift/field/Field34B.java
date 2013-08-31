
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (currency)(amount)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field34B
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field34B(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getCurrency() {
        return getComponent1();
    }

    public String getAmount() {
        return getComponent2();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "currency=" + getComponent1()).append( ", amount=" + getComponent2() ).append( "]").toString();
    }

}
