# Student Profile Manager

A simple Java Swing desktop application for creating and viewing student profiles.

## Overview

This application provides a graphical user interface for students to input their personal information and view a summary of their profile. It demonstrates fundamental Java Swing concepts including form handling, input validation, and file selection.

## Features

- **Profile Form**: Collects student information including name, gender, age, contact details, location, and hobbies
- **Photo Upload**: Allows users to upload a profile photo (JPG and JPEG formats)
- **Input Validation**: Validates required fields, phone number format, and email format
- **Profile Preview**: Displays a formatted summary of the entered profile with optional photo

## Project Structure

```
src/
├── model/
│   └── User.java        # Data model for storing user profile information
└── ui/
    └── profile.java     # Main JFrame containing the profile form UI
```

## Requirements

- Java Development Kit (JDK) 17 or higher
- NetBeans IDE (recommended) or any Java IDE

## How to Run

1. Clone or download the project
2. Open the project in NetBeans or your preferred IDE
3. Build and run `profile.java`

## Usage

1. Fill in the required fields (First Name, Last Name, Phone, Email)
2. Select gender from the dropdown menu
3. Set age using the spinner control
4. Choose your continent from the dropdown
5. Enter hobbies in the text area
6. (Optional) Click **Upload** to select a profile photo
7. Click **Submit** to view your profile summary

## Validation Rules

| Field | Requirement |
|-------|-------------|
| First Name | Required |
| Last Name | Required |
| Phone | Required, minimum 8 digits |
| Email | Required, valid email format |

## Technologies Used

- Java SE
- Swing (GUI framework)
- GroupLayout (layout manager)

## Author

Demi Abolaji

## License

This project is available under the default license. See the license file for details.