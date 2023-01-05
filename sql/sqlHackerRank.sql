
// WeaterObservationStation7
select distinct(city) from station where right(city, 1) in ('a','e','i','o','u');

// WeaterObservationStation8
select distinct(city) from station where left(city,1) in ('A','E','I','O','U') and right(city,1) in ('a','e','i','o','u');


//WeatherObservationStation9
select distinct(city) from station where left(city,1) not in ('A','E','I','O','U');

//WeatherObservationStation10
select distinct(city) from station where right(city,1) not in ('A','E','I','O','U');


//WeatherObservationStation11
select distinct(city) from station where left(city, 1) not in ('A','E','I','O','U') or right(city,1) not in ('a','e','i','o','u');


//weatherObservationStation13
select distinct(city) name from station where left(city,1) not in ('A','E','I','O','U') and right(city,1) not in ('a','e','i','o','u') order by name asc;

//HigherThan75Narks
select name from students where marks>75 order by right(name,3), id asc;

//EmployeeNames
select name from employee order by name asc;

//EmployeeSalaries
select name from employee where salary>2000 and months<10 order by employee_id asc;