# Newsify - Android News Application
Newsify is a sleek and intuitive Android application designed to keep users updated with the latest news articles. 
It provides a seamless experience for browsing news headlines, reading detailed articles, and searching for specific topics of interest.

# Features
- **Browse News Headlines**: Users can explore a curated list of news headlines from various reliable sources.
- **Read Detailed Articles**: Dive into detailed articles with rich content including title, description, and accompanying images.
- **Search Feature**: Search for specific topics or keywords to find relevant news articles quickly.
- **Dependency Injection (DI)**: Utilizes DI for managing dependencies, promoting modularity and easier testing.
- **Caching with Room**: Implements caching mechanism using Room database to store and retrieve news articles locally, ensuring offline access and faster loading times.

# Technologies Used
- **Kotlin**: The primary programming language used for developing the application, offering concise syntax and powerful features.
- **Kotlin DSL**: Dependency management is handled using Kotlin DSL, enabling a more concise and readable build configuration.
- **Coroutines**: Utilized for asynchronous programming to handle network requests and database operations efficiently.
- **Flow**: Employed to handle asynchronous data streams in a more concise and reactive manner.
- **MVVM Architecture**: Follows the Model-View-ViewModel architectural pattern, promoting separation of concerns and maintainability.
- **Clean Architecture**: Adheres to clean architecture principles, ensuring modularity, testability, and scalability of the codebase.
- **Retrofit**: Used for making HTTP requests to fetch news articles from remote APIs in a simple and efficient manner.
- **Room Persistence Library**: Integrated for local data storage, providing a robust and efficient caching mechanism.
