package testcaseswithtestng;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.PaymentPage;

public class PaymentTest extends BaseTest{
	
	@Test
	public void verifyPaymentByCreditCart() {
		PaymentPage paymentPage = new PaymentPage();
		Map<String,String> creditCartDetails = new HashMap<>();
		creditCartDetails.put("cardNumber","8797898389838982");
		creditCartDetails.put("cardExpire", "07/32");
		creditCartDetails.put("cvv", "324");
		creditCartDetails.put("amount", "1200");
		paymentPage.payByCreditCard(creditCartDetails);
		paymentPage.getCreditCardDetails();
	}
	
	@Test
	public void verifyPaymentByDebitCart() {
		PaymentPage paymentPage = new PaymentPage();
		Map<String,String> debitCartDetails = new HashMap<>();
		debitCartDetails.put("cardNumber","8797898389838982");
		debitCartDetails.put("cardExpire", "07/32");
		debitCartDetails.put("cvv", "324");
		debitCartDetails.put("amount", "1200");
		paymentPage.payByDebitCard(debitCartDetails);
		paymentPage.getDebitCardDetails();
	}
	
	@Test
	public void verifyPaymentByAmazonPay() {
		PaymentPage paymentPage = new PaymentPage();
		paymentPage.payByAmazonPayLater("1800");
	}
	
}
