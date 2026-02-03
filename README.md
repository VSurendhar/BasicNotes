# Notes Application

A modern Android notes application built with Clean Architecture and MVI (Model-View-Intent) pattern, featuring color-coded notes, flexible sorting options, and comprehensive testing.

## 📱 Features

- **Create, Read, Update, Delete (CRUD) Operations** - Full note management capabilities
- **Color-Coded Notes** - Identify and organize notes by assigning specific colors
- **Flexible Sorting Options**:
    - Sort by Date (Ascending/Descending)
    - Sort by Title (Ascending/Descending)
- **Persistent Storage** - All notes are saved locally using Room Database
- **Clean UI** - Intuitive interface for seamless note management

## 🏗️ Architecture

This application follows **Clean Architecture** principles combined with **MVI (Model-View-Intent)** pattern, ensuring:

- **Separation of Concerns** - Clear separation between UI, business logic, and data layers
- **Testability** - Easy to write and maintain unit and integration tests
- **Scalability** - Modular structure that supports future enhancements
- **Maintainability** - Well-organized codebase following best practices

### Architecture Layers

```
┌─────────────────────────────────────┐
│         Presentation Layer          │
│              (MVI)                  │
├─────────────────────────────────────┤
│          Domain Layer               │
│        (Use Cases/Business Logic)   │
├─────────────────────────────────────┤
│           Data Layer                │
│       (Room Database/Repository)    │
└─────────────────────────────────────┘
```

## 🛠️ Tech Stack

- **Kotlin** - Primary programming language
- **Jetpack Compose** - Modern UI toolkit
- **Room Database** - Local data persistence
- **MVI Pattern** - Unidirectional data flow for predictable state management
- **Coroutines & Flow** - Asynchronous programming
- **Dependency Injection** - (Hilt/Koin/Dagger)
- **JUnit & Truth** - Unit testing
- **Compose Testing** - UI and instrumentation testing

## 🧪 Testing

<img width="600" alt="Unit Test Results 1" src="https://github.com/user-attachments/assets/16edace8-d800-4a76-a902-298e9e4dfe34" />
<img width="600" alt="Unit Test Results 2" src="https://github.com/user-attachments/assets/44247b63-4b0d-4aaa-b1ac-bbe9d42251ee" />

### Unit Tests
Comprehensive unit tests have been implemented to verify:
- ✅ Sorting functionality (ascending order)
- ✅ Sorting functionality (descending order)
- ✅ Date-based sorting logic
- ✅ Title-based sorting logic
- ✅ Business logic validation

### Instrumentation Tests
UI and integration tests covering:
- ✅ Navigation between screens
- ✅ Notes list screen functionality
- ✅ Note detail/edit screen functionality
- ✅ Create and save operations
- ✅ Update and delete operations

## 📸 Screenshots

*Screenshots showcasing the application's UI and features*

<img width="300" alt="Notes List Screen" src="https://github.com/user-attachments/assets/58c1299f-4ff7-4234-9290-4f4f6c9e24e0" />
<img width="300" alt="Note Detail Screen" src="https://github.com/user-attachments/assets/3c5ef988-e2dd-4bd1-90bb-f5af46e070c5" />

## 🎥 Demo

### Instrumentation Test Results
*Video demonstration of the automated UI testing process and results*

https://github.com/user-attachments/assets/1bc27041-adde-43b1-88a9-dad8c36d17d8



## 📦 Installation

1. Clone the repository:
```bash
git clone https://github.com/VSurendhar/BasicNotes.git
```

2. Open the project in Android Studio

3. Build and run the application on an emulator or physical device

### Download APK
You can download the latest APK from the [Releases](link-to-releases) section to install directly on your Android device.

## 🚀 Usage

1. **Create a Note**: Tap the "+" button to create a new note
2. **Assign Color**: Select a color while creating/editing to categorize your note
3. **Edit/View Note**: Tap on any note from the list to view or edit it
4. **Sort Notes**: Use the sorting options to organize notes by date or title
5. **Delete Note**: Remove unwanted notes with the delete option

## 🧩 Project Structure

```
com.voiddeveloper.notes/
├── core/              # Core utilities and base classes
├── di/                # Dependency injection modules
└── feature/           # Feature modules
    └── note/          # Note feature module
        ├── data/      # Data layer (Room, Repository implementations)
        ├── domain/    # Domain layer (Use cases, Models, Entities)
        └── presentation/ # UI layer (Compose screens, ViewModels, States)
```

## 👨‍💻 Developer

**Surendhar V**
- GitHub: [@VSurendhar](https://github.com/VSurendhar)
- LinkedIn: [vsurendharm](https://linkedin.com/in/vsurendharm)

---

⭐ If you found this project helpful, please consider giving it a star!
