# OpenCB implementation of GA4GH Schemas

This OpenCB repository implements the Avro schemas from GA4GH. These are available at http://ga4gh.org/#/schemas. This Java library will be versioned with as the Avro schema used.

### Code generation
This version implements GA4GH version **0.5.1**. Avro Schemas are stored in _src/main/resources_ in _avro_ folder at https://github.com/opencb/ga4gh/tree/master/src/main/resources/avro

Currently Java 7 code is generated using the following [Maven](http://maven.apache.org/) plugin:

            <plugin>
                <groupId>org.apache.avro</groupId>
                <artifactId>avro-maven-plugin</artifactId>
                <version>1.7.7</version>
                <executions>
                    <execution>
                        <phase>generate-sources</phase>
                        <goals>
                            <goal>schema</goal>
                            <goal>idl-protocol</goal>
                        </goals>
                        <configuration>
                            <sourceDirectory>${project.basedir}/src/main/resources/avro/</sourceDirectory>
                            <outputDirectory>${project.basedir}/src/main/java/</outputDirectory>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
  
### How to use it
You will need Java 7+ to run this library. You can use this repository in two different ways. First, OpenCB libraries are deployed to [Maven Central Repository](http://search.maven.org/) as you can see at http://search.maven.org/#search%7Cga%7C1%7Copencb. So you only need to add this dependency to your _pom.xml_:

            <dependency>
                <groupId>org.opencb</groupId>
                <artifactId>ga4gh</artifactId>
                <version>0.5.1</version>
            </dependency>


Second, you can clone this project using Git and use maven to build and install it in your local repository:

            git clone https://github.com/opencb/ga4gh.git
            mvn clean install


![Image](http://www.opencb.org/sites/opencb.org/files/OPENCB_logo_300.png)   ![Image](http://genomicsandhealth.org/files/logo_ga.png)

