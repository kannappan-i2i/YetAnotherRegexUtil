/**
 *  Utility class to contain regex expressions
 *
 */
package Utilities;

/**
 *      Author: Kannappan
 */
public class RegexpUtils {
    //alphanumeric
    public static final String ALPHANUMERIC = "^[a-zA-Z0-9]+$";
    //except alphanumeric
    public static final String IGNORE_ALPHANUMERIC = "^[^a-zA-Z0-9]+$";
    //only alphabets
    public static final String ALPHABETS = "^[a-zA-Z]+$";
    //except alphabets
    public static final String IGNORE_ALPHABETS = "^[^a-zA-Z]$";
    //only digits
    public static final String ONLY_DIGITS = "^[\\d]+$";
    //except digits
    public static final String IGNORE_DIGITS = "^[\\D]+$";
    //validate phone number
    public static final String PHONENUMBER = "^\\d{4}(-\\d{3})(-\\d{3})$";
    //validate phone number only
    public static final String PHONENUMBERONLY = "^[0-9]+$";
    //validate SSN
    public static final String SSN = "^\\d{3}(-\\d{2})(-\\d{4})$";
    //validate US zip code
    public static final String ZIPCODE = "\\d{5}(-\\d{4})";
    //validate indian postal code
    public static final String INDIAN_POSTAL_CODE = "^\\d{6}$";
    //validate PAN Card
    public static final String PAN_CARD = "^\\[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}$";
    //validate credit card
    public static final String CREDIT_CARD="^\\[0-9]{4}(-[0-9]{4})(-[0-9]{4})(-[0-9]{4})$";
    //validate credit card expiry month and date - MM/YYYY value greater than 2022
    public static final String EXP_MONTH_DATE = "^\\[0-9]{2}/2[0-9]{1}[2-9]{1}[2-9]{1}$";
    //validate CVV number
    public static final String CVV_NUMBER="^[1-9]{1}[0-9]{2}$";
    //validate email address
    public static final String EMAIL_ADDRESS_CHECK = "[\\w]+@[\\w]+\\.[\\w]+{2,20}";

}
