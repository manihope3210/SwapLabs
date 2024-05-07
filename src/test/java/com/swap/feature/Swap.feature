Feature: Purchase A Products In SwapLabs Application

Scenario: User Login In Web Application
Given user Launch The SwapLabs Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And Its Navigate to Product Pages

Scenario: User Product Page The SwapLabs In Web Application
And user Select Product To Add To Cart
Then user Click The Your Add Cart And Its Navigate To Add Cart page

Scenario: User Select The SwapLabs In Web Application
Then user Select The Add Cart For The All Products Checking To Checkout page

Scenario: User CheckOut Information For The SwapLabs In Web Application
When user Enter The FirstName In FirstName Field
When user Enter The LastName In LastName Field
And user Enter The PostalCode In PostalCode Field
Then user Click The Continue Button And Its Navigate To Checkout Overview Confiromation Page

Scenario: User Checkout Overview Confirmation In SwapLabs web Application
Then user Click To Finsih Button And Its To Navigate To Checkout Complete Page  

Scenario: User Click Back Home In SwapLabs Web Application
Then user Click To Back Home Button And Its Navigate To SwapLaps Login Page
 

