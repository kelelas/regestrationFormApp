package model;

public class RegexConstants {
    public static final String REGEX_FOR_SURNAME = "^[A-Z]{1}[ -a-z`]{0,19}[a-z]{1}$";
    public static final String REGEX_FOR_LOGIN = "^[A-Za-z0-9]{7,20}$";
    public static final String REGEX_FOR_NAME = "^[A-Z]{1}[ -a-z`]{0,19}[a-z]{1}$";
    public static final String REGEX_FOR_SECOND_NAME = "^[A-Z]{1}[ -a-z`]{0,19}[a-z]{1}$";
    public static final String REGEX_FOR_PHONE_NUMBER = "^([+])?\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\([0-9]{4})$";
    public static final String REGEX_FOR_HOME_PHONE_NUMBER = "^([+])?\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\([0-9]{4})$";
    public static final String REGEX_FOR_SECOND_PHONE_NUMBER = "^([+])?\\(?([0-9]{3})\\)?([ .-]?)([0-9]{3})\\([0-9]{4})$";
    public static final String REGEX_FOR_COMMENT = ".*";
    public static final String REGEX_FOR_GROUP = "[FRIENDS[FAMILY[OTHERS[WORK]]]]";
    public static final String REGEX_FOR_EMAIL = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
    public static final String REGEX_FOR_SKYPE = "^[ -`_@A-Za-z0-9]{7,20}$";
    public static final String REGEX_FOR_ADDRESS_INDEX_OR_HOUSE_OR_FLAT ="[0-9]{5}";
    public static final String REGEX_FOR_ADDRESS_TOWN_OR_STREET = "[A-Z]{1}[a-z]{25}";


}
