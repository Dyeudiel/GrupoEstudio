package com.toolsqa.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

	//public static Target SIGN_IN = Target.the("Sign in").locatedBy("//a[@title='Log in to your customer account']");
	public static Target SIGN_IN = Target.the("Sign in").locatedBy("//div[@class='header_user_info']");
	public static Target NEW_EMAIL = Target.the("Enter email").locatedBy("//input[@id='email_create']");
	public static Target CREATE_AN_ACCOUNT = Target.the("Create account").locatedBy("//i[@class='icon-user left']");
	public static Target MALE = Target.the("Male").locatedBy("//input[@id='id_gender1']");
	public static Target FEMALE = Target.the("Female").locatedBy("//input[@id='id_gender2']");
	public static Target FIRST_NAME = Target.the("Fisrt name").locatedBy("//input[@id='customer_firstname']");
	public static Target LAST_NAME = Target.the("Last name").locatedBy("//input[@id='customer_lastname']");
	public static Target EMAIL = Target.the("Pasword").locatedBy("//input[@id='passwd']");
	public static Target PASSWORD = Target.the("password").locatedBy("//input[@id='passwd']");
	public static Target YEAR = Target.the("Year").locatedBy("//select[@id='years']");
	public static Target MONTH = Target.the("Month").locatedBy("//select[@id='months']");
	public static Target DAY = Target.the("Day").locatedBy("//select[@id='days']");
	public static Target ADDRESS = Target.the("Address").locatedBy("//input[@name='address1']");
	public static Target CITY = Target.the("City").locatedBy("//input[@id='city']");
	public static Target STATE = Target.the("State").locatedBy("//select[@name='id_state']");
	public static Target ZIP = Target.the("Zip").locatedBy("//input[@name='postcode']");
	public static Target COUNTRY = Target.the("Country").locatedBy("//select[@id='id_country']");
	public static Target CELLPHONE = Target.the("Cellphone").locatedBy("//input[@id='phone_mobile']");
	public static Target FUTURE_REFERENCE = Target.the("future ref").locatedBy("//input[@id='alias']");
	public static Target REGISTER = Target.the("Register")
			.locatedBy("//button[@type=\"submit\"]/span[contains(text(),\"Register\")]");
	
	public static Target REGISTRO_EXITOSO = Target.the("Registro exitoso").locatedBy("//p[contains(text(),'Welcome to your account. ')]");
	

}
