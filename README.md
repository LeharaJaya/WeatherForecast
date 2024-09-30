# WeatherForecast
Simple Weather Forecast in Java
This is a simple command-line weather forecast application written in Java. It allows users to input a city name and returns a hardcoded weather forecast for that city.

Features
Simulates weather forecasts for predefined cities.
Simple command-line interface.
Easily extensible for integration with real weather APIs.
Cities with Hardcoded Forecasts
New York: Sunny, 25°C
London: Cloudy, 18°C
Sydney: Rainy, 22°C
Tokyo: Clear sky, 27°C
If a user enters a city that is not predefined, the application returns a message indicating that weather data is unavailable.

How to Run
Prerequisites
Java Development Kit (JDK) installed (version 8 or higher).
A text editor or IDE (e.g., IntelliJ IDEA, Eclipse).
Steps to Run
Clone or download the project.
Open a terminal/command prompt.
Navigate to the directory where the WeatherForecast.java file is located.
Compile the Java file using the following command:
bash
Copy code
javac WeatherForecast.java
Run the compiled class file:
bash
Copy code
java WeatherForecast
Enter the city name when prompted to see the weather forecast.
Example Output
mathematica
Copy code
Enter the city name: 
New York
Weather forecast for New York: Sunny, 25°C
How to Extend
Add more cities: You can add more hardcoded forecasts for other cities by editing the getWeatherForecast method.
Integrate with an API: You can replace the hardcoded data with an API like OpenWeatherMap to fetch live weather information.
License
This project is open-source and available under the MIT License.

This README.md provides an overview of the project, instructions on how to run it, and tips on extending it further. Let me know if you'd like to make any changes!
