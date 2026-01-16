# multi-db-bridge-framework
Bridge Pattern implementation for reusable database framework. Supports MySQL, Oracle, and PostgreSQL with different indexing and logging implementations. 

Case:
We are planning to develop a framework in order to create applications using a specific
programming language (e.g Python). The framework to be developed is expected to enable
application developers to create database applications. In other words, the application developers
are able to create different types of databases and process on them with this framework. Currently,
the framework supports only MySQL database. We want the framework to be reusable. We would
like the framework to support Oracle and PostgreSQL databases. We know that although the
different types of databases have the same types of properties, they differ in indexing and logging.
