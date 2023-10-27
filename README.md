# SuperBidder
Video Explanation : https://youtu.be/TwoPMVs5Ay8

Asked in Flipkart Machine Coding Round
Problem Statement
A company SuperBidder has hosted an Online Auction System where any user(seller) can sell an object through an auction.
Each auction has a lowest bid limit and the highest bid limit.
Any registered user(buyer) can participate in an auction and bid on the product. Buyers can update this bid amount or withdraw from an auction until the auction is completed.
When the auction closes, show the winning bid using the highest unique bid.
The program should take as input two or more auctions and a set of users participating in these. Multiple auctions can happen simultaneously.
A new requirement came in where SuperBidder has requested that they want to decide the winner based on the lowest unique bid as well. Accommodate this change as well.
For SDE 3s only
Buyers have a limited total budget in the beginning. If the buyer wins the auction, his budget is reduced by the bid amount. Any new bid exceeding the bid amount should be rejected. Buyers should be able to increase the budget at any point as well.
Highest Unique bid definition
For a set of users A, B, C, D, E participating in auction A1
A bids 50,
B bids 90,
C bids 100,
D bids 90,
E bids 70,
F bids 100
Here 70 is the highest unique bid, therefore E is the winner.
If there is no highest unique bid by the end of the auction, there is no winner for the auction.
Functional Requirements
	• Add buyer
	• Add seller
	• Create auction
	• Create/Update bid
	• Withdraw bid
	• Close auction and return winning bid and the winner name
	• Update budget (Only for SDE 3s)
Bonus
	• Upgrade the buyer to a preferred buyer if he has participated in more than 2 auctions. And for choosing a winner, whenever there is a tie on the winning bid, preference should be given to the preferred buyer and if it’s tied between multiple preferred buyers, fallback to the next highest bid.
	• The preferred buyer is across sellers on the platform.
Sample Test Cases
Test Case 1
● ADD_BUYER(“buyer1”)
● ADD_BUYER(“buyer2”)
● ADD_BUYER(“buyer3”)
● ADD_SELLER(“seller1”)
● CREATE_AUCTION(“A1”, “10”, “50”,  “seller1”)
● CREATE_BID(“buyer1”, “A1”, “17”)
● CREATE_BID(“buyer2”, “A1”, “15”)
● UPDATE_BID(“buyer2”, “A1”, “19”)
● CREATE_BID(“buyer3”, “A1”, “19”)
● CLOSE_AUCTION(“A1”) // Should give Buyer1 as winner
Test Case 2
● ADD_SELLER(“seller2”)
● CREATE_AUCTION(“A2”, “5”, “20”, “seller2”)
● CREATE_BID(“buyer3”, ”A2”, 25) //This should fail as highest bid limit is 20 for A2
● CREATE_BID(“buyer2, ”A2”, 5)
● WITHDRAW_BID(“buyer2”, “A2”)
● CLOSE_AUCTION(“A2”) // No winner
Test Case 3 (With budget constraint)
● ADD_BUYER(“buyer1”, 20)
● ADD_BUYER(“buyer2”, 20)
● ADD_BUYER(“buyer3”, 20)
● ADD_SELLER(“seller1”)
● ADD_SELLER(“seller2”)
● CREATE_AUCTION(“A1”, “10”, “50”, “seller1”)
● CREATE_AUCTION(“A2”, “5”, “20”, “seller2”)
● CREATE_BID(“buyer1”, “A1”, “17”)
● CREATE_BID(“buyer2”, “A1”, “15”)
● UPDATE_BID(“buyer2”, “A1”, “19”)
● CREATE_BID(“buyer3”, “A1”, “19”)
● CLOSE_AUCTION(“A1”) // Should give Buyer1 as winner
● CREATE_BID(“buyer1, ”A1”, 5) //This should fail as budget exceeds for buyer1
● CREATE_BID(“buyer3”, ”A2”, 25) //This should fail as highest bid limit is 20 for A2
● CREATE_BID(“buyer2, ”A2”, 5)
● WITHDRAW_BID(“buyer2”, “A2”)
● CLOSE_AUCTION(“A2”) // No winner
Expectations and Guidelines
	Create the sample data yourself. You can put it into a file, test case or main driver program itself.
	The code should be demo-able. Either by using the main driver program or test cases.
	The code should be modular. The code should have the basic OO design. Please do not jam in the responsibilities of one class into another.
	The code should be extensible. Wherever applicable, use interfaces and contracts between different methods. It should be easy to add/remove functionality without rewriting the entire codebase.
	The code should handle edge cases properly and fail gracefully.
	The code should be legible, readable and DRY.
	Database integration is not required.
	Please do not access the internet for anything EXCEPT syntax.
	You are free to use the language and IDE of your choice.
	The entire code should be your own.
	
	
	
	
	Sample Input Used
	
	ADD_SELLER SHUBHAM
	ADD_SELLER AKASH
	CREATE_AUCTION BISCUITS 10 25 SHUBHAM
	CREATE_AUCTION NAMKEEN 10 25 SHUBHAM
	CREATE_AUCTION DARU 10 25 SHUBHAM
	CREATE_AUCTION BEER 10 25 SHUBHAM
	
	ADD_BUYER RACHIT
	ADD_BUYER AMIT 
	ADD_BUYER ARNAV 
	
	
	CREATE_BID RACHIT BISCUITS 15
	CREATE_BID RACHIT DARU 15
	
	CREATE_BID AMIT BEER 15
	CREATE_BID ARNAV BEER 15
	
	CREATE_BID ARNAV NAMKEEN 14
	
	 UPDATE_BID AMIT BISCUITS 19
	
	WITHDRAW_BID RACHIT BISCUITS
	
	CLOSE_AUCTION BISCUITS
	CLOSE_AUCTION NAMKEEN
	
	CLOSE_AUCTION DARU
	CLOSE_AUCTION BEER
	
![image](https://github.com/shubhamharitash/SuperBidder/assets/47567303/b7212e72-57c9-471f-8d3d-9b2482ddb911)
