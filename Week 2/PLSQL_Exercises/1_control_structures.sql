BEGIN
  FOR i IN 1..5 LOOP
    DBMS_OUTPUT.PUT_LINE('Counter value: ' || i);
  END LOOP;
END;
/