# Indevo

It is an app where the user can manage his PDI by creation plans, goals, and even track the progress of his goals and plans.

## Functional Requirements

- User can create an account;
- User can confirm his email after account creation;
- User can recover his password in function of his email;
- User can authenticate;
- User can create a development plan;
- User can create goals for a plan;
- User can delete a goal from a plan when is creating or editing;
- User can archive a development plan;
- User can delete a development plan.

## System Requirements

- The system must show to the user the progress of the plan in percentage with a progress bar based on the number of accomplished goals in that plan;
- The system must have a landing page with a CTA to send the user to the dynamic application;
- The system must show the user when a goal is done based on the currentValue and targetValue.

## My goals with this project

- Do the static landing page with Next.js;
- Do the dynamic app with Angular.js;
- Study microfrontends and apply if is possible;
- Do the backend api with Spring;
- Do a mobile app with Flutter or React Native.

## Class Diagram

![Class Diagram](./class-diagram.png)

## Use Case Diagrams

### Authentication

![Use Case Diagram - Authentication](./use-cases-diagram-authentication.png)

### Development plan

![Use Case Diagram - Development Plan](./use-cases-diagram-development-plan.png)

## Use Cases

### Authentication

#### IND-001 Create account

- Name: Create account;
- Main Actor: user;
- Summary: User creates an account;
- Post-conditions: User must confirm his e-mail after creating the account;
- Main flow:
  1. Click in CTA button on landing page to go to sign up page;
  2. Show signup form;
  3. Fullfill all fields with valid data (first_name, last_name, email, confirm_email, password, confirm_password);
  4. Click in 'Sign Up' button;
  5. Show a screen telling that a confirmation e-mail was sended;
  6. Go to Sign In screen.
- Alternative flow:
  1. Click in CTA button on landing page to go to sign up page;
  2. Show signup form;
  3. Click in 'I already have my account';
  4. Go to Sign In page.
