# BmiCalculatorService

The web service used for our business logic. It is hosted on [188.226.183.46:8030](188.226.183.46:8030). It calculates how the user's bmi history change based on the `bmi` and the `bmiold` parameters.

Request:
```
GET 188.226.183.46:8030/bmicalc-service/bmiutil?bmi=<actual_bmi>&bmiold=<old_bmi>
```
Response:
```
{
	"change" : 1,
	"bmilvl" : 1
}
```
