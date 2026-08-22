# Write your MySQL query statement below
select d.name as Department,e.name as Employee,e.salary from Employee e
join department d on e.departmentId = d.id 
 WHERE e.salary = (
    SELECT MAX(salary)
    FROM Employee
    WHERE departmentId = e.departmentId
);