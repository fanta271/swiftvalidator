package net.uglobal.swiftvalidator.swift.model;

/*
 * README: 
 * 
 * Output
 * 
 * For output messages, the output Application Header defines the type of message, who sent it and when, and when 
 * it was delivered.
 * The following is an example of an output Application Header, as it might appear at the top of a user-to-user 
 * message, output within FIN.
 * 
 * {2:	O	100	1200	010103BANKBEBBAXXX2222123456	010103	1201	N
 *  (a)	(b)	(c)	(d)	    (e)	                            (f)	    (g)	    (h)
 *  
 * (a) Block Identifier
 * The Block Identifier for an Application Header Block is always '2:'.
 * 
 * (b) Input/Output Identifier
 * For an output message, the Input/Output Identifier consists of the single letter 'O'.
 * 
 * (c) Message Type
 * The Message Type consists of 3 digits which define the MT number of the output message. The example used is for
 *  an MT 103 Customer Transfer.
 * 
 * (d) Input Time
 * The Input Time (HHMM) is expressed in the sender's local time. 
 * If the message is a system message, the input time is the time the message was generated by the system, according 
 * to Greenwich Mean Time (GMT).
 * 
 * (e) MIR
 * Every input message is assigned a unique MIR. This is a string of 28 characters which consists of the date, local 
 * to the sender, when the message was input, and the sender's full SWIFT address, Session Number and ISN.
 * 
 * If the output message is system generated, the system MIR will show a Pseudo-Logical Terminal (PLT) address, 
 * for example, DYLRXXXXXXXX, identifying as the sender the particular suite of programs which generated the message within the system. The date given in the system MIR is the generation date, according to GMT.
 * 
 * (f) Output Date
 * The Output Date (YYMMDD) is the date, local to the receiver, on which the message is delivered to the receiver.
 * 
 * (g) Output Time
 * The Output Time (HHMM) is the time, local to the receiver, at which the message is actually delivered to the receiver.
 * 
 * (h) Message Priority
 * The Message Priority, for FIN messages only, is repeated in the FIN output Application Header.
 * GPA output Application Headers are similar to their FIN equivalent except that for GPA the Message Priority is not 
 * included.	
 */
public class SwiftBlock2Output extends SwiftBlock2 {

	// TODO: add unit test 

	private String inputTime; // TODO: change to date data structure
	private String mir;
	private String outputDate; // TODO: change to date data structure
	private String outputTime; // TODO: change to date data structure
	private String messagePriority;

	private SwiftBlock2Output() {
	}

	public SwiftBlock2Output(String unparsedText) {
		super(unparsedText);
	}

	@Override
	protected void preconditionCheck() {
		// Make sure it must have the length of 48, or 49.  All fields are required except MessagePriority
		if (!(unparsedText.length() == 48 || unparsedText.length() == 49)) {
			String errMsg = "Failed to parse, text.length is " + unparsedText.length() + ", but only allow 48, 49.";
			preconditionErrors.add(errMsg);
		}
	}

	@Override
	protected void parseDetails() {
		//		removeBlockIdFromUnparsedText();

		// 1  - inputOutputType
		// 3  - messageType
		// 4  - inputTime (HHMM)
		inputTime = unparsedText.substring(4, 8);
		// 28 - MIR
		mir = unparsedText.substring(8, 36);
		// 6  - outputDate (YYMMDD)
		outputDate = unparsedText.substring(36, 42);
		// 4  - outputTime (HHMM)
		outputTime = unparsedText.substring(42, 46);
		// 1  - messagePriority
		if (unparsedText.length() >= 47) {
			// TODO: use enum
			messagePriority = unparsedText.substring(46, 47);
		}
	}

	@Override
	protected void validate() {
		// TODO: 
	}

	public String getInputTime() {
		return this.inputTime;
	}

	public String getMIR() {
		return this.mir;
	}

	public String getOutputDate() {
		return this.outputDate;
	}

	public String getOutputTime() {
		return this.outputTime;
	}

	public String getMessagePriority() {
		return this.messagePriority;
	}
}
