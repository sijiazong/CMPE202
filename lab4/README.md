# Lab 4 - Ding Tai Feng

**1. CRC Cards**  
*Customer*  
Responsibilities:  
Name  
Cellphone Number  
Number of people  
Sign up for a table  
Confirm Reservation  
Cancel Reservation  
Collaborators:  
ReservationManager

*Reservation Manager*  
Responsibilities:  
Add Customer to Waitlist  
Delete Customer from Waitlist  
Notify Customer of when table is available  
Get Table Availability from Table Manager  
Get next Customer in waitlist for available table  
Assign Customer to table  
Collaborators:  
Customers  
Waitlist  
Table Manager  
Table

*Waitlist*  
Responsibilities:    
<get>Queue of Customer  
Add customer to waiting queue  
Remove customer from waiting queue  
Collaborators:  
Reservation Manager

*Table Manager*  
Responsibilities:  
Notify Reservation Manager when a table is available  
Create table  
Delete table  
Get table availability  
Get table size  
Collaborators:    
Table  
Reservation Manager

*Table*  
Responsibilities:  
Table ID  
<get>Table Size  
<get/set>Availability  
Collaborators:  
Table Manager
Reservation Manager


**2. Design Patterns**

Singleton: For Reservation Manager, Waitlist, Table Manager, use Singleton design patterns to make sure only one instance is created and accessible to other clients in the system.

Observer: State Changes in Table (Table Availability) will trigger behavior in table manager. Table manager will be the observer for Subject Table. When Table availability changes, it will notify Table manager.