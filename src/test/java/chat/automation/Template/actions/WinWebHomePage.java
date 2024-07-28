package chat.automation.Template.actions;

import chat.automation.Template.repository.WinWebHomePageOR;
import chat.automation.framework.helper.ActionsHelper;
public class WinWebHomePage extends ActionsHelper {
	
	public static void navigateToAccountType(){
		// switch to Navbar Frame
		switchToFrame("idFrameNavBar");
		
		//Click on Invoicing Link
		clickObject(WinWebHomePageOR.lnkInvoicing);
		
		//Click on LOV Link
		clickObject(WinWebHomePageOR.lnkLOV);
		
		//click on Account Type Link
		clickObject(WinWebHomePageOR.lnkAccountType);
		
		switchToDefault();
		
	}
}
