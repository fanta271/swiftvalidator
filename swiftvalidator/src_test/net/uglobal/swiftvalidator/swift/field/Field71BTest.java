
package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Field format : (narrative)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 13:45:22 EDT 2012
 * 
 */
public class Field71BTest
    extends FieldTest
{


    @BeforeClass
    public void beforeClass() {
        // 6*35x
        setup(FieldComponentsFormat.FORMAT061.getFormat());
    }

    @Test
    public void testParse1() {
        String narrative = "TODO";
        String validateData = "TODO";
        Field71B f = new Field71B(validateData, xmlField);
        org.testng.Assert.assertEquals(f.getNarrative(), narrative);
    }

}
