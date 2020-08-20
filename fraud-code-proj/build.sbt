name := "fraud-code-proj"

version := "0.1"

scalaVersion := "2.12.11"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-streaming" % "2.4.0",
  "org.apache.spark" %% "spark-sql" % "2.4.0",
  "org.apache.spark" %% "spark-mllib" % "2.4.0",
  "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.4.0",
  "org.apache.spark" %% "spark-sql-kafka-0-10" % "2.4.0",
  "org.apache.kafka" % "kafka-clients" % "0.10.0.1",
  "org.mongodb.spark" %% "mongo-spark-connector" % "2.4.2",
  "org.apache.logging.log4j" %% "log4j-api-scala" % "11.0",
  "org.apache.logging.log4j" % "log4j-api" % "2.11.0",
  "org.apache.logging.log4j" % "log4j-core" % "2.11.0" % Runtime,
  "com.typesafe" % "config" % "1.3.3",
  "com.datastax.cassandra" % "cassandra-driver-core" % "3.10.1",
  "com.datastax.cassandra" % "cassandra-driver-mapping" % "3.10.1",
  "com.datastax.spark" %% "spark-cassandra-connector" % "2.5.1",

)