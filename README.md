# About the project
This is a back-end project with the goal to improve my knowledge in back-end and apis with Java.<br>
I am using it to study JUnit too. You can find all my goals, technologies, and the process to start<br> 
the project are bellow.

## Objectives

 - [x] Make a spring project
 - [x] Make Person and Address classes
 - [x] Create API with the follow instructions:
 - [x] Create person
 - [x] Edit person
 - [x] Search a list of people
 - [x] Search a person
 - [x] Delete person
 - [x] Update person
 - [x] Create address
 - [x] Edit address
 - [x] Inform main address
 - [ ] JUnit tests 

## Technologies

I builded my project with spring initializer in maven and java 11. I use eclipse IDE for the code and<br>
H2 database for the data persistence.

## How to use

For this you can download the source code ou clone this repository. I builded this project with maven so<br>
in case you are using eclipse IDE too is just go to Run As -> Maven Install. After this the project will be<br>
ready to run.

## Observations

The model to post Json data in the app is:
```
"name":"Arthur",
    "birthday":"18/08/2000",
    "addresses": [
        {
            "address": "Faiçalville",
            "cep": "75000-000",
            "number": "100",
            "city": "Goiânia",
            "mainAddress": true
        }
    ]
}
```
And the model to do the put is:
```
{   
    "name":"Rafael",
    "birthday":"14/03/2000",
    "addresses": [
        {
            "address_id": 1,
            "address": "Gran Valence",
            "cep": "75000-000",
            "number": "175",
            "city": "Goiânia",
            "mainAddress": false
        },
        {
            "address_id": 2,
            "address": "Gran Vitaa",
            "cep": "75000-000",
            "number": "176",
            "city": "Goiânia",
            "mainAddress": true
        }
    ]
}
```

This way you can do all the objective functions for the API. Because you can also change the address data with this.<br>
Is just add them with the put request, because you will be updating the person object. And every time you search for a person<br>
or a list of people you will get a list of the address for that people. Last but not least I used this url to connect in the API: <br>
### GET:
http://localhost:8082/api/v1/people/
### POST:
http://localhost:8082/api/v1/people/
### PUT:
http://localhost:8082/api/v1/people/{person_id}
### DELETE:
http://localhost:8082/api/v1/people/{person_id}
