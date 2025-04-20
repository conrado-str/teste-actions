BEGIN
    EXECUTE IMMEDIATE '
        CREATE TABLE semaforo (
            id NUMBER PRIMARY KEY,
            identificador VARCHAR2(100) NOT NULL,
            cruzamento_id NUMBER NOT NULL,
            status_id NUMBER NOT NULL,
            FOREIGN KEY (cruzamento_id) REFERENCES cruzamento(id),
            FOREIGN KEY (status_id) REFERENCES status_semaforo(id)
        )
    ';
EXCEPTION
    WHEN OTHERS THEN
        IF SQLCODE != -955 THEN RAISE; END IF;
END;
/

BEGIN
    EXECUTE IMMEDIATE '
        CREATE SEQUENCE seq_semaforo START WITH 1 INCREMENT BY 1
    ';
EXCEPTION
    WHEN OTHERS THEN
        IF SQLCODE != -955 THEN RAISE; END IF;
END;
/
