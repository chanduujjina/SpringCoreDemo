Setter based injection
Set collection
Map<String,List<Project>) companyProjectInfo

Constructor based injection:
list based injection(String/non String)
set based injection(String/non String)
Map based injection(String/non String)

<import resource="classpath:anotherXXML.xml" />

git checkout -b branchName

Day2:
Dependency injection:

1)setter based injection
2)Constructor based injection

Collection based injection(List,set,map)

c1,c2

Employee

Unit:RCLADM1,FSLADM1

List projects

List addresses

1.will load spring bean class
2.Create the instance for loaded class by reading the meta data from xml
3.will call setter method to set data to object


Day3:
Achieving dependeny injection through Autowiring
No
byName
byType
Constructor
default

Spring bean scopes:
core standard beans:
1.singleton
2.prototype
WebMvc beans:
-------------
3.Request
4.session
5.Global session/Application Context


Annation based spring bean configuration

Scenario1:
M1->D1,D2

@Autowired ->byType
Exeption

M1->D1(primary) ,D2
@Autowired ->byType
will load D1

M1->D1(primary) ,D2
@Autowired ->byType
@Qualifier("d2")
will load D2

Other annatation in Annation based configuration
Java based spring configuration

Spring bean life cycle
Customizing bean and call back methods in spring bean