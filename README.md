# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![UML Diagram for my project](UMLdiagram.png)

## Description

Write a description of your project here. Include what your store you made, and why you chose this topic. In your description, include as many vocab words from our class to explain how you represented the item/service from your store. If you have user input, explain how the user will interact with your store such as which questions are prompted to the user, what response is your program expecting, and how that is use to output information for your store in the console.

My store offers pet services, specifically a spa and an adoption center. I chose this topic because I love pets and it was my childhood dream to have a pet shop of some kind. In my project, I implemented several classes to represent the different components of the pet center. These classes encapsulate properties such as weight, age, name, etc. Using encapsulation, I ensured that the pet's details are private and can only be accessed or modified through getter and setter methods.The user will interact with the store because the store asks questions like: what is the weight of your animal? Or what is the name of the animal? Or what age would you like your animal to be? The response my program is looking for in this case is a decimal (although it doesn't have to be), a String, and another decimal (although it doesn't have to be). This is used to output information from my store in the console because it takes the information about the animal and it produces a price if they would like that service with that animal. 

