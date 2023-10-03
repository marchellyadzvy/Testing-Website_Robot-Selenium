*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
AddComment
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
    Input Text     xpath=//*[@id="AKCKwd"]  Sepatu Sport
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id="AKCFrm"]/div/button
    Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id=\"prod_29350089\"]/div/a[2]
    Set selenium Implicit Wait    10
    Execute Javascript   document.querySelector(\"body > section > section > div.prdDetails.row-fluid > div.gridF > div.card.no-pad > div > div > div.seaTabs_switch > a.seaTabs_tab.forum_qna > span\").click();
     Set selenium Implicit Wait    10
     Input Text     xpath=//*[@id=\"parentCommentArea29350089\"]  Oke kak
     Set selenium Implicit Wait    10
    Click Element    xpath=//*[@id=\"dvPrdQnAList\"]/div[1]/div[2]/div[2]/a

    Log    Test Completed