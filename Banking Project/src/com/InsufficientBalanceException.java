package com;

public class InsufficientBalanceException extends RuntimeException {
	private String message;
	
	InsufficientBalanceException(String message)
	{
		this.message = message;
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}
}

/**
 * Rules for working with Custom Exception:
 * ----------------------------------------
 * 1. Create a class with the Exception Name.
 * 2a. To create Checked Exception, inherit Exception class.
 * 2b. To create Unchecked Exception, inherit RuntimeException class.
 * 3. Override getMessage(). (variable, constructor, method)
 * 4. Invoke Exception Object using throw keyword & handle it using try & catch block.
 *
 *NOTE: Custom Exceptions are used to standardise the project and
 *		in realtime Exception are used to track the errors or problems occured in the project.
 */
