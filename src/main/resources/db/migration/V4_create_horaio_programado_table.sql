BEGIN
    EXECUTE IMMEDIATE '
        CREATE TABLE horario_programado (
            id NUMBER PRIMARY KEY,
            horario_inicio TIMESTAMP NOT NULL,
            horario_fim TIMESTAMP NOT NULL,
            semaforo_id NUMBER NOT NULL,
            FOREIGN KEY (semaforo_id) REFERENCES semaforo(id)
        )
    ';
EXCEPTION
    WHEN OTHERS THEN
        IF SQLCODE != -955 THEN RAISE; END IF;
END;
/

BEGIN
    EXECUTE IMMEDIATE '
        CREATE SEQUENCE seq_horario_programado START WITH 1 INCREMENT BY 1
    ';
EXCEPTION
    WHEN OTHERS THEN
        IF SQLCODE != -955 THEN RAISE; END IF;
END;
/
