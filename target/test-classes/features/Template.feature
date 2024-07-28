Feature: A test case in a Framework Template
   @CLH
    Scenario Outline: Click on a link in a LOV Table
  	
  	Given Login to Win Web Page "<URL>"
    #And Navigate to Invoicing -->LOV-->Account Types from Navbar menu
    #When Click on AddNew btn
    #And Enter Account Type and Account Description and save
    #Then click on Edit against created Account Type
  
			Examples:
      |URL|AccountType|AccountDescription|
		 	|https://winwebtest.cleanharbors.com/|Two|Two|
		 	   
 @CLHOne
    Scenario Outline: API 820679 Contract Entity API
  	
  	Given Auth Endpoint "<URL>"
  	
  	Examples:
      |URL|
      | https://winapitest.cleanharbors.com/security/token/generate|
  @CLHTwo
Scenario Outline: API 820679 Contract Entity API

Given Login to Win Web Page "<URL>"

Examples:
  |URL|
  | https://google.co.in|