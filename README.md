# OpenCB implementation of GA4GH Schemas

This OpenCB repository implements the **Protobuf** and **Avro** data models from GA4GH schemas. These are available at http://ga4gh.org/#/schemas. This Java library will be versioned as the GA4GH schema version used.

### Code generation
This version implements GA4GH version **0.6.0a5**. GA4GH Schemas are stored in _src/main_ in _proto_ and _avro_ folders. Protocol buffers schemas are taken from GA4GH 0.6.0a5 and Avro schemas from GA4GH 0.6.0a4. At the moment protocol buffers 3.0.0-beta-3 and Avro 1.7.7 are used. We will try to keep them updated and sync.

We have respected the schemas _package_ configuration and therefore the protobuf code has been generated in _src/main/java/ga4gh_ and avro code is available at _src/main/java/org/ga4gh_.

Currently, Java code for both Proto and Avro are generated using the following [Maven](http://maven.apache.org/) plugins:

            <plugin>
                <groupId>org.xolstice.maven.plugins</groupId>
                <artifactId>protobuf-maven-plugin</artifactId>
                <version>0.5.0</version>
                <configuration>
                    <!--
                      The version of protoc must match protobuf-java. If you don't depend on
                      protobuf-java directly, you will be transitively depending on the
                      protobuf-java version that grpc depends on.
                    -->
                    <protocArtifact>com.google.protobuf:protoc:3.0.0-beta-3:exe:${os.detected.classifier}</protocArtifact>
                    <pluginId>grpc-java</pluginId>
                    <pluginArtifact>io.grpc:protoc-gen-grpc-java:0.15.0:exe:${os.detected.classifier}</pluginArtifact>
                    <clearOutputDirectory>false</clearOutputDirectory>
                    <outputDirectory>src/main/java</outputDirectory>
                </configuration>
                <executions>
                    <execution>
                        <goals>
                            <goal>compile</goal>
                            <goal>compile-custom</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
            
            <plugin>
                <groupId>org.apache.avro</groupId>
                <artifactId>avro-maven-plugin</artifactId>
                <version>1.7.7</version>
                <executions>
                    <execution>
                        <id>schemas</id>
                        <phase>generate-sources</phase>
                        <goals>
                            <goal>schema</goal>
                            <goal>protocol</goal>
                            <goal>idl-protocol</goal>
                        </goals>
                        <configuration>
                            <fieldVisibility>private</fieldVisibility>
                            <stringType>String</stringType>
                            <sourceDirectory>${project.basedir}/src/main/avro/</sourceDirectory>
                            <outputDirectory>${project.basedir}/src/main/java/</outputDirectory>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
  

### How to use it
You can use this repository in two different ways. First, all OpenCB libraries are deployed to [Maven Central Repository](http://search.maven.org/) as you can see at http://search.maven.org/#search%7Cga%7C1%7Copencb. So you only need to add this dependency to your _pom.xml_:

            <dependency>
                <groupId>org.opencb</groupId>
                <artifactId>ga4gh</artifactId>
                <version>0.6.0a5</version>
            </dependency>


Second, you can clone this project using Git and use maven to build and install it in your local repository:

            git clone https://github.com/opencb/ga4gh.git
            mvn clean install


![Image](http://www.opencb.org/sites/default/files/OPENCB_logo_300.png)  
![Image](http://genomicsandhealth.org/files/logo_ga.png)

