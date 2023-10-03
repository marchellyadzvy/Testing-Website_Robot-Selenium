*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
Deleteitem
    Open Browser    https://www.elevenia.co.id/    edge 
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id=\"mainPopBanner\"]/div[2]/a  
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id="gnbLogin"]/a
    Set selenium Implicit Wait    10
    Input Text     xpath=//*[@id=\"loginName\"]  novarat788@gmail.com
    Input Password    xpath=//*[@id=\"passWord\"]    Coba12345.
    Click Element    xpath=//*[@id=\"container\"]/article/div[1]/fieldset/div/a   
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id=\"mainPopBanner\"]/div[2]/a  
    Set selenium Implicit Wait    10
   Click Element    xpath=//*[@id="layMineTab1"]/i    
    Set selenium Implicit Wait    10
    Click Element    //*[@id="frmTmall"]/table/tbody/tr/td[7]/a[3]  
    Set selenium Implicit Wait    10 
    Click Element    xpath=//*[@id="chkDelPopY"]      
    Log    Test completed
    
