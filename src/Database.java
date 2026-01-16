public abstract class Database {
    protected DatabaseImplementor implementor;
    
    public Database(DatabaseImplementor implementor) {
        this.implementor = implementor;
    }
    
    public void connect() {
        implementor.doConnect();
    }
    
    public abstract String executeQuery(String query);
    
    public void disconnect() {
        implementor.doDisconnect();
    }
    
    public void performIndexing() {
        implementor.doIndexing();
    }
    
    public void performLogging(String message) {
        implementor.doLogging(message);
    }
}
