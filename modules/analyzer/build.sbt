libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "1.6.1",
  "org.apache.spark" % "spark-streaming_2.11" % "1.6.1",
  "org.apache.spark" % "spark-streaming-kafka_2.11" % "1.6.1"
)

dependencyOverrides ++= Set(
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.4"
)