package com.model.sub;

public class AbstractSubEntity {
    private String displayText;
    private int displayValue;

    public AbstractSubEntity() {
    }

    public AbstractSubEntity(String displayText, int displayValue) {
	super();
	this.displayText = displayText;
	this.displayValue = displayValue;
    }

    public String getDisplayText() {
	return displayText;
    }

    public void setDisplayText(String displayText) {
	this.displayText = displayText;
    }

    public int getDisplayValue() {
	return displayValue;
    }

    public void setDisplayValue(int displayValue) {
	this.displayValue = displayValue;
    }
    
    // Phương thức này rất quan trọng vì nó chính là value của mỗi checkBox
    @Override
    public String toString() {
	return String.valueOf(displayValue);
    }
    
    

}
