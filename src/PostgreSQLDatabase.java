public class PostgreSQLDatabase extends Database {
    
    public PostgreSQLDatabase(DatabaseImplementor implementor) {
        super(implementor);
    }
    
    @Override
    public String executeQuery(String query) {
        performLogging("Executing query on PostgreSQL");
        implementor.doExecuteQuery(query);
        return "PostgreSQL ResultSet";
    }
}
