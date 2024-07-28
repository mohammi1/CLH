package chat.automation.Template.actions;

import chat.automation.Template.repository.LoginWinWebOR;
import chat.automation.framework.helper.ActionsHelper;
import chat.automation.framework.utils.APIUtils;
import chat.automation.framework.utils.Environment;
import io.restassured.response.Response;

public class LoginWinWeb extends ActionsHelper{
	public static void LaunchURL(String URL) {
		open(URL);
		setValue(LoginWinWebOR.txtUserName, "mohammi1");
		setValue(LoginWinWebOR.txtPassword, "August@CLH#786");
		//clickObject(LoginWinWebOR.btnLogin);
		//String Token=APIUtils.getToken(Environment.getProperty("AuthURL"), Environment.getProperty("APIKey"), "{\"email\":\"mohammad.imran@cleanharbors.com\",\"GroupApplicationName\":\"IndustrialServices\"}");
		//String praraOne="resultMessage";
		//Object paraTwo=null;
		//System.out.println(Environment.getProperty("Token"));
		//APIUtils.ValidateGetResponse("https://winapitest.cleanharbors.com/pricing/contract/931284/component", "mohammad.imran@cleanharbors.com", Environment.getProperty("Token"),praraOne,paraTwo);
		//APIUtils.validatePost("https://winapitest.cleanharbors.com/pricing/contract/", "mohammad.imran@cleanharbors.com", Environment.getProperty("Token"), "{\"contractName\":\"TEST_AU02\",\"rateCategoryType\":\"ISP\",\"description\":\"Test\",\"activationDate\":\"2024-03-01T06:30:00.000Z\",\"expirationDate\":\"2024-07-31T06:30:00.000Z\",\"customerCode\":\"REY0829\",\"LobCode\":\"ABRBLASTIN\",\"jobTypes\":[{\"code\":\"ABCL\"}],\"RegionId\":\"2\",\"zoneId\":\"6\",\"opSegCode\":\"INDUSTSVCS\"}");
		//APIUtils.ValidateGetResponse("https://winapitest.cleanharbors.com/pricing/contract/","mohammad.imran@cleanharbors.com", Environment.getProperty("Token"),"resultCode",0);
		//String Token=APIUtils.getToken(Environment.getProperty("AuthURL"), Environment.getProperty("APIKey"), "{\"email\":\"mohammad.imran@cleanharbors.com\",\"GroupApplicationName\":\"IndustrialServices\"}");
		//Response getResponse=APIUtils.getResponse("GET","https://winapitest.cleanharbors.com/pricing/contract/931284/component", "mohammad.imran@cleanharbors.com", Token);
		//APIUtils.verifyStatusCode(getResponse, 200);
		//APIUtils.verifyResponseBody(getResponse, "resultMessage", null);
		//Response postResponse=APIUtils.getResponse("POST","https://winapitest.cleanharbors.com/pricing/contract/", "mohammad.imran@cleanharbors.com", Token, "{\"contractName\":\"AUTO_KU13\",\"rateCategoryType\":\"ISP\",\"description\":\"Test\",\"activationDate\":\"2024-03-01T06:30:00.000Z\",\"expirationDate\":\"2024-07-31T06:30:00.000Z\",\"customerCode\":\"REY0829\",\"LobCode\":\"ABRBLASTIN\",\"jobTypes\":[{\"code\":\"ABCL\"}],\"RegionId\":\"2\",\"zoneId\":\"6\",\"opSegCode\":\"INDUSTSVCS\"}");
		//APIUtils.verifyStatusCode(postResponse, 201);
		//APIUtils.verifyResponseBody(postResponse, "resultCode", 0);
		//APIUtils.verifyResponseBody(postResponse, "resultMessage", "Contract Inserted Successfully!");
		
	}
}
