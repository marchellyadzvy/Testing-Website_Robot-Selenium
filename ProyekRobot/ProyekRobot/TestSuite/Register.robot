*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
Register
    Open Browser    https://www.elevenia.co.id/    edge
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id=\"mainPopBanner\"]/div[2]/a     
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id="gnbRegister"]/a
    Set selenium Implicit Wait    10
    Input Text    xpath=//*[@id="chkMemNM"]    Testpkpl    
    Set selenium Implicit Wait    10
     # Input Text    xpath=//*[@id="memIDView"]    novarat788@gmail.com    
    Input Text    xpath=//*[@id="memIDView"]    proyekpkpl45502022@gmail.com     
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id="bdayDate"]/option[2]   
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id="bdayMonth"]/option[4]    
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id="bdayYear"]/option[5] 
    Set selenium Implicit Wait    10
    Click Element   xpath=//*[@id="fldGender"]/div/input[2]    
    Set selenium Implicit Wait    10
    Input Text    xpath=//*[@id="ex"]    0831    
    Set selenium Implicit Wait    10  
    Input Text    xpath=//*[@id="ex2"]    86139401 
        # Set selenium Implicit Wait    10
    # Input Text    xpath=//*[@id="ex"]    abcd    
    # Set selenium Implicit Wait    10  
    # Input Text    xpath=//*[@id="ex2"]    efghijk 
    Set selenium Implicit Wait    10  
    Input Password    xpath=//*[@id="mem_pwd"]    terserah1234    
    Set selenium Implicit Wait    10  
    # Input Password    xpath=//*[@id="mem_re_pwd"]    terserah12345  
    Input Password    xpath=//*[@id="mem_re_pwd"]    terserah1234    
    Set selenium Implicit Wait    10  
    Click Element    xpath=//*[@id="fldNameEmail"]/p/a    
    Set selenium Implicit Wait    10     
    Log    Test completed
    
