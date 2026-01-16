public interface DatabaseImplementor {
    void doConnect();
    void doExecuteQuery(String query);
    void doDisconnect();
    void doIndexing();
    void doLogging(String message);
}
