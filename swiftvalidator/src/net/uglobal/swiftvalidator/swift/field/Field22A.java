
package net.uglobal.swiftvalidator.swift.field;



/**
 * Field format : (type)
 * 
 * AUTO GENERATED - DO NOT HAND MODIFY
 * Generated on Sun Dec 09 17:22:28 EST 2012
 * 
 */
public class Field22A
    extends net.uglobal.swiftvalidator.swift.field.Field
{


    public Field22A(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
        super(validateData, xmlField);
    }

    @Override
    protected void parse() {
        addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));
    }

    public String getType() {
        return getComponent1();
    }

    public String toString() {
        return (new StringBuilder()).append("[" ).append( "type=" + getComponent1() ).append( "]").toString();
    }

}
