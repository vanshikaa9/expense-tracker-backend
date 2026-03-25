# Expense Tracker Backend

A RESTful backend application built using Spring Boot to manage personal expenses.

## Features

- Add new expenses
- View all expenses
- Update existing expenses
- Delete expenses

## Database

- MongoDB (local)

## Future Improvements

- Cloud deployment (MongoDB Atlas)
- User authentication
- Frontend integration

## Tech Stack

- Java 17
- Spring Boot
- REST APIs
  

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | /expenses | Add expense |
| GET    | /expenses | Get all expenses |
| PUT    | /expenses/{id} | Update expense |
| DELETE | /expenses/{id} | Delete expense |

## Example Response

```json

## Author

Vanshika Mishra
[
  {
    "id": 1,
    "title": "Food",
    "amount": 200.0,
    "category": "Daily"
  }
]


---


---

