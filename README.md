# BmiCalculatorService

The web service used for our business logic. It is hosted on [https://bmicalculatorservice.herokuapp.com](https://bmicalculatorservice.herokuapp.com). It calculates how the user's bmi history change based on the `bmi` and the `bmiold` parameters.

Request:
```
https://bmicalculatorservice.herokuapp.com/bmicalc-service/bmiutil?bmi=<actual_bmi>&bmiold=<old_bmi>
```
Response:
```
{
	"change" : 1,
	"bmilvl" : 1
}
```