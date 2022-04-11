# Requirements
- All the following tasks can be done without adding any other dependencies
- Do not add any new dependencies
- Do not change the Unit tests. Fix the code only

# Step 1
- All unit tests should pass

# Step 2
 - Improve performance of the addMultipleWatches
 
# Step 3
 - Make use of lombok annotations (getters/setters methods, constructors, hashcode, equals, toString, etc..)
 - To install lombok to Eclipse IDE:
 - check the location of lombok.jar file locally.(wether to download it from lombok website or with maven)
 - Run the command: java -jar lombok.jar
 - Specify the location of eclipse execution file if not located automatically(ex: eclise.exe) and press install/update
 - add this line to your eclipse.ini file if not automatically added: -vmargs -javaagent:<reference to lombok.jar> (ex: -vmargs -javaagent:C:\path\lombok.jar)