## Apache Tomcat 실행 방법

### 파일 기본 경로

C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps

`ServletName` Directory\\`WEB-INF` Directory,`html` File\\`classes` Directory, `web.xml` File, `ProjectName` Directory\\`ProjectName.class`

- web.xml File
    
    ```html
    <?xml version="1.0" encoding="UTF-8"?>
    <!--
     Licensed to the Apache Software Foundation (ASF) under one or more
      contributor license agreements.  See the NOTICE file distributed with
      this work for additional information regarding copyright ownership.
      The ASF licenses this file to You under the Apache License, Version 2.0
      (the "License"); you may not use this file except in compliance with
      the License.  You may obtain a copy of the License at
    
          http://www.apache.org/licenses/LICENSE-2.0
    
      Unless required by applicable law or agreed to in writing, software
      distributed under the License is distributed on an "AS IS" BASIS,
      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
      See the License for the specific language governing permissions and
      limitations under the License.
    -->
    <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                          http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
      version="4.0"
      metadata-complete="false">
    
      <display-name>Welcome to Tomcat</display-name>
      <description>
         Welcome to Tomcat
      </description>
    
    </web-app>
    ```
    

### 실행 경로

C:\Program Files\Apache Software Foundation\Tomcat 9.0\bin

시작할 때 - `startup.bat` 실행

종료할 때 - `shutdown.bat` 실행
