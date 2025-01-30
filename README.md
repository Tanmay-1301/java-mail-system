# java-mail-system
An email java project is a software development project that involves building an application for sending and receiving email messages using the java programming languages.


This Java program is a basic simulation of Gmail functionalities, including Signup, Login, and Email Composition. The program allows users to create an account, log in, and compose messages, which are stored in text files. It provides a simple command-line interface (CLI) for interacting with the email system.

Features of the Program
1. Signup (Account Creation)
Users can create a new email account by entering a username and password.

The account credentials are stored in a file named <username>@gmail.com.

A separate file with the username is created to store incoming messages.

2. Login (User Authentication)
Users can log in by providing their username and password.

The credentials are verified against the stored data in the corresponding file.

If authentication is successful, the user gets an option to check their inbox.

3. Compose and Send Emails
After logging in, users can compose a new email by entering a recipient’s username and the email body.

The email is stored in the recipient's file along with a timestamp, sender's name, and message content.

How the Program Works

The program uses BufferedReader and FileReader/FileWriter for reading and writing user data.

It uses PrintWriter to store the email content.

The Calendar class is used to include a timestamp in the composed emails.

A do-while loop ensures that users can navigate back to the menu after performing an operation.