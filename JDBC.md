1: JDBC stands for Java Database Connectivity. It is a Java API that allows Java applications to connect to and interact with databases.

2: The Seven Essential Steps to Connect with JDBC:
    a. Import Package: Import necessary JDBC classes
    b. Load Driver: Load the database driver class  
    c. Register Driver: Register driver with DriverManager
    d. Create Connection: Establish connection to database
    e. Create Statement: Create statement object for SQL execution
    f. Execute Statement: Execute SQL queries/updates
    g. Close Connection: Release database resources

    step b and c is optional now driver will automatically get loaded and registered.

3: For statement creation we can use preparedStatement or Statement based on the requirement. Because let say we have to insert value in table but that value is coming from frontend in variable then handling variable while creating statement is very hectic due to multiple use of " and ' in string.

4: Using Statement in JDBC is considered risky because it builds SQL queries by concatenating user input directly into the SQL strings, opening the door to SQL injection attacks. This vulnerability allows attackers to manipulate the query, potentially gaining unauthorized access to or altering the database, highlighting the importance of using prepared statements for safer query execution.