# Supplementary Specification (FURPS+)

## Functionality

_Specifies functionalities that:_

_are common across several US/UC;_
_are not related to US/UC, namely: Audit, Reporting and Security._

> - The application must support the English language.
> - All images should be in SVG format.
> - The buyers should be able to view available properties for lease or for sale.
> - All those who wish to use the application must be authenticated with a password of seven alphanumeric characters, including three capital letters and two digits.
> - The measurement unit of the property area is m2.
> - The currency used is USD.
> - Sun exposure values are: North, South, East, or West.
> - Commision value in 0 or more.
> - All registered information, except the agency commission, can be accessed by the client who intends to buy or rent one property.


## Usability

_Evaluates the client interface. It has several subcategories,
among them: error prevention; interface aesthetics and design; help and
documentation; consistency and standards. Practically speaking, usability
is about the ability of the expected client(s) to operate our product under
the expected operating conditions._

> - The application should have a client-friendly environment.
> - Let users schedule their visit.
> - Needs to have filtering options like the number of rooms.

## Reliability
_Refers to the integrity, compliance and interoperability of the software. The requirements to be considered are: frequency and severity of failure, possibility of recovery, possibility of prediction, accuracy, average time between failures._

> - The application needs to be secure and protected against attacks.
> - The application should not crash.
> - The application must support the English language.

## Performance
_Evaluates the performance requirements of the software, namely: response time, start-up time, recovery time, memory consumption, CPU usage, load capacity and application availability._

> - The application shouldn't have any delays when operating.


## Supportability
_The supportability requirements gathers several characteristics, such as:
testability, adaptability, maintainability, compatibility,
configurability, instability, scalability and more._

> - The application should be able to support many users at a time.
> - The application needs to support various types of devices.
> - The application needs to be easy to maintain and to correct bugs or glitches.


## +

### Design Constraints

_Specifies or constraints the system design process. Examples may include: programming languages, software process, mandatory standards/patterns, use of development tools, class library, etc._

> - The application graphical interface is to be developed in JavaFX 11.


### Implementation Constraints

_Specifies or constraints the code or construction of a system such
as: mandatory standards/patterns, implementation languages,
database integrity, resource limits, operating system._

> - The application must be developed in Java.
> - The application must be developed using the IntelliJ IDE or NetBeans.
> - CamelCase standard should be used.
> - Javadoc should be used to generate useful documentation.
> - There should be unit tests for all methods.
> - The unit tests should be implemented using JUnit 5 framework.
> - The JaCoCo plugin should be used to generate the coverage report.
> - All the images/figures produced during the software development process should be recorded in
    SVG format.


### Interface Constraints
_Specifies or constraints the features inherent to the interaction of the
system being developed with other external systems._


(fill in here )

### Physical Constraints

_Specifies a limitation or physical requirement regarding the hardware used to house the system, as for example: material, shape, size or weight._

(fill in here )