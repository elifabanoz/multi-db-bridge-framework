public class Client {
    public static void main(String[] args) {
        System.out.println("=== MySQL Database Example ===");
        Database mysqlDB = new MySQLDatabase(new MySQLImplementor());
        mysqlDB.connect();
        mysqlDB.executeQuery("SELECT * FROM users");
        mysqlDB.performIndexing();
        mysqlDB.disconnect();
        
        System.out.println("\n=== Oracle Database Example ===");
        Database oracleDB = new OracleDatabase(new OracleImplementor());
        oracleDB.connect();
        oracleDB.executeQuery("SELECT * FROM products");
        oracleDB.performIndexing();
        oracleDB.disconnect();
        
        System.out.println("\n=== PostgreSQL Database Example ===");
        Database postgresDB = new PostgreSQLDatabase(new PostgreSQLImplementor());
        postgresDB.connect();
        postgresDB.executeQuery("SELECT * FROM orders");
        postgresDB.performIndexing();
        postgresDB.disconnect();
        
        System.out.println("\n=== Bridge Pattern Flexibility ===");
        Database mysqlWithOracleImpl = new MySQLDatabase(new OracleImplementor());
        mysqlWithOracleImpl.connect();
        mysqlWithOracleImpl.executeQuery("SELECT * FROM mixed");
        mysqlWithOracleImpl.disconnect();
    }
}
