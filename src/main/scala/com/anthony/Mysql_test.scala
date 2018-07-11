package com.anthony

import java.sql.{Connection, DriverManager, ResultSet, Statement}

/**
  * @ Description:
  * @ Date: Created in 21:54 10/07/2018
  * @ Author: Anthony_Duan
  */
object Mysql_test extends App {

  val url = "jdbc:mysql://localhost:3306/mysql"
  val username = "root"
  val password = "xiaoduan"


  var connection: Connection = null
  var statement: Statement = null
  var resultSet: ResultSet = null

  try {
    classOf[com.mysql.jdbc.Driver] //在分布式环境中最好写上

    connection = DriverManager.getConnection(url, username, password)
    statement = connection.createStatement()
    resultSet = statement.executeQuery("select host, user from user")
    while (resultSet.next()) {
      val host = resultSet.getString("host")
      val user = resultSet.getString("user")
      println(s"$user, $host")
    }
  } catch {
    case e: Exception => println(e.printStackTrace())
  } finally {
    connection.close()
  }

}
