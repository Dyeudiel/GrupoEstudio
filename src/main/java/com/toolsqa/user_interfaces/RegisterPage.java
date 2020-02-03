package com.toolsqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

	public static Target CONTACT_FIRTS_NAME = Target.the("First Name").locatedBy("");
	public static Target CONTACT_LAST_NAME = Target.the("Last Name").locatedBy("");
	public static Target CONTACT_PHONE = Target.the("Phone").locatedBy("");
	public static Target CONTACT_EMAIL = Target.the("Email").locatedBy("");
	public static Target ADDRESS = Target.the("Address").locatedBy("");
	public static Target CITY = Target.the("City").locatedBy("");
	public static Target STATE_PROVINCE = Target.the("State/Province").locatedBy("");
	public static Target POSTAL_CODE = Target.the("Postal Code").locatedBy("");
	public static Target COUNTRY = Target.the("Country").locatedBy("");
	public static Target USER_NAME = Target.the("User Name").locatedBy("");
	public static Target PASSWORD = Target.the("Password").locatedBy("");
	public static Target CONFIRM_PASSWORD = Target.the("Confirm Password").locatedBy("");
			
}
