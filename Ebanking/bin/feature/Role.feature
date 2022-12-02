Feature: Role Creation Functionality

Scenario Outline: Verify Role Creation Functionality with Multiple Sets of Data

Given Tester should on ranford home page

When Tester Enters username password and click on Login

Then Tester click on Role button

When Tester click on Newrole and Enters "<Rolename>" and "<RoleType>"

Then Tester Close the Application

Examples:

    | Rolename | RoleType |
    | TellerAxisdec | E |
    | CashierAxisdec | E |
    | ManagerAxisdec | E |
    

