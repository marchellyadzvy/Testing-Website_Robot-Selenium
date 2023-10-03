*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
Login
    Open Browser    https://www.elevenia.co.id/    edge
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id=\"mainPopBanner\"]/div[2]/a  
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id="gnbLogin"]/a
    Set selenium Implicit Wait    10
    Input Text     xpath=//*[@id=\"loginName\"]  novarat788@gmail.com
    # Input Text     xpath=//*[@id=\"loginName\"]  novarat@gmail.com
    # Input Password    xpath=//*[@id=\"passWord\"]    Coba67890
    Input Password    xpath=//*[@id=\"passWord\"]    Coba12345.
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id=\"container\"]/article/div[1]/fieldset/div/a   
    # Set selenium Implicit Wait    10
    # Click Element    xpath=//*[@id=\"mainPopBanner\"]/div[2]/a         
    Log    Test completed
    