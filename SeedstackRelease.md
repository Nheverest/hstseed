# Versioning and Release

Seedstack version is declared in pom.xml file of distribution project. 
Releasing a new versions starts with update of version in this project: 

	mvn versions:set versions:commit -DnewVersion=19.11-SNAPSHOT
	
Version numbers are formated as follows: 
	Version number = year.month<.revision>
Where month can be: 
- 1 (January)
- 4 (April)
- 7 (July) 
- 11 (November)

Release process itself is triggered by a commit after "-SNAPSHOT" removal from version. 
In other words, the tag associated with version x.y.z includes pom.xml files with x.y.z-SNAPSHOT versions.
(The tag is not on a x.y.z version.)

# Release Process

Identify components to release, so as to update their version in distribution's pom.xml

## bintray

###  Overview

bintray site is a deposit for Seedstack released deliverables, before they are transfered to Maven Central. 

The "Latest Activity" lists all released componnents, especially those released after latest "distribution". 

###  Release 19.11

No component has been released since version 19.7. 

##  Github

###  Overview

Github lists repositories order by latests modification date, decreasing. 
Like in bintray, this enables to identify all components modified since latest change to "distribution" project.

For each component:
- Read CHANGELOG.md file to see if a new release is required, and if changes required an update of distribution.
- Read pom.xml to see if component depends on -SNAPSHOT dependencies. If yes, dependency must be released first. 

Some projects are updated outside of releaes process:
- samples
- website
- seedstack.github.io

###  Release 19.11

#### kafka-addon
Changlog indicates no update since 2.0.0.
Commit list shows only tests have been added since 2.0.0.

=> Nothing to do

#### business

#### jpa-addon

#### scheduling-addon

#### seed

#### poms

#### jms-addon

#### oauth-addon

#### feign-addon