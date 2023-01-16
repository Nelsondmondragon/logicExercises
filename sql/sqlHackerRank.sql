SELECT  distinct(city)
FROM station
WHERE right(city, 1) IN ('a', 'e', 'i', 'o', 'u'); // WeaterObservationStation7

SELECT  distinct(city)
FROM station
WHERE left(city, 1) IN ('A', 'E', 'I', 'O', 'U')
AND right(city, 1) IN ('a', 'e', 'i', 'o', 'u');// WeaterObservationStation8

SELECT  distinct(city)
FROM station
WHERE left(city, 1) not IN ('A', 'E', 'I', 'O', 'U'); //WeatherObservationStation9

SELECT  distinct(city)
FROM station
WHERE right(city, 1) not IN ('A', 'E', 'I', 'O', 'U'); //WeatherObservationStation10

SELECT  distinct(city)
FROM station
WHERE left(city, 1) not IN ('A', 'E', 'I', 'O', 'U') or right(city, 1) not IN ('a', 'e', 'i', 'o', 'u');//WeatherObservationStation11

SELECT  distinct(city) name
FROM station
WHERE left(city, 1) not IN ('A', 'E', 'I', 'O', 'U')
AND right(city, 1) not IN ('a', 'e', 'i', 'o', 'u')
ORDER BY name asc; //weatherObservationStation13

SELECT  name
FROM students
WHERE marks > 75
ORDER BY right(name, 3), id asc;//HigherThan75Narks

SELECT  name
FROM employee
ORDER BY name asc; //EmployeeNames

SELECT  name
FROM employee
WHERE salary > 2000
AND months < 10
ORDER BY employee_id asc; //EmployeeSalaries

SELECT  CASE WHEN (a + b) <= c THEN 'Not A Triangle'
             WHEN a = b AND b = c THEN 'Equilateral'
             WHEN (a = b AND b != c) or (b = c AND b != a) or (a = c AND b != c)THEN 'Isosceles'  ELSE 'Scalene' END
FROM Triangles;//typeoftriangule

SELECT  name || '(' || left(occupation,1) || ')'
FROM occupations
ORDER BY name;

SELECT  'There are a total of ' || COUNT(occupation) || ' ' || occupation || 's.'
FROM occupations
GROUP BY  occupation
ORDER BY COUNT(occupation) asc
         ,occupation asc; // The PADS