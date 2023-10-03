*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
SearchItem
    Open Browser    https://www.elevenia.co.id/    edge
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id=\"mainPopBanner\"]/div[2]/a  
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id="gnbLogin"]/a
    Set selenium Implicit Wait    10
    Input Text     xpath=//*[@id=\"loginName\"]  novarat788@gmail.com
    Input Password    xpath=//*[@id=\"passWord\"]    Coba12345.
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id=\"container\"]/article/div[1]/fieldset/div/a   
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id=\"mainPopBanner\"]/div[2]/a  
    Set selenium Implicit Wait    10
    # Input Text     xpath=//*[@id=\"AKCKwd\"]  abcdef
    Input Text     xpath=//*[@id=\"AKCKwd\"]  Pakaian Bayi
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id=\"AKCFrm\"]/div/button
    Log    Test completed