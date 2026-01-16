public class MySQLImplementor implements DatabaseImplementor {
    private String connection;
    
    @Override
    public void doConnect() {
        connection = "MySQL Connection Established";
        System.out.println(connection);
    }
    
    @Override
    public void doExecuteQuery(String query) {
        System.out.println("MySQL executing: " + query);
    }
    
    @Override
    public void doDisconnect() {
        System.out.println("MySQL Connection Closed");
        connection = null;
    }
    
    @Override
    public void doIndexing() {
        System.out.println("MySQL indexing performed");
    }
    
    @Override
    public void doLogging(String message) {
        System.out.println("MySQL Log: " + message);
    }
}
