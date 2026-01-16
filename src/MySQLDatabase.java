public class MySQLDatabase extends Database {
    
    public MySQLDatabase(DatabaseImplementor implementor) {
        super(implementor);
    }
    
    @Override
    public String executeQuery(String query) {
        performLogging("Executing query on MySQL");
        implementor.doExecuteQuery(query);
        return "MySQL ResultSet";
    }
}
