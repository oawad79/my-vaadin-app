## To use the application

0 - dbserver is not part of the multimodule app, it contains a H2Server for testing.

1 - Change to dbserver and run this to start the server

   ```bash
    run_this_first.sh 
   ```

  Then run this to load the sample data.

   ```bash
    run_this_second.sh
   ```
   
2 - In your browser, open http://localhost:8082 , this will open the DB browser, you should see the tables loaded.

3 - Change to the parent module and run

   ```bash
    mvn install
   ``` 
   
3 - Change to the 'vaadin-front' module and run this command

   ```bash
    mvn spring-boot:run
   ``` 


