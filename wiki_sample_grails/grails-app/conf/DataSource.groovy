dataSource {
  pooled = true
  driverClassName = "org.hsqldb.jdbcDriver"
  dialect = "org.hibernate.dialect.HSQLDialect"
  username = "sa"
  password = ""
}
hibernate {
    cache.use_second_level_cache=true
    cache.use_query_cache=true
    cache.provider_class='com.opensymphony.oscache.hibernate.OSCacheProvider'
		//cache.provider_class='org.hibernate.cache.EhCacheProvider'
    //query.substitutions='firstDoStudyId()=first_do_study_id()'
}
// environment specific settings
environments {
  development {
    dataSource {

      // hsqldb
//      url = "jdbc:hsqldb:mem:devDB"

      // MS SQL Server
//      dbCreate = "create-drop" // one of 'create', 'create-drop','update'
//      url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=sampledb"
//      driverClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
//      dialect = "org.hibernate.dialect.SQLServerDialect"
//      username = "manager"
//      password = "manager"

      // postgresql
      // dbCreateを指定するとDBスキーマを更新しちゃうので指定しない
      url = "jdbc:postgresql://192.168.1.1:5432/sampledb"
      driverClassName = "org.postgresql.Driver"
      dialect = "org.hibernate.dialect.PostgreSQLDialect"
      username = "postgres"
      password = "postgres"

    }
  }
  test {
    dataSource {
      dbCreate = "create-drop"

      // hsqldb
      url = "jdbc:hsqldb:mem:testDb"

        // MS SQL Server
//      url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=sampledb"
//      driverClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
//      dialect = "org.hibernate.dialect.SQLServerDialect"
//      username = "manager"
//      password = "manager"

      // postgresql
//      url = "jdbc:postgresql://localhost:5432/sampledb"
//      driverClassName = "org.postgresql.Driver"
//      dialect = "org.hibernate.dialect.PostgreSQLDialect"
//      username = "postgres"
//      password = "postgres"

    }
  }
  production {
    dataSource {
      // dbCreateを指定するとDBスキーマを更新しちゃうので指定しない

      // hsqldb
//      url = "jdbc:hsqldb:file:prodDb;shutdown=true"

      // MS SQL Server
//      url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=sampledb"
//      driverClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
//      dialect = "org.hibernate.dialect.SQLServerDialect"
//      username = "postgres"
//      password = "postgres"

      // postgresql
      url = "jdbc:postgresql://localhost:5432/sampledb"
      driverClassName = "org.postgresql.Driver"
      dialect = "org.hibernate.dialect.PostgreSQLDialect"
      username = "postgres"
      password = "postgres"

    }
  }
}
