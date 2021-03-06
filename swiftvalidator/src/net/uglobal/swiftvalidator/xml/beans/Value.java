package net.uglobal.swiftvalidator.xml.beans;

public class Value implements XmlBean {
	private String text;

	public Value() {
	}

	public Value(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String toString() {
		return "[text=" + getText() + "]";
	}
}
