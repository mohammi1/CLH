package chat.automation.Template.actions;

import com.aventstack.extentreports.Status;

import chat.automation.Template.repository.AccountTypeHomeOR;
import chat.automation.framework.helper.ActionsHelper;
import chat.automation.framework.utils.ExpectedConditions;
import chat.automation.framework.utils.Reporter;

public class AccountTypeHome extends ActionsHelper {
	public static void verifyNavigationAccountTypeHomePage() {
		//get the page header
		switchToFrame("idFrameCRM");
		String AccTypeheader=getText(AccountTypeHomeOR.weAccountTypeheader);
		ExpectedConditions.assertEquals(AccTypeheader, "acct_type_lov");
		boolean isExist=exist(AccountTypeHomeOR.btnAddnew);
		if(isExist) {
			Reporter.ReportEvent(Status.PASS, "navigate to Account Type Page", "Successfully navigated");
		}else {
			Reporter.ReportEvent(Status.FAIL, "navigate to Account Type Page", "Failed to navigate");
		}
		
	}
	
	public static void clickOnAddNew() {
		//click on add new
		clickObject(AccountTypeHomeOR.btnAddnew);
	}
}