package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (partyIdentifier)(nameAndAddress)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 01:34:52 EST 2012
 * 
 */
public class Field54DTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// [/1!a][/34x1!r1!w]4*35x
		setup(FieldComponentsFormat.FORMAT069.getFormat());
	}

	@Test
	public void testParse1() {
		String partyIdentifier = "line1";
		String nameAndAddress = "line2";
		String validateData = partyIdentifier + NEW_LINE + nameAndAddress;
		Field54D f = new Field54D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPartyIdentifier(), partyIdentifier);
		org.testng.Assert.assertEquals(f.getNameAndAddress(), nameAndAddress);
	}

}
