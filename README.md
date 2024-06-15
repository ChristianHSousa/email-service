<h1>Email Service. 📜 </h1>

This BackEnd project is an API Restfull using Java, Spring Boot following the concepts of clean architecture.

The API was developed for studying  and improvement of my technical backend skills also to demonstrate beginners and students how to implementing an Emails Shooting service as a core functionality of the application and others secondaries functions assigning other technologies.

To solve the core functionality I’m going to follow the [Uber-Code-Challenger | email service] using Amazon SES (https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md)  repository as a guide and meeting your functional requirements and business rules.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Core Functionality](#emails-shooting-service)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)



## Installation
Follow the instructions provided below to configure and run the project.

1. Clone the repository:

HTTP
```bash
https://github.com/ChristianHSousa/email-service.git
```

2. Install dependencies with Maven

## Usage
1. Create and configure an identity at [Amazon SES identity documentation](https://docs.aws.amazon.com/ses/latest/dg/creating-identities.html)
2. Create and configue an [IAM](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_create.html) with **Attach policies directly**  and only **AmazonSESFullAccess** Permission Policy;
3. Set <ins>Region</ins>, <ins>Access key</ins>, <ins>Secret Key</ins> and <ins>SES Email identity</ins> on Enviroment Variables (application.properties)  ;
4. Start the application with Maven
5. The API will be accessible at http://localhost:8080

# Core Functionality
🚧 This service accepts the necessary information and sends emails. It will provide an abstraction between two different email service providers. If one of the services goes down, the service can quickly fail over to a different provider without affecting the customers.🚧
##  Emails Shooting Service.
### Technologies Used
![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=black)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

- [Java](https://www.oracle.com/br/java/technologies/downloads/) - Server-Side Java Execution Environment
- [AWS SDK](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/SES.html#constructor-property) - AWS SDK for sending emails using Simple Email Service (SES)
- [Spring](https://start.spring.io/) - Spring framework to increase productivity in the development of java web applications.


## API Endpoints
The API provides the following endpoints:

**POST SendEmail**
```markdown
POST /api/email –  Send a new email through the app
```
```json
{
  "to": "youremail@gmail.com",
  "subject": "teste Uber Challenger",
  "body": " Hello world from augusto uber challenger teste 2 "
}
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing to this project, please follow the existing code style, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), and submit your changes in a separate branch.
