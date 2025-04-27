# 📄 Description - Exercise Statement

Create an application capable of reading a CSV file.  
The file contains three fields for each record: first name (`nom`), last name (`cognom`), and ID (`DNI`).  
The goal is to read the data from the file and sort the persons by their first name, last name, or DNI.  
You can use any list structure you find most appropriate.

The `Person` class must have three attributes: `firstName`, `lastName`, and `dni`.

The main class must display the following menu:

1. Add a new person.
2. Show persons sorted by first name (A-Z).
3. Show persons sorted by first name (Z-A).
4. Show persons sorted by last name (A-Z).
5. Show persons sorted by last name (Z-A).
6. Show persons sorted by DNI (ascending).
7. Show persons sorted by DNI (descending).
0. Exit.

The program should list the persons in a format similar to:

| First Name | Last Name | DNI |
|------------|-----------|-----|
| Andreu | Ballestero Llenas | 34835767J |
| Miquel | Bayona Font | 48743957B |
| Guillem | Capdevila Riu | 33957834J |
| Albert | Carbonell Ferrer | 77364986R |
| Ferran | Casas Coderch | 23047848P |
| Maria | Casellas Fuste | 47102244S |
| Genis | Ciutat Vendrell | 39718459N |

# 💻 Technologies Used

Java 17  
IntelliJ IDEA

# 📋 Requirements

Java Development Kit (JDK) 17 or higher  
IntelliJ IDEA or another compatible Java IDE

# 🛠️ Installation

Clone the repository:

```bash
git clone https://github.com/anaberod/S1.03_JavaCollections_LV3.git
```

Navigate to the project directory:

```bash
cd CSV-Persons-Sorter
```

Open the project in IntelliJ IDEA.  
Build the project if necessary.

# ▶️ Execution

Open the project in IntelliJ IDEA.  
Locate the `Main` class containing the `main` method.  
Run the `Main` class.  
Use the interactive menu to add persons, read from a CSV file, and display the sorted lists based on the selected criteria.

# 🌐 Deployment

No deployment is necessary for this educational exercise.  
Optionally, you can package it as a `.jar` file using Maven:

```bash
mvn package
```

# 🤝 Contributions

Fork the repository.  
Create a new branch:

```bash
git checkout -b feature/NewFeature
```

Make your changes and commit them:

```bash
git commit -m "Add New Feature"
```

Push your changes:

```bash
git push origin feature/NewFeature
```

Open a pull request.
