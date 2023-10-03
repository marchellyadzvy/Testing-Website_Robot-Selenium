Feature: Test for elevenia(https://www.elevenia.co.id/)


#1.  LOGIN	
 #Scenario: Test Login With Valid Credentials
    #Given open chrome and start application
    #When I enter valid email and valid password
    #Then I can login successfully

#2.  CHANGE ACCOUNT INFORMATION
#Scenario: Test Change Account Information
#		Given open chrome and start application
#		When I enter valid email and valid password
#		And I can login successfully
#		When I click profile
#		And I fill address
#		Then I have added my address
#	
#3. Tambah Alamat
#Scenario: Add New Shipping Address List
#		Given open chrome and start application
#		When I enter valid email and valid password
#		And I can login successfully
#		When I click profile
#		And I click button add
#		And I add new shipping address
#		When I choose Bengkulu
#		And I choose district
#		When I enter another address
#		And I enter postalcode
#		When I enter number phone
#		Then I can add new shipping address
#
#4. Add Pertanyaan
#Scenario: Tanya Jawab
#		Given open chrome and start application
#		When I enter valid email and valid password
#		And I can login successfully
#		When I search item
#		When I get my item
#		And I choose my item
#		And I choose kolom tanya jawab
#		When I give my question
#		Then I send my question

#5. Search Item
#Scenario: Searching Item 
#		Given open chrome and start application
#		When I enter valid email and valid password
#		When I can login successfully
#		And I search item
#		Then I get my item
			
#6. Add to cart
#Scenario: Add to cart
#		Given open chrome and start application
#		When I enter valid email and valid password
#		When I can login successfully
#		And I search item
#		When I get my item
#		Then I choose my item
#		When I add to cart
#		Then My item is already in my cart
#
#7. Delete Item
Scenario: Delete Item in Cart
		Given open chrome and start application
		When I enter valid email and valid password
		When I can login successfully
		And I search item
		When I get my item
		When I choose my item
		When I add to cart
		And My item is already in my cart
		When I delete my item
		Then I successfully deleted my item in cart

