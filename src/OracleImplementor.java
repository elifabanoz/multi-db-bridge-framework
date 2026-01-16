public class OracleImplementor implements DatabaseImplementor {
    private String connection;
    
    @Override
    public void doConnect() {
        connection = "Oracle Connection Established";
        System.out.println(connection);
    }
    
    @Override
    public void doExecuteQuery(String query) {
        System.out.println("Oracle executing: " + query);
    }
    
    @Override
    public void doDisconnect() {
        System.out.println("Oracle Connection Closed");
        connection = null;
    }
    
    @Override
    public void doIndexing() {
        System.out.println("Oracle indexing performed");
    }
    
    @Override
    public void doLogging(String message) {
        System.out.println("Oracle Log: " + message);
    }
}
