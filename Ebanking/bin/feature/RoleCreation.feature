Feature: Role Creation

Scenario Outline: Verify Role Creation with Multiple Sets of Data

Given User Should on Ranford Home page

When User Enters username and Password

Then User Click on Role button

When User Click on new role and Enters "<RoleName>" and "<RoleType>"

Then User close the Application

Examples:

        | RoleName | RoleType |
        | Cashierfbb | E |
        | TellerFbb | E |
        | Gmanager | E |

   



