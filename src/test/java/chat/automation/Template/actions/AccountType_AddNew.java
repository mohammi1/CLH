package chat.automation.Template.actions;
import java.util.concurrent.ThreadLocalRandom;
import com.aventstack.extentreports.Status;
import chat.automation.Template.repository.AccountType_AddnewOR;
import chat.automation.framework.helper.ActionsHelper;
import chat.automation.framework.utils.Reporter;

public class AccountType_AddNew extends ActionsHelper {
	public static void SaveAddNewAccountType() {
		String accType="";
		//verify Page Navigation
		boolean isExist=exist(AccountType_AddnewOR.txtAccountType);
		if(isExist) {
			Reporter.ReportEvent(Status.PASS, "Click on Add New Button and verify page navigation", "Successfully navigated to Add new Page");
		}else {
			Reporter.ReportEvent(Status.FAIL, "Click on Add New Button and verify page navigation", "Failed to navigate Add new Page");
		}
		
		//Enter Account Type
		int randomInt = ThreadLocalRandom.current().nextInt(1, 101);
		accType="A"+randomInt;
		System.setProperty("AccountTypeCode", accType);
		setValue(AccountType_AddnewOR.txtAccountType, accType);
		
		//Enter Account Type Description
		setValue(AccountType_AddnewOR.txtAccountDesc, "CLH001");
		
		//click on Save
		clickObject(AccountType_AddnewOR.btnSave);
		
		//handle pop up
		 String getMsg=handleAlertgetText();
		 if(getMsg!="") {
			 Reporter.ReportEvent(Status.PASS, "Click on Save and handle browser alert", "Successfully saved the details. Following alert:'"+getMsg +"' prompted");
			 
			 
		 }else {
			 Reporter.ReportEvent(Status.FAIL, "Click on Save and handle browser alert", "Failed to handle Alert Message");
		 }
		
	}
	
	public static void clickEditInAccTypeTable() {
		String AcctType=System.getProperty("AccountTypeCode");
		boolean isExist=exist(AccountType_AddnewOR.tblAcctType);
		if(isExist) {
			int rowNumber=getRowWithCelltext(AccountType_AddnewOR.tblAcctType, AcctType);
			int colNumber=1;
			webTableClickObject(AccountType_AddnewOR.tblAcctType, "a", rowNumber, colNumber);
		}else {
			Reporter.ReportEvent(Status.FAIL, "Verify AcctType Table exist in AcctType LOV page" , "Table doesnot exist");
		}
	}
}
