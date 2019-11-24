# kafka-springbatch
code for kafka with spring batch integration example




Kafka is one of the most popular publisher-subscriber models written in Java and Scala. It was originally developed by LinkedIn and later open-sourced. Kafka is known for handling heavy loads, i.e. I/O operations. You can find out more about Kafka here.

Installation
==============
In this article, I am going to explain how to install Kafka on Ubuntu. To install Kafka, Java must be installed on your system. It is a must to set up ZooKeeper for Kafka. ZooKeeper performs many tasks for Kafka but in short, we can say that ZooKeeper manages the Kafka cluster state. 

ZooKeeper Setup
Download ZooKeeper from here.    
https://www.apache.org/dyn/closer.cgi/zookeeper/


Unzip the file. Inside the conf directory, rename the file zoo_sample.cfgas zoo.cfg. 

The zoo.cfg file keeps configuration for ZooKeeper, i.e. on which port the ZooKeeper instance will listen, data directory, etc.

The default listen port is 2181. You can change this port by changing clientPort.

The default data directory is /tmp/data. Change this, as you will not want ZooKeeper's data to be deleted after some random timeframe. Create a folder with the name data in the ZooKeeper directory and change the dataDir in zoo.cfg.

Go to the bin directory.

Start ZooKeeper by executing the command .

C:\softwares\kafka\kafka_2.11-2.3.1>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties


Kafka Setup
==============
Download the latest stable version of Kafka from here.

https://kafka.apache.org/downloads


Unzip this file. The Kafka instance (Broker) configurations are kept in the config directory.

Go to the config directory. Open the file server.properties.

Change log.dirs to /kafka_home_directory/kafka-logs.

Go to the Kafka home directory and execute the command 

C:\softwares\kafka\kafka_2.11-2.3.1>.\bin\windows\kafka-server-start.bat .\config\server.properties

Create topic
=============
C:\softwares\kafka\kafka_2.11-2.3.1\bin\windows>kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test


Run the Producer console
=============================

C:\softwares\kafka\kafka_2.11-2.3.1\bin\windows>kafka-console-producer.bat --broker-list localhost:9092 --topic test 

Run the consumer console
=============================

C:\softwares\kafka\kafka_2.11-2.3.1\bin\windows>kafka-console-consumer.bat --bootstrap-server localhost:2181 --topic test


Important commands for kafka
=================================

List Topics: kafka-topics.bat --list --zookeeper localhost:2181  
Describe Topic: kafka-topics.bat --describe --zookeeper localhost:2181 --topic test
Read messages from the beginning: kafka-console-consumer.bat --zookeeper localhost:2181 --topic test --from-beginning
Delete Topic: kafka-run-class.bat kafka.admin.TopicCommand --delete --topic zipkin --zookeeper localhost:2181

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning






