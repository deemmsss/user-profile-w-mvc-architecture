# Lab 3 – Java Swing Student Profile (MVC)

## Purpose

This project is a Java Swing desktop application that allows users to create a student profile through a graphical form. The application validates user input, creates a User model object, and displays the created profile in a success dialog. Users can optionally upload a photo that will be shown in the popup message.

### This lab practices:

- Java Classes & Objects
- Getters/Setters, Constructors, toString()
- Java Swing components: JComboBox, JTextArea, JSpinner, JFormattedTextField
- Input validation (if conditions, numeric validation, regex)
- Introduction to MVC (Model + UI separation)

## Features

### UI Components

| Component | Type |
|-----------|------|
| First Name / Last Name | JTextField |
| Gender | JComboBox (Male / Female / Other) |
| Age | JSpinner |
| Phone Number | JFormattedTextField |
| Email | JFormattedTextField |
| Continent of Origin | JComboBox |
| Hobbies | JTextArea |
| Photo Upload (Bonus) | JFileChooser (jpg/jpeg/png/gif) |

### Core Logic

- Collects form input and trims text values
- Validates user input before creating a User object
- Creates a User instance with all attributes
- Displays `User.toString()` in a success dialog
- If a photo is uploaded, the success dialog includes a scaled image icon

## Validations

The application validates the following:

| Field | Requirement |
|-------|-------------|
| First Name | Required, cannot be empty |
| Last Name | Required, cannot be empty |
| Phone | Required, must contain at least 8 digits (non-digit characters removed before validation) |
| Email | Required, must match regex pattern (e.g., name@example.com) |
| Age | Must be between 0 and 120 |

If any validation fails, an error dialog is shown and the user must fix inputs before submitting again.

## Project Structure (MVC)

```
src/
├── model/
│   └── User.java        # Model: stores user attributes + getters/setters + toString()
└── ui/
    └── profile.java     # View/Controller: Swing UI + validation + form submission logic
```

### Model: User

User contains the following attributes:
- `firstName`, `lastName`, `gender`, `age`
- `phone`, `email`
- `continent`, `hobbies`
- `photo` (bonus, not included in toString() output)

`toString()` returns a formatted profile summary (excluding photo).

### UI: Profile

Profile is the main Swing frame that:
- Handles **Upload** button (opens JFileChooser)
- Handles **Submit** button:
  - Reads input values
  - Runs validation
  - Creates User object
  - Displays success popup (with photo icon if available)

## Screenshots

All required screenshots are stored in the repository under `/screenshots/`.

Include at minimum:
- Interface with empty fields (before input)
- Interface with filled fields (after input)
- Success message dialog (with User.toString())
- Error dialogs for each validation case:
  - Missing required fields
  - Invalid age
  - Invalid phone digits count
  - Invalid email format

## Notes / Known Improvements

- Phone validation uses digits-only extraction (`replaceAll("\\D", "")`) to handle formatted input
- Email validation uses a simple regex and can be improved for stricter formats
- Age spinner can be configured with a `SpinnerNumberModel` for better UX
- Class naming could follow Java conventions (uppercase `Profile` instead of `profile`)

## Author
- Demi Abolaji