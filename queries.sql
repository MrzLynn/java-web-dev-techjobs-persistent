## Part 1: Test it with SQL
id: int primary key
employer: varchar(255)
name: varchar(255)
skills: varchar(255)
## Part 2: Test it with SQL
SELECT * FROM employer WHERE (location = "Saint Louis, MO");
## Part 3: Test it with SQL
DROP TABLE job;
## Part 4: Test it with SQL
SELECT name, description FROM skill INNER JOIN job_skills on skill.id = job_skills.skills_id
WHERE name IS NOT NULL and description IS NOT NULL ORDER BY name;
