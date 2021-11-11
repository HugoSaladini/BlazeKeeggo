$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login/LoginTest.feature");
formatter.feature({
  "name": "Teste login usuario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Realiza login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@T0001"
    }
  ]
});
formatter.step({
  "name": "abre o browser",
  "keyword": "Given "
});
formatter.step({
  "name": "user clica em LogIn",
  "keyword": "And "
});
formatter.step({
  "name": "user preenche campo de \u003cusername\u003e e \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user clica em logar",
  "keyword": "And "
});
formatter.step({
  "name": "valida campo de Usuario ativo",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "saladini",
        "0123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Realiza login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@T0001"
    }
  ]
});
formatter.step({
  "name": "abre o browser",
  "keyword": "Given "
});
formatter.match({
  "location": "br.com.keeggo.test.login.LoginSteps.abre_o_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clica em LogIn",
  "keyword": "And "
});
formatter.match({
  "location": "br.com.keeggo.test.login.LoginSteps.user_clica_em_LogIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user preenche campo de saladini e 0123",
  "keyword": "When "
});
formatter.match({
  "location": "br.com.keeggo.test.login.LoginSteps.user_preenche_campo_de_username_e_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clica em logar",
  "keyword": "And "
});
formatter.match({
  "location": "br.com.keeggo.test.login.LoginSteps.user_clica_em_logar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida campo de Usuario ativo",
  "keyword": "Then "
});
formatter.match({
  "location": "br.com.keeggo.test.login.LoginSteps.valida_campo_de_Usuario_ativo()"
});
formatter.result({
  "status": "passed"
});
});