
public class Validation {
	
	String properCase (String inputVal) { // Returns a string variable with the first letter uppercase. does nothing for numbers or blank
	    // Empty strings should be returned as-is.

	    if (inputVal.length() == 0) return "";

	    // Strings with only one character uppercased.

	    if (inputVal.length() == 1) return inputVal.toUpperCase();

	    // Otherwise uppercase first letter, lowercase the rest.

	    return inputVal.substring(0,1).toUpperCase()
	        + inputVal.substring(1).toLowerCase();
	}
	
	
}
