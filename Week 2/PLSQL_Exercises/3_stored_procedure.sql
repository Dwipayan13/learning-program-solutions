CREATE TABLE students (
  id NUMBER PRIMARY KEY,
  name VARCHAR2(50),
  marks NUMBER
);

-- Step 2: Insert data
INSERT INTO students VALUES (1, 'Alice', 88);
INSERT INTO students VALUES (2, 'Bob', 72);
COMMIT;

-- Step 3: Create procedure
CREATE OR REPLACE PROCEDURE get_grade(p_id IN NUMBER) AS
  v_marks students.marks%TYPE;
BEGIN
  SELECT marks INTO v_marks FROM students WHERE id = p_id;
  IF v_marks >= 90 THEN
    DBMS_OUTPUT.PUT_LINE('Grade: A');
  ELSIF v_marks >= 75 THEN
    DBMS_OUTPUT.PUT_LINE('Grade: B');
  ELSE
    DBMS_OUTPUT.PUT_LINE('Grade: C');
  END IF;
END;
/