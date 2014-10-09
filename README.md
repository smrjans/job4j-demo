job4j-demo
==========

Sample job4j Jobs &amp; Workflows.

Add job4j maven dependency in pom.xml

	<dependency>
		<groupId>com.talentica</groupId>
		<artifactId>job4j</artifactId>
		<version>0.0.1</version>
	</dependency>

Add "job4j-context.xml" to contextConfigLocation in web.xml

	<context-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>
			classpath:job4j-context.xml
			classpath:job4j-demo-context.xml		
		</param-value>
	</context-param>

Monitor Jobs by: http://localhost:8080/job4j-demo/joblist