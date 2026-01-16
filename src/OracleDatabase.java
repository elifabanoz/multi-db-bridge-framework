public class OracleDatabase extends Database {
    
    public OracleDatabase(DatabaseImplementor implementor) {
        super(implementor);
    }
    
    @Override
    public String executeQuery(String query) {
        performLogging("Executing query on Oracle");
        implementor.doExecuteQuery(query);
        return "Oracle ResultSet";
    }
}
