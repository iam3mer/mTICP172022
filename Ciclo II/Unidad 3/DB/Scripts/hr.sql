-- employees
SELECT last_name "Apellidos", salary "Salario", salary + 200 "Proyección Aumento"
FROM employees;

SELECT last_name "Apellidos", salary as Salario, salary + 200 "Proyección Aumento"
FROM employees
WHERE Salario < 4000;

SELECT first_name||" "||last_name "Apellidos", salary as Salario, salary + 200 "Proyección Aumento"
FROM employees
WHERE Salario < 4000;

SELECT DISTINCT department_id 
FROM employees;

-- Ejercicios
SELECT employee_id, last_name, job_id, hire_date "STARTDATE"
FROM employees;

SELECT DISTINCT job_id
FROM employees;

SELECT employee_id "Emp #", last_name "Employee", job_id "Job", hire_date "HIRE DATE"
FROM employees;

SELECT employee_id "Emp #", last_name "Employee", job_id "Job", hire_date "HIRE DATE"
FROM employees
WHERE job_id NOT IN (9 ,13 ,17);

SELECT last_name, salary
FROM employees
WHERE salary > 12000;

SELECT last_name, department_id
FROM employees
WHERE employee_id = 176;

SELECT last_name, salary
FROM employees
WHERE salary NOT BETWEEN 5000 AND 12000
ORDER BY salary DESC;

SELECT employee_id, last_name, salary, salary + (salary * .155) 'New Salary'
FROM employees e ;

SELECT
	employee_id,
	last_name,
	salary,
	salary + (salary * .155) AS 'New Salary',
	salary + (salary * .155) - salary,
	salary * .155
FROM employees e ;

SELECT
	UPPER(substr(last_name,1,1)) || LOWER(substr(last_name,2,LENGTH(last_name))) Apellido,
	LENGTH (last_name) Longitud
from employees e
WHERE first_name LIKE 'J%' OR first_name LIKE 'A%' OR first_name LIKE 'M%';

SELECT last_name, hire_date, substr(hire_date,9,10) 'DAY', STRFTIME("%d", DATETIME(hire_date))
from employees e ;

SELECT last_name, printf('$ %.15d', salary)
from employees e

select job_id , AVG(salary), MIN(salary), MAX(salary) 
from employees e 
group by job_id ;

SELECT department_id Area, count(last_name) '# Emp'
from employees e 
group by department_id;

select job_id , AVG(salary), MIN(salary), MAX(salary) 
from employees e
group by job_id
having AVG(salary) > 11000;

select SUM(salary) , AVG(salary), MIN(salary), MAX(salary) 
from employees e

select job_id, SUM(salary) , AVG(salary), MIN(salary), MAX(salary) 
from employees e
group by job_id
ORDER by AVG(salary) DESC;

SELECT job_id Area, count(last_name) '# Emp'
from employees e 
group by job_id ;

SELECT COUNT(job_id) '# Manager'
from employees e 
WHERE job_id IN (2,7,10,14,15,19);

SELECT
	job_title,
	last_name
FROM employees e
natural join jobs j ;

SELECT
	job_title,
	last_name
FROM employees e
join jobs j
using (job_id);

SELECT
	job_title,
	last_name
FROM employees e
join jobs j
on (e.job_id = j.job_id);

SELECT e.job_id, j.job_title Area, count(e.last_name) '# Emp'
from employees e
natural join jobs j 
group by job_id ;

SELECT first_name||' '||last_name, j.job_id, job_title
from employees e 
left outer join jobs j ON (e.job_id = j.job_id);

-- rigth simulado
SELECT first_name||' '||last_name, j.job_id, job_title
from  jobs j
left outer join employees e ON (e.job_id = j.job_id);

SELECT last_name, job_title
from employees e 
cross join jobs j ;

SELECT location_id, street_address, city, state_province, country_name
from locations l 
natural join countries c ;

SELECT last_name, department_id, department_name
from employees e 
natural join departments d ;

SELECT last_name, department_id, department_name
from employees e join departments d
using (department_id);

SELECT last_name, d.department_id, department_name
from employees e join departments d
on (e.department_id = d.department_id);

SELECT last_name, job_id, d.department_id, department_name
from employees e 
join departments d 
on (e.department_id = d.department_id)
natural join locations l
where l.city = 'Toronto';

/*
SELECT e2.manager_id, e2.last_name, e.employee_id, e.last_name
from employees e2
join employees e on (e2.manager_id = e.employee_id)
group by e2.manager_id ;
*/


SELECT last_name, salary
FROM employees
WHERE salary > (
	SELECT salary 
	from employees e 
	where first_name = 'Matthew'
);

SELECT first_name, last_name, salary
from employees e 
WHERE department_id IN (
	SELECT department_id
	from departments d 
	WHERE location_id = 1700
);

SELECT first_name, last_name, salary
from employees e 
join departments d ON (e.department_id = d.department_id)
NATURAL JOIN locations l 
WHERE l.location_id = 1700;

SELECT last_name, salary
from employees e 
where salary > (
	SELECT salary 
	from employees e2 
	where last_name = 'Baida'
	);

SELECT department_id, min(salary)
from employees e 
group by department_id
having min(salary) > (
	SELECT min(salary)
	from employees e2 
	where department_id = 5
	);

SELECT  last_name, job_id, salary
from employees e 
where job_id = (
	SELECT job_id 
	from employees e2 
	where last_name = 'Popp'
	)
and salary > (
	SELECT salary 
	from employees e3 
	WHERE last_name = 'Popp'
	);

SELECT round(avg_salary)
FROM (
	select AVG(salary) avg_salary
	from employees e 
	group by department_id
	);

SELECT last_name,
		salary,
		(SELECT round(AVG(salary)) from employees e ) avg_salary,
		salary - (select round(AVG(salary)) from employees e2 ) diferencia
from employees e2 

WITH
dept_co AS (
	select d.department_name, SUM(e.salary) as dept_total
	from employees e 
	join departments d on e.department_id = d.department_id 
	GROUP BY d.department_name 
),
avg_cost AS (
	SELECT sum(dept_total)/count(*) dept_avg
	from dept_co
	) 
SELECT * 
	from dept_co
	where dept_total > (
		SELECT dept_avg
		from avg_cost
		)
order by department_name;



