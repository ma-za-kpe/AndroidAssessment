# AndroidAssessment

## The Solution

``` 
Farmer Persona: 

 FARMER DETAILS
     Credit_score_remark : "",
     Capacity_score : "35",
Capital_score : "0",
Character_score : "0",
 	Collateral_score : "0",
Conditions_score : "0",
National id: FHDHKKRRHGF77
Full name: Rose Mary
Farm Name: Yotas Poultry Farm 
Email: yotaru@gmail.com
Phone: 0778346733
Verified email: false
Location: Onjivu
Description: Off layer farm since 1990
Soil type: 
Sex: Female
Profile image: https://www.google.com/search?q=google
User Type: Farmer
Credit Score : 60
Activity: Poultry Farming
Verify Farmer: false

CAPACITY (35%      70)
Cash Inflows{
Year {
	Title: 2019,
	Average Net Income: 6000000 // average of all seasonal incomes
	Season {
		Name: season 1,
		Income: 1000000,
		Expenses: 4000000,
		Net: 6000000
},
Season {
Name: season 2,
		Income: 1000000,
		Expenses: 4000000,
		Net: 6000000
},
Season {
Name: season 3,
		Income: 1000000,
		Expenses: 4000000,
		Net: 6000000
}


}
},
Income from other sources: {
	Job1 {
Title: Teaching,
Salary/Wages: 500000 
},
Job2 {
Title: Carpentry,
Salary/Wages: 70000 
}

}
Number of outstanding loans: 1
Amount of outstanding loans: {
	 Loan total:35000000 (Loan1 + Loan2 + Loan amount requested:)
 	 Loan1 {
Amount: 3000000,
Bank: centenary
},
Loan2 {
Amount: 2000000,
Bank: postbank
}
}
}
Loan amount requested: 30000000
Loan Duration: 2 years
Debt to Income ratio: ( Loan total /  24) / Yearly Average Net Income 

CAPACITY SCORE: [
	(Loan total / Loan Duration) / average income
(35000000 / 24)  /  6000000 = 0.486 (15)

Score	20	15	10	5	2	1


Ratio
0-0.2
0.21-0.4
0.41-0.6
0.61-0.8	
0.81-1	
Above 1
Score
70 
35
 20
10 
5 
1



]



CAPITAL (20%      40)
Working Capital: 3000000 
Total value of assets owned: 7500000
Savings (nullable):  
Total capital invested : 10500000
Loan total: // dont show field
Capital Score = Total capital invested / Loan total = 0.3 


Ratio
3.00 and above
2.50 - 2.59
2.00 - 2.49
1.50 - 1.99
1.00 - 1.49
0.50 -  0.99
0 - 0.49
Score
40
35 
30
20
10
5
1




COLLATERAL (25%      50)
Accounts receivable: 
Vehicle/automobile: {
	Car total: 55000000
{
Model: 1998,
Amount 4500000,
Name: Harrier
}, 
{
Model: 1908,
Amount 1000000,
Name: Pick up
}
}
Household items: 1000000
Equipment:
Buildings:
Land: 
Farm size: 30000 H
Others: 
Total Value of Assets: 56000000

Total value of assets > Loan requested = 40
Total value of assets == Loan requested = 20
Total value of assets < Loan requested = 10

FINANCIAL BEHAVIOR / CHARACTERS (15%   30)
HIghest level of Educational: Bachelors  // spinner == 2 points
Other achievements: {
  Achievement {
Name: Certificate in Agriculture
  },
 Achievement {
Name: Certificate in Business Administration
  }
}
Field experience:  == 7 points
Number of years spent in farming:
If I have spent;
20 and above years    ->20 points           equivalent to (10/100)*200
15 -19yrs	         -> 16 points
10 -14yrs	         -> 12 points
5 -9yrs	         	         -> 8 points             which means (4/100)*200
1 -4yrs	         	         -> 4 points
<1 yrs		         -> 0 points

Land ownership: 
If rent = 1
If owned = 2 
Land size in use: // spinner
If land size >=10 acres    -- 30 points
If land size >=5 acres   --27 points
If land size >=1    --24 points
If land size > ½        --21 points
If land size < ½      --18 points
	
Crops: {
crop{
Name: Maize,
season: 1,
Year: 2020
  },
crop{
Name: Maize,
season: 2,
Year: 2020
  },
crop{
Name: Maize,
season: 3,
Year: 2020
  },


}
business references: { == 2 points
referees{
Name: Joel Maximo,
Contact: 0776483866,
Location: Mvara
  },
 referees{
Name: Nakasujja Faith,
Contact: 0778364277,
Location: Yumbe

  }

}
Reviewing the applicant's credit history or score: == 4 points
If financial card holder (card number)= 
If no = 


EXPECTED OUTCOME AND CONDITIONS (5%      10)
Purpose of the loan: // check boxes
⦁	Financing for working capital   == 2 points
⦁	Equipment  == 2 points
⦁	Expansion  == 2 points
⦁	Financing major purchases == 2 points
⦁	Home renovations == 1 points
⦁	Debt consolidation  == 1 points

Other conditions
⦁	Loan's interest rate == 1 points
⦁	Principal amount
⦁	Repayment length 


Credit score scale (points)                                                                
Total score
 1 – 40 (Very poor)
41 – 80 (Poor)
81 – 120 (Moderate)  
121 – 160 (Good)
 161 – 180 (Very good)
 181 – 200 (Excellent)

The formula is 
Item/100 * 200

```

## Installation

Please follow these steps to set up AndroidAssessment on your local machine.
1. Create a new, empty folder called androidassessment/ within your home folder. 
2. Navigate to it (cd androidassessment), then clone the AndroidAssessment repo. 
3. This will create a new folder named androidassessment/AndroidAssessment.

- Note: Please keep the folder name as androidassessment.
- Changing the project folder name might lead to future issues with running the pre-push checks on your machine.

2. Run the setup script, which adds some development tools for AndroidAssessment (ktlint, checkstyle, etc.):
-  For Windows
    - Install Git Bash Command Line
    - Open Git Bash Command Line.
    - Navigate to androidassessment/AndroidAssessment.
    - Run the script ``` bash scripts/setup.sh ```.
    - Download the google_checks.xml(https://github.com/checkstyle/checkstyle/blob/14005e371803bd52dff429904b354dc3e72638c0/src/main/resources/google_checks.xml) file. To do this, you can simply right-click on the Raw button and click on Save Link as.
    - Copy this file to the directory where Git is installed (usually C:/Program Files/Git/).

3. Follow instruction on this https://stackoverflow.com/a/66133030/8277525 to change IntelliJ's import order for Kotlin to satisfy ktlint

4. In Android Studio, select File > Open, navigate to androidassessment/AndroidAssessment, and click OK to load the project.

5. Click the elephant icon in the toolbar ("Sync Gradle") to ensure that all the correct dependencies are downloaded. (In general, you'll want to do this step any time you update your dependencies.)

## Important Design Links
1. Postman
   - Farmers => [https://documenter.getpostman.com/view/3729762/2s93JowRBY](Sample Api For Farmer)
   - Capacity =>[https://documenter.getpostman.com/view/3729762/2s93JowR7C](Sample Api For Capacity)
   
## Important Design images
1. Entity relationship diagram

![farmer-credit-system drawio](https://user-images.githubusercontent.com/28810111/223129269-7239d139-64f0-4862-bd1e-7d5a6516848f.svg)

2. Flowchart diagram

![farmer-credit-system-flow-chart drawio](https://user-images.githubusercontent.com/28810111/223134848-7d6d078f-ae67-4a03-9fb9-254d8240b0c9.svg)





