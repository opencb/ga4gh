# OpenCB implementation of GA4GH Schemas

This OpenCB repository implements the Avro schemas from GA4GH. These are available at http://ga4gh.org/#/schemas. This Java library will be named with the same Avro schema version.

### Schemas
This version implements GA4GH version **0.5.1**. Avro Schemas are stored in _src/main/resources_ in _avro_ folder at https://github.com/opencb/ga4gh/tree/master/src/main/resources/avro

Java code is generated using the following Maven plugin:

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
  
