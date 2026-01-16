public class PostgreSQLImplementor implements DatabaseImplementor {
    private String connection;
    
    @Override
    public void doConnect() {
        connection = "PostgreSQL Connection Established";
        System.out.println(connection);
    }
    
    @Override
    public void doExecuteQuery(String query) {
        System.out.println("PostgreSQL executing: " + query);
    }
    
    @Override
    public void doDisconnect() {
        System.out.println("PostgreSQL Connection Closed");
        connection = null;
    }
    
    @Override
    public void doIndexing() {
        System.out.println("PostgreSQL indexing performed");
    }
    
    @Override
    public void doLogging(String message) {
        System.out.println("PostgreSQL Log: " + message);
    }
}
